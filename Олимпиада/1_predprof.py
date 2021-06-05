n = int(input())
p = 1
k = int(input())
l = 1

if(1 <= k <= n <= (10 ** 18)):
    while(n != 0):
        p = p * n
        n -= 1
    
    while(k != 0):
        l = l * k
        k -= 1
        
    c = p - l
    c = str(c)
    c = c[-1]
    c = int(c)
    print(c)

    

