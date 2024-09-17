package com.tenantmanagement.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TenantLoginController {

    @GetMapping("/tenantLogin")
    public String tenantLogin() {
        return "TenantLogin";  // This should correspond to your template name (TenantLogin.html).
    }
}
