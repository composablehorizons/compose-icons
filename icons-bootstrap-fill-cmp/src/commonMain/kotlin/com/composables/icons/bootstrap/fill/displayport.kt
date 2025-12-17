package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Displayport: ImageVector
    get() {
        if (_Displayport != null) return _Displayport!!
        
        _Displayport = ImageVector.Builder(
            name = "displayport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3.191f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, 0.894f)
                lineToRelative(1.618f, 0.81f)
                arcToRelative(1f, 1f, 0f, false, false, 0.447f, 0.105f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(1.5f, 2f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Displayport!!
    }

private var _Displayport: ImageVector? = null

