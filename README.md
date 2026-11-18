# Práctica de Mezcla Directa


* **Alumnos:** Mariem Cristina García López
  
Diego Ortiz Morales

---

##  Objetivo de la Práctica

Completar la lógica de intercalación de bloques en el método `intercalarBloques` en Java para comprender el funcionamiento práctico del algoritmo de ordenamiento externo de **Mezcla Directa**, comparando elementos provenientes de dos archivos auxiliares (`f1.txt` y `f2.txt`) con bloques ordenados de tamaño $L$ y fusionándolos de manera ascendente en un archivo de salida (`f3.txt`).

---

## Estructura del Proyecto

El proyecto está organizado en paquetes de Java junto con los archivos de texto auxiliares en la carpeta raíz:

```
Metodos_De_Ordenamiento/
├── ordenamientoexterno/
│   └──  src/
│       ├── MainMezcla.java
│       └── MezclaDirectaPractica.java
├── f1.txt
├── f2.txt
├── f3.txt
└── README.md

```

## Requisitos para ejecutar/clonar

Java Development Kit (JDK): Versión 8 o superior.

IDE recomendado: IntelliJ IDEA, Eclipse o Visual Studio Code.

Control de versiones: Git instalado en el sistema.

---

# Instrucciones de Instalación y Ejecución
Sigue estos pasos para clonar, configurar y ejecutar el programa en tu entorno de desarrollo:

1. Clonar el repositorio
Abre tu terminal o PowerShell y ejecuta el siguiente comando:

git clone https://github.com/mariemcris2212-hue/ordenamientoextrerno.git

2. Abrir el proyecto en el IDE (IntelliJ IDEA)
Abre IntelliJ IDEA.

Selecciona File > Open... (o Abrir).

Navega hasta la carpeta ordenamientoexterno que acabas de clonar y haz clic en OK.

Verifica que la carpeta src esté marcada como Sources Root y que tengas un JDK configurado en File > Project Structure > Project.

3. Verificar los archivos auxiliares (f1.txt y f2.txt)

Antes de ejecutar el código, asegúrate de que los archivos f1.txt y f2.txt se encuentren en la carpeta raíz del proyecto (al mismo nivel que src/ y README.md), conteniendo un número entero por renglón y sin líneas en blanco al final:

4. Ejecutar el programa
Dentro del panel de proyecto, despliega src > ordenamientoexterno.

Abre la clase MainMezcla.java (o MezclaDirectaPractica.java si ejecutas el main desde esa clase).

Haz clic en el botón verde Run.

Al finalizar la ejecución, el programa creará o actualizará automáticamente el archivo f3.txt en la raíz del proyecto con los datos intercalados en orden ascendente.

---

## Salida Obtenida en Consola

Al ejecutar el programa con los archivos correctamente ubicados en la raíz del proyecto, la consola muestra la siguiente salida exacta:

Bloque intercalado con exito!

Process finished with exit code 0

---

## Resultado generado en f3.txt

36

60
