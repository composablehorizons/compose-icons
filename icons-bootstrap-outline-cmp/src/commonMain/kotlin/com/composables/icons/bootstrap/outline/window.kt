package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Window: ImageVector
    get() {
        if (_Window != null) return _Window!!
        
        _Window = ImageVector.Builder(
            name = "window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(2f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(1f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(13f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                moveTo(2f, 14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
        }.build()
        
        return _Window!!
    }

private var _Window: ImageVector? = null

