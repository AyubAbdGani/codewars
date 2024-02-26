<?php
function square_sum($numbers) : int {
   return  array_reduce($numbers, fn($carry, $number) => $carry += $number * $number, 0);
}

var_dump(square_sum([1,2]));