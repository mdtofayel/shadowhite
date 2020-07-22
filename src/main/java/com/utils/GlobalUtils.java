package com.utils;

import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Tofayel Ahmed on  5/25/17.
 */
public class GlobalUtils {
    public static String getDateTimeCount(Date d1) {
        Date d2 = new Date();
        long diff = d2.getTime() - d1.getTime();
        long day = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return day+"";
    }

    public static String nameToSlug(String itemTitleName){
        String replaceAllCharacterWithSpace  =  itemTitleName.replaceAll("[^\\w]"," ").toLowerCase();
        String afterSpaceRemoveDuplicateSpace = replaceAllCharacterWithSpace.replaceAll("\\s+"," ");
        String replaceSpaceFinal = afterSpaceRemoveDuplicateSpace.replaceAll("[^\\w]","-");
        return replaceSpaceFinal;
    }


    public static String getRedirectedUrl(HttpServletRequest request){
        StringBuffer requestURL = new StringBuffer(new UrlPathHelper().getPathWithinApplication(request));
        String queryString = request.getQueryString();
        String redirectedUrl = "";

        if (queryString == null) {
            redirectedUrl = new UrlPathHelper().getPathWithinApplication(request);
            return redirectedUrl;
        } else {
            redirectedUrl = requestURL.append('?').append(queryString).toString();
            return  redirectedUrl;
        }
    }



    public static String  tomcatContextPathParent(String path){
        File f = new File(path);
        String oginalpath = f.getParent();
        return oginalpath;
    }

    //unzip folder and create a folder with slug name
    public static void unZipIt(String zipFile, String outputFolder, String ifNotExitFolderThenCreate, String slug){

        byte[] buffer = new byte[1024];

        try{
            //create output directory is not exists
            File folder = new File(ifNotExitFolderThenCreate);
            if(!folder.exists()){
                folder.mkdir();
            }
            //get the zip file content
            ZipInputStream zis =
                    new ZipInputStream(new FileInputStream(zipFile));
            //get the zipped file list entry
            ZipEntry ze = zis.getNextEntry();
            int i = 0;
            while(ze!=null){
                System.out.println("_______________________________________))))))(((((((((())))))"+i++);
                String fileName = slug+""+i+""+".png";
                File newFile = new File(outputFolder + File.separator + fileName);

                System.out.println("file unzip : "+ newFile.getAbsoluteFile());

                //create all non exists folders
                //else you will hit FileNotFoundException for compressed folder
                new File(newFile.getParent()).mkdirs();

                FileOutputStream fos = new FileOutputStream(newFile);

                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                ze = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();
            System.out.println("Done");

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }


    //get address
    public static String getURLBase(HttpServletRequest request) throws MalformedURLException {
        URL requestURL = new URL(request.getRequestURL().toString());
        String port = requestURL.getPort() == -1 ? "" : ":" + requestURL.getPort();
        return requestURL.getProtocol() + "://" + requestURL.getHost() + port;

    }

}
