package disiiy.khaper.simantan

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.GridLabelRenderer
import disiiy.khaper.simantan.databinding.ActivityDashboardBinding
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.jjoe64.graphview.helper.StaticLabelsFormatter

class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var dashboardBinding: ActivityDashboardBinding
    private lateinit var lineGraphViewTv: GraphView
    private lateinit var lineGraphViewRadio: GraphView
    private lateinit var lineGraphViewIzinKelas: GraphView

    companion object {
        fun getLaunchService(from: Context) = Intent(from, DashboardActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)
        supportActionBar?.hide()

        lineGraphViewTv = dashboardBinding.gvTelevisi
        lineGraphViewRadio = dashboardBinding.gvRadio
        lineGraphViewIzinKelas = dashboardBinding.gvIzinKelas

        dashboardBinding.fbBack.setOnClickListener(this)

        //Data Televisi
        //Data Tv Analog
        val seriestv: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 30.0),
                DataPoint(1.0, 90.0),
                DataPoint(2.0, 40.0),
                DataPoint(3.0, 140.0),
                DataPoint(4.0, 290.0),
                DataPoint(5.0, 290.0),
                DataPoint(6.0, 340.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 400.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        lineGraphViewTv.addSeries(seriestv)

        //Data Tv Digital
        val seriestv2: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 50.0),
                DataPoint(1.0, 40.0),
                DataPoint(2.0, 300.0),
                DataPoint(3.0, 220.0),
                DataPoint(4.0, 500.0),
                DataPoint(5.0, 250.0),
                DataPoint(6.0, 400.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 500.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        //adding second scale
        lineGraphViewTv.secondScale.addSeries(seriestv2)
        lineGraphViewTv.secondScale.setMinY(0.0)
        lineGraphViewTv.secondScale.setMaxY(500.0)

        // styling series
        seriestv.title = "Tv Analog"
        seriestv.color = Color.DKGRAY

        // styling series 2
        seriestv2.title = "Tv Digital"
        seriestv2.color = Color.CYAN
        lineGraphViewTv.gridLabelRenderer.verticalLabelsSecondScaleColor = (Color.WHITE)

//        //label name
//        val staticLabelsFormatter = StaticLabelsFormatter(lineGraphViewTv)
//        staticLabelsFormatter.setHorizontalLabels(arrayOf("Jan", "", "Feb", "", "Mar", "", "Apr", "", "May", "", "Jun", "", "Jul", "", "Aug", "", "Sep", "", "Oct", "", "Nov", "", "Dec"))
//        lineGraphViewTv.gridLabelRenderer.labelFormatter = staticLabelsFormatter

        //graphview Televisi
        lineGraphViewTv.animate()
        lineGraphViewTv.gridLabelRenderer.gridStyle = GridLabelRenderer.GridStyle.NONE
        lineGraphViewTv.gridLabelRenderer.verticalLabelsColor = R.color.background_color
        lineGraphViewTv.gridLabelRenderer.horizontalLabelsColor = R.color.background_color

        lineGraphViewTv.viewport.isScrollable = true
        lineGraphViewTv.viewport.setMinimalViewport(0.0, 24.0, 0.0, 500.0)

        //Data Radio
        //Data Radio AM
        val seriesradio: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 30.0),
                DataPoint(1.0, 90.0),
                DataPoint(2.0, 40.0),
                DataPoint(3.0, 140.0),
                DataPoint(4.0, 290.0),
                DataPoint(5.0, 290.0),
                DataPoint(6.0, 340.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 400.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        lineGraphViewRadio.addSeries(seriesradio)

        //Data Radio FM
        val seriesradio2: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 50.0),
                DataPoint(1.0, 40.0),
                DataPoint(2.0, 300.0),
                DataPoint(3.0, 220.0),
                DataPoint(4.0, 500.0),
                DataPoint(5.0, 250.0),
                DataPoint(6.0, 400.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 500.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        //adding second scale
        lineGraphViewRadio.secondScale.addSeries(seriesradio2)
        lineGraphViewRadio.secondScale.setMinY(0.0)
        lineGraphViewRadio.secondScale.setMaxY(500.0)

        // styling series
        seriesradio.title = "Radio AM"
        seriesradio.color = Color.DKGRAY

        // styling series 2
        seriesradio2.title = "Radio FM"
        seriesradio2.color = Color.CYAN
        lineGraphViewRadio.gridLabelRenderer.verticalLabelsSecondScaleColor = (Color.WHITE)

//        //label name
//        val staticLabelsFormatterRadio = StaticLabelsFormatter(lineGraphViewRadio)
//        staticLabelsFormatterRadio.setHorizontalLabels(arrayOf("Jan", "", "Feb", "", "Mar", "", "Apr", "", "May", "", "Jun", "", "Jul", "", "Aug", "", "Sep", "", "Oct", "", "Nov", "", "Dec"))
//        lineGraphViewRadio.gridLabelRenderer.labelFormatter = staticLabelsFormatterRadio

        //graphview Radio
        lineGraphViewRadio.animate()
        lineGraphViewRadio.gridLabelRenderer.gridStyle = GridLabelRenderer.GridStyle.NONE
        lineGraphViewRadio.gridLabelRenderer.verticalLabelsColor = R.color.background_color
        lineGraphViewRadio.gridLabelRenderer.horizontalLabelsColor = R.color.background_color

        lineGraphViewRadio.viewport.isScrollable = true
        lineGraphViewRadio.viewport.setMinimalViewport(0.0, 24.0, 0.0, 500.0)

        //Data Izin Kelas
        //Data 5,8 Ghz
        val series58ghz: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 30.0),
                DataPoint(1.0, 90.0),
                DataPoint(2.0, 40.0),
                DataPoint(3.0, 140.0),
                DataPoint(4.0, 290.0),
                DataPoint(5.0, 290.0),
                DataPoint(6.0, 340.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 400.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        lineGraphViewIzinKelas.addSeries(series58ghz)

        //Data 2,4 Ghz
        val series24ghz: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 50.0),
                DataPoint(1.0, 40.0),
                DataPoint(2.0, 300.0),
                DataPoint(3.0, 220.0),
                DataPoint(4.0, 500.0),
                DataPoint(5.0, 250.0),
                DataPoint(6.0, 400.0),
                DataPoint(7.0, 230.0),
                DataPoint(8.0, 500.0),
                DataPoint(9.0, 0.0),
                DataPoint(10.0, 0.0),
                DataPoint(11.0, 0.0),
            )
        )

        //adding second scale
        lineGraphViewIzinKelas.secondScale.addSeries(series24ghz)
        lineGraphViewIzinKelas.secondScale.setMinY(0.0)
        lineGraphViewIzinKelas.secondScale.setMaxY(500.0)

        // styling series
        series58ghz.title = "5,8 Ghz"
        series58ghz.color = Color.DKGRAY

        // styling series 2
        series24ghz.title = "2,4 Ghz"
        series24ghz.color = Color.CYAN
        lineGraphViewIzinKelas.gridLabelRenderer.verticalLabelsSecondScaleColor = (Color.WHITE)

//        //label name
//        val staticLabelsFormatterIzinKelas = StaticLabelsFormatter(lineGraphViewIzinKelas)
//        staticLabelsFormatterIzinKelas.setHorizontalLabels(arrayOf("Jan", "", "Feb", "", "Mar", "", "Apr", "", "May", "", "Jun", "", "Jul", "", "Aug", "", "Sep", "", "Oct", "", "Nov", "", "Dec"))
//        lineGraphViewIzinKelas.gridLabelRenderer.labelFormatter = staticLabelsFormatterIzinKelas

        //graphview Radio
        lineGraphViewIzinKelas.animate()
        lineGraphViewIzinKelas.gridLabelRenderer.gridStyle = GridLabelRenderer.GridStyle.NONE
        lineGraphViewIzinKelas.gridLabelRenderer.verticalLabelsColor = R.color.background_color
        lineGraphViewIzinKelas.gridLabelRenderer.horizontalLabelsColor = R.color.background_color

        lineGraphViewIzinKelas.viewport.isScrollable = true
        lineGraphViewIzinKelas.viewport.setMinimalViewport(0.0, 24.0, 0.0, 500.0)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.fbBack -> startActivity(
                MainActivity.getLaunchService(this)
            )
        }
    }

}