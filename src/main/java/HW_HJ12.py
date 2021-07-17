str1 = input()
list1 = str1.split(" ")
tem = len(list1)-1
str_out = ""
while tem >=0:
    str_out+=(list1[tem]+" ")
    tem-=1
print(str_out)
