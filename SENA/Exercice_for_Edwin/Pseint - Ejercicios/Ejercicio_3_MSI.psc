Algoritmo MasaCorporal_IMC
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
FinAlgoritmo
