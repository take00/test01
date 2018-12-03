<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8">
<title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
    
<?php

mb_internal_encoding("utf8");
$pdo = new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
$stmt = $pdo->query("select * from 4each_keijiban01");

    
?>
    
    
        <img src="4eachblog_logo.jpg" class="logo">
    <ul class="menu">
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>問い合わせ</li>
            <li>その他</li>
    </ul>
    
    <main>
        <div class="left">
            <div class="daimei">
            <b>プログラミングに役立つ掲示板</b>
            </div>
            
            <form method="post" action="insert.php">
        <div class="form-layout">
            <h4>入力フォーム</h4>
            
            <div>
            ハンドルネーム<br>
            <input type="text" class="handlename" name="handlename" size="30">
            </div>
                
            <div>
            タイトル<br>
            <input type="text" class="title" name="title" size="30">
            </div>
                
            <div>
            コメント<br>
            <textarea cols="60" rows="10" name="comments"></textarea>
            </div>
            
            <div>
            <input type="submit" class="submit" value="投稿する">
            </div>
            
            </div>

                
                <?php
                while($row = $stmt->fetch()){
        echo "<div class='form-layout2'>";
        echo "<h4>".$row['title']."</h4>";
        echo $row['comments']."<br>";
        echo "<div class='handlename-layout'>posted by ".$row['handlename']."</div>";
        echo "</div>";
                }
                ?>
                
            </form>
        </div>
            
        <div class="right">
        <h3>人気の記事</h3>
            <ul>
                <li>PHPオススメ本</li>
                <li>PHP myAdminの使い方</li>
                <li>いま人気のエディタTop5</li>
                <li>HTMLの基礎</li>
            </ul>
        <h3>オススメリンク</h3>
            <ul>
                <li>インターノウス株式会社</li>
                <li>XAMPPのダウンロード</li>
                <li>Eclipseのダウンロード</li>
                <li>Bracketsのダウンロード</li>
            </ul>
        <h3>カテゴリ</h3>
            <ul>
                <li>HTML</li>
                <li>PHP</li>
                <li>MySQL</li>
                <li>JavaScript</li>
            </ul>
        
        </div>
    </main>

<footer>
    Copyright internous | 4each blog is the one which provides A to Z about programming
</footer>

</body>
</html>