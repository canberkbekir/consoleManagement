package com.main.consolemanagement.service.role;

import com.main.consolemanagement.model.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    public Role getRoleById(UUID id);
    public Role getRoleByName(String name);
    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Role role);
    public void deleteRoleById(UUID id);
    public void deleteRoleByName(String name);
    public List<Role> getAllRoles();
}
