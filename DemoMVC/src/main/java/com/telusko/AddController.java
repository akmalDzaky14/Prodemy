package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	// @RequestParam("t1") int input1 => menerima input dari browser dan di simpan ke input1
	public ModelAndView add(@RequestParam("t1") int input1, @RequestParam("t2") int input2, HttpServletRequest req,
			HttpServletResponse res) {

		AddService tambah = new AddService();
		int hasil = tambah.add(input1, input2);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		// mv.setViewName("display"); akan memeriksa di webinitializer dan teluskoConfig apakah display.jsp ada atau tidak
		mv.addObject("result", hasil);

		return mv;
	}
}
