### Bruteforce
* calculate all the possible permutations
* make a 2d array and fill the array with possible permutations
* find the array element and return the next permutation

#### Time complexity: **O(N! * N)**   **Too high time** 

### Optimal
* find the first number that is smaller than the number right to it *(breakpoint)*
* if such a number does not exist => Last possible permutation => reverse the arrray
* if such a number exists => find the smallest number that is larger than the *breakpoint* number => swap
* reverse the array starting from breakpoint till end of array.

#### Time complexity: O(N<sup>3</sup>), Space complexity O(1)
