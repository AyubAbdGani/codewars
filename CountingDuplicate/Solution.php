<?php
#Link : https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

function duplicateCount($text) {
    $cArr = array_fill(0,256,0);
    $text = strtolower($text);

    $counter = 0;

    for($i = 0; $i < strlen($text); $i++){
        $cArr[ord($text[$i])]++;
    }

    foreach($cArr as $v){
        if ($v > 1){
            $counter++;
        }
    }

    return $counter;
}

echo duplicateCount("aabBcd131");