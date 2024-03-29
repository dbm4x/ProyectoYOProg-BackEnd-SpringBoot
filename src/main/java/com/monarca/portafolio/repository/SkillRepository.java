package com.monarca.portafolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monarca.portafolio.model.Skill;

@Repository

public interface SkillRepository extends JpaRepository <Skill, Long> {

}
