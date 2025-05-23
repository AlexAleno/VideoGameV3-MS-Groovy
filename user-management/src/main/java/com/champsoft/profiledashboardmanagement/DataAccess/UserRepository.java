package com.champsoft.profiledashboardmanagement.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,UserId> {

    User findUserByUserId_uuid(String uuid);

    boolean existsByUserId(UserId userId);
}
