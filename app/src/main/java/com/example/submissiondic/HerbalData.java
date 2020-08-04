package com.example.submissiondic;

import java.util.ArrayList;

public class HerbalData {

    private static String[] herbalName = {
            "Asam Jawa",
            "Bunga Rosela",
            "Daun Bayam",
            "Daun Cincau",
            "Daun Dewa",
            "Daun Kelor",
            "Daun Kemangi",
            "Daun Kumis Kucing",
            "Daun Pacar Cina",
            "Daun Saga",
            "Daun Seledri",
            "Jahe",
            "Jambu Biji",
            "Jeruk Nipis",
            "Lidah Buaya"
    };
    private static String[] herbalDetail = {
            "Asam jawa, asam atau asem adalah sejenis buah yang masam rasanya; biasa digunakan sebagai campuran bumbu dalam banyak masakan Indonesia sebagai perasa atau penambah rasa asam dalam makanan, misalnya pada sayur asam atau kadang-kadang pada kuah pempek.",
            "Rosela, asam kumbang, asam susur, asam paya atau rosella adalah spesies bunga yang berasal dari benua Afrika. Mulanya bunga yang juga cantik untuk dijadikan penghias halaman rumah itu diseduh sebagai minuman hangat di musim dingin dan minuman dingin di musim panas.",
            "Bayam adalah tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh.",
            "Cincau (Hanzi: 仙草, pinyin: xiancao) adalah minuman dingin yang di antara isinya ada semacam agar-agar dibuat dari daun cincau;[1] agar-agar cincau serupa gel yang diperoleh dari perendaman daun (atau organ lain) tumbuhan tertentu dalam air. Gel terbentuk karena daun tumbuhan tersebut mengandung karbohidrat yang mampu mengikat molekul-molekul air. Cincau juga merupakan nama dari tumbuhan penghasil agar-agar xincau.",
            "Daun Dewa mempunyai nama latin, orang China menyebutnya Samsit. Tinggi tanaman ini sekitar 30-40 cm, merupakan tumbuhan tegak, batang daun pendek lunak berbentuk segi lima, dengan penampang berbentuk lonjong dan berambut pada sisi luar.",
            "Kelor atau merunggai adalah sejenis tumbuhan dari suku Moringaceae. Tumbuhan ini dikenal dengan nama lain seperti: limaran, moringa, ben-oil, drumstick, horseradish tree, dan malunggay di Filipina.",
            "Kemangi adalah terna kecil yang daunnya biasa dimakan sebagai lalap. Aroma daunnya khas, kuat namun lembut dengan sentuhan aroma limau. Daun kemangi merupakan salah satu bumbu bagi pepes. Sebagai lalapan, daun kemangi biasanya dimakan bersama-sama daun kubis, irisan ketimun, dan sambal untuk menemani ayam atau ikan goreng. Di Thailand ia dikenal sebagai manglak dan juga sering dijumpai dalam menu masakan setempat.",
            "Orthosiphon aristatus atau dikenal dengan nama kumis kucing termasuk tanaman dari famili Lamiaceae/Labiatae. Tanaman ini merupakan salah satu tanaman obat asli Indonesia yang mempunyai manfaat dan kegunaan yang cukup banyak dalam menanggulangi berbagai penyakit.",
            "Pacar cina, culan, pacar culan, kemuning cina, atau bhangear cina adalah tanaman perdu dari famili Meliaceae dengan nama latin Aglaia odorata Lour. yang sering disamakan dengan kemuning. Tanaman ini diperkirakan merupakan tanaman asli Asia Tenggara.",
            "Di beberapa kalangan daunnya dimanfaatkan untuk meredakan batuk. Beberapa tangkai daun segar di rendam dalam air mendidih, setelah dingin airnya disaring dan diminum. Untuk memberikan rasa bisa ditambah gula aren secukupnya. Saga rambat, saga telik, atau saga areuy merupakan tumbuhan obat anti seriawan yang populer.",
            "Seledri adalah sayuran daun dan tumbuhan obat yang biasa digunakan sebagai bumbu masakan. Beberapa negara termasuk Jepang, Cina dan Korea mempergunakan bagian tangkai daun sebagai bahan makanan.",
            "Jahe, adalah tanaman rimpang yang sangat populer sebagai rempah-rempah dan bahan obat. Rimpangnya berbentuk jemari yang menggembung di ruas-ruas tengah. Rasa dominan pedas disebabkan senyawa keton bernama zingeron. Jahe termasuk suku Zingiberaceae.",
            "Jambu batu atau sering juga disebut jambu biji, jambu siki dan jambu klutuk adalah tanaman tropis yang berasal dari Brasil, disebarkan ke Indonesia melalui Thailand. Jambu batu memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis.",
            "Jeruk Nipis merupakan jenis tumbuhan yang masuk kedalam suku jeruk-jerukan, tersebar di Asia Dan Amerika Tengah dikenal juga sebagai jeruk pecel. Pohon jeruk nipis dapat mencapai tinggi 3—6 meter, bercabang banyak dan berduri, daun lonjong, tangkai daun bersayap kecil.",
            "Lidah buaya adalah spesies tumbuhan dengan daun berdaging tebal dari genus Aloe. Tumbuhan ini bersifat menahun, berasal dari Jazirah Arab, dan tanaman liarnya telah menyebar ke kawasan beriklim tropis, semi-tropis, dan kering di berbagai belahan dunia."
    };
    private static int[] herbalImages = {
            R.drawable.asam_jawa,
            R.drawable.bunga_rosella,
            R.drawable.daun_bayam,
            R.drawable.daun_cincau,
            R.drawable.daun_dewa,
            R.drawable.daun_kelor,
            R.drawable.daun_kemangi,
            R.drawable.daun_kumis_kucing,
            R.drawable.daun_pacar_cina,
            R.drawable.daun_saga,
            R.drawable.daun_seledri,
            R.drawable.jahe,
            R.drawable.jambu_biji,
            R.drawable.jeruk_nipis,
            R.drawable.lidah_buaya
    };
    static ArrayList<Herbal> getListData(){
        ArrayList<Herbal> list = new ArrayList<>();
        for (int position = 0; position < herbalName.length; position++){
            Herbal herbal = new Herbal();
            herbal.setName(herbalName[position]);
            herbal.setDetail(herbalDetail[position]);
            herbal.setPhoto(herbalImages[position]);
            list.add(herbal);
        }
        return list;
    }
}
