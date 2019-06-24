package com.lec.spring_command;
import com.lec.spring_dto.BDto;
import com.lec.spring_dao.BDao;

import java.util.ArrayList;

import org.springframework.ui.Model;


public class ListCmd implements ICommand {
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		dao.list();		
		
		BDto d = dtos.get(0);
		System.out.println("+++++++"+ d.getName());
	}
}
