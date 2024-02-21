### Bruteforce
* iterate through the array and compare <code>end-i</code> to <code>start-j</code>
* if <code>start-j &le; end-i</code> then merge and add to new array
* return new array

#### Time complexity O($N^2$), Space complexity O(N)

### Optimal
* sort the array according in acesnding order of start
* iterate and compare elements next to eachother
* if <code>start-i &le; end-i+1</code> then merge and add to new array
* return new array

##### Time complexity O($Nlog{_2}{N} + N$), Space complexity O(N)
