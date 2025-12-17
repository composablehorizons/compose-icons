package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Skiing: ImageVector
    get() {
        if (_Skiing != null) return _Skiing!!
        
        _Skiing = ImageVector.Builder(
            name = "skiing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 96f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(458.5f, 0f, 432f, 0f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(73f, 356.1f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                curveToRelative(-12.1f, 12.1f, -30.5f, 15.4f, -45.1f, 8.7f)
                lineToRelative(-135.8f, -70.2f)
                lineToRelative(49.2f, -73.8f)
                curveToRelative(12.7f, -19f, 10.2f, -44.5f, -6f, -60.6f)
                lineTo(293f, 215.7f)
                lineToRelative(-107f, -53.1f)
                curveToRelative(-2.9f, 19.9f, 3.4f, 40f, 17.7f, 54.4f)
                lineToRelative(75.1f, 75.2f)
                lineToRelative(-45.9f, 68.8f)
                lineTo(35f, 258.7f)
                curveToRelative(-11.7f, -6f, -26.2f, -1.5f, -32.3f, 10.3f)
                curveToRelative(-6.1f, 11.8f, -1.5f, 26.3f, 10.3f, 32.3f)
                lineToRelative(391.9f, 202.5f)
                curveToRelative(11.9f, 5.5f, 24.5f, 8.1f, 37.1f, 8.1f)
                curveToRelative(23.2f, 0f, 46f, -9f, 63f, -26f)
                curveToRelative(9.3f, -9.3f, 9.3f, -24.5f, 0f, -33.8f)
                close()
                moveTo(120f, 91.6f)
                lineToRelative(-11.5f, 22.5f)
                curveToRelative(14.4f, 7.3f, 31.2f, 4.9f, 42.8f, -4.8f)
                lineToRelative(47.2f, 23.4f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                lineToRelative(114.5f, 56.8f)
                lineToRelative(32.4f, -13f)
                lineToRelative(6.4f, 19.1f)
                curveToRelative(4f, 12.1f, 12.6f, 22f, 24f, 27.7f)
                lineToRelative(58.1f, 29f)
                curveToRelative(15.9f, 7.9f, 35f, 1.5f, 42.9f, -14.3f)
                curveToRelative(7.9f, -15.8f, 1.5f, -35f, -14.3f, -42.9f)
                lineToRelative(-52.1f, -26.1f)
                lineToRelative(-17.1f, -51.2f)
                curveToRelative(-8.1f, -24.2f, -40.9f, -56.6f, -84.5f, -39.2f)
                lineToRelative(-81.2f, 32.5f)
                lineToRelative(-62.5f, -31f)
                curveToRelative(0.3f, -14.5f, -7.2f, -28.6f, -20.9f, -35.6f)
                lineToRelative(-11.1f, 21.7f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-34.4f, -7f)
                curveToRelative(-1.8f, -0.4f, -3.7f, 0.2f, -5f, 1.7f)
                curveToRelative(-1.9f, 2.2f, -1.7f, 5.5f, 0.5f, 7.4f)
                lineToRelative(26.2f, 23f)
                close()
            }
        }.build()
        
        return _Skiing!!
    }

private var _Skiing: ImageVector? = null

