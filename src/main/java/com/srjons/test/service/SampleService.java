package com.srjons.test.service;

import com.srjons.test.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleService extends JpaRepository<Model, Integer> {
}
