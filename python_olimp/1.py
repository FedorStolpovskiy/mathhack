a = int(input())
b = int(input())

c = b % a
if (c > a / 2):
    c = a - c
print(c)