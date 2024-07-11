Conceptos:

Variables


Definición: Una variable es un espacio de memoria que reserva un tipo de dato específico, como números, texto, booleanos, etc.

Declaración: En (.k+), las variables se declaran usando la sintaxis var nombreVariable = valor;. Por ejemplo, var edad = 30; declara una variable llamada edad con un valor inicial de 30.

Tipos de datos: Pueden ser de diferentes tipos, como enteros (int), flotantes (float), cadenas (string), booleanos (bool), entre otros.

Ámbito: Las variables pueden tener ámbito local o global. Las locales son accesibles solo dentro de un bloque de código específico, mientras que las globales se pueden acceder desde cualquier parte del programa.

Manipulación: Las variables pueden ser actualizadas (asignando un nuevo valor) durante la ejecución del programa.

Uso: Se utilizan para almacenar información temporalmente, realizar cálculos, interactuar con el usuario, entre otras tareas.
------------------------------------------------------------------------------
Declaración de Variables:
En Kotlin, las variables se declaran usando la palabra clave val para valores inmutables (constantes) y var para variables mutables. Por ejemplo:

val nombre: String = "Juan"  // Variable inmutable
var edad: Int = 30           // Variable mutable
-------------------------------------------------------------------------------
Inferencia de Tipos:
Kotlin permite la inferencia de tipos, lo que significa que el compilador puede deducir el tipo de una variable según el contexto, permitiendo una sintaxis más concisa. Por ejemplo:

val nombre = "María"   // Kotlin infiere que nombre es de tipo String
var edad = 25          // Kotlin infiere que edad es de tipo Int
--------------------------------------------------------------------------------

