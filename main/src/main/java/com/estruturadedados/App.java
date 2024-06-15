package com.estruturadedados;

import com.dataStructure.Tree;
import static com.problem.LargestTreeValues.LargestValues;



public class App 
{
    public static void main(String[] args ) {   
        // First problem
        // System.out.println(solve("2*(3+4+5*[2+3)]"));
        // System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        // System.out.println(reverseFirstK(queue, 4));

        Tree tree = new Tree();
        tree.insert(100);

        tree.insert(10);
        tree.insert(5);

        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);


        System.out.println(LargestValues(tree));
    }
}

