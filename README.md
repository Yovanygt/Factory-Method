# Sistema de Métodos de Pago usando el Patrón Factory Method

Este programa es una aplicación de consola escrita en Java que permite al usuario seleccionar diferentes métodos de pago (tarjeta de crédito o PayPal) utilizando el patrón de diseño **Factory Method**.

## Descripción del programa

Este proyecto demuestra el uso del patrón de diseño creacional **Factory Method**. En lugar de crear directamente instancias de los diferentes métodos de pago (como Tarjeta de Crédito o PayPal), utilizamos Clases específicas que se encargan de la creación de estos objetos. Esto permite extender el programa con facilidad al agregar nuevos métodos de pago sin modificar el código existente.

### Estructura del programa

El programa está compuesto por las siguientes clases:

- **PaymentMethod (Interfaz):** Define el contrato que deben seguir todos los métodos de pago. Contiene un único método `pay(double amount)` que debe ser implementado por las clases concretas.
  
- **CreditCardPayment (Implementa PaymentMethod):** Esta clase concreta implementa el método `pay` para simular un pago usando una tarjeta de crédito.
  
- **PaypalPayment (Implementa PaymentMethod):** Esta clase concreta implementa el método `pay` para simular un pago usando PayPal.

- **PaymentFactory (Clase abstracta):** Define un método abstracto `createPaymentMethod()` que será implementado por las Clases concretas.

- **CreditCardPaymentFactory (Extiende PaymentFactory):** Esta clase concreta crea una instancia de `CreditCardPayment`.

- **PaypalPaymentFactory (Extiende PaymentFactory):** Esta clase concreta crea una instancia de `PaypalPayment`.

- **Main:** La clase principal que permite al usuario seleccionar el método de pago y realizar un pago.

### Funcionamiento

1. El usuario selecciona un método de pago (1. Tarjeta de crédito o 2. PayPal).
2. Dependiendo de la selección del usuario, se crea una instancia de la Clase correspondiente.
3. La Clase seleccionada crea el método de pago adecuado.
4. El usuario ingresa el monto a pagar, y se realiza el pago utilizando el método seleccionado.

### Diagrama del Patrón Factory Method

![ ](https://github.com/Yovanygt/imagenes/blob/main/diagrama%20factory.png)


## Cómo ejecutar el programa

### Requisitos:

- Tener instalado Java 8 o superior.
- Tener un IDE o editor de código compatible con proyectos Java (Eclipse, IntelliJ IDEA, VS Code, etc.).

### Pasos para ejecutar:

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/tuusuario/metodos-de-pago-factory-method.git


### Seleccione el método de pago:
1. Tarjeta de Crédito
2. PayPal

![ ](https://github.com/Yovanygt/imagenes/blob/main/metodo_factory.png)



### Ingrese el monto a pagar:
150.00
Pagado 150.0 usando Tarjeta de Crédito.

![ ](https://github.com/Yovanygt/imagenes/blob/main/tarjeta_factory.png)


------------



## Si el Usuario Selecciona la Opcion No.2

------------

### Ingrese el monto a pagar:
50.00
Pagado 50.0 usando PayPal, en Linea.

![ ](https://github.com/Yovanygt/imagenes/blob/main/paypal_factory.png)


