package task;

public class Depo {
    /*
     * basit bir depo projesi
	 *
	 * Calisan bir fabrikada uygulanan bir sistem olan depo uygulamasidir.
	 *
	 * 1-) burada oncelikle urunun tanimlamasi  yapilir.  //pojoUrun

	  id
	  urunIsmi
	  uretici
	  miktar
	  birim
	  raf (6 adet fields mevcut)

	 *
	 * 2-) methodlar olusturacagiz.
	 * 		urunTanimlama 	==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist
	 *
	 * 		urunListele 	==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
	 *     ///  printf(%10)

	 * 		urunGirisi 		==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
	 *
	 * 		urunuRafaKoy 	==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
	 *
	 *		urunCikisi 		==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
	 *							urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.  ///exception
	 * 		===> yaptigimiz tum degisiklikler listede de gorunsun.
	 *
	 *
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	0 			cuval 		null
	 *
	 * 		urunGirisi		==> id:1000  urun girisi :5
	 * 		urunListele 	==>
	 *
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	5 			cuval 		null
	 *
	 * 		urunuRafaKoy 	==> id:1000 raf : raf1
	 * 		urunListele 	==>
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	5 			cuval 		raf1
	 *
	 * 		urunCikisi 		==> id 1000: urun cikis : 3 (kalan 2 cuval un)
	 * 		urunListele 	==>
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	2 			cuval 		raf1
	 *
	 *
     */
}
