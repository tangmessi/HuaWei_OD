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
