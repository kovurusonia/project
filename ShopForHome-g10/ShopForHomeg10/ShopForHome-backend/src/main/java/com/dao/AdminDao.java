package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Admin;




public interface AdminDao extends JpaRepository<Admin, String> {

}
