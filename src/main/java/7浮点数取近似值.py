#写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
#如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
a = float(input())
b = str(a)
c = b.split(".")
d = int((c[1])[0])
if d>=5:
    print(int(c[0])+1)
else:
    print(int(c[0]))