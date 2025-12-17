package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.InputCursor: ImageVector
    get() {
        if (_InputCursor != null) return _InputCursor!!
        
        _InputCursor = ImageVector.Builder(
            name = "input-cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(6f, 5f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 1f)
            }
        }.build()
        
        return _InputCursor!!
    }

private var _InputCursor: ImageVector? = null

