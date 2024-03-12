def menor(list):
    if len(list) == 1:
        return list[0]
    
    metadeDoTamanhoDaLista = int(len(list) / 2)

    a = menor(list[: metadeDoTamanhoDaLista])
    b = menor(list[metadeDoTamanhoDaLista :])

    if a < b:
        return a
    return b

print(menor([2, 7, 6, 8, 1, 9, 0]))