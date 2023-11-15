package id.infinitelearning.KotlinSubmission.exercise1

import com.sun.org.apache.xpath.internal.operations.Bool

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val first: String = "Sugini"
    val last: String = "Injani"
    var age: Number = 21
    var statuss: Boolean = true

    println("Halo kakak mentor! perkenalkan nama saya $first $last")
    println("Saya berumur $age dan status saya sudah ${if(statuss) "taken" else "single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var codeSmiths = "Grup merge $groupId, dengan member ${groupMember.joinToString(", ")} dari sesi $session"
    return codeSmiths
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val memCSmith: List<String> = listOf(
        "Putra Ganda D",
        "Sugini Injani",
        "Dewangga Nanda A",
        "Novia Indah R",
        "Abdul Malik",
        "Revon Anandiya",
        "Nabilah Rahmah",
        "Alexandro",
        "Vina Damayanti",
        "M. Faiz")
    var gege = memCSmith[1]
    return listOf(gege)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>(
        "Shania",
        "Kelvin",
        "Iffan"
    )
    val countOfGroup = arrayOf<String>(
        "Putra Ganda D",
        "Sugini Injani",
        "Dewangga Nanda A",
        "Novia Indah R",
        "Abdul Malik",
        "Revon Anandiya",
        "Nabilah Rahmah",
        "Alexandro",
        "Vina Damayanti",
        "M. Faiz"
    )

    val sum = mentor.size + countOfGroup.size

    return sum
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("13", listOf(
        "Putra Ganda D",
        "Sugini Injani",
        "Dewangga Nanda A",
        "Novia Indah R",
        "Abdul Malik",
        "Revon Anandiya",
        "Nabilah Rahmah",
        "Alexandro",
        "Vina Damayanti",
        "M. Faiz"), "Morning")

}