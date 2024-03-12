<?php
# Link : https://www.codewars.com/kata/546f922b54af40e1e90001da

function alphabet_position(string $s): string {
    $result = '';

    $splt = str_split($s,1);

    foreach ($splt as $v) {
        if (ctype_alpha($v)){
            $result = $result . ((string) (ctype_upper($v) ? ord($v) - (ord('A') - 1) : ord($v) - (ord('a') - 1)  )) . " ";
        }
    }

    return trim($result);
}

echo alphabet_position("The sunset sets at twelve o\' clock.");