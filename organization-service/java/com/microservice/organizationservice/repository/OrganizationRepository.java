package com.microservice.organizationservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.organizationservice.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
