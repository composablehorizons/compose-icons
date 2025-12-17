package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ClipboardData: ImageVector
    get() {
        if (_ClipboardData != null) return _ClipboardData!!
        
        _ClipboardData = ImageVector.Builder(
            name = "clipboard-data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 4f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11f, 2.5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 0f)
                close()
                moveToRelative(3f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
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
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 5f)
                horizontalLineToRelative(-3f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4f, 2.5f)
                close()
                moveTo(10f, 8f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                close()
                moveToRelative(-6f, 4f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                close()
                moveToRelative(4f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _ClipboardData!!
    }

private var _ClipboardData: ImageVector? = null

