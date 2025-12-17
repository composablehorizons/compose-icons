package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MapMarker: ImageVector
    get() {
        if (_MapMarker != null) return _MapMarker!!
        
        _MapMarker = ImageVector.Builder(
            name = "map-marker",
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
            }
        }.build()
        
        return _MapMarker!!
    }

private var _MapMarker: ImageVector? = null

