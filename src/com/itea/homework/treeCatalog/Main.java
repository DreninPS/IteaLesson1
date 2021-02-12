package com.itea.homework.treeCatalog;

import java.io.File;
import java.util.Objects;

public class Main {

    private static int count = 0;
    public static void main(String[] args) {
        File dir = new File("d://");
        treeCatalog(dir);
        int count=0;
    }
private static String tabulation(){
        String s = "";
        if (count == 0) return "";
        for (int i = 0; i <count ; i++) {
            s=s+"\t";}
        return s;}

private static void treeCatalog (File catalog) throws NullPointerException{

        if (catalog.isDirectory()) {
            try {
                for (File file : Objects.requireNonNull(catalog.listFiles())) {
                    if (file.isDirectory()) {
                        count++;
                        System.out.println(tabulation() + file.getName() + "\t folder");
                        treeCatalog(file);
                        count--;
                    } else {
                        System.out.println(tabulation() + "\t" + file.getName() + "\t file");
                    }
                }
            }
            catch (NullPointerException e){
                System.out.println(e);
            }
        }
        }

    }
