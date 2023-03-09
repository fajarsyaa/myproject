import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHanding {
    public static void main(String[] args) {

        try {
            /**
             * Membuat file
             */
            File createFile = new File("tryFile.txt");
            System.out.println("===== create file =====");

            if (createFile.createNewFile()){
                System.out.println("File created : "+createFile.getName());
            }else {
                System.out.println("file already exists");
            }

            /**
             * Membuat file + menulis di file
             */
            FileWriter writeFile = new FileWriter("fileWriter.txt");
            System.out.println("===== write file =====");

            writeFile.write("aku sayang kamu \n");
            writeFile.write("temanan iloo ga boong");
            writeFile.close();


            /**
             * Membaca File
             */
            File readFile = new File("fileWriter.txt");
            System.out.println("===== read file =====");

            Scanner myReaderFile = new Scanner(readFile);
            while (myReaderFile.hasNextLine()){
                String data = myReaderFile.nextLine();
                System.out.println(data);
            }
            myReaderFile.close();

            /**
             * Menghapus file
             */
            File deleteFile = new File("FileIniDihapus.txt");
            System.out.println("===== delete file =====");

            if (createFile.delete()){
                System.out.println("File deleted : "+deleteFile.getName());
            }else {
                System.out.println("file not found");
            }

            /**
             * list file
             */
            File listFile = new File("C:\\JavaProjects");
            System.out.println("===== read list file =====");

            String[] files = listFile.list();
            for (int i = 0; i < files.length; i++){
                System.out.println(files[i]);
            }


        }catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }

    }
}
