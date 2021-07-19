#•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
#长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
while True:
    try:
        str_in = str(input())
        len_str =len(str_in)
        if len_str <= 8:
            print(str_in+"0"*(8-len(str_in)))
        else:
            a = len_str%8
            b = len_str//8
            count = 0
            while count < b:
                print(str_in[count*8:(count+1)*8])
                count+=1
            if a!=0:
                print(str_in[b*8:]+"0"*(8-len(str_in[b*8:])))
    except:
        break

