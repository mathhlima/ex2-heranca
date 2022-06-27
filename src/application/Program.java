package application;

import entities.Product;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("product #" + i + " data");
            System.out.print("common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("price: ");
            Double price = sc.nextDouble();

            if (ch == 'u') {
                System.out.print("manufacture data (dd/mm/yyyy): ");
                String date = sc.nextLine();
            } else if (ch == 'i') {
                System.out.print("custons fee: ");
                double custons = sc.nextDouble();
            }

            list.add(new Product(name, price));
        }

        System.out.println();
        System.out.println("price tags: ");
        for (Product pro : list) {
            System.out.println(pro.getName() + " - $ " + String.format("%.2f", pro.priceTag()));
        }

    }
}
