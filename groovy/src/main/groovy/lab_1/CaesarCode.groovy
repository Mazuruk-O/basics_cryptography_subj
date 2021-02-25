package lab_1

class CaesarCode {

    def alphabet
    def key

    static def isCorrectString(def str) {
        str && !str.isEmpty() && (str.size() > 0)
    }

    def encode(def str) {
        if(!isCorrectString(str)) {
            return 'Incorrect string! Try again.'
        }

        final int alphabetSize = alphabet.size() - 1
        def encodeStr = new StringBuilder()

        str.each {
            if(it == ' ') {
                encodeStr.append(' ')
            } else if(alphabet.indexOf(it) != -1) {
                encodeStr.append(alphabet[(alphabet.indexOf(it) - key) % alphabetSize])
            } else {
                encodeStr.append(alphabet[(alphabet.indexOf(it.toLowerCase()) - key) % alphabetSize].toUpperCase())
            }
        }

        encodeStr.toString()
    }

    def getNewIndex(alphabet, key, oldIndex) {
        if(oldIndex + key > alphabet.size() - 1) {
            return (oldIndex + key - 1) % (alphabet.size() - 1)
        }

        oldIndex + key
    }

    def decode(def str) {
        if(!isCorrectString(str)) {
            return 'Incorrect string! Try again.'
        }

        final int alphabetSize = alphabet.size() - 1
        def decodeStr = new StringBuilder()

        str.each {
            if(it == ' ') {
                decodeStr.append(' ')
            } else if(alphabet.indexOf(it) != -1) {
                decodeStr.append(alphabet[getNewIndex(alphabet, key, alphabet.indexOf(it))])
            } else {
                decodeStr.append(alphabet[getNewIndex(alphabet, key, alphabet.indexOf(it.toLowerCase()))].toUpperCase())
            }
        }

        decodeStr.toString()
    }
}
