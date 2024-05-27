import java.util.Arrays;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealthOfEachCustomer = new int[accounts.length];

		//for each customer
		for (int customer = 0; customer < accounts.length; customer++) {
			
			//for each bank
			for (int bank = 0; bank < accounts[0].length; bank++) {
				wealthOfEachCustomer[customer] += accounts[customer][bank];
			}
		}
		java.util.Arrays.sort(wealthOfEachCustomer);
		return wealthOfEachCustomer[wealthOfEachCustomer.length-1]; //last elem
    }
}
