package com.euroceramica.dashboard.webController;

import com.euroceramica.dashboard.domain.Users;
import com.euroceramica.dashboard.domain.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersService.getAll();
    }
}
