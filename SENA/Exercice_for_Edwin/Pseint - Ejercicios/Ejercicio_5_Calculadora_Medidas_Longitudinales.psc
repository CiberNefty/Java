Algoritmo Calculadora_Medidas_Longitudinales
	Definir opc, metros Como real
	Escribir 'CONVERTIDOR K-D-D-C'
	Escribir "Ingresame los metros a convertir: "
	Leer metros
	Escribir "Los metros que ingresaste a que medida quieres convertirlos?"
	Escribir '1. Convertir a Kilometros'
	Escribir '2. Convertir a Decametros'
	Escribir '3. Convertir a Decimetros'
	Escribir '4. Convertir a Centimetros'
	Escribir "Escriba la opcion: '
	Leer opc
	
	Segun opc Hacer
		1:
			resul<-metros/1000
			Escribir metros," metros equivalen a ", resul, '(Km) Kilometros."
		2:
			resul<- metros*0.1
			Escribir metros," metros equivalen a", resul,"(Dam) Decametros."
		3:
			resul<- metros*10
			Escribir "metros, metros equivalen a ",resul,"(Dec) Decimetross "
		4:	
			resul<-metros*100
			Escribir metros," metros equivalen a ",resul,"(Cm) Centimetros."
	FinSegun
FinAlgoritmo
