package application;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Client;
import entities.Product;
import enums.Status;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Criando o objeto Client
        System.out.println("Client: ");
        System.out.print("ID: ");
        Long clientID = sc.nextLong();
        sc.nextLine();
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Client client = new Client(clientID, clientName, email);

        System.out.print("How many orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Order #" + i + ":");
            System.out.print("ID: ");
            Long orderID = sc.nextLong();
            sc.nextLine();
            System.out.print("Order Date: ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Status: ");
            Status status = Status.valueOf(sc.nextLine().toUpperCase());

            System.out.println();
            System.out.print("How many products: ");
            int m = sc.nextInt();

            Set<Product> setProduct = new HashSet<>();

            for (int j = 1; j <= m; j++) {
                System.out.println("Product #" + j + ":");
                System.out.print("ID: ");
                Long productID = sc.nextLong();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                BigDecimal price = sc.nextBigDecimal();
                sc.nextLine();
                System.out.print("Category: ");
                String category = sc.nextLine();

                Product product = new Product(productID, name, price, category);

                setProduct.add(product);
            }

            setProduct.forEach(System.out::println);
        }

        sc.close();
    }
}
