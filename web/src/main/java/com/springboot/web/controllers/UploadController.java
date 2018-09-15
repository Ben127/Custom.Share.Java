package com.springboot.web.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@Controller
@RequestMapping("/upload")
public class UploadController extends BaseController {

    @RequestMapping("")
    public String index() {
        return "/upload/index";
    }

    @Value("${custom.upload}")
    private String filePath;

    @ResponseBody
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public Object postIndex(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {

            String path = "";
            try {

                path = filePath + "/" + file.getOriginalFilename();

                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(path)));

                out.write(file.getBytes());
                out.flush();
                out.close();

            } catch (FileNotFoundException e) {

                e.printStackTrace();
                return UploadUnSuccess("上传失败," + e.getMessage());

            } catch (IOException e) {

                e.printStackTrace();

                return UploadUnSuccess("上传失败," + e.getMessage());

            }

            return UploadSuccess(path);

        } else {

            return UploadUnSuccess("上传失败，因为文件是空的.");

        }

    }

}
