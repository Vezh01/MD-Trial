package org.example;
import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Hello and welcome!");
        System.out.println("Insert the medicine name, price, and quantity");
        Scanner myObj =  new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("user.json"));

        String name = myObj.nextLine();
        String price = myObj.nextLine();
        String count = myObj.nextLine();

        System.out.printf("Name = " + name + "\n");
        System.out.printf("Price = Rp. " + price + "\n");
        System.out.printf("Quantity = " + count + "\n");
        Gson gson = new Gson();
        User user = new User();

        user.name = name;
        user.price = price;
        user.count = count;

        String json = gson.toJson(user);
        writer.write(json);
        writer.close();

    }
}
