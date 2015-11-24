package com.mtrojahn.mvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by trojahn on 11/24/15.
 */

@Controller
class MvcController {

    @RequestMapping(value = "/")
    public @ResponseBody String hello() {
        return "Hello World!"
    }
}
