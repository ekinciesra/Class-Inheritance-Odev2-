# Class-Inheritance-Odev2-
### User, Instructor ve Student Classları Hakkında
KodlamaIo sayfasını kullanan genel bir kullanıcıya ait olabileceği öngörülen ufak çaplı bir "User" sınıfı oluşturuldu.
Kullanıcıların her birinin ortak olarak barındıracakları özellikler bu ana sınıfta tanımlandı.
Ardından bu kullanıcıların kendine has özellikleri, kod üzerinde ilerleyen zamanlarda yapılacak ekleme ve çıkarmalarda karışıklık yaratmaması adına, ayrı sınıflar oluşturularak tanımlandı.
"StudentUser" ve "InstructorUser" olarak oluşturulan bu sınıflar, kendilerine ait ortak özellikleri de kullanabilmeleri için ana sınıf olarak oluşturulan "User" sınıfından extends edildi.

### UserManager, InstructorManager ve StudentManager Classları Hakkında
KodlamaIo sayfasını kullanan genel bir kullanıcının yapabileceği öngörülen metod işlemlerini içeren ufak çaplı bir "UserManager" sınıfı oluşturuldu.
Kullanıcıların her birinin ortak olarak gerçekleştirebilecekleri eylemler bu ana sınıfta tanımlandı.
Ardından bu kullanıcıların sadece kendilerinin gerçekleştirebildikleri eylemler, kod üzerinde ilerleyen zamanlarda yapılacak ekleme ve çıkarmalarda karışıklık yaratmaması adına, ayrı sınıflar oluşturularak tanımlandı.
"StudentManager" ve "InstructorManager" olarak oluşturulan bu sınıflar, sadece kendilerinin yapabildikleri eylemleri de kullanabilmeleri için ana sınıf olarak oluşturulan "UserManager" sınıfından extends edildi.


