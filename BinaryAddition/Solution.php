<?php
# Link : https://www.codewars.com/kata/551f37452ff852b7bd000139
function add_binary($a, $b) {
    $c = $a + $b;
    
    $result = "";
    while ($c > 0) {
        $temp = $c % 2;
        $result = $temp . $result;
        $c = floor($c / 2);
    }

    return $result === ''? "0" : $result;
}

echo add_binary(5, 3) . PHP_EOL;