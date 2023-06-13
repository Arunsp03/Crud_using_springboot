package com.example.userdata.repository;

import com.example.userdata.entity.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<entity,Long> {
    @Modifying
    @Transactional
    @Query(
            value = "delete from entity e where e.email=:email",
            nativeQuery = true

    )
    public void deletebyemail(@Param("email") String email);


}
