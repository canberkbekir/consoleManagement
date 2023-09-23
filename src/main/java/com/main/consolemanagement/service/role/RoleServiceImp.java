package com.main.consolemanagement.service.role;

import com.main.consolemanagement.model.Role;
import com.main.consolemanagement.repository.role.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImp implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRoleById(UUID id) {

        return roleRepository.getById(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return null;
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(Role role) {

    }

    @Override
    public void deleteRoleById(UUID id) {

    }

    @Override
    public void deleteRoleByName(String name) {

    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
