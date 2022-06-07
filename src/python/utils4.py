import json
import re

import openpyxl
import os

path = "../../source_data"
for file in os.listdir(path):
    file = path + "/" + file
    print(file)
    lines = open(file,encoding="utf-8")
    l = set()
    for line in lines:
        l.add(line)






# fun("php")
