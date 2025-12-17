package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Flask: ImageVector
    get() {
        if (_Flask != null) return _Flask!!
        
        _Flask = ImageVector.Builder(
            name = "flask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(5.36f)
                lineTo(0.503f, 13.717f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.783f, 16f)
                horizontalLineToRelative(12.434f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.28f, -2.282f)
                lineTo(11f, 6.359f)
                verticalLineTo(1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(10f, 2f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.22f)
                lineToRelative(0.61f, 1f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineToRelative(1.442f)
                lineToRelative(0.611f, 1f)
                horizontalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineToRelative(1.664f)
                lineToRelative(0.611f, 1f)
                horizontalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                horizontalLineToRelative(1.886f)
                lineToRelative(0.758f, 1.24f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.427f, 0.76f)
                horizontalLineTo(1.783f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.427f, -0.76f)
                lineToRelative(4.57f, -7.48f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 6.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Flask!!
    }

private var _Flask: ImageVector? = null

