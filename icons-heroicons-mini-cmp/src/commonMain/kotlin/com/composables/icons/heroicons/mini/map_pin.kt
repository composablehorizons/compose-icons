package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MapPin: ImageVector
    get() {
        if (_MapPin != null) return _MapPin!!
        
        _MapPin = ImageVector.Builder(
            name = "map-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.69f, 18.933f)
                lineToRelative(0.003f, 0.001f)
                curveTo(9.89f, 19.02f, 10f, 19f, 10f, 19f)
                reflectiveCurveToRelative(0.11f, 0.02f, 0.308f, -0.066f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(0.006f, -0.003f)
                lineToRelative(0.018f, -0.008f)
                arcToRelative(5.741f, 5.741f, 0f, false, false, 0.281f, -0.14f)
                curveToRelative(0.186f, -0.096f, 0.446f, -0.24f, 0.757f, -0.433f)
                curveToRelative(0.62f, -0.384f, 1.445f, -0.966f, 2.274f, -1.765f)
                curveTo(15.302f, 14.988f, 17f, 12.493f, 17f, 9f)
                arcTo(7f, 7f, 0f, true, false, 3f, 9f)
                curveToRelative(0f, 3.492f, 1.698f, 5.988f, 3.355f, 7.584f)
                arcToRelative(13.731f, 13.731f, 0f, false, false, 2.273f, 1.765f)
                arcToRelative(11.842f, 11.842f, 0f, false, false, 0.976f, 0.544f)
                lineToRelative(0.062f, 0.029f)
                lineToRelative(0.018f, 0.008f)
                lineToRelative(0.006f, 0.003f)
                close()
                moveTo(10f, 11.25f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0f, 4.5f)
                close()
            }
        }.build()
        
        return _MapPin!!
    }

private var _MapPin: ImageVector? = null

