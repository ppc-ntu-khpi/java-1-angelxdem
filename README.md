# Звіт

## Практична робота «Створення класів»

### Завдання 1. Створення класу з атрибутами
 
 1. В завданні 1 я клонувала створений репозиторій в Netbeans. 
 2. Потім я створила в пакеті domain клас ````Сustomer```` з такими приватними атрибутами:
   - ````ID```` (номер клієнта, ціле число). В мене ````ID=1````
   - ````isNew```` (статус клієнта новий він чи старий, булевське значення). В мене - ````true````. 
   - ````total```` (сума замовлень за рік, дробове число). В мене ````total = 1000````. 
 3. Взяла до уваги, що атрибути повинні були мати значення за замовчуванням. 

### Завдання 2. Додавання в клас методів

В другому завданні я додала до класу метод ````displayCustomerInfo````, який виводить на консоль інформацію про клієнта з допомогою ````System.out.println````. Кожен рядок містить відповідну мітку. 

### Перевірка працездатності створеного класу
 1. Для перевірки я створила в пакеті test клас ````CustomerTest````, в методі ````main```` якого створити об'єкт класу ````Сustomer```` та вивести на екран його властивості з допомогою методу ````displayCustomerInfo````. 
 2. Далі я запустила його. 
 3. Після цього я зробила та зберегла у теку ````Solution```` файли ````done.png```` зі скріншотами результатів роботи програми. 
 
На завершення виконання лабораторної роботи я закомітила свій проект до репозиторію та здала завдання через *Google Classroom*, вказавши посилання на Ваш репозиторій.

Завдання виконала "**на п'ять**". Виконала перелічені завдання, змінила файл ````README.md```` з скріншотом програми та зберегла та змінила код класу наступним чином:
- додала конструктор за замовчуванням, який ініціалізує атрибути початковими значеннями. 
- додала методи для зміни атрибутів - ````setID````, ````setStatus````, ````setTotal```` з відповідними параметрами та перевіркою присвоюваних значень
- використала ці методи в методі ````main```` класу ````CustomerTest````
- зробила та зберегла у теку ````Solution```` файл ````advanced1.png````, ````advanced1(2 part)png````, ````advanced2.png```` скріншоти результатів роботи програми, та модифікувала файл ````README.md```` відповідним чином.
 
### Вихідні коди

#### Початковий варіант

Customer.java

````java
package domain;
public class Customer {
    public int id = 1;
    public boolean isNew = true;
    public float total = 1000;

  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isIsNew() {
        return isNew;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    
    
 public void displayCustomerInfo(){
    System.out.println("id: " + id);
    System.out.println("isNew: " + isNew);
    System.out.println("total: " + total);
 }}
````

CustomerTest.java

````java
package domain;

public class CustomerTest {
    public static void main(String args[]){
      Customer myCustomer = new Customer();
      myCustomer.displayCustomerInfo();
    }
}
````

#### Змінені коди:

Customer.java

```` java
package domain;
public class Customer {
    public int id = 1;
    public boolean isNew = true;
    public float total = 1000;

  public Customer(){
    this.id = 1;
    this.isNew = true;
    this.total = 1000;
}
  
    public int getId() {
        return id;
    }

    public boolean isIsNew() {
        return isNew;
    }
  
    public float getTotal() {
        return total;
    }

  public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
  
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
  
    public void setTotal(float total) {
        if (total > 0) {
            this.total = total;
        }
    }
    
    
 public void displayCustomerInfo(){
    System.out.println("id: " + id);
    System.out.println("isNew: " + isNew);
    System.out.println("total: " + total);
 }}
 ````
CustomerTest.java

````java
package domain;

public class CustomerTest {
    public static void main(String args[]){
      Customer myCustomer = new Customer();
      myCustomer.displayCustomerInfo();

      myCustomer.setId(3);
      myCustomer.setIsNew(false);
      myCustomer.setTotal(2000);

       myCustomer.displayCustomerInfo();
    }
}
````
