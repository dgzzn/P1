
valor_multa = float(input('Informe o valor da multa por dia de atraso: '))

maior_devedor = 0
maior_multa = 0

continua = 1
while continua == 1:
    
    matricula = int(input('Informe a matrícula do aluno: '))
    qtd_livros = int(input('Informe a quantidade de livros a serem devolvidos: '))

    total_multa = 0
    for i in range(1, qtd_livros+1):
        dias_atraso = int(input('%iº livro\nInforme a quantidade de dias de atraso: '%i))
        total_multa += valor_multa * dias_atraso
    if total_multa > maior_multa:
        maior_multa = total_multa
        maior_devedor = matricula
    continua = int(input('\n1 - Continuar\nQualquer tecla para finalizar\n'))
print(' - Maior devedor - \nMatrícula: %i\nTotal a pagar: R$%.2f'%(maior_devedor, maior_multa))