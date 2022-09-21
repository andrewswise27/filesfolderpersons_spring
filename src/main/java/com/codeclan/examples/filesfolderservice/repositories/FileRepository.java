package com.codeclan.examples.filesfolderservice.repositories;

import com.codeclan.examples.filesfolderservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
