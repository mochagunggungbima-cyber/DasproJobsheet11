1. Done.
2. Apa fungsi dari Arrays.toString()?
Arrays.toString() adalah method yang berfungsi untuk mengubah array menjadi representasi String yang mudah dibaca. Method ini akan menampilkan semua elemen array dalam format [elemen1, elemen2, elemen3, ...].
Contoh:
Input: int[] arr = {1, 2, 3}
Output dari Arrays.toString(arr): "[1, 2, 3]"
Tanpa Arrays.toString(), jika kita print array langsung, yang muncul adalah alamat memori array (contoh: [I@15db9742), bukan isi elemennya.
3. Apa nilai default untuk elemen pada array dengan tipe data int?
Nilai default untuk elemen array dengan tipe data int adalah 0 (nol).
Ketika array bertipe primitif dideklarasikan dan diinstansiasi, Java secara otomatis menginisialisasi semua elemennya dengan nilai default sesuai tipe datanya:
int → 0
double → 0.0
boolean → false
char → '\u0000' (karakter null)
Tipe objek (String, dll) → null
4. Done.
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
Tidak, panjang array tidak dapat dimodifikasi setelah diinstansiasi.
Penjelasan:
Setelah array dibuat dengan ukuran tertentu (misal new int[5]), ukurannya bersifat tetap/fixed.
Jika ingin mengubah ukuran, kita harus membuat array baru dengan ukuran yang berbeda.
Dalam kasus myNumbers, setiap baris sudah diinstansiasi dengan ukuran berbeda:
Baris 0 = 5 elemen (tetap 5, tidak bisa diubah)
Baris 1 = 3 elemen (tetap 3, tidak bisa diubah)
Baris 2 = 1 elemen (tetap 1, tidak bisa diubah)