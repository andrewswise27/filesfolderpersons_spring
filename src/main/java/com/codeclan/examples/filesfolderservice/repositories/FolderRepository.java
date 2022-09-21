package com.codeclan.examples.filesfolderservice.repositories;

import com.codeclan.examples.filesfolderservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
