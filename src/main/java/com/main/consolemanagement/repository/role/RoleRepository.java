package com.main.consolemanagement.repository.role;

import com.main.consolemanagement.model.Rank;
import com.main.consolemanagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
    Role findFirstByName(String name);

    List<Role> getRolesByRank(Rank rank);

}
