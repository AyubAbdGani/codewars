<?php

function statAssoc($strg) {
    if ($strg === "")  return "";

    $split = explode("," , $strg);
    $arrt = [];

    foreach ($split as $v) {
        $time = explode("|", $v);
        
        $jam = ((int) $time[0]) * 3600;
        $menit = ((int) $time[1]) * 60;
        $detik = (int) $time[2] ;

        $arrt[] = $jam + $menit + $detik;
    }

    sort($arrt);

    $sizeAr = sizeof($arrt);

    $range = max($arrt) - min($arrt);
    $mean = array_sum($arrt)/ $sizeAr;
    $median = $sizeAr % 2 === 0 ? (int)(($arrt[$sizeAr / 2 - 1] + $arrt[$sizeAr / 2]) / 2) : (int)($arrt[($sizeAr - 1) / 2]);

    $jrange = sprintf("%02d|%02d|%02d", floor($range / 3600), floor(($range % 3600)/ 60), floor($range % 60));
    $jmean = sprintf("%02d|%02d|%02d", floor($mean / 3600), floor(($mean % 3600)/ 60), floor($mean % 60));
    $jmedian = sprintf("%02d|%02d|%02d", floor($median / 3600), floor(($median % 3600)/ 60), floor($median % 60));

    return sprintf("Range: %s Average: %s Median: %s", $jrange, $jmean, $jmedian);
}


echo statAssoc("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17") . PHP_EOL;

