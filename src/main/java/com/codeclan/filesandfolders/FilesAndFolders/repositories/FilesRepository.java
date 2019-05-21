package com.codeclan.filesandfolders.FilesAndFolders.repositories;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import com.codeclan.filesandfolders.FilesAndFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FilesRepository extends JpaRepository<File, Long> {
}
