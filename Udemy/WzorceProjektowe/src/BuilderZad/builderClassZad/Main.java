package BuilderZad.builderClassZad;

import BuilderZad.builderClassZad.flightLeg.FlightLeg;
import BuilderZad.builderClassZad.flightLeg.MethodWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        LinkedList<FlightLeg> AirPortWarszawa = new LinkedList<>();
        LinkedList<FlightLeg> AirPortGdańsk = new LinkedList<>();
        LinkedList<FlightLeg> AirPortPoznań = new LinkedList<>();
        LinkedList<FlightLeg> AirPortSzczecinGoleniow = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        MethodWrite methodWrite = new MethodWrite();

        String fileName ;
        FileWriter fileWriter = null;

//        boolean add = true;
        int counter = 1;

        String surname;
        String forname;
        String age;
        String weight;
        String growth;
        String plane;
        String terminal;
        String ticketClass;
        String from;
        String to;
        String price;
        String delayed;

        int mainChoice;
        int wchoice;
        int gchoice;
        int pchoice;
        int sgchoice;


        System.out.println("choise of AirPort \nWarszawa = 1, Gdańsk = 2, Poznań = 3, Szczecin Goleniów = 4");
        mainChoice = scanner.nextInt();
        //scanner.next();
        switch (mainChoice) {
            // -------------------------- Warszawa -----------------------------------------------
            case 1: {
                //TODO obsługa Lotniska warszawa
                boolean backW;
                do {
                    System.out.println("Welcome to Warsaw AirPort");
                    System.out.println("Add new Pasager = 1\n Load the Pasenger = 2\n Remove the pasager = 3\nBack = 4 ");
                    wchoice = scanner.nextInt();
                   // scanner.next();
                    switch (wchoice) {
                        case 1: {
                            //ToDo Add
                            backW = false;
                            boolean addLW=true;
                            int counterAddW = 0;

                            do {
                                Scanner scannerWarszawa = new Scanner(System.in);
                                System.out.println("Enter passenger nr" + counterAddW + " details");
                                System.out.println("Surname:");
                                surname = scannerWarszawa.nextLine();
                                System.out.println("Forname: ");
                                forname = scannerWarszawa.nextLine();
                                System.out.println("Age");
                                age = scannerWarszawa.nextLine();
                                System.out.println("Weight");
                                weight = scannerWarszawa.nextLine();
                                System.out.println("Growth");
                                growth = scannerWarszawa.nextLine();
                                System.out.println("Plane: ");
                                plane = scannerWarszawa.nextLine();
                                System.out.println("Terminal: ");
                                terminal = scannerWarszawa.nextLine();
                                System.out.println("Ticket Class ");
                                ticketClass = scannerWarszawa.nextLine();
                                System.out.println("From: ");
                                from = scannerWarszawa.nextLine();
                                System.out.println("To: ");
                                to = scannerWarszawa.nextLine();
                                System.out.println("Price: ");
                                price = scannerWarszawa.nextLine();
                                System.out.println("Delayed: ");
                                delayed = scannerWarszawa.nextLine();
                                //scannerWarszawa.close();
                                FlightLeg flightLegW = new FlightLeg.FlightLegBuilder()
                                        .buildSurname(surname)
                                        .buildForname(forname)
                                        .buildAge(age)
                                        .buildWeight(weight)
                                        .buildGrowth(growth)
                                        .buildPlane(plane)
                                        .buildTerminal(terminal)
                                        .buildTicketClass(ticketClass)
                                        .buildFrom(from)
                                        .buildTo(to)
                                        .buildPrice(price)
                                        .buildDelayed(delayed)
                                        .build();
                                AirPortWarszawa.add(flightLegW);
                                counterAddW++;


                                String addw;
                                boolean againw;
                                do {
                                    System.out.println("Add new passenger? Yes/No");
                                    addw = scanner.nextLine();
                                    if (addw.equals("Yes")) {
                                        addLW=true;
                                        againw = false;
                                    } else if (addw.equals("No")) {
                                        addLW=false;
                                        againw = false;
                                    } else {
                                        System.out.println("Wrong Answer");
                                        againw = true;
                                    }
                                }
                                while (againw);

                            }while (addLW == true);

                        } break;

                        case 2: {
                            //ToDo Load
                            //ToDo BufferedReader;
                            backW = false;
                            int sizeLW = AirPortWarszawa.size();
                            if(sizeLW>0){
                                System.out.println("Number of passengers"+AirPortWarszawa.size());
                                int counterLW=0;

                                for(int i =0;i<sizeLW;i++){
                                    System.out.println("Passenger"+counterLW +AirPortWarszawa.get(i));
                                }
                                String SaveListW;
                                System.out.println("SaveList? = Yes" );
                                SaveListW = scanner.nextLine();
                                scanner.next();
                                if(SaveListW.equals("Yes")){
                                    try {
                                        fileName = "ListPassengers";
                                        fileWriter = new FileWriter(fileName);
                                        for (int i=0;i<sizeLW;i++) {
                                            //fileWriter.write(String.valueOf(AirPortWarszawa.get(i)));
                                        }
                                    } catch (IOException ex) {
                                        System.out.println();
                                    }finally {
                                        if (fileWriter == null){
                                            System.out.println("Problem");
                                            fileWriter.close();
                                        }else
                                            fileWriter.close();
                                    }

                                }else {
                                    System.out.println("");
                                }


//                                do{
//                                    System.out.println("Passenger"+counterLW +AirPortWarszawa.get(counterLW));
//                                    counterLW++;
//                                }while (counterLW==AirPortWarszawa.size());
                            }else System.out.println("List Passengers AirPort Warszawa is Empty");



                        }break;

                        case 3: {
                            //ToDo Remove
                            backW = false;

                        }break;

                        case 4: {
                            //ToDo Back
                            backW = true;

                        }break;

                        default: {
                            backW = false;
                            System.out.println("Itroduced Wrong Value");
                        }break;
                    }
                } while (backW == false);
            }break;
            // --------------------------- Gdańsk ------------------------------------------------
            case 2: {
                //TODO obsługa Lotniska Gdańsk
                boolean backG;
                do {
                    System.out.println("Welcome to Gdańsk AirPort");
                    System.out.println("Add new Pasager = 1\n Load the Pasenger = 2\n Remove the pasager = 3\nBack = 4 ");
                    gchoice = scanner.nextInt();
                    switch (gchoice) {
                        case 1: {
                            //ToDo Add
                            backG = false;
                            boolean addLG = true;
                            do {
                                Scanner scannerGdańsk = new Scanner(System.in);
                                System.out.println("Enter passenger nr" + counter + " details");
                                System.out.println("Surname:");
                                surname = scannerGdańsk.nextLine();
                                System.out.println("Forname: ");
                                forname = scannerGdańsk.nextLine();
                                System.out.println("Age");
                                age = scannerGdańsk.nextLine();
                                System.out.println("Weight");
                                weight = scannerGdańsk.nextLine();
                                System.out.println("Plane: ");
                                plane = scannerGdańsk.nextLine();
                                System.out.println("Terminal: ");
                                terminal = scannerGdańsk.nextLine();
                                System.out.println("Ticket Class ");
                                ticketClass = scannerGdańsk.nextLine();
                                System.out.println("From: ");
                                from = scannerGdańsk.nextLine();
                                System.out.println("To: ");
                                to = scannerGdańsk.nextLine();
                                System.out.println("Price: ");
                                price = scannerGdańsk.nextLine();
                                System.out.println("Delayed: ");
                                delayed = scannerGdańsk.nextLine();
                                FlightLeg flightLegG = new FlightLeg.FlightLegBuilder()
                                        .buildSurname(surname)
                                        .buildForname(forname)
                                        .buildAge(age)
                                        .buildWeight(weight)
                                        .buildPlane(plane)
                                        .buildTerminal(terminal)
                                        .buildTicketClass(ticketClass)
                                        .buildFrom(from)
                                        .buildTo(to)
                                        .buildPrice(price)
                                        .buildDelayed(delayed)
                                        .build();
                                AirPortGdańsk.add(flightLegG);


                                String addg;
                                boolean againg;
                                do {
                                    System.out.println("Add new passenger? Yes/No");
                                    addg = scannerGdańsk.nextLine();
                                    if (addg.equals("Yes")) {
                                        addLG=true;
                                        againg = false;
                                    } else if (addg.equals("No")) {
                                        addLG=false;
                                        againg = false;
                                    } else {
                                        System.out.println("Wrong Answer");
                                        againg = true;
                                    }
                                }
                                while (againg);

                            }while (addLG ==true);

                        }break;

                        case 2: {
                            //ToDo Load
                            backG = false;

                        }break;

                        case 3: {
                            //ToDo Remove
                            backG = false;

                        }break;

                        case 4: {
                            //ToDo Back
                            backG = true;
                        }break;

                        default: {
                            backG = false;
                            System.out.println("Itroduced Wrong Value");
                        }break;
                    }
                } while (backG == false);
            }break;
            // --------------------------- Poznań ------------------------------------------------
            case 3: {
                //TODO obsługa Lotniska Poznań
                boolean backP;
                do {
                    System.out.println("Welcome to Poznań AirPort");
                    System.out.println("Add new Pasager = 1\nLoad the Pasenger = 2\nRemove the pasager = 3\nBack = 4 ");
                    pchoice = scanner.nextInt();
                    switch (pchoice) {
                        case 1: {
                            //ToDo Add
                            backP = false;
                            boolean addLP = true;

                        do {
                            Scanner scannerPoznań = new Scanner(System.in);
                            System.out.println("Enter passenger nr" + counter + " details");
                            System.out.println("Surname:");
                            surname = scannerPoznań.nextLine();
                            System.out.println("Forname: ");
                            forname = scannerPoznań.nextLine();
                            System.out.println("Age");
                            age = scannerPoznań.nextLine();
                            System.out.println("Plane: ");
                            plane = scannerPoznań.nextLine();
                            System.out.println("Terminal: ");
                            terminal = scannerPoznań.nextLine();
                            System.out.println("Ticket Class ");
                            ticketClass = scannerPoznań.nextLine();
                            System.out.println("From: ");
                            from = scannerPoznań.nextLine();
                            System.out.println("To: ");
                            to = scannerPoznań.nextLine();
                            System.out.println("Price: ");
                            price = scannerPoznań.nextLine();
                            System.out.println("Delayed: ");
                            delayed = scannerPoznań.nextLine();
                            FlightLeg flightLegP = new FlightLeg.FlightLegBuilder()
                                    .buildSurname(surname)
                                    .buildForname(forname)
                                    .buildAge(age)
                                    .buildPlane(plane)
                                    .buildTerminal(terminal)
                                    .buildTicketClass(ticketClass)
                                    .buildFrom(from)
                                    .buildTo(to)
                                    .buildPrice(price)
                                    .buildDelayed(delayed)
                                    .build();
                            AirPortPoznań.add(flightLegP);

                            String addp;
                            boolean againp;
                            do {
                                System.out.println("Add new passenger? Yes/No");
                                addp = scannerPoznań.nextLine();
                                if (addp.equals("Yes")) {
                                    addLP=true;
                                    againp = false;
                                } else if (addp.equals("No")) {
                                    addLP=false;
                                    againp = false;
                                } else {
                                    System.out.println("Wrong Answer");
                                    againp = true;
                                }
                            }
                            while (againp);
                        }while (addLP ==true);

                        }break;

                        case 2: {
                            //ToDo Load
                            backP = false;

                        }break;

                        case 3: {
                            //ToDo Remove
                            backP = false;

                        }break;

                        case 4: {
                            //ToDo Back
                            backP = true;
                        }break;

                        default: {
                            backP = false;
                            System.out.println("Itroduced Wrong Value");

                        }break;
                    }
                } while (backP == false);
            }break;
            // ----------------------- Szczecin-Golenow-------------------------------------------
            case 4: {
                //TODO obsługa Lotniska Szczecin-Goleniów
                boolean backSG;
                do {
                    System.out.println("Welcome to Szczecin-Goleniów AirPort");
                    System.out.println("Add new Pasager = 1,\n Load the Pasenger = 2\n Remove the pasager = 3\nBack = 4 ");
                    sgchoice = scanner.nextInt();
                    switch (sgchoice) {
                        case 1: {
                            //ToDo Add
                            backSG = false;
                            boolean addLSG = true;

                        do {
                            Scanner scannerSzczecinGoleniow = new Scanner(System.in);
                            System.out.println("Enter passenger nr" + counter + " details");
                            System.out.println("Surname:");
                            surname = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Forname: ");
                            forname = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Plane: ");
                            plane = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Terminal: ");
                            terminal = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Ticket Class ");
                            ticketClass = scannerSzczecinGoleniow.nextLine();
                            System.out.println("From: ");
                            from = scannerSzczecinGoleniow.nextLine();
                            System.out.println("To: ");
                            to = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Price: ");
                            price = scannerSzczecinGoleniow.nextLine();
                            System.out.println("Delayed: ");
                            delayed = scannerSzczecinGoleniow.nextLine();
                            FlightLeg flightLegSG = new FlightLeg.FlightLegBuilder()
                                    .buildSurname(surname)
                                    .buildForname(forname)
                                    .buildPlane(plane)
                                    .buildTerminal(terminal)
                                    .buildTicketClass(ticketClass)
                                    .buildFrom(from)
                                    .buildTo(to)
                                    .buildPrice(price)
                                    .buildDelayed(delayed)
                                    .build();
                            AirPortSzczecinGoleniow.add(flightLegSG);

                            String addsg;
                            boolean againsg;
                            do {
                                System.out.println("Add new passenger? Yes/No");
                                addsg = scannerSzczecinGoleniow.nextLine();
                                if (addsg.equals("Yes")) {
                                    addLSG=true;
                                    againsg = false;
                                } else if (addsg.equals("No")) {
                                    addLSG=false;
                                    againsg = false;
                                } else {
                                    System.out.println("Wrong Answer");
                                    againsg = true;
                                }
                            }
                            while (againsg);
                        }while (addLSG==true);



                        }break;

                        case 2: {
                            //ToDo Load
                            backSG = false;

                        }break;

                        case 3: {
                            //ToDo Remove
                            backSG = false;

                        }break;
                        case 4: {
                            //ToDo Back
                            backSG = true;
                        }break;

                        default: {
                            backSG = false;
                            System.out.println("Itroduced Wrong Value");

                        }break;
                    }
                } while (backSG == false);

            }break;


        }
    }


}
        ///////////////////////////////////////////////////////////////////////////////////////////
