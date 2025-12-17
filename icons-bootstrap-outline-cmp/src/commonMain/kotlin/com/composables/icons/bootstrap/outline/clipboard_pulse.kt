package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ClipboardPulse: ImageVector
    get() {
        if (_ClipboardPulse != null) return _ClipboardPulse!!
        
        _ClipboardPulse = ImageVector.Builder(
            name = "clipboard-pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveToRelative(-5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 0f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 4f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 2.5f)
                close()
                moveToRelative(-2f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3.5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(6.979f, 3.856f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.968f, 0.04f)
                lineTo(7.92f, 10.49f)
                lineToRelative(-0.94f, -3.135f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.895f, -0.133f)
                lineTo(4.232f, 10f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.416f, -0.223f)
                lineToRelative(1.41f, -2.115f)
                lineToRelative(1.195f, 3.982f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.968f, -0.04f)
                lineTo(9.58f, 7.51f)
                lineToRelative(0.94f, 3.135f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 11f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-1.128f)
                close()
            }
        }.build()
        
        return _ClipboardPulse!!
    }

private var _ClipboardPulse: ImageVector? = null

