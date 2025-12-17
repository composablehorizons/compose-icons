package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.GeoAlt: ImageVector
    get() {
        if (_GeoAlt != null) return _GeoAlt!!
        
        _GeoAlt = ImageVector.Builder(
            name = "geo-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                reflectiveCurveToRelative(6f, -5.686f, 6f, -10f)
                arcTo(6f, 6f, 0f, false, false, 2f, 6f)
                curveToRelative(0f, 4.314f, 6f, 10f, 6f, 10f)
                moveToRelative(0f, -7f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
            }
        }.build()
        
        return _GeoAlt!!
    }

private var _GeoAlt: ImageVector? = null

