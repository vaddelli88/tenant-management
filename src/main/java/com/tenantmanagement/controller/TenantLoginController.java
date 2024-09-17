package com.tenantmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TenantLoginController {

    @GetMapping("/")
    public String home() {
        return "TenantLogin";  // This should correspond to your template name (TenantLogin.html).
    }
}
