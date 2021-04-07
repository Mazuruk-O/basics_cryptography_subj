package lab3

import lab_1.CaesarCode

class VermanCode {

    def alphabet
    def key

    def decode(def str, def key) {
        if(!CaesarCode.isCorrectString(str) || !CaesarCode.isCorrectString(str) || str.size() != key.size()) {
                return 'Incorrect string! Try again.'
        }

        def i = 0
        StringBuilder decodeWord = new StringBuilder()
        str.each {
            decodeWord.append(((str.charAt(i) as int) ^ (key.charAt(i) as int)) as char)

            i++
        }

        return decodeWord.toString()
    }

    def encode(def str, def key) {
        if(!CaesarCode.isCorrectString(str) || !CaesarCode.isCorrectString(str) || str.size() != key.size()) {
            return 'Incorrect string! Try again.'
        }

        def i = 0
        StringBuilder decodeWord = new StringBuilder()
        str.each {
            decodeWord.append(((str.charAt(i) as int) ^ (key.charAt(i) as int)) as char)

            i++
        }

        return decodeWord.toString()
    }
}
