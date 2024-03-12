<?php 
# Link : https://www.codewars.com/kata/586538146b56991861000293
$NATO = array(
    'A' => 'Alpha',
    'B' => 'Bravo',
    'C' => 'Charlie',
    'D' => 'Delta',
    'E' => 'Echo',
    'F' => 'Foxtrot',
    'G' => 'Golf',
    'H' => 'Hotel',
    'I' => 'India',
    'J' => 'Juliet',
    'K' => 'Kilo',
    'L' => 'Lima',
    'M' => 'Mike',
    'N' => 'November',
    'O' => 'Oscar',
    'P' => 'Papa',
    'Q' => 'Quebec',
    'R' => 'Romeo',
    'S' => 'Sierra',
    'T' => 'Tango',
    'U' => 'Uniform',
    'V' => 'Victor',
    'W' => 'Whiskey',
    'X' => 'X-ray',
    'Y' => 'Yankee',
    'Z' => 'Zulu'
);


function to_nato($words) {
    global $NATO;
    
    $words = strtoupper($words);

    $arr = str_split($words);

    $result =[];

    foreach ($arr as $word) {
        if ($word === ' ') continue;
        $result[] = isset($NATO[$word]) ? $NATO[$word] : $word;
    }

    return implode (" ", $result);
}

echo to_nato("Hey");