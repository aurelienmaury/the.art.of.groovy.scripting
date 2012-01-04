<!doctype html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title><g:layoutTitle default="Grails"/></title>

  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <g:layoutHead/>

  <r:require module="bootstrap"/>
  <r:require module="addon"/>

  <r:layoutResources/>
</head>

<body>
<div class="topbar">
  <div class="fill">
    <div class="container">
      <h3>
        <g:link class="brand" controller='home'>The.Art.Of.Groovy.Scripting</g:link>
      </h3>
    </div>
  </div>
</div>

<div class="container content">
  <g:layoutBody/>
</div>

<r:layoutResources/>

</body>
</html>