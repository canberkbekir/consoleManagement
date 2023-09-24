package com.main.consolemanagement.controller;

import com.main.consolemanagement.model.Role;
import com.main.consolemanagement.service.role.RoleService;
import org.aspectj.apache.bcel.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping(value = "create",consumes = "application/json",produces = "application/json")
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }

    @GetMapping("getAll")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
}
