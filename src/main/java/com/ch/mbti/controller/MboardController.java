package com.ch.mbti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ch.mbti.model.Mboard;
import com.ch.mbti.service.MboardService;
import com.ch.mbti.service.PagingBean;


@Controller
public class MboardController {
	@Autowired        
	private MboardService mbs;
	
	@RequestMapping("mBoardList")
	public String mBoardList(Mboard mboard, String pageNum, Model model) {
		int  rowPerPage = 10;
		if (pageNum == null || pageNum.equals("")) pageNum="1";
		int currentPage = Integer.parseInt(pageNum);
		int total = mbs.getTotal(mboard);
		int startRow = (currentPage - 1) * rowPerPage + 1;
		int endRow = startRow + rowPerPage - 1;
		mboard.setStartRow(startRow);
		mboard.setEndRow(endRow);
		List<Mboard> mbList = mbs.mbList(mboard);
		PagingBean pb = new PagingBean(currentPage, rowPerPage, total);
		model.addAttribute("mbList", mbList);
		model.addAttribute("pb", pb);
		return "mBoard/mBoardList";
	}
	@RequestMapping ("mBoardInsertForm")
		public String mBoardInsertForm (String pageNum, Model model) {
			int mbo_no = 0;
			mbo_no = mbs.maxMbo_no();
			System.out.println("mbo_no : " + mbo_no);
			model.addAttribute("pageNum", pageNum);
			model.addAttribute("mbo_no", mbo_no);
			return "mBoard/mBoardInsertForm";
	}
	@RequestMapping ("mBoardInsert")
	public String mBoardInsert (Mboard mboard, String pageNum, Model model) {
		int result = 0 ;				//입력실패
		result = mbs.insert(mboard); 	//입력성공한 갯수
		model.addAttribute("result", result);
		model.addAttribute("pageNum", pageNum);
		return "mBoard/mBoardInsert";
	}
	@RequestMapping ("mBoardView")
	public String mBoardView(Mboard mboard, String pageNum, Model model) {
		Mboard mboard2 = mbs.select(mboard.getMbo_no());
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("mboard", mboard2);
		return "mBoard/mBoardView" ;
	}
	@RequestMapping("mBoardUpdateForm")
	public String mBoardUpdateForm (int mbo_no, String pageNum, Model model) {
		Mboard mboard = mbs.select(mbo_no);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("mboard", mboard);
		return "mBoard/mBoardUpdateForm" ;
	}
	@RequestMapping("mBoardUpdate")
	public String mBoardUpdate (Mboard mboard, String pageNum, Model model) {
		int result = 0; 				//수정실패
		result = mbs.update(mboard);	//수정된 갯수
		model.addAttribute("result", result);
		model.addAttribute("pageNum", pageNum);
		return "mBoard/mBoardUpdate" ;
	}
	
}
