#给定n个字符串，请对n个字符串按照字典序排列。
#输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
a = int(input())
list1 = []
for i in range (a):
    str1 = str(input())
    list1.append(str1)
list2 = sorted(list1)
for i in list2:
    print(i)

