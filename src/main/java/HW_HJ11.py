str1 = input()
tem = len(str1)-1
str_out = ""
while tem >=0:
    str_out+=str1[tem]
    tem-=1
print(str_out)
