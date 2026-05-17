
/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author ???
 * @version ???
 */

public class Main {

	/*
	 * ALGORITHM
	 *
	 * 1. Generate 52 card deck into Card array
	 * - instantiate card array of size 52
	 * - for each suit (4 kinds):
	 * 		- for each value (1-13 inclusive)
	 * 			- create new card using current value and suit
	 * 			- add to array
	 *
	 * 2. Print deck
	 * - for each card in deck
	 * 		- if 13th card, print newline
	 * 		- print current card
	 */

	public static void main(String[] args) {

		/*** RUNNING TESTER ***/
		// Uncomment line below to run CardTester:
		// CardTester.main(null);

		// 1. Generate 52 card deck
		Card[] deck = new Card[52];

		char[] suits = {
				Card.HEART,
				Card.DIAMOND,
				Card.CLUB,
				Card.SPADE
		};

		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < 13; j++) {

				deck[i * 13 + j] = new Card(j + 1, suits[i]);
			}
		}

		// 2. Print deck
		for (int i = 0; i < deck.length; i++) {

			if (i % 13 == 0 && i != 0) {
				System.out.println();
			}

			System.out.print(deck[i] + "\t");
		}
	}
}