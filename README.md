Dynamic-Programming-MaxApple
============================
Problem:
A table composed of N x M cells, each having a certain quantity of apples, is given. You start from the upper-left corner. At each step you can go down or right one cell. Find the maximum number of apples you can collect. 

This problem is solved in the same way as other DP problems; there is almost no difference. 

First of all we have to find a state. The first thing that must be observed is that there are at most 2 ways we can come to a cell - from the left (if it's not situated on the first column) and from the top (if it's not situated on the most upper row). Thus to find the best solution for that cell, we have to have already found the best solutions for all of the cells from which we can arrive to the current cell. 

From above, a recurrent relation can be easily obtained:
S[i][j]=A[i][j] + max(S[i-1][j], if i>0 ; S[i][j-1], if j>0) (where i represents the row and j the column of the table , its left-upper corner having coordinates {0,0} ; and A[i][j] being the number of apples situated in cell i,j). 
Please see the java file for Implementation.
http://www.topcoder.com/tc?d1=tutorials&d2=dynProg&module=Static is an excellent source to learn dynamic programming
