import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonReader
{

    public static void main(String[] args)
    {
        ArrayList<Person> listOne = new ArrayList<>();

        JFileChooser chooser = new JFileChooser();
        File selectedFile;

        String iD = "";
        String fName = "";
        String lName = "";
        String title = "";
        String data = "";

        int yob;




        try
        {
            File PersonData = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(PersonData);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));



                System.out.printf(" %-10s  %-10s  %-10s  %-10s  %-10s", "ID#", "FName", "LName", "Title", "YOB");
                System.out.printf("%n========================================================%n");

                while (reader.ready())
                {
                    data = reader.readLine();
                    String[] arrOfdata = data.split(", ", 6);

                    iD = arrOfdata[0];
                    fName = arrOfdata[1];
                    lName = arrOfdata[2];
                    title = arrOfdata[3];
                    yob = Integer.parseInt(arrOfdata[4]);


                    Person record = new Person(fName, lName, title, iD, yob);
                    listOne.add(record);

                    System.out.printf(" %-10s  %-10s  %-10s  %-10s  %-10s%n", fName, lName, title, iD, yob);

                    System.out.println(record.getFullName());


                }
                reader.close();


                System.out.println("\n\nfile read");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }





    }

}
