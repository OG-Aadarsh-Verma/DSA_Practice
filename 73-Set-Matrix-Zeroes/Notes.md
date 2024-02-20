### Bruteforce
* iterate thourgh the array
* every instance of '0' set rowe & column values to '-1' (except other 0s)
* After complete iteration, iterate again
* set all '-1' to '0'

#### Time complexity O(($N\times M$)<sup>2</sup> + ($N+M$)), Space Complexity: O(1)

### Better
* Make a 'm' size column array and 'n' size row array [fill with 0]
* every instance of '0' mark the row & column arrays to '1'
* re iterate & replace according to row & column array

#### Time complexity O($2\times N\times M$), Space Complexity: O($N+M$)

### Optimal
* Instead of creating new arrays, assums 1st row & column of matrix as the respective arrays
* make a variable <code>col0</code> to overcome overalpping at the 1st index
* Now iterate through the array & mark the array for every instance of '0'
* After marking, first iterate through the array except 1st row and column
* Then iterate over 1st column
* and then over 1st row

#### Time complexity O($2\times N\times M$), Space Complexity: O(1)
