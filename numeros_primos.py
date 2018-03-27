n = int(input('Digite o valor de N: '))

for i in range(1,n+1):
    primo = True
    for j in range(2, i): #número primo só é divisivel por 1 e ele mesmo
        if i % j == 0:    #range de 2 a i vai checar todos os números que não sejam 1 e i, já que range vai até i-1
            primo = False
        
    if primo:
        print(i)