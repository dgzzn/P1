continua = True
total_joao = 0
total_maria = 0
total_branco = 0
total_nulo = 0
votos_totais = 0
vencedor = 0

while continua:
    nome_eleitor = input('Digite o nome do eleitor: ')

    voto = 3
    while voto < -1 or voto > 2:
        opt = int(input('Para quem será o voto: \n1 - João das Couves\n2 - Maria das Neves\n0 - Branco\n-1 - Nulo'))
        if opt == 1:
            total_joao += 1
            votos_totais += 1
            voto = 1
        elif opt == 2:
            total_maria += 1
            voto = 2
            votos_totais += 1
        elif opt == 0:
            total_branco += 1
            voto = 0
            votos_totais += 1
        elif opt == -1:
            total_nulo += 1
            voto = -1
            votos_totais += 1
    validador = 2
    while validador < 0 or validador > 1:
        outro = int(input('Iniciar outra votação com novo eleitor?\n0 - Não\n1 - Sim\n'))
        if outro == 1:
            continua = True
            validador = 1
        else:
            continua = False
            break
print('Total de votos: %i'%votos_totais)
if total_joao == total_maria:
    print('Houve empate entre os candidatos.')
elif total_joao > total_maria:
    print('O presidente eleito foi João das Couves!')
else:
    print('O presidente eleito foi Maria das Neves!')
if total_joao > 0:
    print('João das Couves - %i votos (%.2f%%)'%(total_joao, ((100*total_joao)/votos_totais)))
else:
    print('João das Couves - 0 votos (0%)')
if total_maria > 0:
    print('Maria das Neves - %i votos (%.2f%%)'%(total_maria, ((100*total_maria)/votos_totais)))
else:
    print('Maria das Neves - 0 votos (0%)')
if total_branco > 0:
    print('Branco - %i votos (%.2f%%)'%(total_branco, ((100*total_branco)/votos_totais)))
else:
    print('Branco - 0 votos (0%)')
if total_nulo > 0:
    print('Nulo - %i votos (%.2f%%)'%(total_nulo, ((100*total_nulo)/votos_totais)))
else:
    print('Nulo - 0 votos (0%)')

