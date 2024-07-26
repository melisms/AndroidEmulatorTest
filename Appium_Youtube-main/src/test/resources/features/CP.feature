Feature: Cp testleri yapilir.

  Scenario: başarılı bir şekilde login yapılır.
    Given 3 sn beklenir.
    Given kullanıcı emailini girer.
    And kullanıcı şifresini girer.
    And Sign in butonu tıklanır.
    And 2 sn beklenir.
    And Aşağı kaydırılır
    And CP tıklanır.
    And 2 sn beklenir.
    And Protel'e tıklanır.
    And 2 sn beklenir.
    And 3700 tıklanır.
    And 2 sn beklenir.
    #And Bir daha gösterme tıklanır.
    #And 2 sn beklenir.
    And Artı butonu tıklanır.
    And 2 sn beklenir.
    And Rezervasyona tıklanır.
    And 5 sn beklenir.
    Then Müşteri isim yazma yerine tıklanır.
    And 3 sn beklenir.
    Then İsim yazılır.
    And 3 sn beklenir.
    Then Müşteriye tıklanır.
    And 3 sn beklenir.
    And Aşağı kaydırılır

    
