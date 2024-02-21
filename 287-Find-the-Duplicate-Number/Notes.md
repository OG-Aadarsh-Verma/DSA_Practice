### BruteForce
* sort the array 
* apply binary search [if no. of elements before mid <code>&gt;</code> no. of elements after mid => element is before mid]
* compare every element to it's adjacent element
* return the repeated element

#### Time complexity: O($Nlog{_2}{N} + N$), Space complexity O(1)

### Better
* Apply hashing to each element and store in another array
* if a hash collision occurs, return the number

#### Time complexity: O(N), Space complexity O(N)

### Optimal
* Make a linked list of the array such that the value of the linked list represents the postion of the next node within the array
* traverse using the fast-slow method till the first collison
* now reset fast and move one step for both fast and slow till 2nd collision
* value of 2nd collision is a repeat [as it represents the start of the loop in the linked list]

#### Time complexity: O(N), Space complexity: O(N)
