package ru.mirea.task15;
import java.io.*;

public class Filework {

        public static void main(String[] args) {
            java.util.Scanner in = new java.util.Scanner(System.in);
            try(FileWriter writer = new
                    FileWriter("ban.txt", false))
            {
                String text = in.nextLine();
                writer.write(text);
                writer.append('\n');
                writer.flush();
            }catch(IOException ex){
                System.out.println(ex.getMessage());

            }
            try(FileWriter anotherwriter = new
                    FileWriter("ban.txt", true))
            {
                String text = in.nextLine();
                anotherwriter.write(text);
                anotherwriter.append('\n');
                anotherwriter.append('E');
                anotherwriter.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());

        }
            try(FileReader reader = new
                    FileReader("ban.txt"))
            {
                int c;
                while((c=reader.read())!=-1){
                    System.out.print((char)c);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
