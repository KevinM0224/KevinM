import turtle
import random


turtle.setup(500, 500)

# Definir los colores
COLOR_FONDO = "white"
COLOR_JUGADOR = "blue"
COLOR_ENEMIGO = "red"
COLOR_COMIDA = "green"

# Crear el jugador
jugador = turtle.Turtle()
jugador.shape("circle")
jugador.color(COLOR_JUGADOR)
jugador.penup()

# Crear los enemigos
enemigos = []
for i in range(3):
    enemigo = turtle.Turtle()
    enemigo.shape("triangle")
    enemigo.color(COLOR_ENEMIGO)
    enemigo.penup()
    enemigo.goto(random.randint(-200, 200), random.randint(-200, 200))
    enemigos.append(enemigo)

# Crear la comida
comida = turtle.Turtle()
comida.shape("square")
comida.color(COLOR_COMIDA)
comida.penup()
comida.goto(random.randint(-200, 200), random.randint(-200, 200))

# Definir la velocidad del jugador
velocidad = 10

# Definir la función de movimiento del jugador
def mover_arriba():
    jugador.sety(jugador.ycor() + velocidad)

def mover_abajo():
    jugador.sety(jugador.ycor() - velocidad)

def mover_izquierda():
    jugador.setx(jugador.xcor() - velocidad)

def mover_derecha():
    jugador.setx(jugador.xcor() + velocidad)

# Asignar las teclas de movimiento del jugador
turtle.listen()
turtle.onkey(mover_arriba, "Up")
turtle.onkey(mover_abajo, "Down")
turtle.onkey(mover_izquierda, "Left")
turtle.onkey(mover_derecha, "Right")

# Iniciar el bucle principal del juego
jugando = True
while jugando:
    # Mover los enemigos hacia el jugador
    for enemigo in enemigos:
        if jugador.distance(enemigo) < 20:
            print("¡Perdiste!")
            jugando = False
        else:
            x = enemigo.xcor()
            y = enemigo.ycor()
            if jugador.xcor() > x:
                x += 1
            elif jugador.xcor() < x:
                x -= 1
            if jugador.ycor() > y:
                y += 1
            elif jugador.ycor() < y:
                y -= 1
            enemigo.goto(x, y)

    # Comprobar si el jugador comió la comida
    if jugador.distance(comida) < 20:
        comida.goto(random.randint(-200, 200), random.randint(-200, 200))

    # Actualizar la pantalla
    turtle.update()

# 
turtle.bye()