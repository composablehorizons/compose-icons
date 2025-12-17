package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Compass: ImageVector
    get() {
        if (_Compass != null) return _Compass!!
        
        _Compass = ImageVector.Builder(
            name = "compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(347.94f, 129.86f)
                lineTo(203.6f, 195.83f)
                arcToRelative(31.938f, 31.938f, 0f, false, false, -15.77f, 15.77f)
                lineToRelative(-65.97f, 144.34f)
                curveToRelative(-7.61f, 16.65f, 9.54f, 33.81f, 26.2f, 26.2f)
                lineToRelative(144.34f, -65.97f)
                arcToRelative(31.938f, 31.938f, 0f, false, false, 15.77f, -15.77f)
                lineToRelative(65.97f, -144.34f)
                curveToRelative(7.61f, -16.66f, -9.54f, -33.81f, -26.2f, -26.2f)
                close()
                moveToRelative(-77.36f, 148.72f)
                curveToRelative(-12.47f, 12.47f, -32.69f, 12.47f, -45.16f, 0f)
                curveToRelative(-12.47f, -12.47f, -12.47f, -32.69f, 0f, -45.16f)
                curveToRelative(12.47f, -12.47f, 32.69f, -12.47f, 45.16f, 0f)
                curveToRelative(12.47f, 12.47f, 12.47f, 32.69f, 0f, 45.16f)
                close()
                moveTo(248f, 8f)
                curveTo(111.03f, 8f, 0f, 119.03f, 0f, 256f)
                reflectiveCurveToRelative(111.03f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.03f, 248f, -248f)
                reflectiveCurveTo(384.97f, 8f, 248f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.28f, 0f, -200f, -89.72f, -200f, -200f)
                reflectiveCurveTo(137.72f, 56f, 248f, 56f)
                reflectiveCurveToRelative(200f, 89.72f, 200f, 200f)
                reflectiveCurveToRelative(-89.72f, 200f, -200f, 200f)
                close()
            }
        }.build()
        
        return _Compass!!
    }

private var _Compass: ImageVector? = null

