a = int(input())
b = a
new_list = []

while(b != 0):
    c = int(input())
    new_list.append(c)
    b -= 1

print("\t")

for i in new_list:
    i = (i - a - 1) * (-1)
    print(i)


