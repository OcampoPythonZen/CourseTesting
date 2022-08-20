package com.example.junit5app.corutines

import java.io.IOException
import java.security.GeneralSecurityException
import java.security.Key
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.PrivateKey
import java.security.PublicKey
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.Arrays
import java.util.Base64
import javax.crypto.Cipher

class RSAPhone() {

    lateinit var privateKey: PrivateKey
    lateinit var publicKey: PublicKey

    companion object {

        // convert String publickey to Key object
        @Throws(GeneralSecurityException::class, IOException::class)
        fun loadPublicKey(stored: String): Key {
            val data: ByteArray = Base64.getDecoder().decode(stored.toByteArray())
            val spec = X509EncodedKeySpec(data)
            val fact = KeyFactory.getInstance("RSA")
            return fact.generatePublic(spec)
        }

        // Encrypt using publickey
        @Throws(Exception::class)
        fun encryptMessage(plainText: String, publickey: String): String {
            val cipher = Cipher.getInstance("RSA")
            cipher.init(Cipher.ENCRYPT_MODE, loadPublicKey(publickey))
            return Base64.getEncoder().encodeToString(
                cipher.doFinal
                    (plainText.toByteArray())
            )
        }

        // Decrypt using privatekey
        @Throws(Exception::class)
        fun decryptMessage(encryptedText: String?, privatekey: String):
                String {
            val cipher = Cipher.getInstance("RSA")
            cipher.init(Cipher.DECRYPT_MODE, loadPrivateKey(privatekey))
            return String(
                cipher.doFinal(
                    Base64.getDecoder().decode(encryptedText)
                )
            )
        }

        // Convert String private key to privateKey object
        @Throws(GeneralSecurityException::class)
        fun loadPrivateKey(key64: String): PrivateKey {
            val clear: ByteArray = Base64.getDecoder().decode(key64.toByteArray())
            val keySpec = PKCS8EncodedKeySpec(clear)
            val fact = KeyFactory.getInstance("RSA")
            val priv = fact.generatePrivate(keySpec)
            Arrays.fill(clear, 0.toByte())
            return priv
        }

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val secretText = "5529664637"
            val keyPairGenerator = RSAPhone()

            // Generate private and public key
            val privateKey: String = Base64.getEncoder().encodeToString(keyPairGenerator.privateKey.encoded)
            val publicKey: String = Base64.getEncoder().encodeToString(
                keyPairGenerator.publicKey.encoded
            )

            println("Private Key: ${privateKey.uppercase()}")
            println("Private Key Length: ${privateKey.length}")
            println("Public Key: ${publicKey.uppercase()}")
            println("Public Key Length: ${publicKey.length}")


            // Encrypt secret text using public key
            val encryptedValue = encryptMessage(secretText, publicKey)
            println("Encrypted Value: $encryptedValue")
            println("Encrypted Value Length: ${encryptedValue.length}")

            // Decrypt
            val decryptedText = decryptMessage(encryptedValue, privateKey)
            println("Decrypted output: $decryptedText")

            val str = "69DCBF948FD5CE59AE91B76BA910B9B4797A25A0C0FC6EAA36FADE0BC82B97641108BBDD7CC3C3826D648A5D600B2992B572B369E7913D3684CD6ED05D7D7FB03C3867B2013D1D296AAA318240CD08661A331952279BAF28DFA2DE80A70027D3975F70923C98BC17B319FD853547D9878BA8D34EFE0E300DB581495829312D2A921C2AA98D5E2D75FEF721F6872726B11DDE26428920428F2052907CECE3595CDCCA50AF2E8C9DC2107A5E9FC6D7D0B3FA2D6B9D8AFC10974A0921E375BFA1DE3D2C784A67D4A6936293C206492B5B448EA1FB593525DE9F41A8DFE57E9182F9E20EFFB8EF3CB3ADA046F9444E830A85533EAD8B391EB783A5695DEDB4FB4E6E"
            println(str.length)
        }
    }

    init {
        val keyGen = KeyPairGenerator.getInstance("RSA")
        keyGen.initialize(2770)
        val pair = keyGen.generateKeyPair()
        privateKey = pair.private
        publicKey = pair.public
    }

}