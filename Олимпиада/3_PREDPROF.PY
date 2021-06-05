import math

a = int(input())
if(a < 0 and a >= 10 ** 9 + 7):
    a = a * (-1)

a = a / 2
b = int(a)
if(a - b == 0):
    print(a)