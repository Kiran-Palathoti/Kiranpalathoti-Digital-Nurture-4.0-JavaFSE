import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSearch {

    
    private static List<String> products = new ArrayList<>();

    
    public static void loadProducts() {
        products.add("iPhone 15");
        products.add("Samsung Galaxy S24");
        products.add("Apple Watch");
        products.add("Sony Headphones");
        products.add("MacBook Air");
        products.add("Dell XPS Laptop");
        products.add("Boat Earbuds");
        products.add("Canon DSLR Camera");
        products.add("HP Printer");
        products.add("Nike Shoes");
    }

    
    public static void search(String keyword) {
        boolean found = false;
        System.out.println("Search Results for: " + keyword);

        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("➤ " + product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    
    public static void main(String[] args) {
        loadProducts();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String input = sc.nextLine();

        search(input);
        sc.close();
    }
}
