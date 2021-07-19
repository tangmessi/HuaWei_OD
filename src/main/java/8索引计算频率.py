#数据表记录包含表索引和数值（int范围的正整数），
#请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，
#输出按照key值升序进行输出。
dict1 = {}
set1 = set()
count = int(input())
for i in range(count):
#while i<= count:
    tem = input()
    list1 = tem.split(" ")
    key_in = int(list1[0])
    value_in = int(list1[1])
    set1.add(key_in)
    if (key_in in dict1) == True:
        dict1[key_in] = dict1[key_in]+value_in
    else:
        dict1[key_in] = value_in
    count +=1
list1 = sorted(set1)
for key in list1:
    print(key,dict1[key])
