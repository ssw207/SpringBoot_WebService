package com.song.woo.member.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.song.woo.member.domain.Memeber;

public interface MemberDao extends JpaRepository<Memeber, String> {

}
