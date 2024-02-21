### Dynamic programming approach
* set <code>min</code> to <code>prices[0]</code>
* iterate the array, subtract min and check is <code>profit &gt; old profit</code>
* keep track of <code>min</code>
* update the <code>min</code> if lower value is found

#### Time complexity O(N), Space complexity O(1)
