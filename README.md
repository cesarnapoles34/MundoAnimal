# MundoAnimal

Aplicación de consola en Java que muestra información de distintos animales, su sonido y su forma de desplazarse. Aplica herencia, sobrescritura, polimorfismo, una clase abstracta y una interfaz.

## Estructura

```
src/mx/com/animales
├── Animal.java    → clase abstracta con nombre, edad, mostrarInformacion() y hacerSonido() abstracto
├── Movible.java   → interfaz con el método moverse()
├── Perro.java     → extiende Animal e implementa Movible
├── Gato.java      → extiende Animal e implementa Movible
├── Vaca.java      → extiende Animal e implementa Movible
├── Caballo.java   → reto extra, integrado sin cambiar el ciclo
└── Main.java      → crea los animales, los guarda en Animal[] y los recorre
```

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA (JDK 17 o superior).
2. Abrir `src/mx/com/animales/Main.java`.
3. Dar clic en el botón ▶ junto a `main` → **Run 'Main'**.

## Ejemplo de salida

```
Nombre: Machito | Edad: 3 | Sonido: Guau | Movimiento: Corre
Nombre: Mew | Edad: 2 | Sonido: Miau | Movimiento: Camina
Nombre: Inna | Edad: 5 | Sonido: Muu | Movimiento: Camina
Nombre: Bobollo | Edad: 10 | Sonido: Hiiii | Movimiento: Galopa
```

## Preguntas de reflexión

**1. ¿Qué se reutiliza al heredar de Animal?**
Los atributos `nombre` y `edad`, el constructor (a través de `super`) y el método `mostrarInformacion()`. Las clases hijas no tienen que volver a escribirlos.

**2. ¿Qué hace super(nombre, edad)?**
Llama al constructor de la clase padre (Animal) y le pasa los datos para que él los guarde. Es necesario porque los atributos son `private` y solo Animal puede asignarlos.

**3. ¿Para qué sirve @Override?**
Indica que un método está sobrescribiendo uno heredado o de una interfaz. El compilador verifica que exista en el padre, así que si me equivoco en el nombre, me marca error.

**4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?**
Por el polimorfismo: aunque la variable es de tipo `Animal`, Java ejecuta la versión del objeto real (Perro, Gato, Vaca o Caballo) en tiempo de ejecución. Por eso no se necesita `if/else`.

**5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?**
La clase abstracta puede tener atributos, constructor y métodos con cuerpo, y una clase solo puede heredar de una (`extends`). La interfaz es un contrato que solo define qué métodos se deben implementar, y una clase puede implementar varias (`implements`).