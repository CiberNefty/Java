Algoritmo Ejercicio_4_Case
	Escribir 'MENU OPCIONES'
	Escribir '1. Suma'
	Escribir '2. Masa Corporal'
	Escribir '3. Area de un Circulo'
	Escribir '4. Mensaje Nulo'
	Definir opc como entero
	Leer  opc
	Segun opc Hacer
		1:
			Escribir '¡SUMA dos numeros!'
			Definir a,b Como Entero
			Escribir 'Ingresa primer numero:'
			Leer a
			Escribir 'Ingresa el segundo numero:'
			Leer b
			suma <- a+b
			Escribir 'La suma entre ',a,' + ',b,' es:', suma
		2:
			Escribir 'INDICE MASA CORPORAL'
			Definir P, E, Resul Como real
			Escribir 'Ingrese su Estatura(metros):'
			Leer E
			Escribir 'Ingrese su Peso(Kg):'
			Leer P
			Resul <- P/(E^2)
			Escribir  'Resultado: ', Resul
			Si Resul<18.5 Entonces
				Escribir "Índice Masa corporal: ",resul
				Escribir ' Tienes Insuficiencia Ponderadal'
			SiNo
				Si Resul >= 18.5 Y Resul < 25.0 Entonces
					Escribir "Índice Masa corporal: ",resul
					Escribir "Tienes Peso Normal"
				SiNo
					Si Resul >= 25.0 Y Resul < 30.0 Entonces
						Escribir "Índice Masa corporal: ",resul
						Escribir "Tienes Preobesidad"
					SiNo
						Si Resul >= 30.0 Y Resul < 35.0 Entonces
							Escribir "Índice Masa corporal: ",resul
							Escribir "Tienes Obesidad Clase 1"
						SiNo
							Si Resul >= 35.0 Y Resul < 40 Entonces
								Escribir "Índice Masa corporal: ",resul
								Escribir "Tienes Obesidad Clase 2"
							SiNo
								Si Resul >= 40.0 Entonces
									Escribir "Índice Masa corporal: ",resul
									Escribir "Teienes Obesidad Clase 3"
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		3:
			Escribir 'Area de un Circulo.'
			Definir radio Como Real
			Escribir 'Escriba el radio del circulo'
			Leer radio
			area <- 3.1416 * (radio^2)
			Escribir 'El area del circulo es: ', area
			
		De Otro Modo:
			Escribir 'No digitaste ninguna opcion.'
	Fin Segun
FinAlgoritmo
