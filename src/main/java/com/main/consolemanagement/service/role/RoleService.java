package com.main.consolemanagement.service.role;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    Role getRoleById(UUID id);

    Role getRoleByName(String name);

    List<Role> getRolesByRank(Rank rank);

    Role createRole(Role role);

    Role updateRole(Role role);

    void deleteRole(Role role);

    void deleteRoleById(UUID id);

    void deleteRoleByName(String name);

    List<Role> getAllRoles();
}
