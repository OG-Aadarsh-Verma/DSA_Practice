### Bruteforce
* make a loop and add elements to the list such that <code> val == <sup>row-1</sup>C<sub>col-1</sub></code>
* return the list

#### TIme complexity: ~O(N<sup>3</sup>), Space complexity O(X) 
<sup>[Where X is the number of elements in that row of the pascal's triangle]
	</sup>

### Optimal
* optimize the <code><sup>n</sup>C<sub>r</sub></code> function by simply generating the whole row using indices.

#### TIme complexity: ~O(N<sup>2</sup>), Space complexity O(X) 
