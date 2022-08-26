package practice;

public class BoardGame extends Game {
	private int peopleNum;
	
	BoardGame(){
		this.peopleNum = 0;
	}
	BoardGame(String gameTitle, int peopleNum){
		super(gameTitle);
		this.peopleNum = peopleNum;
	}
	
	void play() {
		System.out.println(peopleNum+"명이서 "+getGameTitle()+"게임을 시작합니다");
	}
}
