package com.codeclan.filesandfolders.FilesAndFolders.projections;

import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getName();
}
