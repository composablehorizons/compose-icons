package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MapMarkerAlt: ImageVector
    get() {
        if (_MapMarkerAlt != null) return _MapMarkerAlt!!
        
        _MapMarkerAlt = ImageVector.Builder(
            name = "map-marker-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(172.268f, 501.67f)
                curveTo(26.97f, 291.031f, 0f, 269.413f, 0f, 192f)
                curveTo(0f, 85.961f, 85.961f, 0f, 192f, 0f)
                reflectiveCurveToRelative(192f, 85.961f, 192f, 192f)
                curveToRelative(0f, 77.413f, -26.97f, 99.031f, -172.268f, 309.67f)
                curveToRelative(-9.535f, 13.774f, -29.93f, 13.773f, -39.464f, 0f)
                close()
                moveTo(192f, 272f)
                curveToRelative(44.183f, 0f, 80f, -35.817f, 80f, -80f)
                reflectiveCurveToRelative(-35.817f, -80f, -80f, -80f)
                reflectiveCurveToRelative(-80f, 35.817f, -80f, 80f)
                reflectiveCurveToRelative(35.817f, 80f, 80f, 80f)
                close()
            }
        }.build()
        
        return _MapMarkerAlt!!
    }

private var _MapMarkerAlt: ImageVector? = null

