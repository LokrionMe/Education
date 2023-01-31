package Java.sem5;

import java.io.*;

public class Filemanager {
    String FILE_PATH = "./Java/sem5/";
    String FILE_NAME_EXPORT = "export.csv";

    public void exportFile(Addressbook book1) {
        try (FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false)) {
            writer.write(book1.getAdressbook());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void importFile(Addressbook book) {
        try {
            File file = new File(FILE_PATH + FILE_NAME_EXPORT);
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                // System.out.println(line);
                String[] tmp = line.split(";", 0);
                book.addPhonebook(new Phonebook(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
