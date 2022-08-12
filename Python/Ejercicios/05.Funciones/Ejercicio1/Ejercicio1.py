import math

def triarea(b, h):
    return (b*h)/2

def cirarea(r):
    return math.pi*r**2


areaTriangulo = triarea(2, 2)
print(areaTriangulo)

areaCirculo = cirarea(2)
print(areaCirculo)
