import java.util.Scanner;
import java.util.Random;

public class bossFightWendys {

		public static void main(String[] args) throws InterruptedException {

			Scanner scnr = new Scanner(System.in);
			double cash = 5.67;
			int choice;
			int bossChoice;
			int health = 50;
			int bossHp = 50;
			Random chance = new Random();
			Random bossChance = new Random();
			System.out.println("Hi there. Welcome to Wendy's.");

			do {
				Thread.sleep(2000);
				System.out.println("\nYou have $" + cash + " dollars burning a hole in your pocket.\n");
				Thread.sleep(2000);
				System.out.println("What would you like to do?");
				Thread.sleep(2000);
				System.out.println("1. Buy a Frosty...$1.57\n");
				System.out.println("2. Purchase a Big Mac...$4.25\n");
				System.out.println("3. Order a Classic Single meal...$7.99\n");
				System.out.println("4. SpEaK tO yOuR mAnAgEr!...Free\n");
				System.out.println("5. Leave - I'm outta here!\n");
				System.out.println("Enter the number of your choice below:");
				choice = scnr.nextInt();

				switch (choice) {

				case 1:
					cash = cash - 1.57;
					System.out.println("Great choice - enjoy! Maybe you should get something to go with it?");
					Thread.sleep(2000);
					break;
				case 2:
					cash = cash - 4.25;
					System.out.println("...");
					Thread.sleep(2000);
					System.out.println("'Sir, this is a Wendy's.'");
					Thread.sleep(2000);
					System.out.println("The cashier takes your money and doesn't give you anything - except attitude.");
					Thread.sleep(2000);
					System.out.println("The manager is watching you, closely...");
					break;
				case 3:
					cash = cash - 7.99;
					System.out.println("You don't have enough cash but demand it anyways.");
					Thread.sleep(2000);
					System.out.println("The cashier calls the manager, he starts getting loud.");
					Thread.sleep(2000);
					System.out.println("The manager challenges you to a duel!?");
					break;
				case 4:
					cash = -1;
					System.out.println("Ope...");
					Thread.sleep(2000);
					System.out.println("The manager was more strong-willed than you expected.");
					Thread.sleep(2000);
					System.out.println("He stole the rest of your cash!?");
					break;
				case 5:
					cash = cash;
					System.out.println("Actually, you're having second thoughts and decide to stay.");
					Thread.sleep(2000);
					System.out.println("You have an unbreakable spirit!");
					break;
				default:
					cash = cash;
					System.out.println("Not sure what happened there...try again.");
					break;
				}
			} while (cash >= 0 && cash < 100);
			Thread.sleep(2000);
			System.out.println("You don't have enough cash to cover that!");
			Thread.sleep(2000);
			System.out.println("You're confused. Why's everyone so mad?");
			Thread.sleep(2000);
			System.out.println("Oh no - it's a Boss Fight!");
			do {
				Thread.sleep(2000);
				System.out.println("You have " + health + "HP and the manager has " + bossHp + "HP.");
				Thread.sleep(2000);
				System.out.println("What should you do?");
				Thread.sleep(2000);
				System.out.println("1. Attack");
				System.out.println("2. Run");
				System.out.println("3. Use Potion");
				choice = scnr.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Attack!");
					choice = chance.nextInt(10);
					bossChoice = bossChance.nextInt(13);
					if (choice <= 2) {
						Thread.sleep(2000);
						System.out.println("Oof..a swing and a miss.");
						if (bossChoice <= 4) {
							Thread.sleep(2000);
							System.out.println("The manager tried to attack, but missed!");
						} else if (bossChoice >= 5 && bossChoice <= 9) {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("You took 10 damage.");
							health = health - 10;
							if (health <= 0) {
								cash = 202;
								break;
							}

						} else {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("A critical hit!");
							Thread.sleep(2000);
							System.out.println("They deal you 20 damage.");
							health = health - 20;
							if (health <= 0) {
								cash = 202;
								break;
							}
						}
					} else if (choice >= 3 && choice <= 7) {
						Thread.sleep(2000);
						System.out.println("Success!");
						Thread.sleep(2000);
						System.out.println("You deal the manager 10 damage.");
						bossHp = bossHp - 10;
						if (bossHp <= 0) {
							cash = 101;
							break;
						} else {

							if (bossChoice <= 4) {
								Thread.sleep(2000);
								System.out.println("The manager tried to attack, but missed!");
							} else if (bossChoice >= 5 && bossChoice <= 9) {
								Thread.sleep(2000);
								System.out.println("The manager used slap!");
								Thread.sleep(2000);
								System.out.println("You took 10 damage.");
								health = health - 10;
								if (health <= 0) {
									cash = 202;
									break;
								}

							} else {
								Thread.sleep(2000);
								System.out.println("The manager used slap!");
								Thread.sleep(2000);
								System.out.println("A critical hit!");
								Thread.sleep(2000);
								System.out.println("They deal you 20 damage.");
								health = health - 20;
								if (health <= 0) {
									cash = 202;
									break;
								}
							}
						}
					} else {
						Thread.sleep(2000);
						System.out.println("A critical hit!");
						Thread.sleep(2000);
						System.out.println("You deal the manager 20 damage.");
						bossHp = bossHp - 20;
						if (bossHp <= 0) {
							cash = 101;
							break;
						} else {
							if (bossChoice <= 4) {
								Thread.sleep(2000);
								System.out.println("The manager tried to attack, but missed!");
							} else if (bossChoice >= 5 && bossChoice <= 9) {
								Thread.sleep(2000);
								System.out.println("The manager used slap!");
								Thread.sleep(2000);
								System.out.println("You took 10 damage.");
								health = health - 10;
								if (health <= 0) {
									cash = 202;
									break;
								}

							} else {
								Thread.sleep(2000);
								System.out.println("The manager used slap!");
								Thread.sleep(2000);
								System.out.println("A critical hit!");
								Thread.sleep(2000);
								System.out.println("They deal you 20 damage.");
								health = health - 20;
								if (health <= 0) {
									cash = 202;
									break;
								}
							}
						}
					}
					break;
				case 2:
					System.out.println("You attempt to get away!");
					choice = chance.nextInt(10);
					bossChoice = bossChance.nextInt(13);
					if (choice <= 2) {
						Thread.sleep(2000);
						System.out.println("Oh no - you tripped on your shoelace!");
						if (bossChoice <= 4) {
							Thread.sleep(2000);
							System.out.println("The manager tried to attack, but missed!");
						} else if (bossChoice >= 5 && bossChoice <= 9) {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("You took 10 damage.");
							health = health - 10;
							if (health <= 0) {
								cash = 202;
								break;
							}

						} else {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("A critical hit!");
							Thread.sleep(2000);
							System.out.println("They deal you 20 damage.");
							health = health - 20;
							if (health <= 0) {
								cash = 202;
								break;
							}
						}
					} else if (choice >= 3 && choice <= 7) {
						Thread.sleep(2000);
						System.out.println("Success!");
						Thread.sleep(2000);
						System.out.println("The manager can't hit you this time.");
					} else {
						Thread.sleep(2000);
						System.out.println("Amazing! You evaded attack and the manager fell down chasing you!");
						Thread.sleep(2000);
						System.out.println("The manager took 10 damage.");
						bossHp = bossHp - 10;
						if (bossHp <= 0) {
							cash = 101;
							break;
						} else {
							System.out.print("");
						}
					}
					break;
				case 3:
					System.out.println("You use a potion!");
					choice = chance.nextInt(10);
					bossChoice = bossChance.nextInt(13);
					if (choice <= 2) {
						Thread.sleep(2000);
						System.out.println("Oof..you dropped it on the ground.");
						if (bossChoice <= 4) {
							Thread.sleep(2000);
							System.out.println("The manager tried to attack, but missed!");
						} else if (bossChoice >= 5 && bossChoice <= 9) {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("You took 10 damage.");
							health = health - 10;
							if (health <= 0) {
								cash = 202;
								break;
							}

						} else {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("A critical hit!");
							Thread.sleep(2000);
							System.out.println("They deal you 20 damage.");
							health = health - 20;
							if (health <= 0) {
								cash = 202;
								break;
							}
						}
					} else if (choice >= 3 && choice <= 7) {
						Thread.sleep(2000);
						System.out.println("You drink a health potion.");
						Thread.sleep(2000);
						System.out.println("You regain 15 HP!");
						health = health + 15;
						if (bossChoice <= 4) {
							Thread.sleep(2000);
							System.out.println("The manager tried to attack, but missed!");
						} else if (bossChoice >= 5 && bossChoice <= 9) {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("You took 10 damage.");
							health = health - 10;
							if (health <= 0) {
								cash = 202;
								break;
							}

						} else {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("A critical hit!");
							Thread.sleep(2000);
							System.out.println("They deal you 20 damage.");
							health = health - 20;
							if (health <= 0) {
								cash = 202;
								break;
							}
						}
					} else {
						Thread.sleep(2000);
						System.out.println("It's your lucky day!");
						Thread.sleep(2000);
						System.out.println("You drink the potion and heal 20 HP.");
						health = health + 20;
						if (bossChoice <= 4) {
							Thread.sleep(2000);
							System.out.println("The manager tried to attack, but missed.");
						} else if (bossChoice >= 5 && bossChoice <= 9) {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("You took 10 damage.");
							health = health - 10;
							if (health <= 0) {
								cash = 202;
								break;
							}

						} else {
							Thread.sleep(2000);
							System.out.println("The manager used slap!");
							Thread.sleep(2000);
							System.out.println("A critical hit!");
							Thread.sleep(2000);
							System.out.println("They deal you 20 damage.");
							health = health - 20;
							if (health <= 0) {
								cash = 202;
								break;
							}
						}
					}
					break;
				default:
					System.out.println("What was that!? Try again.");
					break;
				}
			} while (cash < 0);
			if (cash == 101) {
				System.out.println("Congrats! You beat the manager!");
				Thread.sleep(2000);
				System.out.println("You won't be able to go back, but at least you'll have a good story.");
				System.out.println("Thanks for playing!");
			} else if (cash == 202) {
				Thread.sleep(2000);
				System.out.println("What a day...");
				Thread.sleep(2000);
				System.out.println("The manager slapped you silly.");
				Thread.sleep(2000);
				System.out.println("You go home, defeated, but vow to return again when you're stronger...");
			} else {
				System.out.println("Congrats! You beat the manager!");
				Thread.sleep(2000);
				System.out.println("You won't be able to go back, but at least you'll have a good story.");
				System.out.println("Thanks for playing!");
			}
		}
	}

