package com.lec.spring;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lec.spring_dao.BDao;
import com.lec.spring_dto.BDto;

@Controller
public class MyController {

	@RequestMapping(method=RequestMethod.POST, value="/addressList")
	public String addressList(Model model) {

		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		return "addressList";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addAddress")
	public String addAddress() {
		return "addAddress";
	}

	@RequestMapping(method=RequestMethod.POST, value="/addAddressDisplay")
	public ModelAndView addAddressDisplay(HttpServletRequest httpServletRequest, Model model){
			
		String id = httpServletRequest.getParameter("id");
		String country = httpServletRequest.getParameter("country");
		String name = httpServletRequest.getParameter("name");
		String street1 = httpServletRequest.getParameter("street1");
		String street2 = httpServletRequest.getParameter("street2");
		String city = httpServletRequest.getParameter("city");
		String state = httpServletRequest.getParameter("state");
		String zipcode = httpServletRequest.getParameter("zipcode");
		String phone = httpServletRequest.getParameter("phone");

		BDao dao = new BDao();
        dao.addNew(id, country, name, street1, street2, city, state, zipcode, phone);

		ModelAndView mv = new ModelAndView();
		mv.addObject("customerId", id);
		mv.addObject("customerCountry", country);
		mv.addObject("customerName", name);
		mv.addObject("customerStreet1", street1);
        mv.addObject("customerStreet2", street2);
		mv.addObject("customerCity", city);
		mv.addObject("customerState", state);
		mv.addObject("customerZipcode", zipcode);
		mv.addObject("customerPhone", phone);
		mv.setViewName("addAddressDisplay");

		return mv;
	}

	@RequestMapping(method=RequestMethod.POST, value="/deleteAddress")
	public String deleteAddress() {
		return "deleteAddress";
	}

	@RequestMapping(method=RequestMethod.POST, value="/deleteAddressDisplay")
	public ModelAndView deleteAddressDisplay(HttpServletRequest httpServletRequest, Model model) {

		String id = httpServletRequest.getParameter("id");

		BDao dao = new BDao();
		dao.deleteNew(id);

		ModelAndView mv = new ModelAndView();
		mv.addObject("customerId", id);

		mv.setViewName("deleteAddressDisplay");

		return mv;
	}

    @RequestMapping(method=RequestMethod.POST, value="/editAddress")
    public String editAddress() {
        return "editAddress";
    }

	@RequestMapping(method=RequestMethod.POST, value="/editAddressDisplay")
	public ModelAndView editAddressDisplay(HttpServletRequest httpServletRequest, Model model){

		String id = httpServletRequest.getParameter("id");
		String country = httpServletRequest.getParameter("country");
		String name = httpServletRequest.getParameter("name");
		String street1 = httpServletRequest.getParameter("street1");
		String street2 = httpServletRequest.getParameter("street2");
		String city = httpServletRequest.getParameter("city");
		String state = httpServletRequest.getParameter("state");
		String zipcode = httpServletRequest.getParameter("zipcode");
		String phone = httpServletRequest.getParameter("phone");

		BDao dao = new BDao();
		dao.editNew(id, country, name, street1, street2, city, state, zipcode, phone);

		ModelAndView mv = new ModelAndView();
		mv.addObject("customerId", id);
		mv.addObject("customerCountry", country);
		mv.addObject("customerName", name);
		mv.addObject("customerStreet1", street1);
		mv.addObject("customerStreet2", street2);
		mv.addObject("customerCity", city);
		mv.addObject("customerState", state);
		mv.addObject("customerZipcode", zipcode);
		mv.addObject("customerPhone", phone);
		mv.setViewName("editAddressDisplay");

		return mv;
	}
}
