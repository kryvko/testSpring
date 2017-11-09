package ua.kryvko.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.kryvko.testspring.beans.User;
import ua.kryvko.testspring.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Controller

public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String getUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "index";
    }
}
