import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter document type (word/pdf): ");
        String type = sc.nextLine();

        Document doc = DocumentFactory.createDocument(type);
        doc.open();

        sc.close();
    }
}
