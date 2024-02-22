### Bruteforce
* iterate the array
* for each integer <code>i</code> we count occurances using linear search
* return the elements that occur 2 times and 0 times

#### Time complexity: O($N^2$), Space complexity: O(1)

### Better
* iterate through the array
* make a hash table (or array of length <code>n</code>)
* for each integer <code>i</code> store the number of occurences in the hash table
* search the hashtable, return the elements that occur 2 times and 0 times

#### Time complexity: O($2\times N$), Space complexity: O(N)

### Optimal
* we know, sum of numbers from 1 to n is 	$\frac{n\times (n+1)}{2}$
* And, sum of square of numbers from 1 to n is $\frac{n\times (n+1)\times (2\times n + 1)}{6}$
* Thus, we calculate the sum of elements of the given array and their squared sum.
* <code>val1 = S - SN</code>
* <code>val2 = S2 - S2N</code>
* Missing number is $\frac{val1 + val2}{2}$
* Repeating number is $\frac{val1 + val2}{2} - val1$

#### Time complexity: O(N), Space complexity: O(1)
