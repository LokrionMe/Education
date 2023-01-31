package Java.sem5;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        Filemanager fm = new Filemanager();
        Handler filehandler = new FileHandler("./Java/sem5/logi.log");
        logger.setUseParentHandlers(false);
        logger.addHandler(filehandler);
        Addressbook book1 = new Addressbook();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Choose number:\n1. Show adressbook\n2. Load Addressbook\n3. Upload Addressbook\n4. Exit");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    System.out.println(book1.getAdressbook());
                    logger.info("show book");
                    break;
                case 2:
                    fm.importFile(book1);
                    logger.info("Load");
                    System.out.println("Load complete");
                    break;
                case 3:
                    fm.exportFile(book1);
                    logger.info("Upload");
                    System.out.println("Upload complete");
                    break;
                case 4:
                    System.exit(input);
            }
        }
    }
}
