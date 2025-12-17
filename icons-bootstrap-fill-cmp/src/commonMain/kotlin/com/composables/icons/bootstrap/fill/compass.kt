package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Compass: ImageVector
    get() {
        if (_Compass != null) return _Compass!!
        
        _Compass = ImageVector.Builder(
            name = "compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 8.516f)
                arcToRelative(7.5f, 7.5f, 0f, true, true, -9.462f, -7.24f)
                arcTo(1f, 1f, 0f, false, true, 7f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.962f, 1.276f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 5.538f, 7.24f)
                moveToRelative(-3.61f, -3.905f)
                lineTo(6.94f, 7.439f)
                lineTo(4.11f, 12.39f)
                lineToRelative(4.95f, -2.828f)
                lineToRelative(2.828f, -4.95f)
                close()
            }
        }.build()
        
        return _Compass!!
    }

private var _Compass: ImageVector? = null

