package scorponok.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import scorponok.common.exception.DaoException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shensijie on 2018/3/29.
 */
@Controller public class PageController {
	//前台过滤权限
	@GetMapping("/{page}.htm") public String htm(@PathVariable String page) {
		return page;
	}

	//前台不过滤
	@GetMapping("/{page}.page") public String page(@PathVariable String page) {
		return page;
	}

	// 后台过滤权限
	@GetMapping("/pc/{page}.pc") public ModelAndView pcPage(@PathVariable("page") String page) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/pc/" + page);
		return mv;
	}

	//域名跳转到后台页面
	@GetMapping("/") public void back(HttpServletRequest request, HttpServletResponse response) throws DaoException, IOException {
		response.sendRedirect("/pc/backindex.pc");
	}

}
