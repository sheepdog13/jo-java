package practice;

public class GamePlay {
	public static void main(String[] args) {
		Game game1 = new Game("가위바위보");
		BoardGame boardGame = new BoardGame("원카드", 3);
		
		game1.play();
		game1.end();
		boardGame.play();
		boardGame.end();
	}
}
