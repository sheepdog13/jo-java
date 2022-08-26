package chap07_2_getset;

public class GetsetTest {
	public static void main(String[] args) {
		AnimalCard card1 = new AnimalCard();
		
		card1.setAnimal("강아지");
		System.out.println(card1.getAnimal());
		System.out.println(card1.getName());
		System.out.println(card1.getMonth());
		
		AnimalCard card2 = new AnimalCard("고양이", "나비", 10);
		System.out.println(card2.getAnimal());
		System.out.println(card2.getName());
		System.out.println(card2.getMonth());
		
		card1.printAnimalCard();
		card2.printAnimalCard();
		
		System.out.println(AnimalCard.getCardCount());
	}
}
