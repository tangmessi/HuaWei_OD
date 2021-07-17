a = float(input())
b = str(a)
c = b.split(".")
d = int((c[1])[0])
if d>=5:
    print(int(c[0])+1)
else:
    print(int(c[0]))