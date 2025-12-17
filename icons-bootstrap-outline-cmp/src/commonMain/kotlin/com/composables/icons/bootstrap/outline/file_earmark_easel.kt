package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileEarmarkEasel: ImageVector
    get() {
        if (_FileEarmarkEasel != null) return _FileEarmarkEasel!!
        
        _FileEarmarkEasel = ImageVector.Builder(
            name = "file-earmark-easel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 7.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 11f)
                horizontalLineToRelative(0.473f)
                lineToRelative(-0.447f, 1.342f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.948f, 0.316f)
                lineTo(7.027f, 11f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.473f)
                lineToRelative(0.553f, 1.658f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.948f, -0.316f)
                lineTo(10.027f, 11f)
                horizontalLineToRelative(0.473f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12f, 9.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.5f, 6f)
                close()
                moveTo(5f, 7.5f)
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
                moveTo(14f, 14f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                moveTo(9.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 4.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5.5f)
                close()
            }
        }.build()
        
        return _FileEarmarkEasel!!
    }

private var _FileEarmarkEasel: ImageVector? = null

