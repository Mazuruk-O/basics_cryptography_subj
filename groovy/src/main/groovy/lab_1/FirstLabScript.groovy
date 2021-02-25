package lab_1

def alphebet = ['а', 'б', 'в', 'г', 'ґ', 'д', 'е', 'є', 'ж', 'з', 'и', 'і', 'ї', 'й', 'к', 'л', 'м',
                'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ю', 'я']

def testStr = 'Третя нормальна форма в базах даних'

println('== Шифр Цезаря ==')

def caesarCode = new CaesarCode(alphabet: alphebet, key: 3)
println caesarCode.decode(testStr)
println caesarCode.encode(caesarCode.decode(testStr))
println()

println('== Шифр Віженера ==')

def vizierCipher = new VizierCipher(alphebet, "тест")
println vizierCipher.decode(testStr)
println vizierCipher.encode(vizierCipher.decode(testStr))