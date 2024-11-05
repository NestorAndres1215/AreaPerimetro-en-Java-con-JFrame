# Area Perimetro en Java con JFrame

Este proyecto es una **calculadora de áreas y perímetros** para diversas figuras geométricas, diseñado para proporcionar a los usuarios una forma sencilla y rápida de obtener estos cálculos esenciales.

## Descripción

La aplicación permite calcular el área y el perímetro de las siguientes figuras geométricas:

- **Círculo**
- **Cuadrado**
- **Rectángulo**
- **Triángulo**
- **Pentágono**
- **Rombo**

Los usuarios pueden seleccionar la figura deseada, ingresar las dimensiones requeridas y recibir instantáneamente los resultados de los cálculos. La interfaz es intuitiva y se basa en la biblioteca **Swing** de Java para proporcionar una experiencia de usuario fluida.

## Funcionalidades

- **Interfaz Gráfica**: Desarrollada con **Swing**, permite una interacción sencilla.
- **Cálculos Automáticos**: Los resultados se calculan y muestran en tiempo real tras ingresar las dimensiones.
- **Soporte para Múltiples Figuras**: Permite calcular áreas y perímetros de varias figuras geométricas comunes.

## Figuras y Cálculos

### Círculo
- **Área**: \( \text{Área} = \pi \times r^2 \)
- **Perímetro**: \( \text{Perímetro} = 2 \times \pi \times r \)

### Cuadrado
- **Área**: \( \text{Área} = l^2 \)
- **Perímetro**: \( \text{Perímetro} = 4 \times l \)

### Rectángulo
- **Área**: \( \text{Área} = b \times h \)
- **Perímetro**: \( \text{Perímetro} = 2 \times (b + h) \)

### Triángulo
- **Área**: \( \text{Área} = \frac{b \times h}{2} \)
- **Perímetro**: \( \text{Perímetro} = a + b + c \) (donde \( a, b, c \) son los lados del triángulo)

### Pentágono
- **Área**: \( \text{Área} = \frac{1}{4} \sqrt{5(5 + 2\sqrt{5})} \times l^2 \)
- **Perímetro**: \( \text{Perímetro} = 5 \times l \)

### Rombo
- **Área**: \( \text{Área} = \frac{d_1 \times d_2}{2} \)
- **Perímetro**: \( \text{Perímetro} = 4 \times l \)

## Estructura del Código

El código está organizado en varias clases que representan cada figura geométrica. La clase base `Figura` es abstracta y define métodos que deben ser implementados por las subclases.

### Clases Principales

- **Main.java**: Punto de entrada de la aplicación.
- **Figura.java**: Clase abstracta que contiene métodos para calcular área y perímetro.
- **Circulo.java**: Implementa cálculos específicos para un círculo.
- **Cuadrado.java**: Implementa cálculos específicos para un cuadrado.
- **Rectangulo.java**: Implementa cálculos específicos para un rectángulo.
- **Triangulo.java**: Implementa cálculos específicos para un triángulo.
- **Pentagono.java**: Implementa cálculos específicos para un pentágono.
- **Rombo.java**: Implementa cálculos específicos para un rombo.

## Ejemplo de Uso

### Cálculo de un Círculo

1. Selecciona "Círculo".
2. Ingresa el radio (por ejemplo, `5`).
3. Haz clic en "Calcular".

**Salida esperada:**
- Área: `78.54`
- Perímetro: `31.42`

### Cálculo de un Rectángulo

1. Selecciona "Rectángulo".
2. Ingresa la base (`4`) y la altura (`6`).
3. Haz clic en "Calcular".

**Salida esperada:**
- Área: `24.00`
- Perímetro: `20.00`

