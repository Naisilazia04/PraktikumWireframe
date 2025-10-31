package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(
            1,
            "Keripik Singkong Pedas",
            "Keripik singkong renyah dengan bumbu balado pedas nampol",
            "Rp 8.000",
            R.color.redSnack
        ),
        FoodItem(
            2,
            "Pisang Goreng Crispy",
            "Pisang goreng dengan tepung renyah dan taburan keju parut",
            "Rp 10.000",
            R.color.amberSnack
        ),
        FoodItem(
            3,
            "Tahu Crispy Isi",
            "Tahu goreng crispy berisi sayuran dan tauge segar",
            "Rp 7.000",
            R.color.orangeSnack
        ),
        FoodItem(
            4,
            "Cireng Bumbu Rujak",
            "Cireng kenyal dengan bumbu rujak pedas manis",
            "Rp 6.000",
            R.color.redSnack
        ),
        FoodItem(
            5,
            "Makaroni Goreng Pedas",
            "Makaroni goreng crispy dengan bumbu pedas level 5",
            "Rp 9.000",
            R.color.redSnack
        ),
        FoodItem(
            6,
            "Sukun Goreng Keju",
            "Sukun goreng renyah dengan taburan keju mozarella",
            "Rp 11.000",
            R.color.amberSnack
        ),
        FoodItem(
            7,
            "Risoles Mayo Premium",
            "Risoles isi ragout ayam dengan mayonaise creamy",
            "Rp 12.000",
            R.color.orangeSnack
        ),
        FoodItem(
            8,
            "Lumpia Mini Sayur",
            "Lumpia mini isi sayuran segar dengan saus sambal",
            "Rp 8.000",
            R.color.tealSnack
        ),
        FoodItem(
            9,
            "Tempe Mendoan Asli",
            "Tempe mendoan tipis crispy dengan cabai rawit",
            "Rp 7.000",
            R.color.orangeSnack
        ),
        FoodItem(
            10,
            "Bakwan Jagung Spesial",
            "Bakwan jagung manis dengan sayuran pilihan",
            "Rp 9.000",
            R.color.amberSnack
        ),
        FoodItem(
            11,
            "Kroket Kentang Isi",
            "Kroket kentang isi daging sapi cincang dengan bumbu",
            "Rp 10.000",
            R.color.orangeSnack
        ),
        FoodItem(
            12,
            "Combro Oncom Pedas",
            "Combro isi oncom pedas khas Sunda yang gurih",
            "Rp 6.000",
            R.color.indigoSnack
        )
    )
}
