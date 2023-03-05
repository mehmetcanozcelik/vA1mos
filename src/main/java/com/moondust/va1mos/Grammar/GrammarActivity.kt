package com.moondust.va1mos.Grammar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.moondust.va1mos.KelimePaketi.KelimeActivity
import com.moondust.va1mos.R
import kotlinx.android.synthetic.main.activity_grammar.*

import kotlinx.android.synthetic.main.activity_grammar.bottomNavigationView

class GrammarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar)


        var dilbilgileri = arrayListOf<Grammar>(
            Grammar("Conocer a alguien","Biriyle tanışmak",R.drawable.meeting,"Adın(ız) nedir ? – Como te llamas ? / como se llama? (komo te yamas / komo se yyama)\n" +
                    "\n" +
                    "Benim adım … – Me llamo… (me yyamo…)\n" +
                    "\n" +
                    "Soyadım… – Mi apellido es… (mi apellido es…)\n" +
                    "\n" +
                    "Türküm – Soy turco (soy turko)\n" +
                    "\n" +
                    "(İstanbul)luyum – Soy de Estambul. (soy de Estambul)\n" +
                    "\n" +
                    "Kaç yaşındasınız ? – Cuantos anos tiene ? (kuantos anyos tiyene)\n" +
                    "\n" +
                    "… yaşındayım – Tengo … anos. (tengo … anyos)\n" +
                    "\n" +
                    "Mesleğiniz nedir ? / Ne iş yapıyorsunuz ? – A que se dedica? Cual es su profesion ? (a ke se dedika kual es su profesiyon)\n" +
                    "\n" +
                    "Ben (öğrenciyim, doktorum, öğretmenim, işçiyim…) – Soy (estudiante, médico, profesor, obrero…) (soy (estudiyante, mediko, profesor, obrero)\n" +
                    "\n" +
                    "Memnun oldum – Encantado / Encantado de conocerle (enkantado / enkantada de konoserle)\n" +
                    "\n" +
                    "Ben de memnun oldum. – Encantado / Encantada de conocerle también. (enkantado / enkantada de konoserle tambiyen)\n" +
                    "\n" +
                    "Nerelisiniz ? – De donde viene usted ? / De donde es usted ? (de donde biyene usted / de donde es usted))"),

            Grammar("Conversaciones diarias","Günlük Konuşma",R.drawable.feelings,"Como esta Usted? (Komo esta usted)\n" +
                    "\n" +
                    "Nasılsınız?\n" +
                    "\n" +
                    "Bien gracias y usted? (Bien grasyas i usted) Burada “y” harfi Türkçe’de “ve” anlamındadır ve “i” diye okunur.\n" +
                    "\n" +
                    "İyiyim teşekkürler siz?\n" +
                    "\n" +
                    "Encantado de conocerle (Enkantado de konoserle) ve ya Mucho gusto (muçho gusto)\n" +
                    "\n" +
                    "Tanıştığımıza memnun oldum\n" +
                    "\n" +
                    "Hasta luego (asta luego) İspanyolcada “h” harfi ile başlayan gelimelerde “h” harfinin telaffuzu yapılmaz.\n" +
                    "\n" +
                    "Görüşürüz!" ),
            Grammar("Pronombres","Zamirler",R.drawable.pronouns, "Tekil kişi zamirleri\n" +
                    "Yo : Ben\n" +
                    "Tú: Sen\n" +
                    "Él : O (Eril)\n" +
                    "Ella : O (Dişil)\n" +
                    "Usted : Siz\n" +
                    "Tekil kişi zamirlerinde dikkat etmeniz gereken bir ayrıntı “usted” zamirinin kullanımıdır. Eğer karşınızdaki kişiyi yeni tanıyorsanız veya resmi bir ortamda iseniz “tú” yerine “usted” zamirini kullanmalısınız.\n" +
                    "Çoğul kişi zamirleri\n" +
                    "Nosotros : Biz ( Eril) | Nosotras : Biz (Dişil)\n" +
                    "Vosotros: Sizler( Eril) | Vosotras : Sizler (Dişil)\n" +
                    "Ellos: Onlar (Eril)\n" +
                    "Ellas : Onlar (Dişil)\n" +
                    "Ustedes: Sizler\n" +
                    "Çoğul kişi zamirlerinde dikkat etmeniz gereken bir ayrıntı “ustedes” zamirinin kullanımıdır. Eğer karşınızdaki kişileri yeni tanıyorsanız veya resmi bir ortamda iseniz “vosotros/vosotras” yerine “ustedes” zamirini kullanmalısınız.\n" +
                    "\n"),
            Grammar("Adjetivos","Sıfatlar",R.drawable.adjective,"İspanyolca Sıfatlar [Niteleme Sıfatları]\n" +
                    "İsimlerin şeklini, durumunu, hareketini, rengini, kısacası özelliklerini gösteren sıfatlardır. Niteleme sıfatları isimlere sorulan “ Nasıl ?” sorusunun cevabıdır.\n" +
                    "Bu durumda sıfat isimden sonra gelmektedir.\n" +
                    "\n" +
                    "Bu durumda sıfat isimden sonra gelmektedir.\n" +
                    "\n" +
                    "El perro blanco : Beyaz Köpek\n" +
                    "\n" +
                    "Los perros blancos : Beyaz Köpekler\n" +
                    "\n" +
                    "El banco rojo : Kırmızı Banka\n" +
                    "\n" +
                    "Los bancos rojos : Kırmızı Bankalar\n" +
                    "\n" +
                    "Sıfatlar bağlı oldukları isimlere uyarlar. İspanyol dilinde sıfatların isimlere uyum sağlamasında 2 temel durum geçerlidir.\n" +
                    "\n" +
                    "a. Sıfat sadece ismin sayısına (tekilliğine ve çoğulluğuna) uyar veya\n" +
                    "\n" +
                    "b. Sıfat hem ismin cinsine (eril ve dişil) hem de sayısına (tekilliğine ve çoğulluğuna) uyar.\n" +
                    "\n" +
                    "Ispanyol dilinde “beyaz” sıfatının karşılığı “blanco” dur.\n" +
                    "Bu anlamda “Beyaz ev”örneğini inceleyelim\n" +
                    "Burada ilk bakmamız gereken ismin karakteridir. “La casa” dişil karakter taşımaktadır ve tekildir.\n" +
                    "\n" +
                    "“Blanco” sıfatı bu durumda kendini dişil cinse çevirecektir. “Blanca” olacaktır.\n" +
                    "“Beyaz ev” – “La casa blanca” olacaktır."),
            Grammar("Numeros","Sayılar",R.drawable.numbers,"0 Sıfır Cero Sero\n" +
                    "1 Bir uno uno\n" +
                    "2 Iki dos dos\n" +
                    "3 Üç tres tres\n" +
                    "4 Dört cuatro kuatro\n" +
                    "5 Beş cinco sinko\n" +
                    "6 Altı seis seis\n" +
                    "7 Yedi siete siete\n" +
                    "8 Sekiz ocho oço\n" +
                    "9 Dokuz nueve nuebe\n" +
                    "10 On diez dies"),
            Grammar("Tiempo presente","Geniş Zaman",R.drawable.present,"İspanyolcada bulunan tüm fiiller aşağıda gördüğünüz üç çekimle sona ererler.\n" +
                    "\n" +
                    "Bunlar \"- ar\", \" -er\", \"-ir\" ekleridir.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Türkçe'de satın almak istiyorum derken İspanyolca'da quiero comprar denir.\n" +
                    "Llegar ‘varmak’ anlamındadır. Öyleyse varmak istiyorum quiero llegar olur. \n" +
                    "\n" +
                    "Buradan da fark edeceğimiz üzere İspanyolca'da mastar halindeki fiiller r harfi ile sona erer. Bu sebeple ‘yer ayırtmak’ reservar fiilidir. Yer ayırtmak istiyorum quiero reservar olur.\n" +
                    " \n" +
                    "\n" +
                    "Siz biletleri alıyorsunuz İspanyolca'da Vd. compra los billetes olarak söylenir. Yarın varırsınız Vd. llega mañana.\n" +
                    "\n" +
                    "comprar  satın almak \n" +
                    "\n" +
                    "llegar varmak\n" +
                    "\n" +
                    "Vd. compra Siz satın alıyorsunuz.\n" +
                    "\n" +
                    "Vd. llega Siz varıyorsunuz\n" +
                    "\n" +
                    "Vd. reserva Siz yer ayırtıyorsunuz\n" +
                    "\n" +
                    "Vd. compra mucho Siz çok şey satın alıyorsunuz"),
            Grammar("Tiempo Irregular","Kuralsız Geniş Zaman",R.drawable.prnorules,"İspanyol diline yeni başlıyorsanız, kuracağınız cümleler geniş zaman ağırlıklı olacaktır. İspanyolca geniş zamanda ser estar fiilerini kullanarak temel cümleleri rahatlıkla kullanabilirsiniz. İspanyolca geniş zamanda ser estar fiillerinin kullanım alanlarını ve çekimlerini öğrenerek Dele A1 de hızlıca ilerleyebilirsiniz.\n" +
                    "\n" +
                    "Kendinizi tanıtırken, bir kişiye genel sorular sorarken ya da kendinizle ilgili genel soruları cevaplarken bu zamanı kullanacaksınız.\n" +
                    "\n" +
                    "Geniş zaman kişi perspektifinde;\n" +
                    "\n" +
                    "• Kişinin genel özelliklerinin ifade edilmesinde kullanılır.\n" +
                    "\n" +
                    "• Kişinin şu anda ya da sürekli yaptığı işlerin/eylemlerin ifade edilmesinde kullanılır.\n" +
                    "\n" +
                    "Geniş zaman genel persfektifte;\n" +
                    "\n" +
                    "• Genel durumları ve eylemleri ifade etmede kullanılır.\n" +
                    "\n" +
                    "Geniş zamana kişi perspektifinden bakıldığında aşağıdaki örnekler verilebilir.\n" +
                    "\n" +
                    "“Meksikalıyım”,\n" +
                    "\n" +
                    "“Öğretmenim”,\n" +
                    "\n" +
                    "“21 yaşındayım” ,\n" +
                    "\n" +
                    "“Memurum”\n" +
                    "\n" +
                    "Geniş zamana genel persfektiften bakıldığında aşağıdaki örnekler verilebilir.\n" +
                    "\n" +
                    "• Dünya güneşin etrafında döner. • Su 100 derecede kaynar.\n" +
                    "\n" +
                    "• Bu bir kitaptır."),
            Grammar("Preposiciones","Edatlar (Ön Adlar)",R.drawable.preposition,"Eril Tanım Edatları\n" +
                    "Belirli bir eril isimden bahsederken “el” kullanılırken belirsiz herhangi bir eril isimden bahsedilirken “un” kullanılır.\n" +
                    "Perro: [ Köpek ] anlamına gelir ve eril bir isimdir.\n" +
                    "Bu isim, tanım edatı başa getirilmeden kullanılmaz. İsmin başına gelecek edat o ismin belirliliğine bağlıdır.\n" +
                    "Eğer herhangi bir köpekten bahsediyorsanız [ Un perro ]\n" +
                    "Eğer belirli bir köpekten bahsediyorsanız [ El perro ]\n" +
                    "\n" +
                    "Dişil Tanım Edatları\n" +
                    "Dişil tanım edatları tablosu aşağıda sunulmuştur. Belirli bir dişil isimden bahsederken “la” kullanılırken belirsiz herhangi bir dişil isimden bahsedilirken “una” kullanılır.\n" +
                    "La Chica : Kız\n" +
                    "La Universidad : Üniversite\n" +
                    "La Canción : Şarkı\n" +
                    "La Televisión : Televizyon\n" +
                    "La Lección: Ders\n" +
                    "\n"),
            Grammar("Tiempo Futuro","Gelecek Zaman",R.drawable.future,"İlginç haber; çekim eklerini kökün üzerine değil fiilin üzerine getireceksiniz.\n" +
                    "Nasıl ?\n" +
                    "“Vivir” (Yaşamak) fiilini ele alalım:\n" +
                    "Köke ulaşma derdi bitiyor. Ekleri doğrudan fiilin üzerine getiriyoruz. TEKRAR EDİYORUM FİİLİN ÜZERİNE !\n" +
                    "\n" +
                    "Unutulmaması gereken nokta kurallı fiilin hangi ekle bittiği önem taşımamaktadır. Hadi biraz örnek yapalım!\n" +
                    "” Amar ” (Sevmek) fiilini gelecek zamanda çekelim. Fiilin doğrudan kendisini alıp, eklerimizi yerleştiriyoruz.\n" +
                    "Amar-Amaré-Amarás-Amará-Amaremos-Amaréis-Amarán\n" +
                    "\n"),
            Grammar("Hacer preguntas","Soru Sormak",R.drawable.question,"“Qué ? ” [ Ne ? ] edatı\n" +
                    "\n" +
                    "Bu zamir kişiden kişiye değişmez\n" +
                    "\n" +
                    "¿Qué lee ? : Ne okur ?\n" +
                    "\n" +
                    "¿Qué haces ? : Ne yaparsın?\n" +
                    "\n" +
                    "“¿Quién ? / ¿Quiénes ? ” : [ Kim ? / Kimler ? ] edatı :\n" +
                    "\n" +
                    "Bu zamir tekil ve çoğul kişiye göre biçim değiştirir. Tekil kişilerde “¿Quién?”, çoğul kişilerde “¿Quiénes?” kullanılır.\n" +
                    "\n" +
                    "¿Quién viene ? : Kim gelecek ?\n" +
                    "\n" +
                    "¿Quiénes vienen ? : Kimler gelecekler ?\n" +
                    "\n" +
                    "“¿Quién ? / ¿Quiénes ? ” : [ Kim ? / Kimler ? ] edatı :\n" +
                    "\n" +
                    "Bu zamir tekil ve çoğul kişiye(nesneye) göre biçim değiştirir.\n" +
                    "\n" +
                    "Tekil kişilerde “¿Cuál?”, çoğul kişilerde “¿Cuáles?” kullanılır.\n" +
                    "\n" +
                    "¿Cuál es tu hermano ? : Hangisi senin kardeşin ?\n" +
                    "\n" +
                    "¿Cuáles son tus hermanos ? : Hangileri senin kardeşlerin ?"),
            Grammar("Sobres","Zarflar",R.drawable.adverb,"spanyolca zarflar ispanyol dilinin temel taşlarındandır. Zira bu zarflar olmadan soru soramazsanız. 2 dakikanınızı ayırın ve ispanyolca zarfları öğrenin.\n" +
                    "Cómo ? : Nasıl\n" +
                    "¿Cómo te sientes ? : Nasıl hissedersin ?\n" +
                    "Me siento bien: İyi hissederim.\n" +
                    "Me siento mal: Kötü hissederim.\n" +
                    "¿Cómo canta Juan ? : Juan nasıl şarkı söyler ?\n" +
                    "Juan canta bien: Juan, iyi şarkı söyler.\n" +
                    "Juan canta mal: Juan, kötü şarkı söyler.\n" +
                    "Cuándo? : Ne Zaman\n" +
                    "¿ Cuándo llegas ? : Ne zaman varırsın ?\n" +
                    "Llego hoy.: Bugün varırım.\n" +
                    "Llego antes. : Önceden varırım\n" +
                    "Llego despues. : Sonradan varırım\n" +
                    "Llego temprano. : Erken varırım.\n" +
                    "Dónde ? : Nerede\n" +
                    "¿ Dónde vives ? : Nerede yaşarsın ?\n" +
                    "Vivo aqui.: Burada yaşarım.\n" +
                    "Cuánto ? : Ne kadar\n" +
                    "¿ Cuánto bebes ? : Ne kadar içersin ?\n" +
                    "Bebo mucho. : Çok içerim\n" +
                    "Bebo poco. : Az içerim\n" +
                    "Bebo bastante. : Yeterince içerim\n" +
                    "Bebo demasiado. : Çok fazla içerim.\n" +
                    "¿Cuántos idiomas se hablan en el mundo? : Dünyada kaç dil konuşulur ?\n" +
                    "¿Cuántos árboles hay en nuestro planeta? : Gezegenimizde kaç ağaç var ?\n" +
                    "\n"),
            Grammar("Tiempo Presente","Şimdiki Zaman",R.drawable.now,"“Estar” fiilinin geniş zamandaki çekimlerini, bir ulaç ile kullandığımızda dilimizde şimdiki zamana karşılık gelen “-yor” ekini fiile eklemiş oluruz. Şu anda yaptığınız bir eylemden bahsederken bu yapıyı kullanabilirsiniz.İspanyolca şimdiki zaman kurulumu gerçekten çok basittir.\n" +
                    "“Beber” fiilini bu yapı içerisinde görelim.\n" +
                    "Estoy bebiendo. : İçiyorum.\n" +
                    "Estás bebiendo. : İçiyorsun.\n" +
                    "“Vivir” fiilini bu yapı içerisinde görelim.\n" +
                    "Estoy viviendo. : Yaşıyorum.\n" +
                    "Estás viviendo. : Yaşıyorsun.\n" +
                    "“Pensar”fiilini bu yapı içerisinde görelim.\n" +
                    "Estoy pensando. : Düşünüyorum.\n" +
                    "“Aprender” fiilini bu yapı içerisinde görelim.\n" +
                    "Estoy aprendiendo turco. :Türkçe öğreniyorum.\n" +
                    "Filiz estâ aprendiendo espanol en Madrid :Filiz, Madrid’de İspanyolca öğreniyor.\n" +
                    "\n"),

        )


        val adapter = GrammarAdapter(dilbilgileri)
        lvGrammar.adapter = adapter

        lvGrammar.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this,TiklananSatirActivity::class.java)
            intent.putExtra("grammarAnahtar",dilbilgileri)
            intent.putExtra("position", position)
            startActivity(intent)
        }





        bottomNavigationView.menu.getItem(1).isChecked =true

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.bnvKelimeActivity -> {
                    val wordIntent = Intent(this, KelimeActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(wordIntent)
                    return@OnNavigationItemSelectedListener true

                }

                R.id.bnvGrammarActivity -> {
                    val grammarIntent = Intent(this, GrammarActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                    startActivity(grammarIntent)
                    return@OnNavigationItemSelectedListener true

                }
            }
            return@OnNavigationItemSelectedListener false
        })
    }
}