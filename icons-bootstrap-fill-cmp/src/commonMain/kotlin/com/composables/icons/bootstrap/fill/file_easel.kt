package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FileEasel: ImageVector
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
                moveTo(12f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(8.5f, 5f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 6.5f)
                verticalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-0.473f)
                lineToRelative(0.447f, 1.342f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.948f, 0.316f)
                lineTo(8.973f, 10f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.473f)
                lineToRelative(-0.553f, 1.658f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, -0.316f)
                lineTo(5.973f, 10f)
                horizontalLineTo(5.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 8.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _FileEasel!!
    }

private var _FileEasel: ImageVector? = null

