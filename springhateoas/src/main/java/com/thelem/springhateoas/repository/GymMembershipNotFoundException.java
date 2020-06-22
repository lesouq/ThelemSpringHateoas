package com.thelem.springhateoas.repository;

import lombok.Getter;

@Getter
public class GymMembershipNotFoundException extends RuntimeException {

  private final long id;

  public GymMembershipNotFoundException(final long id) {
    super("GymMembership could not be found with id: " + id);
    this.id = id;
  }

}
