USE jugos_ventas;

SELECT * FROM facturas;
SELECT * FROM items_facturas;
SELECT * FROM tabla_de_clientes;
SELECT * FROM tabla_de_productos;
SELECT * FROM tabla_de_vendedores;

-- COMANDO CASE
-- SE REALIZA UN TEST EN UNO O MAS CAMPOS Y DEPENDIENDO DE RESULTADO, OBTENDREMOS UN VALOR ESPECIFICO
-- CASE 
-- WHEN <condicion_1> THEN <value_1> 
-- WHEN <condicion_2> THEN <value_2> 
-- WHEN <condicion_N> THEN <value_N> 
-- ELSE <valor_ELSE>  
-- END