package ru.skillbench.tasks.basics.entity;

import java.util.Random;
import java.util.Scanner;


public class DiceGame {
	
	int players;
	int dices;
	int[] winnings;
	int[] playersSum;
	
	public void setConfiguration() {
		int N;
		int k;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		N = console.nextInt();
		System.out.println("Enter the number of dices: ");
		k = console.nextInt();
		console.close();
		/*Set number of players and dices*/
		this.players = N;
		this.dices = k;
		this.winnings = new int[N];
		this.playersSum = new int[N];
		/*Set start sum of points*/
		for(int i=0; i<N;i++) {
			winnings[i]=0;
			playersSum[i]=0;
		}
	}
	
	/*Generate an array in random numbers from 1 to 6*/
	public int[] valueOfTheDice() {
		Random random = new Random();
		int[] rollResult = new int[dices];
		for (int i=0; i<dices; i++) {
			rollResult[i]=random.nextInt(6) + 1;
			System.out.print(rollResult[i]+" ");
		}
		System.out.println();
		return rollResult;
	}
	
	/*Get sum of array elements*/
	public int getSum(int[] array) {
		int sum=0;
		for (int i=0; i<dices; i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	
	/*Add to playersSum sum of values*/
	public void rollTheDice(int player) {
		System.out.println("Rolling the dice!");
		this.playersSum[player] = getSum(valueOfTheDice());
		System.out.println("Your sum: "+ this.playersSum[player]);
	}
	
	/*Find the max value from playersSum and choose the winner*/
	public void findWinner() {
		int max = playersSum[0];
		int winner=0;
		for (int i=1; i<players; i++) {
			if (playersSum[i]>max) {
				max = playersSum[i];
				winner=i;
			}
		}
		this.winnings[winner]+=1;
		System.out.println("Player "+ (1+winner)+ " wins");
		System.out.println();
	}
	
	/*Zeroing of plauersSum values*/
	public void newStep() {
		for(int i=0; i<players;i++) {
			playersSum[i]=0;
		}
	}
	
	public int getMax(int[] array) {
		int max=array[0];
		for (int i=1; i<players; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public void ShowTheWinner() {
		int winner=0;
		for(int i=0; i<players;i++) {
			if (winnings[i]==7)
				winner = i+1;
		}
		System.out.println("The winner is player "+ winner);
	}
	
	public void Game() {
		while(getMax(winnings)<8) {
			for (int i=0; i<players-1; i++) {
				rollTheDice(i);
			}
			rollTheDice(players-1);
			findWinner();
			newStep();
		}
	}
	
	public static void main(String[] args){
		DiceGame newGame = new DiceGame();
		newGame.setConfiguration();
		newGame.Game();
		newGame.ShowTheWinner();
	}
}
