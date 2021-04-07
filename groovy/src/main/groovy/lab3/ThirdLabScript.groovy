package lab3

def word = "Перша нормальна форма в базах даних"
def key = "QrtaaEWPbLfYGhdbCCrRZrPPDSgciVaMFWa"

println('== Шифр Вермана ==')
def verman = new VermanCode()
def vermanDecode = verman.decode(word, key)
println(vermanDecode)
println(verman.encode(vermanDecode, key))
