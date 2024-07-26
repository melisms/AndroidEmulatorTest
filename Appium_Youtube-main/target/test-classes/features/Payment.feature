Feature: Payment testleri
  Scenario: test1
    Given Online payment sitesine gidilir.
    And Kullanıcı emailini girer.
    And Aşağı kaydırılır
    And Kullanıcı ödeyeceği miktarı girdi.
    And Aşağı orta kaydırılır
    And Kullanıcı kart bilgilerini girer.
    And Aşağı az kaydırılır
    When Kullanıcı aydınlanma metnini onaylar.
    Then Kullanıcı ödeme yap butonuna tıklar.

