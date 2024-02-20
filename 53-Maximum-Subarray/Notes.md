### Bruteforce
* iterate through very possible subarray and find the maximum sum

#### Time complexity: O(N<sup>3</sup>), Space complexity O(1)

### Optimal
###### 2 pointer approach *Kadane's algorithm*
* iterate through array and add values to sum
* if at any point <code>sum &lt; 0</code> , reset sum to 0 & restart new array 
* if <code>sum &gt; max</code> => <code>max = sum</code>

#### Time complexity: O(N), Space complexity: O(1)
