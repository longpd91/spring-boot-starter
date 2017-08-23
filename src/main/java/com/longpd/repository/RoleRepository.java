package com.longpd.repository;

import com.longpd.domain.Role;
 import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);

}