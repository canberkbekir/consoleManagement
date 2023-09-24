package com.main.consolemanagement.service.role;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;
import com.main.consolemanagement.repository.role.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImp implements RoleService{

    private final RoleRepository roleRepository;

    public RoleServiceImp(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleById(UUID id) {

        return roleRepository.getReferenceById(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleRepository.findFirstByName(name);
    }

    @Override
    public List<Role> getRolesByRank(Rank rank) {
        return roleRepository.getRolesByRank(rank);
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
        roleRepository.delete(role);
    }

    @Override
    public void deleteRoleById(UUID id) {
        roleRepository.deleteById(id);
    }

    @Override
    public void deleteRoleByName(String name) {
        Role role = roleRepository.findFirstByName(name);
        roleRepository.delete(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
