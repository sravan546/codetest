<h1> Longest word in a sentence </h1>

To begin with this project uses Maven .<b>Please install maven </b>

<ol type="1">
<li><h3>To Running Tests</h3>
<ol type="a">
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test</pre></li>
  <li> You should see output as below <br></li>
              &nbsp; Results :Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
  </ol></li>
 <li>         
<h3>For your convinience i have also included Main class where you can provide your own input </h3>
 <ol type="a">
 
  <li> Go into project root directory .Which is "codetest" directory</li>
  <li> Execute below command  <pre>mvn test -Prun</pre></li>
  <li> Program will prompt you as below  <pre>Please enter the sentence:</pre></li>
  <li> Enter sentence you want to test </li>
  <li> You shoud see two output lines as below</li>
 </li>

  <li>
  
    <h3>Some assumptions i made</h3>
    <ol type="a">
      <li>When null or empty i assumed you output to be empty string and 0</li>
      <li>When sentences of other languages are passed it simple processed it as english letters </li>
      <li> When sentence has more than one word which is longest then it only returns first found words</li>
     </ol>
  </li>
</ol>
