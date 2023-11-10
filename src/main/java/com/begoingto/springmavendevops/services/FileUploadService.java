package com.begoingto.springmavendevops.services;

import com.begoingto.springmavendevops.models.FileUpload;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    FileUpload uploadSingle(MultipartFile file);
}
