import re
while True:
    p1 = "[A-Z]"
    p2 = "[a-z]"
    p3 = "\d"
    p4 = "\W"
    p5 = "(.{3,}).*\\1"
    try:
        str1 = str(input())
        i = 0
        k = 0
        if len(str1)>8:
            if len(re.findall(p1,str1))!=0:
                i+=1
            if len(re.findall(p2,str1))!=0:
                i+=1
            if len(re.findall(p3,str1))!=0:
                i+=1
            if len(re.findall(p4,str1))!=0:
                i+=1
            if len(re.findall(p5,str1))==0:
                k+=1
            if (i>=3) and (k ==1):
                print("OK")
            else:
                print("NG")
            
        else:
            print("NG")
    except:
        break