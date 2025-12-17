package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileLock2: ImageVector
    get() {
        if (_FileLock2 != null) return _FileLock2!!
        
        _FileLock2 = ImageVector.Builder(
            name = "file-lock2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(2f, 2.076f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(1.076f)
                curveToRelative(-0.54f, 0.166f, -1f, 0.597f, -1f, 1.224f)
                verticalLineToRelative(2.4f)
                curveToRelative(0f, 0.816f, 0.781f, 1.3f, 1.5f, 1.3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.719f, 0f, 1.5f, -0.484f, 1.5f, -1.3f)
                verticalLineTo(8.3f)
                curveToRelative(0f, -0.627f, -0.46f, -1.058f, -1f, -1.224f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _FileLock2!!
    }

private var _FileLock2: ImageVector? = null