//
//    String surname;
//    String forname;
//    String age;
//    String weight;
//    String growth;
//    String plane;
//    String terminal;
//    String ticketClass;
//    String from;
//    String to;
//    String price;
//    String delayed;
//       // Port lotniczy Warszawa
//        do {
//            System.out.println("Enter passenger nr" + counter + " details");
//            System.out.println("Surname:");
//            surname = scanner.nextLine();
//            System.out.println("Forname: ");
//            forname = scanner.nextLine();
//            System.out.println("Age");
//            age = scanner.nextLine();
//            System.out.println("Weight");
//            weight = scanner.nextLine();
//            System.out.println("Plane: ");
//            plane = scanner.nextLine();
//            System.out.println("Terminal: ");
//            terminal = scanner.nextLine();
//            System.out.println("Ticket Class ");
//            ticketClass = scanner.nextLine();
//            System.out.println("From: ");
//            from = scanner.nextLine();
//            System.out.println("To: ");
//            to = scanner.nextLine();
//            System.out.println("Price: ");
//            price = scanner.nextLine();
//            System.out.println("Delayed: ");
//            delayed = scanner.nextLine();
//
//        FlightLeg flightLeg1 = new FlightLeg.FlightLegBuilder()
//                .buildSurname(surname)
//                .buildForname(forname)
//                .buildAge(age)
//                .buildWeight(weight)
//                .buildPlane(plane)
//                .buildTerminal(terminal)
//                .buildTicketClass(ticketClass)
//                .buildFrom(from)
//                .buildTo(to)
//                .buildPrice(price)
//                .buildDelayed(delayed)
//                .build();
//
//        System.out.println(flightLeg1);
//        counter++;
//        LotniskoWarszawa.add(flightLeg1);
//            System.out.println("Licznik wynosi :" + counter);
//            if(counter==3){
//                for (int i =0; i<LotniskoWarszawa.size();i++){
//                    System.out.println(LotniskoWarszawa.get(i));
//                }
//                System.out.println(LotniskoWarszawa);
//                add = false;
//            }
//        }while (add==true);

//        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder()
//                .buildSurname("Pawel")
//                .buildForname("Szeligowski")
//                .buildAge("")
//                .buildPlane("Airbus A380")
//                .buildTerminal("first")
//                .buildTicketClass("first")
//                .buildFrom("Las Vegas")
//                .buildTo("Los Angeles")
//                .buildPrice("50")
//                .buildDelayed("false")
//                .build();
//
//        System.out.println(flightLeg);


