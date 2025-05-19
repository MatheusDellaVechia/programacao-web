INSERT INTO PUBLIC.CATEGORY (ID, NAME) VALUES
(nextval('category_id_seq'), 'Masculino'),
(nextval('category_id_seq'), 'Feminino'),
(nextval('category_id_seq'), 'Camiseta'),
(nextval('category_id_seq'), 'Jaqueta'),
(nextval('category_id_seq'), 'Acessórios');

INSERT INTO PUBLIC.PRODUCTS (ID, DESCRIPTION, IMAGE, NAME, PRICE, COLOR, SIZE, RATING) VALUES
(nextval('products_id_seq'), 'Camiseta de Algodão Prima Azul Marinho', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw214f7083/TH6709_166_24.jpg?imwidth=450&impolicy=pctp', 'Camiseta de Algodão Prima', 399.0, 'BLUE', 'P', 3),
(nextval('products_id_seq'), 'Camiseta de Algodão Prima Preta', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw14e81695/TH6709_031_24.jpg?imwidth=450&impolicy=pctp', 'Camiseta de Algodão Prima', 399.0, 'BLACK', 'M', 4),
(nextval('products_id_seq'), 'Jaqueta Varsity de Lã com Emblema em Contraste', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw7aa3e268/BH2898_031_24.jpg?imwidth=450&impolicy=pctp', 'Jaqueta Varsity de Lã', 1829.0, 'BLACK', 'M', 4.5),
(nextval('products_id_seq'), 'Jaqueta Esportiva Monograma Cropped', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw0a837af4/BH4001_031_24.jpg?imwidth=450&impolicy=pctp', 'Jaqueta Esportiva Monograma', 1039.0, 'BLACK', 'G', 5);

INSERT INTO PUBLIC.PRODUCTS_CATEGORIES (PRODUCT_ID, CATEGORIES_ID) VALUES
(1, 3), (2, 3), (3, 4), (4, 4),
(1, 1), (2, 1), (3, 1), (4, 1);
