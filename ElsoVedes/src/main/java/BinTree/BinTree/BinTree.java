package BinTree;


import java.io.BufferedWriter;
import java.io.IOException;

import java.io.*;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.ArrayList;


import java.util.Queue;
import java.util.PriorityQueue;
import java.util.*;


public class BinTree {
	private final Node root; // root referencia egy node tipusú objektumra final hogy  ne változoon az értéke
	private Node currentNode;

	private int maxDeep, deep, averageSum, averageCount;
	private double average, deviation, deviationSum;


	public BinTree() {
		this('/');               //meghívja az adott osztályon belül lévő átadott paramétert váró konstruktort
	}

	public BinTree(char value) {
		root = new Node(value); //létrehoz egy csomopontot
		currentNode = root;   // azért kell hogy vissaadja a gyökeret mert így node tipusú lesz
	}


	public Node getRoot() {
		return root;              //node tipusú
	}

	public void addElement(char value) {
		switch (value) {
		case '0':   //megnézi hogy van e 0 ha nincsa akkor létrehozza ha van akkor csak rálép
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(new Node('0'));
				currentNode = root;
			} else {
				currentNode = currentNode.getLeft();
			} break;

		case '1':
			if (currentNode.getRight() == null) {
				currentNode.setRight(new Node('1'));
				currentNode = root;
			} else {
				currentNode = currentNode.getRight();
			} break;
		}
	}

// node tipusú referencia az element meg egy kimeneti fájlt vár  és a bufferedwriter nek van egy erite metódusa ezért dobhat kivételt
/*	public void writeOut(BufferedWriter output, Node element) throws IOException {
		if (element != null) {
				   	++deep;
				  	writeOut(output, element.getRight()); // inorder
			//    writeOut(output, element.getRight()); //postorder
			//	  writeOut(output, element.getLeft()); //postorder
			 for (int i = 0; i < deep; ++i) {
				     output.write("-");
			   }
			 	output.write(element.getValue() + "(" + (deep - 1) + ")\n");
			   writeOut(output, element.getLeft()); //inorder
	  //	 writeOut(output, element.getRight()); //preorder
     //	writeOut(output, element.getLeft());  //preorder
        	--deep;
		}
	}*/



	public int getDeep() {
		deep = maxDeep = 0;
		calcDeep(root);
		return --maxDeep;
	}

	public double getAverage() {
		deep = averageSum = averageCount = 0;
		calcAverage(root);
		average = ((double) averageSum) / averageCount;
		return average;
	}


	public double getDeviation() {
		average = getAverage();
		deviationSum = 0.0;
		deep = averageCount = 0;
		calcDeviation(root);

		if ((averageCount - 1) > 0) {
			deviation = Math.sqrt(deviationSum / (averageCount - 1));
		} else {
			deviation = Math.sqrt(deviationSum);
		}

		return deviation;
	}

	private void calcDeep(Node element) {
		if (element != null) {
			++deep;

			if (deep > maxDeep) {
				maxDeep = deep;
			}

			calcDeep(element.getRight());
			calcDeep(element.getLeft());
			--deep;
		}
	}

	private void calcDeviation(Node element) {
		if (element != null) {
			++deep;
			calcDeviation(element.getRight());
			calcDeviation(element.getLeft());
			--deep;

			if (element.getRight() == null && element.getLeft() == null) {
				++averageCount;
				deviationSum += Math.pow((deep - average), 2);
			}
		}
	}

	private void calcAverage(Node element) {
		if (element != null) {
			++deep;
			calcAverage(element.getRight());
			calcAverage(element.getLeft());
			--deep;

			if (element.getRight() == null && element.getLeft() == null) {
				++averageCount;
				averageSum += deep;
			}
		}
	}

}
