# GCD of the sum of Two Nth fibonacci terms calculator

Asks the user to input two positive whole numbers smaller than 45 (A, B), finds the sum of the first A and B fibonacchi terms and outputs GCD of the two sums

## Installation

1.) In terminal/command prompt open directory where the java source code file is located

2.) Ensure JDK is installed, this can be done by running the following command
javac -version

3.) simply run the program by typing java Main into the terminal

```

## Usage/Examples

Enter a Positive Integer that is lower than 45 when prompted,
you will need to do this twice, afterwards you will receive an
output of the GCD of the sums of the n1th and n2th terms of the
fibonacci series

Enter Integer A (Number Must Be A Positive Integer and Less than 45)
5
Enter Integer B (Number Must Be A Positive Integer and Less than 45)
6
Sum of First 5 Fibonacci numbers: 12
Sum of First 6 Fibonacci numbers: 20
a = qb + r   ||||   20 = 1*12 + 8
a = qb + r   ||||   12 = 1*8 + 4
a = qb + r   ||||   8 = 2*4 + 0
GCD of the sum of the first 5 fibonacci numbers and the sum of the first 6 fibonacci numbers: 4


Enter Integer A (Number Must Be A Positive Integer and Less than 69)
3
Enter Integer B (Number Must Be A Positive Integer and Less than 69)
4
Sum of First 3 Fibonacci numbers: 4
Sum of First 4 Fibonacci numbers: 7
a = qb + r   ||||   7 = 1*4 + 3
a = qb + r   ||||   4 = 1*3 + 1
a = qb + r   ||||   3 = 3*1 + 0
GCD of the sum of the first 3 fibonacci numbers and the sum of the first 4 fibonacci numbers: 1

Enter Integer A (Number Must Be A Positive Integer and Less than 69)
68
Enter Integer B (Number Must Be A Positive Integer and Less than 69)
67
Sum of First 68 Fibonacci numbers: 190392490709134
Sum of First 67 Fibonacci numbers: 117669030460993
a = qb + r   ||||   190392490709134 = 1*117669030460993 + 72723460248141
a = qb + r   ||||   117669030460993 = 1*72723460248141 + 44945570212852
a = qb + r   ||||   72723460248141 = 1*44945570212852 + 27777890035289
a = qb + r   ||||   44945570212852 = 1*27777890035289 + 17167680177563
a = qb + r   ||||   27777890035289 = 1*17167680177563 + 10610209857726
a = qb + r   ||||   17167680177563 = 1*10610209857726 + 6557470319837
a = qb + r   ||||   10610209857726 = 1*6557470319837 + 4052739537889
a = qb + r   ||||   6557470319837 = 1*4052739537889 + 2504730781948
a = qb + r   ||||   4052739537889 = 1*2504730781948 + 1548008755941
a = qb + r   ||||   2504730781948 = 1*1548008755941 + 956722026007
a = qb + r   ||||   1548008755941 = 1*956722026007 + 591286729934
a = qb + r   ||||   956722026007 = 1*591286729934 + 365435296073
a = qb + r   ||||   591286729934 = 1*365435296073 + 225851433861
a = qb + r   ||||   365435296073 = 1*225851433861 + 139583862212
a = qb + r   ||||   225851433861 = 1*139583862212 + 86267571649
a = qb + r   ||||   139583862212 = 1*86267571649 + 53316290563
a = qb + r   ||||   86267571649 = 1*53316290563 + 32951281086
a = qb + r   ||||   53316290563 = 1*32951281086 + 20365009477
a = qb + r   ||||   32951281086 = 1*20365009477 + 12586271609
a = qb + r   ||||   20365009477 = 1*12586271609 + 7778737868
a = qb + r   ||||   12586271609 = 1*7778737868 + 4807533741
a = qb + r   ||||   7778737868 = 1*4807533741 + 2971204127
a = qb + r   ||||   4807533741 = 1*2971204127 + 1836329614
a = qb + r   ||||   2971204127 = 1*1836329614 + 1134874513
a = qb + r   ||||   1836329614 = 1*1134874513 + 701455101
a = qb + r   ||||   1134874513 = 1*701455101 + 433419412
a = qb + r   ||||   62731757 = 1*39920209 + 22811548
a = qb + r   ||||   39920209 = 1*22811548 + 17108661
a = qb + r   ||||   22811548 = 1*17108661 + 5702887
a = qb + r   ||||   17108661 = 3*5702887 + 0
GCD of the sum of the first 68 fibonacci numbers and the sum of the first 67 fibonacci numbers: 5702887





## Running Tests

due to rounding errors to do with how Java stores the long type,
the sum of n fibonacchi numbers after 68 were all incorrect
69 was returning 308061521170129 when the actual value should have been 308061521170128, the disparity only broadens from here
70 returns 498454011879264, where it shoud return 498454011879263

The resulting code snippet
for (int i =1; i < 100; i++) {
            double UnroundedSubractFloor = (((Math.pow(gR, i + 2) - Math.pow(1 - gR, i + 2)) / Math.sqrt(5)) - 1);
            System.out.println(i   + ") " + ((UnroundedSubractFloor) - Math.round(UnroundedSubractFloor)));
        }
returns the value of the unrounded number - the rounded number, we see that at n = 69, the result becomes negative, this shows that this is the point where the rounding error occurs
63) 0.037109375
64) 0.0625
65) 0.09375
66) 0.171875
67) 0.28125
68) 0.4375
69) -0.3125


While testing the GCD, the largest two inputs i could input, 68 and 67, gave me the correct answer for my GCD, I can see that all the assignments happen correctly, ie b goes to a and r goes to b in the next iteration and on top of that the answers have been corroborated with an online calculator, furthermore to check if somehow my code and the online calculator had the same rounding error, I divided both numbers by the GCD, both numbers were divided with no remainder, so i can be confident that there are no rounding errors at the highest end of my testing, I have also checked by hand smaller values such as inputs of 5 and 6 and I can also see that the euclidean algorithm is correctly implemented there as well, so Im confident that my code works in outputting the GCD
```
