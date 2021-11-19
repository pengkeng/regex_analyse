import openpyxl
import xlrd
import xlwt

file = "../../data/java/java.txt"
m = dict()
lines = open(file, encoding="utf-8").readlines()
for line in lines:
    line = line.strip("\n ")
    m[line.split(":")[0].strip(" ")] = line.split(":")[1].strip(" ")

print(m)

readbook = openpyxl.load_workbook(r'/Users/pqc/Desktop/统计.xlsx')
sheet = readbook['Sheet1']  # 名字的方式

for i in range(18, 61):
    print(i)
    val = str(sheet["A" + str(i)].value)
    print(val)
    val = val.strip(" ")
    if val in m.keys():
        print(val + " " + m[val])
        sheet["M" + str(i)] =  m[val]

readbook.save(r'/Users/pqc/Desktop/统计.xlsx')