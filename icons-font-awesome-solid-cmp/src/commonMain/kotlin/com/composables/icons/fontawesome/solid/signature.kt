package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Signature: ImageVector
    get() {
        if (_Signature != null) return _Signature!!
        
        _Signature = ImageVector.Builder(
            name = "signature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(623.2f, 192f)
                curveToRelative(-51.8f, 3.5f, -125.7f, 54.7f, -163.1f, 71.5f)
                curveToRelative(-29.1f, 13.1f, -54.2f, 24.4f, -76.1f, 24.4f)
                curveToRelative(-22.6f, 0f, -26f, -16.2f, -21.3f, -51.9f)
                curveToRelative(1.1f, -8f, 11.7f, -79.2f, -42.7f, -76.1f)
                curveToRelative(-25.1f, 1.5f, -64.3f, 24.8f, -169.5f, 126f)
                lineTo(192f, 182.2f)
                curveToRelative(30.4f, -75.9f, -53.2f, -151.5f, -129.7f, -102.8f)
                lineTo(7.4f, 116.3f)
                curveTo(0f, 121f, -2.2f, 130.9f, 2.5f, 138.4f)
                lineToRelative(17.2f, 27f)
                curveToRelative(4.7f, 7.5f, 14.6f, 9.7f, 22.1f, 4.9f)
                lineToRelative(58f, -38.9f)
                curveToRelative(18.4f, -11.7f, 40.7f, 7.2f, 32.7f, 27.1f)
                lineTo(34.3f, 404.1f)
                curveTo(27.5f, 421f, 37f, 448f, 64f, 448f)
                curveToRelative(8.3f, 0f, 16.5f, -3.2f, 22.6f, -9.4f)
                curveToRelative(42.2f, -42.2f, 154.7f, -150.7f, 211.2f, -195.8f)
                curveToRelative(-2.2f, 28.5f, -2.1f, 58.9f, 20.6f, 83.8f)
                curveToRelative(15.3f, 16.8f, 37.3f, 25.3f, 65.5f, 25.3f)
                curveToRelative(35.6f, 0f, 68f, -14.6f, 102.3f, -30f)
                curveToRelative(33f, -14.8f, 99f, -62.6f, 138.4f, -65.8f)
                curveToRelative(8.5f, -0.7f, 15.2f, -7.3f, 15.2f, -15.8f)
                verticalLineToRelative(-32.1f)
                curveToRelative(0.2f, -9.1f, -7.5f, -16.8f, -16.6f, -16.2f)
                close()
            }
        }.build()
        
        return _Signature!!
    }

private var _Signature: ImageVector? = null

