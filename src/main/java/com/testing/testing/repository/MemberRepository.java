package com.testing.testing.repository;
import com.testing.testing.entity.BookEntity;
import com.testing.testing.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}

