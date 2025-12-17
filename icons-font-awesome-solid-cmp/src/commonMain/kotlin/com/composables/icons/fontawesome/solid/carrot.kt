package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Carrot: ImageVector
    get() {
        if (_Carrot != null) return _Carrot!!
        
        _Carrot = ImageVector.Builder(
            name = "carrot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298.2f, 156.6f)
                curveToRelative(-52.7f, -25.7f, -114.5f, -10.5f, -150.2f, 32.8f)
                lineToRelative(55.2f, 55.2f)
                curveToRelative(6.3f, 6.3f, 6.3f, 16.4f, 0f, 22.6f)
                curveToRelative(-3.1f, 3.1f, -7.2f, 4.7f, -11.3f, 4.7f)
                reflectiveCurveToRelative(-8.2f, -1.6f, -11.3f, -4.7f)
                lineTo(130.4f, 217f)
                lineTo(2.3f, 479.7f)
                curveToRelative(-2.9f, 6f, -3.1f, 13.3f, 0f, 19.7f)
                curveToRelative(5.4f, 11.1f, 18.9f, 15.7f, 30f, 10.3f)
                lineToRelative(133.6f, -65.2f)
                lineToRelative(-49.2f, -49.2f)
                curveToRelative(-6.3f, -6.2f, -6.3f, -16.4f, 0f, -22.6f)
                curveToRelative(6.3f, -6.2f, 16.4f, -6.2f, 22.6f, 0f)
                lineToRelative(57f, 57f)
                lineToRelative(102f, -49.8f)
                curveToRelative(24f, -11.7f, 44.5f, -31.3f, 57.1f, -57.1f)
                curveToRelative(30.1f, -61.7f, 4.5f, -136.1f, -57.2f, -166.2f)
                close()
                moveToRelative(92.1f, -34.9f)
                curveTo(409.8f, 81f, 399.7f, 32.9f, 360f, 0f)
                curveToRelative(-50.3f, 41.7f, -52.5f, 107.5f, -7.9f, 151.9f)
                lineToRelative(8f, 8f)
                curveToRelative(44.4f, 44.6f, 110.3f, 42.4f, 151.9f, -7.9f)
                curveToRelative(-32.9f, -39.7f, -81f, -49.8f, -121.7f, -30.3f)
                close()
            }
        }.build()
        
        return _Carrot!!
    }

private var _Carrot: ImageVector? = null

