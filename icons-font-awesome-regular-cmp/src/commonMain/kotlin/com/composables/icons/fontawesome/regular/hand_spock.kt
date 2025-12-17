package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.HandSpock: ImageVector
    get() {
        if (_HandSpock != null) return _HandSpock!!
        
        _HandSpock = ImageVector.Builder(
            name = "hand-spock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501.03052f, 116.17605f)
                curveToRelative(-19.39059f, -31.50779f, -51.24406f, -35.72849f, -66.31044f, -35.01756f)
                curveToRelative(-14.11325f, -50.81051f, -62.0038f, -54.08f, -70.73816f, -54.08f)
                arcToRelative(74.03091f, 74.03091f, 0f, false, false, -72.23816f, 58.916f)
                lineToRelative(-4.64648f, 22.66014f)
                lineToRelative(-13.68357f, -53.207f)
                curveToRelative(-9.09569f, -35.37107f, -46.412f, -64.05074f, -89.66f, -53.07223f)
                arcToRelative(73.89749f, 73.89749f, 0f, false, false, -55.121f, 78.94722f)
                arcToRelative(73.68273f, 73.68273f, 0f, false, false, -64.8495f, 94.42181f)
                lineToRelative(24.35933f, 82.19721f)
                curveToRelative(-38.24017f, -7.54492f, -62.79677f, 16.18358f, -68.11512f, 21.84764f)
                arcToRelative(73.6791f, 73.6791f, 0f, false, false, 3.19921f, 104.19329f)
                lineToRelative(91.36509f, 85.9765f)
                arcTo(154.164f, 154.164f, 0f, false, false, 220.62279f, 512f)
                horizontalLineToRelative(107.4549f)
                arcTo(127.30079f, 127.30079f, 0f, false, false, 452.3392f, 413.8614f)
                lineToRelative(57.623f, -241.96272f)
                arcTo(73.20274f, 73.20274f, 0f, false, false, 501.03052f, 116.17605f)
                close()
                moveToRelative(-37.7597f, 44.60544f)
                lineTo(405.6479f, 402.7481f)
                arcToRelative(79.46616f, 79.46616f, 0f, false, true, -77.57019f, 61.25972f)
                horizontalLineTo(220.62279f)
                arcToRelative(106.34052f, 106.34052f, 0f, false, true, -73.1366f, -28.998f)
                lineToRelative(-91.369f, -85.98041f)
                curveTo(31.34381f, 325.72668f, 66.61133f, 288.131f, 91.39644f, 311.5392f)
                lineToRelative(51.123f, 48.10739f)
                curveToRelative(5.42577f, 5.10937f, 13.48239f, 0.71679f, 13.48239f, -5.82617f)
                arcToRelative(246.79913f, 246.79913f, 0f, false, false, -10.17771f, -70.1523f)
                lineToRelative(-36.01362f, -121.539f)
                curveToRelative(-9.7324f, -32.88279f, 39.69916f, -47.27145f, 49.38664f, -14.625f)
                lineToRelative(31.3437f, 105.77923f)
                curveToRelative(5.59374f, 18.90428f, 33.78119f, 10.71288f, 28.9648f, -8.00781f)
                lineTo(177.06427f, 80.23662f)
                curveToRelative(-8.50389f, -33.1035f, 41.43157f, -45.64646f, 49.86515f, -12.83593f)
                lineToRelative(47.32609f, 184.035f)
                curveToRelative(4.42773f, 17.24218f, 29.16207f, 16.5039f, 32.71089f, -0.80468f)
                lineToRelative(31.791f, -154.9706f)
                curveToRelative(6.81054f, -33.1074f, 57.51748f, -24.10741f, 50.11906f, 11.96288f)
                lineTo(360.32764f, 246.78925f)
                curveToRelative(-3.72265f, 18.10936f, 23.66793f, 24.63084f, 28.05659f, 6.21679f)
                lineTo(413.185f, 148.85962f)
                curveTo(421.1498f, 115.512f, 471.14f, 127.79713f, 463.27084f, 160.7815f)
                close()
            }
        }.build()
        
        return _HandSpock!!
    }

private var _HandSpock: ImageVector? = null

