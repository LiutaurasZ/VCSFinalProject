### Baigiamasis darbas
### Automation tests for https://www.pegasas.lt/
<br>

#### TESTS:
__1. Logging in to account using valid email and valid password:__
   * open log in page;
   * enter valid email address into `El. paštas` field;
   * enter valid password into `Slaptažodis` field;
   * click  `Prisijungti` button;
   * check if `Mano paskyra` button appears instead of `Prisijungti` in the right top corner.

**2. Add a book to the shopping cart:**
   * open `Knygos` page;
   * click the first book in the list;
   * enter the number of books;
   * click `Įdėti į krepšelį` button;
   * check if the number next to the cart is equal to the number of books entered.

**3. Filter books by price:** 
   * open `Knygos` page;
   * enter price into the field `Nuo:`
   * enter price into the field `Iki:`
   * click `Kaina nuo mažiausios` from drop down list `Prekių rikiavimas` to sort books by price in ascending order;
   * check if the price in the field `Nuo:` is lower than or equal to the price of the first book on the list;
   * click `Kaina nuo didžiausios` from drop down list `Prekių rikiavimas` to sort books by price in descending order;
   * check if the price in the field `Iki:` is higher than or equal to the price of the first book on the list;

**4. Search for books in Search bar:**
   * open `Home` page;
   * enter keyword into the search bar;
   * click `Search` button;
   * click a book if there is at least one in the list;
   * check for the keyword in the book title and description.

__5. Update account information:__
   * login to account;
   * click `Mano paskyra` button;
   * click `Paskyros informacija` from the list;
   * click `Redaguot` button on `Paskyros informacija` card;
   * enter a new name in the field `Vardas`
   * enter a new last name  in the field `Pavardė`
   * enter a new phone number in the field `Mobilaus telefono numeris`
   * click `Išsaugoti` button;
   * Check if popup message `Duomenys sėkmingai atnaujinti` appears.
