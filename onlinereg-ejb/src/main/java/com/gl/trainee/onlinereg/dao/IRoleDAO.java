package com.gl.trainee.onlinereg.dao;

import java.util.List;

import com.gl.trainee.onlinereg.model.Role;

public interface IRoleDAO {
	
	public void addRole(Role role);
	
	public void delete(Role role);
	
	public List<Role> getRoles();

	public Role getRole(int id);

}
