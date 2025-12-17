package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MapPin: ImageVector
    get() {
        if (_MapPin != null) return _MapPin!!
        
        _MapPin = ImageVector.Builder(
            name = "map-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(112f, 316.94f)
                verticalLineToRelative(156.69f)
                lineToRelative(22.02f, 33.02f)
                curveToRelative(4.75f, 7.12f, 15.22f, 7.12f, 19.97f, 0f)
                lineTo(176f, 473.63f)
                verticalLineTo(316.94f)
                curveToRelative(-10.39f, 1.92f, -21.06f, 3.06f, -32f, 3.06f)
                reflectiveCurveToRelative(-21.61f, -1.14f, -32f, -3.06f)
                close()
                moveTo(144f, 0f)
                curveTo(64.47f, 0f, 0f, 64.47f, 0f, 144f)
                reflectiveCurveToRelative(64.47f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.47f, 144f, -144f)
                reflectiveCurveTo(223.53f, 0f, 144f, 0f)
                close()
                moveToRelative(0f, 76f)
                curveToRelative(-37.5f, 0f, -68f, 30.5f, -68f, 68f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                curveToRelative(0f, -50.73f, 41.28f, -92f, 92f, -92f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
            }
        }.build()
        
        return _MapPin!!
    }

private var _MapPin: ImageVector? = null

