#输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
#保证输入的整数最后一位不是0。
str1 = str(input())
num = len(str1)-1
list1 = []
while 0 <= num :
    if str1[num] in list1:
        num-=1
        continue
    else:
        list1.append(str1[num])
        num-=1
tem = ""
for i in list1:
    tem+=i
print(tem)
