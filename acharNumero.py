def acharNumero(list, number):
    if len(list) == 1:
        return list[0] == number
    
    metadeDoTamanhoDaLista = int(len(list) / 2)

    return (
        acharNumero(list[: metadeDoTamanhoDaLista], number) or 
        acharNumero(list[metadeDoTamanhoDaLista :], number)
    )


print(acharNumero([2, 7, 6, 8, 1, 9, 0], 2))