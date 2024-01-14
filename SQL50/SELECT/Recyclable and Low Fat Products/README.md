## Problem

You are given a table named `Products`, where each row represents a product with the following columns:

- `product_id` (int): Primary key for the table, unique identifier for each product.
- `low_fats` (enum): Indicates whether the product is low fat or not. Values are 'Y' for low fat and 'N' for not low fat.
- `recyclable` (enum): Indicates whether the product is recyclable or not. Values are 'Y' for recyclable and 'N' for not recyclable.

Write a SQL query to find the `product_id` of products that are both low fat and recyclable.

Return the result table in any order.

### Example

**Input:**
| product_id | low_fats | recyclable |
|------------|----------|------------|
| 0          | Y        | N          |
| 1          | Y        | Y          |
| 2          | N        | Y          |
| 3          | Y        | Y          |
| 4          | N        | N          |



**Output:**
| product_id |
|------------|
| 1          
| 3          


**Explanation:**
Only products 1 and 3 are both low fat and recyclable.
