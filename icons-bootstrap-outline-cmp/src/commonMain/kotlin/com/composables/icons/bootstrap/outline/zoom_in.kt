package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ZoomIn: ImageVector
    get() {
        if (_ZoomIn != null) return _ZoomIn!!
        
        _ZoomIn = ImageVector.Builder(
            name = "zoom-in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 12f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 0f, -11f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, 11f)
                moveTo(13f, 6.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -13f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 13f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.344f, 11.742f)
                quadToRelative(0.044f, 0.06f, 0.098f, 0.115f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1f, 1f, 0f, false, false, 1.415f, -1.414f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1f, 1f, 0f, false, false, -0.115f, -0.1f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -1.398f, 1.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(6f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ZoomIn!!
    }

private var _ZoomIn: ImageVector? = null

