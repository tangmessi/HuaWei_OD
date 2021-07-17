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
