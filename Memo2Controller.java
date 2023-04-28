package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.Mongo;

@Controller
public class Memo2Controller {
	
	@Autowired
	Memo2DAO dao;
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		//dao의 list()해서 결과 받아오면 됨
		List<Memo2VO> list = dao.list();
		//결과 받아온 것을 model의 속성을 지정해서 views까지 검색결과 보내자
		model.addAttribute("list", list);
	}

	@RequestMapping("insert.memo")
	private void insert(Memo2VO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("one.memo")
    public void one(String _id, Model model) {
        System.out.println("one.memo2컨트롤러 >> " + _id);
        Memo2VO vo = dao.one(_id);
        model.addAttribute("vo", vo);
    }
	
	@RequestMapping("delete.memo")
    public String delete(String _id) {
        dao.delete(_id);
        return "redirect:/mongo_memo.jsp";
    }
	
	@RequestMapping("update.memo")
    public String update(String _id, String content, Model model) {
        //400 error --> bad request error
        Memo2VO vo = new Memo2VO();
        vo.set_id(_id);
        vo.setContent(content);
        dao.update(vo);
        System.out.println("update.memo 컨트롤러>> " + vo);
        return "redirect:/mongo_memo.jsp";
    }
	
}
