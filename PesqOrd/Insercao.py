def insercao(lista=[]):
    for i in range(1,len,(lista)):
        aux = lista[i]
        for j in range(i-1,0,-1):
            qtd_comparacoes += 1
            if(aux < lista[j]):
                lista[j+1] = lista[j]
                qtd_trocas += 1
            else:
                break     
        lista[j+1] = aux
        qtd_trocas += 1