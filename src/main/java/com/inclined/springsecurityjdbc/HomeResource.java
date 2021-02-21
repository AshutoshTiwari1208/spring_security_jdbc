package com.inclined.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getHomePage() {
        return("<h2> This is accessible to everyone... welcome</h2>");
    }

    @GetMapping("/user")
    public String getUsersHomePage() {
        return("<h2> Only users are allowed!!, welcome</h2>");
    }

    @GetMapping("/admin")
    public String getAdminsHomePage() {
        return("<h2> Admin's Page!! Welcome @Admin</h2>");
    }

}
