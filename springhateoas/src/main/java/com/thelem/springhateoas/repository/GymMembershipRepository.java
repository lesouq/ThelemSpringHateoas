package com.thelem.springhateoas.repository;

import com.thelem.springhateoas.entity.GymMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymMembershipRepository extends JpaRepository<GymMembership, Long> {}
