#接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
str1 = input()
list1 = str1.split(" ")
tem = len(list1)-1
str_out = ""
while tem >=0:
    str_out+=(list1[tem]+" ")
    tem-=1
print(str_out)
