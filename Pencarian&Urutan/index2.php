<!DOCTYPE html>
<html>
<head>
    <title>POST</title>
</head>
<body>

    <form action="" method="post">
        masukkan angka : 
        <input type="text" name="angka" placeholder="contoh : 1,2,3,4,5,6">
        <br>
        <button type="submit" name="submit">TAMPILKAN</button>
    </form>
<br>

    <?php if ( isset($_POST['submit']) ) : ?>
        <h1><?php 

            $angka = $_POST['angka'];

            $hasil = explode(",", $angka);
            rsort($hasil);

            // mengurutkan secara desc
            
            foreach ($hasil as $data) {
                echo $data . " ";
            }
            echo "<- Angka secara descending";
            
            echo "<br>";

            $hasil = explode(",", $angka);
            sort($hasil);

            // mengurutkan secara asc
            
            foreach ($hasil as $data) {
                echo $data . " ";
            }
            echo "<- Angka secara ascending";

            echo "<br>";

            // mencari sisa bagi dari nilai asc
            
            foreach ($hasil as $data) {
                $sisa = $data % 2;
                echo $sisa . " ";
            }
            echo "<- Sisa Bagi asc";

            echo "<br>";

            // mencari bilangan prima
            
            foreach ($hasil as $data) {
                $counter = 0; 
                for($j=1;$j<=$data;$j++){ 
                  
                    if($data % $j==0){ 
                        
                        $counter++;
                    }
                }
                if($counter==2){
                 
                    echo $data . " ";
                }else{
                    echo " ";
                }
            }
            echo "<- Bilangan Prima";
            
        ?></h1>

    <?php endif; ?>
    
</body>
</html>