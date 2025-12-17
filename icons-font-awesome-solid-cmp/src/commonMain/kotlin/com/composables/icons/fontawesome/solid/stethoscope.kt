package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) return _Stethoscope!!
        
        _Stethoscope = ImageVector.Builder(
            name = "stethoscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(447.1f, 112f)
                curveToRelative(-34.2f, 0.5f, -62.3f, 28.4f, -63f, 62.6f)
                curveToRelative(-0.5f, 24.3f, 12.5f, 45.6f, 32f, 56.8f)
                verticalLineTo(344f)
                curveToRelative(0f, 57.3f, -50.2f, 104f, -112f, 104f)
                curveToRelative(-60f, 0f, -109.2f, -44.1f, -111.9f, -99.2f)
                curveTo(265f, 333.8f, 320f, 269.2f, 320f, 192f)
                verticalLineTo(36.6f)
                curveToRelative(0f, -11.4f, -8.1f, -21.3f, -19.3f, -23.5f)
                lineTo(237.8f, 0.5f)
                curveToRelative(-13f, -2.6f, -25.6f, 5.8f, -28.2f, 18.8f)
                lineTo(206.4f, 35f)
                curveToRelative(-2.6f, 13f, 5.8f, 25.6f, 18.8f, 28.2f)
                lineToRelative(30.7f, 6.1f)
                verticalLineToRelative(121.4f)
                curveToRelative(0f, 52.9f, -42.2f, 96.7f, -95.1f, 97.2f)
                curveToRelative(-53.4f, 0.5f, -96.9f, -42.7f, -96.9f, -96f)
                verticalLineTo(69.4f)
                lineToRelative(30.7f, -6.1f)
                curveToRelative(13f, -2.6f, 21.4f, -15.2f, 18.8f, -28.2f)
                lineToRelative(-3.1f, -15.7f)
                curveTo(107.7f, 6.4f, 95.1f, -2f, 82.1f, 0.6f)
                lineTo(19.3f, 13f)
                curveTo(8.1f, 15.3f, 0f, 25.1f, 0f, 36.6f)
                verticalLineTo(192f)
                curveToRelative(0f, 77.3f, 55.1f, 142f, 128.1f, 156.8f)
                curveTo(130.7f, 439.2f, 208.6f, 512f, 304f, 512f)
                curveToRelative(97f, 0f, 176f, -75.4f, 176f, -168f)
                verticalLineTo(231.4f)
                curveToRelative(19.1f, -11.1f, 32f, -31.7f, 32f, -55.4f)
                curveToRelative(0f, -35.7f, -29.2f, -64.5f, -64.9f, -64f)
                close()
                moveToRelative(0.9f, 80f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Stethoscope!!
    }

private var _Stethoscope: ImageVector? = null

