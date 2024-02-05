package com.camosquerab.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
