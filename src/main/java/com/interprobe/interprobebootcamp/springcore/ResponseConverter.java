package com.interprobe.interprobebootcamp.springcore;

public interface ResponseConverter {

    void convert();

    // 2 tane implementasyonu var
    //bu implementasyonlardan birinin basina @Primary ekleyebilirsin
    // veya
    //interface di yapildigi yerde @Qualifier anotasyonu kullanabilirsin
    //@Qualifier @Primary e gore onceliklidir.
    // Bu ikisini de bulamazsa autowired byName yapilabilir(Orn: ResponseConverter responseConverterJson gibi)
}
