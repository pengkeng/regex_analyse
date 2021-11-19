import re

file = "/Users/pqc/idea/regex_analyse/data/java/maven.json"
# lines = open(file,encoding="utf-8").readlines()
f = open("/Users/pqc/idea/regex_analyse/data/java/pro.txt", encoding="utf-8")
ff = set()
for line in f.readlines():
    ff.add(line.strip("\n")[0:-4])
print(len(ff))

f = open("/Users/pqc/idea/regex_analyse/data/java/file.txt", encoding="utf-8")

pros = set()
lines = f.readlines()
for line in lines:
    strs = line.strip("\n").replace("D:/pqc/maven/2021-1-20/maven-file/", "").split("/")
    ss = 'D:/pqc/maven/2021-1-20/maven-file'
    print(line)
    for s in strs:
        ss = ss + "/" + s
        if ss in ff:
            pros.add(ss)
            break

print(len(pros))