package com.ch.mbti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.mbti.model.Reply;
import com.ch.mbti.service.ReplyService;

@Controller
public class ReplyController {
	@Autowired
	private ReplyService rs;
	@RequestMapping("replyList")
	public String replyList (int mbo_no, Model model) {
		List<Reply> rpList = rs.rpList(mbo_no);
		model.addAttribute("mbo_no",mbo_no);
		model.addAttribute("rpList",rpList);
		return "reply/replyList";
	}
	@RequestMapping("replyInsert")
	public String replyInsert (int mbo_no, Model model) {
		int result = 0; //댓글 게시 실패
		result = rs.insert(mbo_no);
		model.addAttribute("result",result);
		return "reply/replyInsert";
	}

}
