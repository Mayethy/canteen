package org.lyq.canteen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: RedirectController
 * Package: org.lyq.canteen.controller
 * Description:
 *
 * @author 林宁
 * 2024/12/23 12:23
 */
@Controller
@RequestMapping("/")
public class RedirectController {

    @GetMapping
    public void redirectLogin(HttpServletResponse response) throws IOException {
        response.sendRedirect("/backend/page/login/login.html");
    }
}
