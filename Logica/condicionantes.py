#si condicion se cumple es decir True, el codigo se ejecutara, pero 
#si es False el codigo hara otra accion cuando eso pase ej:

if edad >= 18:
    print("eres mayor de edad")

else:
    print("no eres menor de edad")

#ejemplo 2 

contrasenaAlmacenada = "capatas"
contrasenaEscrita = "escrita"

if contrasenaAlmacenada == contrasenaEscrita:
    print("is esta bien")
else:
    print("no esta bien ")

print ()

#ELSE IF  es una condicion extra y en python se escribe elif e if anidados 
 

ingresoDelHogar = 250000
ingresoDeSuscripciones = 5622

if (ingresoDelHogar) > 250000:
    if ingresoDelHogar - ingresoDeSuscripciones < 0:
        print("no pasamos ni cagando")
    elif ingresoDelHogar - ingresoDeSuscripciones > 3000:
        print("no estamos seguro es prudente economizar")
    else:
        print("estas gastando mucho nene, cortala che")

elif ingresoDelHogar > 15000: 
    print("no esta mal, pero a mediados de mes nos quedaremos cortos")

elif ingresoDelHogar > 145000: 
    print("no esta mal, pero tendremos que recortar gastos")

elif ingresoDelHogar > 89000: 
    print("no esta mal, es casi crisis de mes ")
else:
    print("crisis de mes")

print(ingresoDelHogar)




