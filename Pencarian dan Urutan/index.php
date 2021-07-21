<!DOCTYPE html>
<html>

<head>
    <title>Program pencarian dan urutan</title>
</head>

<body>

    <div class="container">
	
		<br>
		<center><h1>Program Pencarian & Urutan</h1></center>

        <center><form action="" method="post"></center>
            <br>
            <br>
            <center>Masukkan Input Angka</center>
			<br>
			<center>||</center>
			<center>||</center>
			<center>V</center>
			<br>
            <center><input type="text" name="Angka"></center>
            <br>
            <br>
            <center><button type="submit" name="submit">Output</button></center>
        </form>
    </div>

    <br>

    <?php if (isset($_POST['submit'])) : ?>

        <center><h3><?php

            $Angka = $_POST['Angka'];

            $hasil = str_split($Angka);
            rsort($hasil);

            // mengurutkan secara ascennnding

            foreach ($hasil as $data) {
                echo $data . " ";
            }
            echo " = Urutan dari Angka yang Terbesar";

            echo "<br>";
			echo "<br>";

            sort($hasil);
			
			
			
            // mengurutkan secara desccending

            foreach ($hasil as $data) {
                echo $data . " ";
            }
            echo " = Urutan dari Angka yang Terkecil";

            echo "<br>";
			echo "<br>";



            // mencari sisa bagi dari nilai asc
			
			
			foreach ($hasil as $data) {
                $counter = 0;
                for ($j = 1; $j <= $data; $j++) {

                    if ($data % $j == 0) {

                        $counter++;
                    }
                }
                if ($counter == 2) {

                    echo $data . " ";
                } else {
                    echo " ";
                }
            }
            echo " = Urutan dari Bilangan Prima";
			
			echo "<br>";
			echo "<br>";
			

            

            

            // mencari bilangan prima

            foreach ($hasil as $data) {
                $sisa = $data % 2;
                echo $sisa . " ";
            }
            echo " = Urutan dari Sisa Bagi ";

            ?></h3></center>

    <?php endif; ?>

</body>

</html>