package lab4;

String word = "Поле"

println('== RSA ==')
def rsa = new RSACode()
def rsaDecode = rsa.decode(word.getBytes())
println(rsaDecode)
println()
def rsaEncodeBytes = rsa.encode(rsaDecode as byte[])
println(rsaEncodeBytes)
println()
println(new String(word.getBytes()))
