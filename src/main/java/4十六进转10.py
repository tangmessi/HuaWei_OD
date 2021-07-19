#写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
while True:
    try:
        print(int(input(),base = 8))
    except:
        break