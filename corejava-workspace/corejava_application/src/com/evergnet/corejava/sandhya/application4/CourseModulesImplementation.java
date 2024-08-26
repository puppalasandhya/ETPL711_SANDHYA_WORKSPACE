//package com.evergnet.corejava.sandhya.application4;
//
//import java.util.Scanner;
//
//class FullstackModule extends CourseModule {
//    @Override
//    protected void selectSubModule() {
//        Scanner br = new Scanner(System.in);
//        System.out.println("------------------------");
//        System.out.println("JavaFullstack");
//        System.out.println("PythonFullstack");
//        System.out.println("DotNetstack");
//        System.out.println("------------------------------");
//        System.out.println("Enter your Sub-Module name (JavaFullstack, PythonFullstack, DotNetstack): ");
//        String submodule = br.nextLine();
//
//        switch (submodule) {
//            case "JavaFullstack":
//                itemCost = 10000;
//                break;
//            case "PythonFullstack":
//                itemCost = 15000;
//                break;
//            case "DotNetstack":
//                itemCost = 16000;
//                break;
//            default:
//                System.out.println("Invalid Sub-Module selected.");
//                break;
//        }
//        enterStudentCount(br);
//    }
//}
//
//class DbmsModule extends CourseModule {
//    @Override
//    protected void selectSubModule() {
//        Scanner br = new Scanner(System.in);
//        System.out.println("------------------------");
//        System.out.println("Rdbms");
//        System.out.println("Nosqldbms");
//        System.out.println("Networkdbms");
//        System.out.println("------------------------------");
//        System.out.println("Enter your Sub-Module name (Rdbms, Nosqldbms, Networkdbms): ");
//        String submodule = br.nextLine();
//
//        switch (submodule) {
//            case "Rdbms":
//                itemCost = 40000;
//                break;
//            case "Nosqldbms":
//                itemCost = 50000;
//                break;
//            case "Networkdbms":
//                itemCost = 44000;
//                break;
//            default:
//                System.out.println("Invalid Sub-Module selected.");
//                break;
//        }
//        enterStudentCount(br);
//    }
//}
//
//class MernstackModule extends CourseModule {
//    @Override
//    protected void selectSubModule() {
//        Scanner br = new Scanner(System.in);
//        System.out.println("------------------------");
//        System.out.println("Mongodb");
//        System.out.println("nodejs");
//        System.out.println("------------------------------");
//        System.out.println("Enter your Sub-Module name (Mongodb, nodejs): ");
//        String submodule = br.nextLine();
//
//        switch (submodule) {
//            case "Mongodb":
//                itemCost = 25000;
//                break;
//            case "nodejs":
//                itemCost = 30000;
//                break;
//            default:
//                System.out.println("Invalid Sub-Module selected.");
//                break;
//        }
//        enterStudentCount(br);
//    }
//}



package com.evergnet.corejava.sandhya.application4;

import java.util.Scanner;

class FullstackModule extends CourseModule {
    @Override
    protected void selectSubModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("s111-JavaFullstack");
        System.out.println("s112-PythonFullstack");
        System.out.println("s113-DotNetstack");
        System.out.println("------------------------------");
        System.out.println("Enter your Sub-Module name (s111, s112, s113): ");
        String submodule = br.nextLine();

        switch (submodule) {
            case "s111":
                itemCost = 10000;
                break;
            case "s112":
                itemCost = 15000;
                break;
            case "s113":
                itemCost = 16000;
                break;
            default:
                System.out.println("Invalid Sub-Module selected.");
                break;
        }
        enterStudentCount(br);
    }
}

class DbmsModule extends CourseModule {
    @Override
    protected void selectSubModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("s121-Rdbms");
        System.out.println("s122-Nosqldbms");
        System.out.println("s123-Networkdbms");
        System.out.println("------------------------------");
        System.out.println("Enter your Sub-Module name (s121, s122, s123): ");
        String submodule = br.nextLine();

        switch (submodule) {
            case "s121":
                itemCost = 40000;
                break;
            case "s122":
                itemCost = 50000;
                break;
            case "s123":
                itemCost = 44000;
                break;
            default:
                System.out.println("Invalid Sub-Module selected.");
                break;
        }
        enterStudentCount(br);
    }
}

class MernstackModule extends CourseModule {
    @Override
    protected void selectSubModule() {
        Scanner br = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("s131-Mongodb");
        System.out.println("s132-nodejs");
        System.out.println("------------------------------");
        System.out.println("Enter your Sub-Module name (s131, s132): ");
        String submodule = br.nextLine();

        switch (submodule) {
            case "s131":
                itemCost = 25000;
                break;
            case "s132":
                itemCost = 30000;
                break;
            default:
                System.out.println("Invalid Sub-Module selected.");
                break;
        }
        enterStudentCount(br);
    }
}