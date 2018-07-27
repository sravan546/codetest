<h1> Longest word in a sentence </h1>

This project uses Maven .<b>Please install maven </b>

<ol type="1">
<li><h3>To Running Tests</h3>
<ol type="a">
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test</pre></li>
  <li> You should see output as below <br></li>
  <pre>Results :Tests run: 12, Failures: 0, Errors: 0, Skipped: 0</pre>
  </ol></li>
 <li>         
<h3>For your convinience i have also included Main class which you run to provide your own input </h3>
 <ol type="a">
 
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test -Prun</pre></li>
  <li> Program will prompt you as below  <pre>Please enter the sentence:</pre></li>
  <li> Enter sentence you want to test </li>
  <li> You shoud see two output lines as below</li>
 </li>
 </ol>
<li>
 
  <h3>Some assumptions i made</h3>
  <ol type="a">
    <li>When null or empty i assumed  output to be null and empty string and length will be 0</li>
    <li>When input is other than english language it simply processes it as english letters </li>
    <li>When sentence has more than one word which that has longest then it only returns first found longest word</li>
    
   </ol>
</li>
</ol>
