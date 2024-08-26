//package com.evergnet.corejava.sandhya.application4;
//
//import java.util.Scanner;
//
//class ServicesModule implements Module {
//    public void execute() {
//        Scanner br = new Scanner(System.in);
//        System.out.println("-------------------");
//        System.out.println("Call");
//        System.out.println("Mail");
//        System.out.println("Instagram");
//        System.out.println("------------------------------");
//        System.out.println("Enter your Module name (Call, Mail, Instagram): ");
//        String service = br.nextLine();
//
//        switch (service) {
//            case "Call":
//                System.out.println("Phone number: 7036635645");
//                break;
//            case "Mail":
//                System.out.println("Mail address: puppalasandhya77@gmail.com");
//                break;
//            case "Instagram":
//                System.out.println("Instagram id: sandhya77");
//                break;
//            default:
//                System.out.println("Invalid Service selected.");
//                break;
//        }
//    }
//}
//
//
//class PaymentModule {
//    public void processPayment() {
//        Scanner br = new Scanner(System.in);
//        System.out.println(" Payment Module");
//        System.out.println("------------------------");
//        System.out.println("Invoice");
//        System.out.println("Summary");
//        System.out.println("Payamount");
//        System.out.println("---------------------------");
//        System.out.println("Enter your Module code (Invoice, Summary, Payamount): ");
//        String paymentOption = br.nextLine();
//
//        switch (paymentOption) {
//            case "Invoice":
//                System.out.println("Invoice Display");
//                System.out.println("==================");
//                System.out.println("Ordered Id: " + (Math.ceil(Math.random())));
//                System.out.println("Invoice will be sent to your registered email.");
//                break;
//
//            case "Summary":
//                System.out.println("Summary Of Order");
//                System.out.println("======================");
//                System.out.println("Your order details will be summarized and sent to your registered email.");
//                break;
//
//            case "Payamount":
//                System.out.println("Please proceed to the payment gateway to complete your transaction.");
//                break;
//
//            default:
//                System.out.println("Invalid Payment option selected.");
//                break;
//        }
//    }
//}


package com.evergnet.corejava.sandhya.application4;

import java.util.Scanner;

class ServicesModule implements Module {
    public void execute() {
        Scanner br = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("s21-Call");
        System.out.println("s22-Mail");
        System.out.println("s23-Instagram");
        System.out.println("------------------------------");
        System.out.println("Enter your Module name (s21, s22, s23): ");
        String service = br.nextLine();

        switch (service) {
            case "s21":
                System.out.println("Phone number: 7036635645");
                break;
            case "s22":
                System.out.println("Mail address: puppalasandhya77@gmail.com");
                break;
            case "s23":
                System.out.println("Instagram id: sandhya77");
                break;
            default:
                System.out.println("Invalid Service selected.");
                break;
        }
    }
}


class PaymentModule {
    public void processPayment() {
        Scanner br = new Scanner(System.in);
        System.out.println(" Payment Module");
        System.out.println("------------------------");
        System.out.println("s31-Invoice");
        System.out.println("s32-Summary");
        System.out.println("s33-Payamount");
        System.out.println("---------------------------");
        System.out.println("Enter your Module code (s31, s32, s33): ");
        String paymentOption = br.nextLine();

        switch (paymentOption) {
            case "s31":
                System.out.println("Invoice Display");
                System.out.println("==================");
                System.out.println("Ordered Id: " + (Math.ceil(Math.random())));
                System.out.println("Invoice will be sent to your registered email.");
                break;

            case "s32":
                System.out.println("Summary Of Order");
                System.out.println("======================");
                System.out.println("Your order details will be summarized and sent to your registered email.");
                break;

            case "s33":
                System.out.println("Please proceed to the payment gateway to complete your transaction.");
                break;

            default:
                System.out.println("Invalid Payment option selected.");
                break;
        }
    }
}