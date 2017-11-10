package ua.kryvko.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.kryvko.testspring.repository.RoleRepository;

@Controller
public class RoleController{

    RoleRepository roleRepository;

    @Autowired
    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @RequestMapping("/roles")
    public String getRoles(Model model) {

        model.addAttribute("roles", roleRepository.findAll());
        return "roles";
    }
}
