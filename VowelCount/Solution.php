<?php
function getCount($str) {
    $vowelsCount = 0;
    $exp = str_split($str, 1);
    
    foreach ($exp as $c){
        if (strpos("aiueo", $c) !== false) {
            $vowelsCount++;
        }
    }
    
    return $vowelsCount;
}

echo getCount('abracadabra') . PHP_EOL;