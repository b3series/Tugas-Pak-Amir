# Program Validasi Tanggal
 
nama_bulan = ["Januari","Februari","Maret","April","Mei","Juni","Juli",
              "Agustus","September","Oktober","November","Desember"]
 
tanggal = input("Masukan Tanggal  : ")
bulan = input("Masukan Bulan  : ")
tahun = input("Masukan Tahun : ")
kabisat = tahun % 4
 
if (bulan % 2 == 0):
    hari = 30
    bln = nama_bulan[bulan - 1]
 
    # tahun Kabisat
    if (kabisat == 0):
        hari = 29
        bln = nama_bulan[bulan - 1]
    else:
        hari = 28
        bln = nama_bulan[bulan - 1]
else:
    hari = 31
    bln = nama_bulan[bulan - 1]
 
bTanggal = tanggal >=1 and tanggal <= hari
bBulan = bulan >=1 and bulan <=12
bValid = bTanggal and bBulan
if(bValid):
        hasil = "adalah tanggal yang valid."
else:
        hasil = "adalah tanggal yang tidak valid."
print " "
print tanggal,bulan,tahun,hasil
