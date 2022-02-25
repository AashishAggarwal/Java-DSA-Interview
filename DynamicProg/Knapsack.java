// Given two integer arrays to represent weights and profits of ‘N’ items, we need to find a subset of these items 
// which will give us maximum profit such that their cumulative weight is not more than a given number ‘C’. 

package DynamicProg;

class Knapsack {
    
    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        // TODO: Write your code here
        return -1;
      }
    
      public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
      }
}
