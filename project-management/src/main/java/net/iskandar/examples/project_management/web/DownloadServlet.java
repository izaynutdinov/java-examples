/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.iskandar.examples.project_management.dao.DocumentDao;
import net.iskandar.examples.project_management.domain.Document;
import net.iskandar.examples.project_management.service.ProjectManagementService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author iskandar
 */

public class DownloadServlet extends HttpServlet {

    private static final Logger log = LogManager.getLogger(DownloadServlet.class);
    
    @Autowired
    private DocumentDao documentDao;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("doGet");
        String id = req.getParameter("id");
        String userHomeDirName = System.getProperty("user.home");
        File userHomeDir = new File(userHomeDirName);
        File projectManagementDir = new File(userHomeDir, ProjectManagementService.PROJECT_MANAGEMENT_ROOT_DIR_NAME);
        File fileStoreDir = new File(projectManagementDir, ProjectManagementService.FILE_STORE_DIR_NAME);
        if(fileStoreDir.exists()){
            File file = new File(fileStoreDir, id + ".dat");
            if(file.exists()){
                Integer documentId = Integer.parseInt(id);
                Document document = documentDao.get(documentId);
                if(document != null){
                    resp.setContentType(document.getContentType());
                    resp.setHeader("Content-Disposition", "attachment; filename=\"" + document.getOriginalFileName() + "\"");
                }
                FileInputStream is = new FileInputStream(file);
                OutputStream os = resp.getOutputStream();
                byte[] buf = new byte[4096];
                int count = 0;
                while((count = is.read(buf)) != -1){
                    log.debug("read " + count + " bytes sending...");
                    os.write(buf, 0, count);
                }
            } else {
                resp.sendError(404, "The file requested not found!");
            }
        } else {
            resp.sendError(404, "The file requested not found!");
        }
    }
    
}
