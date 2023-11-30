package com.example.resumewebapp.service;

import java.util.Optional;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumewebapp.model.resumeItem;
import com.example.resumewebapp.repository.resumeItemRepository;

@Service
public class resumeItemService {
    @Autowired
    private resumeItemRepository repo;

    public Iterable<resumeItem> getAll(){
        return repo.findAll();
    }

    public Optional<resumeItem> getById(Long id){
        return repo.findById(id);
    }

    public resumeItem save(resumeItem item) {
        if (item.getId() == null) {
            item.setCreatedAt(Instant.now());
        }
        item.setUpdatedAt(Instant.now());

        return repo.save(item);
    }

    public void delete(resumeItem item){
        repo.delete(item);
    }

    public Optional<resumeItem> getResumeByName(String name) {
        return repo.findByName(name);
    }
}
