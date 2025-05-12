INSERT INTO PUBLIC.CATEGORY VALUES (1, 'Masculino'), (2, 'Feminino'), (3, 'Camiseta'), (4, 'Jaqueta'), (5, 'Acessórios');
INSERT INTO PUBLIC.PRODUCTS (ID, DESCRIPTION, IMAGE, NAME, PRICE) VALUES (1,'Camiseta de Algodão Prima Azul Marinho', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw214f7083/TH6709_166_24.jpg?imwidth=450&impolicy=pctp', 'Camiseta de Algodão Prima', 399.0), (2, 'Camiseta de Algodão Prima Preta', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw14e81695/TH6709_031_24.jpg?imwidth=450&impolicy=pctp', 'Camiseta de Algodão Prima', 399.0), (3, 'Jaqueta Varsity de Lã com Emblema em Contraste ', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw7aa3e268/BH2898_031_24.jpg?imwidth=450&impolicy=pctp', 'Jaqueta Varsity de Lã com Emblema em Contraste ', 1829.0), (4, 'Jaqueta Esportiva Monograma Cropped ', 'https://imagesa1.lacoste.com/dw/image/v2/BCWL_PRD/on/demandware.static/-/Sites-master/default/dw0a837af4/BH4001_031_24.jpg?imwidth=450&impolicy=pctp', 'Jaqueta Esportiva Monograma Cropped', 1039.0);
INSERT INTO PUBLIC.PRODUCTS_CATEGORIES (PRODUCT_ID, CATEGORIES_ID) VALUES (1, 3), (2, 3), (3, 4), (4, 4), (1, 1), (2, 1), (3, 1), (4, 1);

UPDATE PUBLIC.PRODUCTS SET COLOR = 'BLUE' WHERE ID = 1;
UPDATE PUBLIC.PRODUCTS SET COLOR = 'BLACK' WHERE ID = 2;
UPDATE PUBLIC.PRODUCTS SET COLOR = 'BLACK' WHERE ID = 3;
UPDATE PUBLIC.PRODUCTS SET COLOR = 'BLACK' WHERE ID = 4;

UPDATE PUBLIC.PRODUCTS SET SIZE = 'P' WHERE ID = 1;
UPDATE PUBLIC.PRODUCTS SET SIZE = 'M' WHERE ID = 2;
UPDATE PUBLIC.PRODUCTS SET SIZE = 'M' WHERE ID = 3;
UPDATE PUBLIC.PRODUCTS SET SIZE = 'G' WHERE ID = 4;

UPDATE PUBLIC.PRODUCTS SET RATING = 3 WHERE ID = 1;
UPDATE PUBLIC.PRODUCTS SET RATING = 4 WHERE ID = 2;
UPDATE PUBLIC.PRODUCTS SET RATING = 4.5 WHERE ID = 3;
UPDATE PUBLIC.PRODUCTS SET RATING = 5 WHERE ID = 4;