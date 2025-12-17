package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileArrowUp: ImageVector
    get() {
        if (_FileArrowUp != null) return _FileArrowUp!!
        
        _FileArrowUp = ImageVector.Builder(
            name = "file-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(6.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(7.5f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
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
        
        return _FileArrowUp!!
    }

private var _FileArrowUp: ImageVector? = null

