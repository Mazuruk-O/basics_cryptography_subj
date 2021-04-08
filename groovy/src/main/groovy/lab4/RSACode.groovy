package lab4

class RSACode {

    BigInteger P;
    BigInteger Q;
    BigInteger N;
    BigInteger PHI;
    BigInteger e;
    BigInteger d;
    int maxLength = 1024;
    Random R;

    RSACode() {
        R = new Random();
        P = BigInteger.probablePrime(maxLength, R);
        Q = BigInteger.probablePrime(maxLength, R);
        N = P.multiply(Q);
        PHI = P.subtract(BigInteger.ONE).multiply(  Q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime((maxLength / 2) as int, R);
        while (PHI.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(PHI) < 0) {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(PHI);
    }

    RSACode(BigInteger n, BigInteger e, BigInteger d) {
        N = n
        this.e = e
        this.d = d
    }

    def decode(byte[] message)
    {
        return (new BigInteger(message)).modPow(e, N);
    }

    def encode(byte[] message)
    {
        return (new BigInteger(message)).modPow(d, N);
    }

    static String bToS(byte[] cipher)
    {
        String temp = "";
        for (byte b : cipher)
        {
            temp += Byte.toString(b);
        }
        return temp;
    }
}
