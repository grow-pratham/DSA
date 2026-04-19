# update-progress.ps1
# Run this script from the root of your DSA-Java repo before every git push.
# It counts .java files per topic/difficulty and updates the README.md tracker.

$readmePath = "README.md"

$topics = @(
    @{ Num = "01"; Name = "Arrays";               Folder = "01-Arrays" },
    @{ Num = "02"; Name = "Binary Search";         Folder = "02-BinarySearch" },
    @{ Num = "03"; Name = "Strings";               Folder = "03-Strings" },
    @{ Num = "04"; Name = "Linked List";           Folder = "04-LinkedList" },
    @{ Num = "05"; Name = "Recursion";             Folder = "05-Recursion" },
    @{ Num = "06"; Name = "Binary Trees";          Folder = "06-BinaryTrees" },
    @{ Num = "07"; Name = "BST";                   Folder = "07-BST" },
    @{ Num = "08"; Name = "Graphs";                Folder = "08-Graphs" },
    @{ Num = "09"; Name = "Dynamic Programming";   Folder = "09-DynamicProgramming" },
    @{ Num = "10"; Name = "Stacks & Queues";       Folder = "10-Stacks-Queues" },
    @{ Num = "11"; Name = "Heaps";                 Folder = "11-Heaps" },
    @{ Num = "12"; Name = "Tries";                 Folder = "12-Tries" }
)

$totalEasy   = 0
$totalMedium = 0
$totalHard   = 0

$tableLines = @()
$tableLines += "| # | Topic | Easy | Medium | Hard | Total |"
$tableLines += "|---|-------|------|--------|------|-------|"

foreach ($topic in $topics) {
    $easyPath   = Join-Path $topic.Folder "Easy"
    $mediumPath = Join-Path $topic.Folder "Medium"
    $hardPath   = Join-Path $topic.Folder "Hard"

    $easy   = if (Test-Path $easyPath)   { (Get-ChildItem "$easyPath\*.java"   -ErrorAction SilentlyContinue).Count } else { 0 }
    $medium = if (Test-Path $mediumPath) { (Get-ChildItem "$mediumPath\*.java" -ErrorAction SilentlyContinue).Count } else { 0 }
    $hard   = if (Test-Path $hardPath)   { (Get-ChildItem "$hardPath\*.java"   -ErrorAction SilentlyContinue).Count } else { 0 }
    $total  = $easy + $medium + $hard

    $totalEasy   += $easy
    $totalMedium += $medium
    $totalHard   += $hard

    $tableLines += "| $($topic.Num) | $($topic.Name) | $easy | $medium | $hard | $total |"
}

$grandTotal = $totalEasy + $totalMedium + $totalHard
$tableLines += "| | **Total** | **$totalEasy** | **$totalMedium** | **$totalHard** | **$grandTotal** |"

$newTable = $tableLines -join "`n"

$readme = Get-Content $readmePath -Raw

# Replace everything between the table header and the next --- separator
$pattern = '(?s)(\| # \| Topic \|.*?\n\| \| \*\*Total\*\*.*?\|)'
$readme = [regex]::Replace($readme, $pattern, $newTable)

Set-Content $readmePath $readme -NoNewline

Write-Host ""
Write-Host "Progress updated!" -ForegroundColor Green
Write-Host "  Easy   : $totalEasy" -ForegroundColor Cyan
Write-Host "  Medium : $totalMedium" -ForegroundColor Yellow
Write-Host "  Hard   : $totalHard" -ForegroundColor Red
Write-Host "  Total  : $grandTotal" -ForegroundColor White
Write-Host ""
