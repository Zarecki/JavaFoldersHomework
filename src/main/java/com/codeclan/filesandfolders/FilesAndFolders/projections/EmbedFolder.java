package com.codeclan.filesandfolders.FilesAndFolders.projections;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();


}
