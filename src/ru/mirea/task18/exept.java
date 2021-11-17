package ru.mirea.task18;

import java.io.FileReader;
import java.io.IOException;

public class exept {
        public static void main (String[] args) {
            try(FileReader reader = new
                    FileReader("banssss.txt"))
            {
                    System.out.print("no error");
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
