package problem1.main;

import problem1.system.SystemBuilderDirector;
import problem1.system.QMSystem;
import problem1.system.SystemBuilder;
import problem1.system.SystemBuilderFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                String pack,communication;
                int count;
                System.out.println("Enter Package (Deluxe/Optimal/Poor):");
                pack = scanner.next();
                System.out.println("Enter display unit count:");
                count = scanner.nextInt();
                System.out.println("Enter CommunicationModule (Wifi/Mobile):");
                communication = scanner.next();

                SystemBuilderFactory systemBuilderFactory = new SystemBuilderFactory();
                SystemBuilder systemBuilder = systemBuilderFactory.getSystemBuilder(pack);

                SystemBuilderDirector systemBuilderDirector = new SystemBuilderDirector();
                systemBuilderDirector.construct(systemBuilder,count,communication);

                QMSystem qmSystem= systemBuilder.getQMSystem();
                qmSystem.showItems();
                System.out.println("Total Cost: "+qmSystem.getCost()+"$");

            }catch (Exception e){
                System.out.println("Something went wrong...");
            }
            System.out.println("--------------------------");
        }
    }
}
