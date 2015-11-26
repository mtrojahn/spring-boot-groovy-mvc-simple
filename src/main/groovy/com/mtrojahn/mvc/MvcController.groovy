package com.mtrojahn.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MvcController {
    @RequestMapping(value = "/")
    def @ResponseBody hello() {
        return "Hello World!"
    }
}
