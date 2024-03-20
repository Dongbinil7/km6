package com.example.layoutexam.data.datasource

import com.example.layoutexam.R
import com.example.layoutexam.data.model.Menu

interface MenuDataSource {
    fun getMenuData(): List<Menu>
}

class MenuDataSourceImpl : MenuDataSource {
    override fun getMenuData(): List<Menu> {
        return mutableListOf(
            return mutableListOf(
                Menu(
                    image = R.drawable.img_1,
                    name = "Salad",
                    price = 11000.0,
                    description = "Makanan Nusantara adalah kumpulan hidangan yang berasal dari berbagai daerah di Indonesia, setiap daerah memiliki kekhasan dan keunikan dalam bumbu serta cara pengolahannya. Makanan ini dikenal dengan kekayaan rempah-rempah yang menjadi ciri khas kuliner Indonesia. Rasa yang ditawarkan beragam, mulai dari pedas, manis, asam, hingga gurih, seringkali dalam satu hidangan yang sama. Tekstur makanannya pun beragam, ada yang lembut, renyah, hingga kenyal. Makanan Nusantara umumnya disajikan dengan nasi sebagai makanan pokok, ditemani dengan lauk-pauk yang terbuat dari daging, ikan, atau sayuran. Hidangan ini tidak hanya menawarkan kelezatan rasa, tapi juga keanekaragaman budaya dan tradisi yang terkandung di dalamnya.",
                    location = "Jl. Raya Bojongsoang No.279, Cipagalo, Kec. Bojongsoang, Kabupaten Bandung, Jawa Barat 40287",
                    mapLink = "https://www.google.com/maps?s=web&client=safari&lqi=Cgx3YXJ1bmcgbWFrYW5aFiIMd2FydW5nIG1ha2FuKgYIAxAAEAGSAQ9uYXNpX3Jlc3RhdXJhbnSqAUcQASoQIgx3YXJ1bmcgbWFrYW4oJjIfEAEiG14Ky1r67v7AMcnRT--evsiEHRjjyyQ104UcCzIQEAIiDHdhcnVuZyBtYWthbg&vet=12ahUKEwjuva67h4KFAxXq9zgGHT5PB0gQ1YkKegQIKxAI..i&cs=1&um=1&ie=UTF-8&fb=1&gl=id&sa=X&geocode=KUdjMxuz6WguMfUgx9S0wN9s&daddr=Jl.+Raya+Bojongsoang+No.279,+Cipagalo,+Kec.+Bojongsoang,+Kabupaten+Bandung,+Jawa+Barat+40287"
                ),
                Menu(
                    image = R.drawable.img_2,
                    name = "Nasi Padang",
                    price = 11000.0,
                    description = "Makanan Nusantara adalah kumpulan hidangan yang berasal dari berbagai daerah di Indonesia, setiap daerah memiliki kekhasan dan keunikan dalam bumbu serta cara pengolahannya. Makanan ini dikenal dengan kekayaan rempah-rempah yang menjadi ciri khas kuliner Indonesia. Rasa yang ditawarkan beragam, mulai dari pedas, manis, asam, hingga gurih, seringkali dalam satu hidangan yang sama. Tekstur makanannya pun beragam, ada yang lembut, renyah, hingga kenyal. Makanan Nusantara umumnya disajikan dengan nasi sebagai makanan pokok, ditemani dengan lauk-pauk yang terbuat dari daging, ikan, atau sayuran. Hidangan ini tidak hanya menawarkan kelezatan rasa, tapi juga keanekaragaman budaya dan tradisi yang terkandung di dalamnya.",
                    location = "Jl. Raya Bojongsoang No.279, Cipagalo, Kec. Bojongsoang, Kabupaten Bandung, Jawa Barat 40287",
                    mapLink = "https://www.google.com/maps?s=web&client=safari&lqi=Cgx3YXJ1bmcgbWFrYW5aFiIMd2FydW5nIG1ha2FuKgYIAxAAEAGSAQ9uYXNpX3Jlc3RhdXJhbnSqAUcQASoQIgx3YXJ1bmcgbWFrYW4oJjIfEAEiG14Ky1r67v7AMcnRT--evsiEHRjjyyQ104UcCzIQEAIiDHdhcnVuZyBtYWthbg&vet=12ahUKEwjuva67h4KFAxXq9zgGHT5PB0gQ1YkKegQIKxAI..i&cs=1&um=1&ie=UTF-8&fb=1&gl=id&sa=X&geocode=KUdjMxuz6WguMfUgx9S0wN9s&daddr=Jl.+Raya+Bojongsoang+No.279,+Cipagalo,+Kec.+Bojongsoang,+Kabupaten+Bandung,+Jawa+Barat+40287"
                ),
                Menu(
                    image = R.drawable.img_3,
                    name = "Ayam Bakar",
                    price = 12000.0,
                    description = "Makanan Nusantara adalah kumpulan hidangan yang berasal dari berbagai daerah di Indonesia, setiap daerah memiliki kekhasan dan keunikan dalam bumbu serta cara pengolahannya. Makanan ini dikenal dengan kekayaan rempah-rempah yang menjadi ciri khas kuliner Indonesia. Rasa yang ditawarkan beragam, mulai dari pedas, manis, asam, hingga gurih, seringkali dalam satu hidangan yang sama. Tekstur makanannya pun beragam, ada yang lembut, renyah, hingga kenyal. Makanan Nusantara umumnya disajikan dengan nasi sebagai makanan pokok, ditemani dengan lauk-pauk yang terbuat dari daging, ikan, atau sayuran. Hidangan ini tidak hanya menawarkan kelezatan rasa, tapi juga keanekaragaman budaya dan tradisi yang terkandung di dalamnya.",
                    location = "Jl. Raya Bojongsoang No.279, Cipagalo, Kec. Bojongsoang, Kabupaten Bandung, Jawa Barat 40287",
                    mapLink = "https://www.google.com/maps?s=web&client=safari&lqi=Cgx3YXJ1bmcgbWFrYW5aFiIMd2FydW5nIG1ha2FuKgYIAxAAEAGSAQ9uYXNpX3Jlc3RhdXJhbnSqAUcQASoQIgx3YXJ1bmcgbWFrYW4oJjIfEAEiG14Ky1r67v7AMcnRT--evsiEHRjjyyQ104UcCzIQEAIiDHdhcnVuZyBtYWthbg&vet=12ahUKEwjuva67h4KFAxXq9zgGHT5PB0gQ1YkKegQIKxAI..i&cs=1&um=1&ie=UTF-8&fb=1&gl=id&sa=X&geocode=KUdjMxuz6WguMfUgx9S0wN9s&daddr=Jl.+Raya+Bojongsoang+No.279,+Cipagalo,+Kec.+Bojongsoang,+Kabupaten+Bandung,+Jawa+Barat+40287"
                ),
                Menu(
                    image = R.drawable.img_4,
                    name = "Gulai",
                    price = 13000.0,
                    description = "Makanan Nusantara adalah kumpulan hidangan yang berasal dari berbagai daerah di Indonesia, setiap daerah memiliki kekhasan dan keunikan dalam bumbu serta cara pengolahannya. Makanan ini dikenal dengan kekayaan rempah-rempah yang menjadi ciri khas kuliner Indonesia. Rasa yang ditawarkan beragam, mulai dari pedas, manis, asam, hingga gurih, seringkali dalam satu hidangan yang sama. Tekstur makanannya pun beragam, ada yang lembut, renyah, hingga kenyal. Makanan Nusantara umumnya disajikan dengan nasi sebagai makanan pokok, ditemani dengan lauk-pauk yang terbuat dari daging, ikan, atau sayuran. Hidangan ini tidak hanya menawarkan kelezatan rasa, tapi juga keanekaragaman budaya dan tradisi yang terkandung di dalamnya.",
                    location = "Jl. Raya Bojongsoang No.279, Cipagalo, Kec. Bojongsoang, Kabupaten Bandung, Jawa Barat 40287",
                    mapLink = "https://www.google.com/maps?s=web&client=safari&lqi=Cgx3YXJ1bmcgbWFrYW5aFiIMd2FydW5nIG1ha2FuKgYIAxAAEAGSAQ9uYXNpX3Jlc3RhdXJhbnSqAUcQASoQIgx3YXJ1bmcgbWFrYW4oJjIfEAEiG14Ky1r67v7AMcnRT--evsiEHRjjyyQ104UcCzIQEAIiDHdhcnVuZyBtYWthbg&vet=12ahUKEwjuva67h4KFAxXq9zgGHT5PB0gQ1YkKegQIKxAI..i&cs=1&um=1&ie=UTF-8&fb=1&gl=id&sa=X&geocode=KUdjMxuz6WguMfUgx9S0wN9s&daddr=Jl.+Raya+Bojongsoang+No.279,+Cipagalo,+Kec.+Bojongsoang,+Kabupaten+Bandung,+Jawa+Barat+40287"
                ),
                Menu(
                    image = R.drawable.img_5,
                    name = "Ketoprak",
                    price = 14000.0,
                    description = "Makanan Nusantara adalah kumpulan hidangan yang berasal dari berbagai daerah di Indonesia, setiap daerah memiliki kekhasan dan keunikan dalam bumbu serta cara pengolahannya. Makanan ini dikenal dengan kekayaan rempah-rempah yang menjadi ciri khas kuliner Indonesia. Rasa yang ditawarkan beragam, mulai dari pedas, manis, asam, hingga gurih, seringkali dalam satu hidangan yang sama. Tekstur makanannya pun beragam, ada yang lembut, renyah, hingga kenyal. Makanan Nusantara umumnya disajikan dengan nasi sebagai makanan pokok, ditemani dengan lauk-pauk yang terbuat dari daging, ikan, atau sayuran. Hidangan ini tidak hanya menawarkan kelezatan rasa, tapi juga keanekaragaman budaya dan tradisi yang terkandung di dalamnya.",
                    location = "Jl. Raya Bojongsoang No.279, Cipagalo, Kec. Bojongsoang, Kabupaten Bandung, Jawa Barat 40287",
                    mapLink = "https://www.google.com/maps?s=web&client=safari&lqi=Cgx3YXJ1bmcgbWFrYW5aFiIMd2FydW5nIG1ha2FuKgYIAxAAEAGSAQ9uYXNpX3Jlc3RhdXJhbnSqAUcQASoQIgx3YXJ1bmcgbWFrYW4oJjIfEAEiG14Ky1r67v7AMcnRT--evsiEHRjjyyQ104UcCzIQEAIiDHdhcnVuZyBtYWthbg&vet=12ahUKEwjuva67h4KFAxXq9zgGHT5PB0gQ1YkKegQIKxAI..i&cs=1&um=1&ie=UTF-8&fb=1&gl=id&sa=X&geocode=KUdjMxuz6WguMfUgx9S0wN9s&daddr=Jl.+Raya+Bojongsoang+No.279,+Cipagalo,+Kec.+Bojongsoang,+Kabupaten+Bandung,+Jawa+Barat+40287"
                ),





                )
            )

    }
}