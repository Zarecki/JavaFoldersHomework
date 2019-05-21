package com.codeclan.filesandfolders.FilesAndFolders.components;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import com.codeclan.filesandfolders.FilesAndFolders.models.User;
import com.codeclan.filesandfolders.FilesAndFolders.repositories.FilesRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repositories.FoldersRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FoldersRepository foldersRepository;

    @Autowired
    FilesRepository filesRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User drFreeman = new User("Gordon Freeman");
        userRepository.save(drFreeman);

        Folder documents = new Folder("Documents", drFreeman);
        foldersRepository.save(documents);

        Folder pictures = new Folder("Pictures", drFreeman);
        foldersRepository.save(pictures);

        File coverLetter = new File("Cover Letter Template", ".docx", 124, documents);
        filesRepository.save(coverLetter);

        File curriculumVitae = new File("CVDraft", ".pdf", 454, documents);
        filesRepository.save(curriculumVitae);

        File wallpaper = new File("Wallpaper", ".png", 342, pictures);
        filesRepository.save(wallpaper);

        File profile = new File("Profile Pic", ".jpeg", 231, pictures);
        filesRepository.save(profile);

        documents.addFile(coverLetter);
        documents.addFile(curriculumVitae);
        pictures.addFile(wallpaper);
        pictures.addFile(profile);
        foldersRepository.save(documents);
        foldersRepository.save(pictures);
    }
}
