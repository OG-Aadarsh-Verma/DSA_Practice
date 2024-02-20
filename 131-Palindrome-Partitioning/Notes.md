### Bruteforce
* Since, <code>s.length()</code> has a constraint <code>&le; 16 characters</code>
* Find all possible substrings of <code>s</code>
* check if substring is palindrome or not
* if palindrome, add to the result
* return result

#### Time complexity: O($2^N\times K$ $\times N/2$), Space complexity: O($K\times X$)
Reason for Time: 
* $2^N$ : to explore each substring
* N/2 : to check if Palindrome or not
* K : to insert into the data structure [List]\

Reason for Space:
* K : average length of the <code>ans</code>
* X : average number of palindrome substrings in <code>s</code>
