package com.restapi.book.springbootrestapi.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    // public final String UPLOAD_DIR = "F:\\Jul24CT-Internship-20241211T101710Z-001\\Spring-Boot\\code\\springbootrestapi\\src\\main\\resources\\static\\images";
    
    public final String UPLOAD_DIR = new ClassPathResource("static/images/").getFile().getAbsolutePath(); 

    public FileUploadHelper() throws IOException{
        
    }

    public boolean uploadFile(MultipartFile file) {

        boolean flag = false;

        try {
            // 1
            // Reading
            InputStream is = file.getInputStream();
            byte[] fileData = new byte[is.available()];
            is.read(fileData);

            // Writing
            FileOutputStream fos = new FileOutputStream(UPLOAD_DIR + File.separator + file.getOriginalFilename());
            fos.write(fileData);

            // 2
            // byte[] fileData = file.getBytes();
            // FileOutputStream fos = new
            // FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename());
            // fos.write(fileData);

            fos.flush();
            fos.close();

            // 3
            // Files.copy(file.getInputStream(),
            // Paths.get(UPLOAD_DIR+File.separator+file.getOriginalFilename()),
            // StandardCopyOption.REPLACE_EXISTING);

            flag = true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return flag;
    }
}
