package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Strava: ImageVector
    get() {
        if (_Strava != null) return _Strava!!
        
        _Strava = ImageVector.Builder(
            name = "strava",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.731f, 0f)
                lineTo(2f, 9.125f)
                horizontalLineToRelative(2.788f)
                lineTo(6.73f, 5.497f)
                lineToRelative(1.93f, 3.628f)
                horizontalLineToRelative(2.766f)
                close()
                moveToRelative(4.694f, 9.125f)
                lineToRelative(-1.372f, 2.756f)
                lineTo(8.66f, 9.125f)
                horizontalLineTo(6.547f)
                lineTo(10.053f, 16f)
                lineToRelative(3.484f, -6.875f)
                close()
            }
        }.build()
        
        return _Strava!!
    }

private var _Strava: ImageVector? = null

