#功能:输入一个正整数，按照从小到大的顺序输出它的所有 （重复的也要列举）（如180的质因子为2 2 3 3 5 ）
#最后一个数后面也要有空格



a = int(input())
n = 2
while n*n<=a and a>=n:
    while (a % n)!= 0:
        n+=1
    print(n, end=" ")
    a = a//n
if a>=n:
    print(a, end=" ")

#复杂度太大，能完成任务但是超时
'''n = int(input())
i = 2
while i * i <= n and n >= i:
    while n % i == 0:
        n = n // i
        print(i, end=" ")
    i = i + 1
if n - 1:
    print(n, end=" ")
'''
'''
a = int(input())
n = 2
while n*n<=a and a>n:
    while (a % n)== 0:
        print(n, end=" ")
        a = a//n
    n+=1
if a >1:
    print(a, end=" ")
    '''

