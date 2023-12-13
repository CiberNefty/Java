Algoritmo Determinar_Nota
	Definir n1,n2,n3, resul como real
	Escribir "Ingrese Nota 1: "
	Leer n1
	Escribir "Ingrese Nota 2: "
	Leer n2
	Escribir "Ingrese Nota 3: "
	Leer n3
	resul <- (n1+n2+n3)/3
	Si resul >=4.0 Entonces
		Escribir "El Estudiante aprobo con: ", resul " Excelente"
	SiNo
		Si resul<=3.9 Y resul>=3.0  Entonces
			Escribir "El estudiante aprobro con: ", resul " ACEPTABLE"
		SiNo
			Si resul < 3.0 Entonces
				Escribir "El estudiante reprobo con: ", result " INSUFICIENTE"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
