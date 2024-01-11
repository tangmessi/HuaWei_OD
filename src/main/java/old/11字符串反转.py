#输入一个整数，将这个整数以字符串的形式逆序输出
#程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
str1 = input()
tem = len(str1)-1
str_out = ""
while tem >=0:
    str_out+=str1[tem]
    tem-=1
print(str_out)
