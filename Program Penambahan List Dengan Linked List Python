class Node:

    # Constructor untuk buat node sebagai objek
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:

    # Fungsi untuk inisialisasi kepala
    def __init__(self):
        self.head = None

    # Fungsi untuk memasukkan Node baru di awal
    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    # List penjumlahan dua buah Nodes
    def addTwoLists(self, first, second):
        prev = None
        temp = None
        carry = 0

        # Selama kedua Node ada isinya maka
        while (first is not None or second is not None):

            fdata = 0 if first is None else first.data
            sdata = 0 if second is None else second.data
            Sum = carry + fdata + sdata

            # Perbarui carry untuk perhitungan selanjutnya
            carry = 1 if Sum >= 10 else 0

            # Perbarui penjumlahan jika lebih besar dari 10 (puluhan)
            Sum = Sum if Sum < 10 else Sum % 10

            # Buat Node baru sebagai hasil penjumlahan
            temp = Node(Sum)

            # Jika ini merupakan Node pertama maka jadikan sebagai kepala
            if self.head is None:
                self.head = temp
            else:
                prev.next = temp

                # Atur prev untuk insert selanjutnya
            prev = temp

            # Pindahkan pointer pertama dan kedua untuk next Nodes
            if first is not None:
                first = first.next
            if second is not None:
                second = second.next

        if carry > 0:
            temp.next = Node(carry)

    def printList(self):
        temp = self.head
        while (temp):
            print temp.data,
            temp = temp.next

first = LinkedList()
second = LinkedList()

# Buat List pertama
first.push(3)
first.push(4)
first.push(7)

print "\nSebagai contoh kita ingin Menjumlah : "
print "\n347 + 37 = ..."
print "\nUntuk semua list dilihat dari belakang"
print "\nList Pertama yaitu =",
first.printList() ,

# Buat List kedua
second.push(3)
second.push(7)
print "\nList Kedua yaitu =",
second.printList()," "

# Hasil Penjumlahan list
res = LinkedList()
res.addTwoLists(first.head, second.head)
print "\nPenjumlahan Kedua List =",
res.printList()
