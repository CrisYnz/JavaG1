use generationg1;

select * from customers c;

select * 
from customers c 
where c.customerName like '%toy%';

select c.customerNumber  , c.customerName  
from customers c 
where c.customerName like '%toy%';

select c.customerNumber  , c.customerName  
from customers c ;

select c.customerNumber  , c.customerName , c.city  
from customers c 
where c.city = 'Madrid';

select * 
from customers c , orders o ;


select * 
from customers c , orders o 
order by c.customerNumber desc;

select * 
from customers c , orders o
where c.customerNumber = o.customerNumber 
order by c.customerNumber desc;

-- obtner todas las ordenes por cliente
select c.customerNumber , o.orderNumber, o.orderDate  
from customers c , orders o
where c.customerNumber = o.customerNumber
and c.customerNumber = 496
order by c.customerNumber desc;

select c.customerNumber , o.orderNumber, o.orderDate  
from customers c , orders o
where c.customerNumber =  496
order by c.customerNumber desc;

select p.productName , pl.productLine 
from products p , productlines pl
where p.productLine  = pl.productLine;


select p.productName , pl.productLine, pl.textDescription  
from products p , productlines pl
where p.productLine  = pl.productLine
and pl.productLine = 'Motorcycles';

SELECT p.productName, pl.productLine, p.quantityInStock
FROM products p, productlines pl  
WHERE p.productLine = pl.productLine
AND p.productLine = 'Motorcycles' 
ORDER BY p.quantityInStock DESC;

SELECT p.productName, p.quantityInStock, pl.productLine
FROM products p , productlines pl  
WHERE p.productName LIKE '%Ford%'
And p.productLine = pl.productLine
ORDER BY p.productLine ASC;



