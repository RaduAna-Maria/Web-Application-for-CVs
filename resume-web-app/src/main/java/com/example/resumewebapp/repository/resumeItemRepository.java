package com.example.resumewebapp.repository;
import com.example.resumewebapp.model.resumeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface resumeItemRepository extends JpaRepository<resumeItem, Long>{
    Optional<resumeItem> findByName(String name);
}
