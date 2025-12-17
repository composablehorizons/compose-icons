package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ClipboardMinus: ImageVector
    get() {
        if (_ClipboardMinus != null) return _ClipboardMinus!!
        
        _ClipboardMinus = ImageVector.Builder(
            name = "clipboard-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 9f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
                moveToRelative(-3f, -1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 4f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 2.5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 0f)
                close()
            }
        }.build()
        
        return _ClipboardMinus!!
    }

private var _ClipboardMinus: ImageVector? = null

