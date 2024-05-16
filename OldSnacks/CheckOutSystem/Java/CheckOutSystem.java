import java.util.ArrayList;

import java.util.Scanner;

public class CheckOutSystem {

	public static void main(String[] args) {

		double discount = 100.00;

		double vatPercentage = 17.50;

		double total = 0;

		String nameOfItem = "";

		int quantityOfItem = 0;

		double pricePerUnit = 0;

		ArrayList<String> items = new ArrayList<>();

		ArrayList<Integer> quantity = new ArrayList<>();

		ArrayList<Double> price = new ArrayList<>();

		double subTotal = 0;

		boolean programIsActive = true;

		String message = """
				\nSEMICOLON STORES
				MAIN BRANCH
				LOCATION: 312, HEBERT MACAULAY WAY, SABO YABA, LAGOS.
				TEL: 03293828343
				DATE: 11/04/2024
				""";

		Scanner input = new Scanner(System.in);

		System.out.print("\nENTER CUSTOMER NAME: ");
		String customerName = input.nextLine();

		while (programIsActive) {

			System.out.print("\nWHAT DID THE CUSTOMER BUY? ");
			nameOfItem = input.nextLine();

			items.add(nameOfItem);

			System.out.print("\nHOW MANY PIECES? ");
			quantityOfItem = input.nextInt();

			quantity.add(quantityOfItem);

			if (quantityOfItem > 0) {

				System.out.print("\nPRICE PER UNIT?  ");
				pricePerUnit = input.nextInt();

				price.add(pricePerUnit);

				total = (quantityOfItem * pricePerUnit);

			}

			System.out.println("\nADD MORE ITEMS? (yes or no):  ");
			input.nextLine();
			String moreItems = input.nextLine();

			// System.out.print(moreItems);

			if (moreItems.equals("no")) {

				programIsActive = false;

			}

			// System.out.print(programIsActive);
		}

		for (int index = 0; index < price.size(); index++) {
			subTotal += price.get(index);
		}

		System.out.print("\nWHAT IS YOUR NAME? \n");
		String cashiersName = input.nextLine();

		System.out.println("How much discount will he get? ");
		double discountGiven = input.nextDouble();

		discountGiven = (discountGiven / discount) * subTotal;

		double vat = (vatPercentage / 100.00) * subTotal;

		double billTotal =  subTotal + discountGiven + vat;

		System.out.print(message);

		System.out.printf("Cashier's Name: %s%n", cashiersName);
		System.out.printf("Customer Name: %s%n", customerName);
		System.out.println("===============================================");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %7s ITEM%5sQTY%5sPRICE%5sTOTAL(NGN)%n", "", "", "", "");
		System.out.println("-----------------------------------------------");



		for (int index = 0; index < items.size(); index++) {
			System.out.printf("%s%13s %5s%d %5s%.2f %5s%.2f%n", "", items.get(index), "", quantity.get(index), "",
					price.get(index), "", (quantity.get(index) * price.get(index)));
		}
		System.out.println("===============================================");

		System.out.printf(" %25sSub Total:%3s%.2f%n%26sDiscount:%4s%.2f%n%26sVAT @ 17.50:%1s%.2f%n", "", "",subTotal,"", "", discountGiven, "", "", vat);
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %25sBill Total:%2s%.2f%n", "", "", billTotal);
		System.out.println("-----------------------------------------------");
		System.out.printf(" %3sTHIS IS NOT A RECEIPT KINDLY PAY %.2f%n", "", billTotal);
		System.out.println("-----------------------------------------------");




		System.out.println("\nHow much did the customer give to you? ");
		double amountPaid = input.nextDouble();

		double balance = amountPaid - billTotal;






		System.out.print(message);

		System.out.printf("Cashier's Name: %s%n", cashiersName);
		System.out.printf("Customer Name: %s%n", customerName);
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %7s ITEM%5sQTY%5sPRICE%5sTOTAL(NGN)%n", "", "", "", "");
		System.out.println("-----------------------------------------------");






		for (int index = 0; index < items.size(); index++) {
			System.out.printf("%s%13s %5s%d %5s%.2f %5s%.2f%n", "", items.get(index), "", quantity.get(index), "",
					price.get(index), "", (quantity.get(index) * price.get(index)));
		}
		System.out.println("-----------------------------------------------");

		System.out.printf(" %25sSub Total:%3s%.2f%n%26sDiscount:%4s%.2f%n%26sVAT @ 17.50:%1s%.2f%n", "", "",subTotal,"", "", discountGiven, "", "", vat);
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %25sBill Total:%2s%.2f%n", "", "", billTotal);
		System.out.printf(" %25sAmount Paid:%1s%.2f%n", "", "", amountPaid);



		System.out.printf(" %25sBalance:%4s%.2f%n", "", "", balance);
		System.out.println("-----------------------------------------------");
		System.out.printf("%5sTHANK YOU FOR YOUR PATRONAGE%n", "");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------\n");



	}

}