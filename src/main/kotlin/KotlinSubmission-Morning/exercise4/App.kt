package id.infinitelearning.KotlinSubmission.exercise4
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun main() {
        try {
            val userInput = "dsm"
            val intValue = userInput.toInt()
            println("Nilai integer: $intValue")
        } catch (e: NumberFormatException) {
            println("Error: Gagal mengkonversi ke integer. Input bukan angka.\nInput harus berupa angka!")
        }
    }

