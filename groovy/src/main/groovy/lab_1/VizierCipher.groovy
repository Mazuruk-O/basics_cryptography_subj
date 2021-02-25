package lab_1

class VizierCipher {

    def alphabet
    def key

    VizierCipher(alphabet, key) {
        this.alphabet = alphabet
        this.key = ""

        while (alphabet.size() > this.key.size()) {
          this.key += key;
        }

        this.key = this.key.substring(0, alphabet.size())
    }

    def encode(def str) {
        if (!CaesarCode.isCorrectString(str)) {
            return 'Incorrect string! Try again.'
        }

        final int alphabetSize = alphabet.size()
        def decodeStr = new StringBuilder()

        int currentIndex = -1
        str.each {
            currentIndex = alphabet.indexOf(it)

            if (it == ' ') {
                decodeStr.append(' ')
            } else if (currentIndex != -1) {
                decodeStr.append(alphabet[(currentIndex + alphabetSize - alphabet.indexOf(key.charAt(currentIndex))) % alphabetSize])
            } else {
                currentIndex = alphabet.indexOf(it.toLowerCase())
                decodeStr.append(alphabet[(currentIndex + alphabetSize - alphabet.indexOf(key.charAt(currentIndex))) % alphabetSize].toUpperCase())
            }
        }

        decodeStr.toString()
    }

    def decode(def str) {
        if (!CaesarCode.isCorrectString(str)) {
            return 'Incorrect string! Try again.'
        }

        final int alphabetSize = alphabet.size() - 1
        def encodeStr = new StringBuilder()

        int currentIndex = -1
        str.each {
            currentIndex = alphabet.indexOf(it)

            if (it == ' ') {
                encodeStr.append(' ')
            } else if (currentIndex != -1) {
                encodeStr.append(alphabet[(currentIndex + alphabet.indexOf(key.charAt(currentIndex))) % alphabetSize])
            } else {
                currentIndex = alphabet.indexOf(it.toLowerCase())
                encodeStr.append(alphabet[(currentIndex + alphabet.indexOf(key.charAt(currentIndex))) % alphabetSize].toUpperCase())
            }
        }

        encodeStr.toString()
    }
}
