package com.codeclan.filesandfolders.FilesAndFolders.repositories;

import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import com.codeclan.filesandfolders.FilesAndFolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FoldersRepository extends JpaRepository<Folder, Long> {
}
