import sys

rows_num = int(input("Input matrix size: "))
lst = []
filler = input("Input placeholder character: ")
half = rows_num//2
    
for i in range(rows_num):
    lst.append([])
    if i<half:
        for j in range(rows_num-i):
            print(' ', end=" ")
        for j in range(i+1):
            if len(filler) == 1:
                lst[i].append(ord(filler))
                print(chr(lst[i][j]), end=" ")
            elif len(filler) == 0:
                print("No placeholder character")
                sys.exit(1)
            else:
                print("To many placeholder characters")
                sys.exit(1)
        print()
    else:
        for j in range(i+1):
            print(' ', end=" ")
        for j in range(rows_num-i):
            if len(filler) == 1:
                lst[i].append(ord(filler))
                print(chr(lst[i][j]), end=" ")
            elif len(filler) == 0:
                print("No placeholder character")
                sys.exit(1)
            else:
                print("To many placeholder characters")
                sys.exit(1)
        print()
        

with open('output.txt', 'w') as file:
    for row in lst:
        for item in row:
            print(chr(item), end='\t', file=file)
        print(file=file)