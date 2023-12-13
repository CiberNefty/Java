Algoritmo Aplicar_Bonificacion
	Definir venta, descuento como Entero
	Escribir "Ingrese valor venta:"
	Leer venta
	Si venta >= 250000 Entonces
		descuento = venta*10/100
		venta <- venta - descuento
		Escribir "Tienes un descuento del 10%: $", descuento
		Escribir "Valor a cancelar: $",venta
	SiNo
		Escribir "No alcanza el valor de venta para descuento."
		Escribir "Valor a cancelar: $",venta
	FinSi
FinAlgoritmo
