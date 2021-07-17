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