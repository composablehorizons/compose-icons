package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pause: ImageVector
    get() {
        if (_Pause != null) return _Pause!!
        
        _Pause = ImageVector.Builder(
            name = "pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineTo(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                moveToRelative(5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineTo(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
            }
        }.build()
        
        return _Pause!!
    }

private var _Pause: ImageVector? = null

