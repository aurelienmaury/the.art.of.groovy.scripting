<head>
  <meta name="layout" content="main"/>
  <title>Welcome to Xebia</title>
</head>

<body>
<div class="hero-unit ctxt">
  <h1>Hall of fame</h1>

  <p>Only the quickest ones shall pass</p>
</div>

<div class="row">
  <div class="span-one-third">
    <div class="ctxt"><h2>JMX</h2></div>
    <ol>
      <g:each in="${jmxWin}" var="winner">
        <li>${winner.name}</li>
      </g:each>
    </ol>
  </div>

  <div class="span-one-third ctxt">
    <h2>JSON</h2>
  </div>

  <div class="span-one-third ctxt">
    <h2>CSV</h2>
  </div>
</div>
</body>
</html>
