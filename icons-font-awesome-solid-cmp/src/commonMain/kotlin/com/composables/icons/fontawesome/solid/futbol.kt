package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Futbol: ImageVector
    get() {
        if (_Futbol != null) return _Futbol!!
        
        _Futbol = ImageVector.Builder(
            name = "futbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveToRelative(0f, 136.967f, -111.033f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 392.967f, 8f, 256f)
                reflectiveCurveTo(119.033f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111.033f, 248f, 248f)
                close()
                moveToRelative(-48f, 0f)
                lineToRelative(-0.003f, -0.282f)
                lineToRelative(-26.064f, 22.741f)
                lineToRelative(-62.679f, -58.5f)
                lineToRelative(16.454f, -84.355f)
                lineToRelative(34.303f, 3.072f)
                curveToRelative(-24.889f, -34.216f, -60.004f, -60.089f, -100.709f, -73.141f)
                lineToRelative(13.651f, 31.939f)
                lineTo(256f, 139f)
                lineToRelative(-74.953f, -41.525f)
                lineToRelative(13.651f, -31.939f)
                curveToRelative(-40.631f, 13.028f, -75.78f, 38.87f, -100.709f, 73.141f)
                lineToRelative(34.565f, -3.073f)
                lineToRelative(16.192f, 84.355f)
                lineToRelative(-62.678f, 58.5f)
                lineToRelative(-26.064f, -22.741f)
                lineToRelative(-0.003f, 0.282f)
                curveToRelative(0f, 43.015f, 13.497f, 83.952f, 38.472f, 117.991f)
                lineToRelative(7.704f, -33.897f)
                lineToRelative(85.138f, 10.447f)
                lineToRelative(36.301f, 77.826f)
                lineToRelative(-29.902f, 17.786f)
                curveToRelative(40.202f, 13.122f, 84.29f, 13.148f, 124.572f, 0f)
                lineToRelative(-29.902f, -17.786f)
                lineToRelative(36.301f, -77.826f)
                lineToRelative(85.138f, -10.447f)
                lineToRelative(7.704f, 33.897f)
                curveTo(442.503f, 339.952f, 456f, 299.015f, 456f, 256f)
                close()
                moveToRelative(-248.102f, 69.571f)
                lineToRelative(-29.894f, -91.312f)
                lineTo(256f, 177.732f)
                lineToRelative(77.996f, 56.527f)
                lineToRelative(-29.622f, 91.312f)
                horizontalLineToRelative(-96.476f)
                close()
            }
        }.build()
        
        return _Futbol!!
    }

private var _Futbol: ImageVector? = null

