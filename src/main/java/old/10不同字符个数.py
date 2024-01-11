#编写一个函数，计算字符串中含有的不同字符的个数。
#字符在ASCII码范围内(0~127，包括0和127)，换行表示结束符，不算在字符里。
#不在范围内的不作统计。多个相同的字符只计算一次
#例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
str_in = str(input())
i = 0
list1 = []
while i<len(str_in):
    ascii = ord(str_in[i])
    if (0 <= ascii <= 127):
        list1.append(ascii)
        i+=1
    else:
        i+=1
print(len(set(list1)))