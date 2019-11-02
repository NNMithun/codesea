package com.PhotoOrganizer;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class PhotosOrganizer {

    private static long  whatsappVideos=0;

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("./src/main/java/com/PhotoOrganizer/fileName.txt");   //reads the file
        //createFile(fr);
        File folder = new File("./src/main/java/com/PhotoOrganizer/fileDirectory/");
        File[] listOfFiles = folder.listFiles();

        long totalvideos=0;
        long totaljpg=0;
        long totalpng=0;
        long totaljpeg=0;
        long totalMedia=0;
        for (File f: listOfFiles) {
            BasicFileAttributes attr = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
            totalMedia++;
            if(Pattern.matches("^.*.mp4||^.*.3gp||^.*.mkv",f.getName()))
            {
                totalvideos++;

            }
            else if(Pattern.matches("^.*.jpg||^.*.JPG",f.getName()))
            {
                totaljpg++;
                Files.move(Paths.get(f.getAbsolutePath()),Paths.get("/Users/mithun/OneDrive - hunanxiaoue/mygitDir/codesea/devcode/src/main/java/com/PhotoOrganizer/fileDirectory/photos"), REPLACE_EXISTING, ATOMIC_MOVE);
            }
            else if(Pattern.matches("^.*.png",f.getName()))
            {
                totalpng++;


            }
            else if(Pattern.matches("^.*.jpeg",f.getName()))
            {
                totaljpeg++;

            }else {
                System.out.println(f.getName());
            }



        }
        System.out.println("totalMedia "+totalMedia);
        System.out.println("totalvideos "+totalvideos);
        System.out.println("totaljpg "+totaljpg);
        System.out.println("totalpng "+totalpng);
        System.out.println("totaljpeg "+totaljpeg);
        System.out.println("difference "+ (totalMedia-(totaljpeg+totalvideos+totalpng+totaljpg)));





    }

    private static void getCountOfWhatsaAppVideos(File f) {
        System.out.println(f.getName());
        if(Pattern.matches("^.*WA.*.mp4",f.getName())){
            whatsappVideos++;
        }
    }


    private static void createFile(FileReader fr) throws IOException {
        BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
        StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
        String line;
        int count=0;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
            new FileWriter(new File("./src/main/java/com/PhotoOrganizer/fileDirectory/"+line));
            count++;

        }
    }
}
