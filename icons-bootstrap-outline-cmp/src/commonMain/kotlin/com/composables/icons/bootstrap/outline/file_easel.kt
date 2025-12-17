package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEasel: ImageVector
    get() {
        if (_FileEasel != null) return _FileEasel!!
        
        _FileEasel = ImageVector.Builder(
            name = "file-easel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 6.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 10f)
                horizontalLineToRelative(0.473f)
                lineToRelative(-0.447f, 1.342f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.948f, 0.316f)
                lineTo(7.027f, 10f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.473f)
                lineToRelative(0.553f, 1.658f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.948f, -0.316f)
                lineTo(10.027f, 10f)
                horizontalLineToRelative(0.473f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12f, 8.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.5f, 5f)
                close()
                moveTo(5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(10f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _FileEasel!!
    }

private var _FileEasel: ImageVector? = null

