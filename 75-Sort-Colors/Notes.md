### Bruteforce
* Use any sorting technique

#### Time complexity O(N $log{_2}{N}$) [Merge sort], Space complexity O(N) 
### Better
* Count every instance of 0s,1s & 2s
* manually fill the array with respective numbers

#### Time complexity O($2\times N$), Space Complexity O(1)

### Optimal
###### Dutch National Flag Algorithm
* 3 pointer approach
* if 0 => <code>swap(low, mid)</code>, then <code>low++</code>, <code>mid++</code>
* if 1 => <code>mid++</code>
* if 2 => <code>swap(mid, high)</code>, then <code>high--</code>
* till <code>mid &gt; high</code>

#### Time complexity O(N), Space complexity O(1)
