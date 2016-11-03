
package org.deeplearning4j.ui.views.html.training

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object TrainingModel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class TrainingModel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[org.deeplearning4j.ui.api.I18N,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i18n: org.deeplearning4j.ui.api.I18N):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8">
	<title>DL4J Training UI</title>
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->

	<link id="bootstrap-style" href="/assets/css/bootstrap.min.css" rel="stylesheet">
	<link href="/assets/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="/assets/css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="/assets/css/style-responsive.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<link rel="shortcut icon" href="/assets/img/favicon.ico">

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="/assets/css/ie.css" rel="stylesheet"/>
	<![endif]-->

	<!--[if IE 9]>
		<link id="ie9style" href="/assets/css/ie9.css" rel="stylesheet"/>
	<![endif]-->
</head>

<body>
		<!-- Start Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.html"><span>DL4J Training UI</span></a>
			</div>
		</div>
	</div>
	<!-- End Header -->

		<div class="container-fluid-full">
		<div class="row-fluid">

			<!-- Start Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li><a href="overview"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Overview</span></a></li>
						<li class="active"><a href="javascript:void(0);"><i class="icon-tasks"></i><span class="hidden-tablet"> Model</span></a></li>
						<li><a href="system"><i class="icon-dashboard"></i><span class="hidden-tablet"> System</span></a></li>
						<li><a href="help"><i class="icon-star"></i><span class="hidden-tablet"> User Guide</span></a></li>
						<li>
							<a class="dropmenu" href="javascript:void(0);"><i class="icon-folder-close-alt"></i><span class="hidden-tablet"> Language</span></a>
							<ul>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> English</span></a></li>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 日本語</span></a></li>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 中文</span></a></li>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> 한글</span></a></li>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> русский</span></a></li>
								<li><a class="submenu" href="javascript:void(0);"><i class="icon-file-alt"></i><span class="hidden-tablet"> український</span></a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<!-- End Main Menu -->

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>

			<style>
			/* Graph */
			#layers """),format.raw/*82.12*/("""{"""),format.raw/*82.13*/("""
			  """),format.raw/*83.6*/("""height: 100%;
			  width: 50%;
			  position: absolute;
			  left: 0;
			  top: 0;
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/("""
			"""),format.raw/*89.4*/("""</style>

			<!-- Start Content -->
			<div id="content" class="span10">

				<div class="row-fluid span6">
					<div id="layers"></div>
				</div>
				<!-- Start Layer Details -->
				<div class="row-fluid span6" id="0">

					<div class="box">
						<div class="box-header">
							<h2><b>Layer Information</b></h2>
						</div>
						<div class="box-content">
							<table class="table table-bordered table-striped table-condensed" id="layerInfo"></table>
						</div>
					</div>

					<div class="box">
						<div class="box-header">
							<h2><b>Mean Magnitude Update Ratios - Log10</b></h2>
						</div>
						<div class="box-content">
							<div id="meanmag"  class="center" style="height:300px;" ></div>
							<p id="hoverdata"><b>Log10 Ratio:</b> <span id="yMeanMagnitudes">0</span>, <b>Iteration:</b> <span id="xMeanMagnitudes">0</span></p>
						</div>
					</div>

					<div class="box">
						<div class="box-header">
							<h2><b>Activations</b></h2>
						</div>
						<div class="box-content">
							<div id="activations"  class="center" style="height:300px;" ></div>
							<p id="hoverdata"><b>Activation:</b> <span id="yActivations">0</span>, <b>Iteration:</b> <span id="xActivations">0</span></p>
						</div>
					</div>

					<div class="box">
						<div class="box-header">
							<h2><b>Learning Rates</b></h2>
						</div>
						<div class="box-content">
							<div id="learningrate"  class="center" style="height:300px;" ></div>
							<p id="hoverdata"><b>Learning Rate:</b> <span id="yLearningRate">0</span>, <b>Iteration:</b> <span id="xLearningRate">0</span></p>
						</div>
					</div>

					<div class="box">
						<div class="box-header">
							<h2><b>Parameters Histogram</b></h2>
						</div>
						<div class="box-content">
							<div id="parametershistogram" class="center" style="height:300px;"></div>
						</div>
					</div>

					<div class="box">
						<div class="box-header">
							<h2><b>Updates Histogram</b></h2>
						</div>
						<div class="box-content">
							<div id="updateshistogram" class="center" style="height:300px;"></div>
						</div>
					</div>

				</div>
				<!-- End Layer Details-->

		<!-- End Content -->
		</div><!-- End Container -->
	</div><!-- End Row Fluid-->

		<!-- Start JavaScript-->
		<script src="/assets/js/jquery-1.9.1.min.js"></script>
		<script src="/assets/js/jquery-migrate-1.0.0.min.js"></script>
		<script src="/assets/js/jquery-ui-1.10.0.custom.min.js"></script>
		<script src="/assets/js/jquery.ui.touch-punch.js"></script>
		<script src="/assets/js/modernizr.js"></script>
		<script src="/assets/js/bootstrap.min.js"></script>
		<script src="/assets/js/jquery.cookie.js"></script>
		<script src="/assets/js/fullcalendar.min.js"></script>
		<script src="/assets/js/jquery.dataTables.min.js"></script>
		<script src="/assets/js/excanvas.js"></script>
		<script src="/assets/js/jquery.flot.js"></script>
		<script src="/assets/js/jquery.flot.pie.js"></script>
		<script src="/assets/js/jquery.flot.stack.js"></script>
		<script src="/assets/js/jquery.flot.resize.min.js"></script>
		<script src="/assets/js/jquery.chosen.min.js"></script>
		<script src="/assets/js/jquery.uniform.min.js"></script>
		<script src="/assets/js/jquery.cleditor.min.js"></script>
		<script src="/assets/js/jquery.noty.js"></script>
		<script src="/assets/js/jquery.elfinder.min.js"></script>
		<script src="/assets/js/jquery.raty.min.js"></script>
		<script src="/assets/js/jquery.iphone.toggle.js"></script>
		<script src="/assets/js/jquery.uploadify-3.1.min.js"></script>
		<script src="/assets/js/jquery.gritter.min.js"></script>
		<script src="/assets/js/jquery.imagesloaded.js"></script>
		<script src="/assets/js/jquery.masonry.min.js"></script>
		<script src="/assets/js/jquery.knob.modified.js"></script>
		<script src="/assets/js/jquery.sparkline.min.js"></script>
		<script src="/assets/js/counter.js"></script>
		<script src="/assets/js/retina.js"></script>
		<script src="/assets/js/custom.js"></script>
		<script src="/assets/js/cytoscape.min.js"></script>
		<script src="/assets/js/dagre.min.js"></script>
		<script src="/assets/js/cytoscape-dagre.js"></script>
		"""),format.raw/*198.100*/("""
		"""),format.raw/*199.3*/("""<script src="/assets/js/train/model.js"></script>        <!-- Charts and tables are generated here! -->

        <script src="/assets/js/train/model-graph.js"></script> <!-- Layer graph generated here! -->

		<!-- Execute once on page load -->
		<script>
				$(document).ready(function()"""),format.raw/*205.33*/("""{"""),format.raw/*205.34*/("""
					"""),format.raw/*206.6*/("""renderModelGraph();
					renderModelPage();
					renderLayerTable();
				"""),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""");
		</script>

		<!-- Execute periodically (every 2 sec) -->
		<script>
				setInterval(function()"""),format.raw/*214.27*/("""{"""),format.raw/*214.28*/("""
					"""),format.raw/*215.6*/("""renderModelPage();
				"""),format.raw/*216.5*/("""}"""),format.raw/*216.6*/(""", 2000);
		</script>

		<!--<script type="text/javascript">-->
		<!--$(document).ready(function() """),format.raw/*220.36*/("""{"""),format.raw/*220.37*/("""-->
			<!--var option = '1';-->
			<!--var url = window.location.href;-->
			<!--option = url.match(/layer=(.*)/)[1];-->
			<!--showDiv(option);-->
		<!--"""),format.raw/*225.7*/("""}"""),format.raw/*225.8*/(""");-->
		<!--function showDiv(option) """),format.raw/*226.32*/("""{"""),format.raw/*226.33*/("""-->
			<!--$('#0').hide();-->
			<!--$('#' + option).show();-->
		<!--"""),format.raw/*229.7*/("""}"""),format.raw/*229.8*/("""-->
		<!--</script>-->
		<!-- End JavaScript-->
</body>
</html>
"""))
      }
    }
  }

  def render(i18n:org.deeplearning4j.ui.api.I18N): play.twirl.api.HtmlFormat.Appendable = apply(i18n)

  def f:((org.deeplearning4j.ui.api.I18N) => play.twirl.api.HtmlFormat.Appendable) = (i18n) => apply(i18n)

  def ref: this.type = this

}


}

/**/
object TrainingModel extends TrainingModel_Scope0.TrainingModel
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 16:15:16 AEDT 2016
                  SOURCE: C:/DL4J/Git/deeplearning4j/deeplearning4j-ui-parent/deeplearning4j-play/src/main/views/org/deeplearning4j/ui/views/training/TrainingModel.scala.html
                  HASH: 9658888a5ba015deb8696751b506208de78c33a2
                  MATRIX: 598->1|731->39|759->41|4568->3822|4597->3823|4631->3830|4749->3921|4777->3922|4809->3927|9104->8289|9136->8293|9458->8586|9488->8587|9523->8594|9627->8670|9656->8671|9789->8775|9819->8776|9854->8783|9906->8807|9935->8808|10066->8910|10096->8911|10283->9070|10312->9071|10379->9109|10409->9110|10510->9183|10539->9184
                  LINES: 20->1|25->1|26->2|106->82|106->82|107->83|112->88|112->88|113->89|222->198|223->199|229->205|229->205|230->206|233->209|233->209|238->214|238->214|239->215|240->216|240->216|244->220|244->220|249->225|249->225|250->226|250->226|253->229|253->229
                  -- GENERATED --
              */
          