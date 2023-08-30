package com.foodEase.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodEase.model.Admin;
import com.foodEase.repository.AdminRepository;
import com.foodEase.service.interfaces.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin findByEmailAndPassword(String email, String password) {

		return adminRepository.findByEmailAndPassword(email, password);
	}
}