package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CandyCane: ImageVector
    get() {
        if (_CandyCane != null) return _CandyCane!!
        
        _CandyCane = ImageVector.Builder(
            name = "candy-cane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.5f, 92f)
                curveTo(469.6f, 33.1f, 411.8f, 0f, 352.4f, 0f)
                curveToRelative(-27.9f, 0f, -56.2f, 7.3f, -81.8f, 22.6f)
                lineTo(243.1f, 39f)
                curveToRelative(-15.2f, 9.1f, -20.1f, 28.7f, -11f, 43.9f)
                lineToRelative(32.8f, 54.9f)
                curveToRelative(6f, 10f, 16.6f, 15.6f, 27.5f, 15.6f)
                curveToRelative(5.6f, 0f, 11.2f, -1.5f, 16.4f, -4.5f)
                lineToRelative(27.5f, -16.4f)
                curveToRelative(5.1f, -3.1f, 10.8f, -4.5f, 16.4f, -4.5f)
                curveToRelative(10.9f, 0f, 21.5f, 5.6f, 27.5f, 15.6f)
                curveToRelative(9.1f, 15.1f, 4.1f, 34.8f, -11f, 43.9f)
                lineTo(15.6f, 397.6f)
                curveToRelative(-15.2f, 9.1f, -20.1f, 28.7f, -11f, 43.9f)
                lineToRelative(32.8f, 54.9f)
                curveToRelative(6f, 10f, 16.6f, 15.6f, 27.5f, 15.6f)
                curveToRelative(5.6f, 0f, 11.2f, -1.5f, 16.4f, -4.5f)
                lineTo(428.6f, 301f)
                curveToRelative(71.7f, -42.9f, 104.6f, -133.5f, 68.9f, -209f)
                close()
                moveToRelative(-177.7f, 13f)
                lineToRelative(-2.5f, 1.5f)
                lineTo(296.8f, 45f)
                curveToRelative(9.7f, -4.7f, 19.8f, -8.1f, 30.3f, -10.2f)
                lineToRelative(20.6f, 61.8f)
                curveToRelative(-9.8f, 0.8f, -19.4f, 3.3f, -27.9f, 8.4f)
                close()
                moveTo(145.9f, 431.8f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveToRelative(107.5f, -63.9f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveTo(364.3f, 302f)
                lineToRelative(-60.5f, -38.5f)
                lineToRelative(30.8f, -18.3f)
                lineToRelative(60.5f, 38.5f)
                lineToRelative(-30.8f, 18.3f)
                close()
                moveToRelative(20.4f, -197.3f)
                lineToRelative(46f, -46f)
                curveToRelative(8.4f, 6.5f, 16f, 14.1f, 22.6f, 22.6f)
                lineTo(407.6f, 127f)
                curveToRelative(-5.7f, -9.3f, -13.7f, -16.9f, -22.9f, -22.3f)
                close()
                moveToRelative(82.1f, 107.8f)
                lineToRelative(-59.5f, -19.8f)
                curveToRelative(3.2f, -5.3f, 5.8f, -10.9f, 7.4f, -17.1f)
                curveToRelative(1.1f, -4.5f, 1.7f, -9.1f, 1.8f, -13.6f)
                lineToRelative(60.4f, 20.1f)
                curveToRelative(-2.1f, 10.4f, -5.5f, 20.6f, -10.1f, 30.4f)
                close()
            }
        }.build()
        
        return _CandyCane!!
    }

private var _CandyCane: ImageVector? = null

