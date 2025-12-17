package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Compass: ImageVector
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
                moveTo(8f, 16.016f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 1.962f, -14.74f)
                arcTo(1f, 1f, 0f, false, false, 9f, 0f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -0.962f, 1.276f)
                arcTo(7.5f, 7.5f, 0f, false, false, 8f, 16.016f)
                moveToRelative(6.5f, -7.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -13f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 13f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.94f, 7.44f)
                lineToRelative(4.95f, -2.83f)
                lineToRelative(-2.83f, 4.95f)
                lineToRelative(-4.949f, 2.83f)
                lineToRelative(2.828f, -4.95f)
                close()
            }
        }.build()
        
        return _Compass!!
    }

private var _Compass: ImageVector? = null

