
import turtle
import threading
import time


#ÁREA DE JUEGO.
wn = turtle.Screen()
wn.title("Pong")
wn.bgcolor("white")
wn.setup(width=800, height=600)
wn.tracer(0)

#MARCADOR
score_a = 0
score_b = 0

#PALA A
paddle_a = turtle.Turtle()
paddle_a.speed(0)
paddle_a.shape("square")
paddle_a.color("green")
paddle_a.shapesize(stretch_wid=5, stretch_len=1)
paddle_a.penup()
paddle_a.goto(-350, 0)

#PALA B
paddle_b = turtle.Turtle()
paddle_b.speed(0)
paddle_b.shape("square")
paddle_b.color("blue")
paddle_b.shapesize(stretch_wid=5, stretch_len=1)
paddle_b.penup()
paddle_b.goto(350, 0)

#LINEA DIVISORIA
line = turtle.Turtle()
line.speed(0)
line.shape("square")
line.color("gray")
line.shapesize(stretch_wid=30, stretch_len=0.07)
line.penup()
line.goto(0, 0)

#PELOTA
ball = turtle.Turtle()
ball.speed(0)
ball.shape("square")
ball.color("red")
ball.penup()
ball.goto(0, 0)
ball.dx = 2.0


ball.dy = 2.1
static = True

#MARCADOR INICIAL
pen = turtle.Turtle()
pen.speed(0)
pen.color("black")
pen.penup()
pen.hideturtle()
pen.goto(-2.5, 220)
pen.write("0       0",align="center", font=("Fixedsys", 60, "bold"))

#MENSAJE "ENTER".
pen2 = turtle.Turtle()
pen2.speed(0)
pen2.color("black")
pen2.penup()
pen2.hideturtle()
pen2.goto(0, 120)
pen2.write("PRESS ENTER TO START",align="center", font=("Fixedsys", 24, "bold"))


#ACTUALIZA MARCADOR.
def update_score():
    pen.clear()
    pen.write("{}       {}".format(score_a,score_b),
    align="center", font=("Fixedsys", 60, "bold"))
    point()

#MOVER PALA "A" HACIA ARRIBA
def paddle_a_up():
    y = paddle_a.ycor()
    if y <= 240:
        y += 20
        paddle_a.sety(y)

#MOVER PALA "A" HACIA ABAJO
def paddle_a_down():
    y = paddle_a.ycor()
    if y >= -220:
        y -= 20
        paddle_a.sety(y)

#MOVER PARA "B" HACIA ARRIBA
def paddle_b_up():
    y = paddle_b.ycor()
    if y <= 240:
        y += 20
        paddle_b.sety(y)

#MOVER PALA "B" HACIA ABAJO
def paddle_b_down():
    y = paddle_b.ycor()
    if y >= -220:
        y -= 20
        paddle_b.sety(y)


    
    


    
   

#INICIAR JUEGO    
def init_game():
    global static
    static = False
    pen2.clear()

def point(): 
    pen2.write("NEW POINT",align="center", font=("Fixedsys", 24, "bold"))
    time.sleep(1)
    pen2.clear()



#RESTAURAR PANTALLA DE INICIO
def reset_screen():
    ball.goto(0, 0)
    ball.dx *= -1    
    pen2.write("PRESS ENTER TO START",align="center", font=("Fixedsys", 24, "bold"))
    paddle_a.goto(-350, 0)
    paddle_b.goto(350, 0)

#REGISTRAR EVENTOS DE TECLADO.    
wn.listen()
wn.onkeypress(paddle_a_up, "w")
wn.onkeypress(paddle_a_down, "s")
wn.onkeypress(paddle_b_up, "Up")
wn.onkeypress(paddle_b_down, "Down")
wn.onkeypress(init_game, "Return")

#DESARROLLO DEL JUEGO.
while True:
    try:
        wn.update()
        #MOVER PELOTA
        if static == False:
            ball.setx(ball.xcor() + ball.dx)
            ball.sety(ball.ycor() + ball.dy)

        #REBOTE EN EL MARGEN SUPERIOR.
        if ball.ycor() > 290:
            ball.sety(290)
            ball.dy *= -1
         

        #REBOTE EN EL MARGEN INFERIOR.
        if ball.ycor() < -290:
            ball.sety(-290)
            ball.dy *= -1
         

        #PELOTA SOBREPASA LA PALA B
        if ball.xcor() > 390:
            score_a += 1
          
            update_score()
            static = True
            #time.sleep(1)
            reset_screen()

        #PELOTA SOBREPASA LA PALA A
        if ball.xcor() < -390:
            score_b += 1
           
            update_score()
            static = True
            #time.sleep(1)
            reset_screen()

        #REBOTE EN LA PALA B.
        if (ball.xcor() > 340 and ball.xcor() < 350) and (ball.ycor() < paddle_b.ycor() + 50 and ball.ycor() > paddle_b.ycor() - 50):
            ball.setx(340)
            ball.dx *= -1
          

        #REBOTE EN LA PALA A
        if (ball.xcor() < -340 and ball.xcor() > -350) and (ball.ycor() < paddle_a.ycor() + 50 and ball.ycor() > paddle_a.ycor() - 50):
            ball.setx(-340)
            ball.dx *= -1        
            
    except:
        break