package com.tejatummalapalli.instateam.service;

import com.tejatummalapalli.instateam.dao.RoleDao;
import com.tejatummalapalli.instateam.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public List<Role> getAllRoles() {
       return roleDao.getAllRoles();
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }
}
