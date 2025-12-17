package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SendExclamation: ImageVector
    get() {
        if (_SendExclamation != null) return _SendExclamation!!
        
        _SendExclamation = ImageVector.Builder(
            name = "send-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.964f, 0.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.65f, -0.65f)
                lineTo(0.767f, 5.855f)
                horizontalLineTo(0.766f)
                lineToRelative(-0.452f, 0.18f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.082f, 0.887f)
                lineToRelative(0.41f, 0.26f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(4.995f, 3.178f)
                lineToRelative(1.59f, 2.498f)
                curveTo(8f, 14f, 8f, 13f, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 5.026f, -4.47f)
                close()
                moveToRelative(-1.833f, 1.89f)
                lineTo(6.637f, 10.07f)
                lineToRelative(-0.215f, -0.338f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.154f, -0.154f)
                lineToRelative(-0.338f, -0.215f)
                lineToRelative(7.494f, -7.494f)
                lineToRelative(1.178f, -0.471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.5f, -5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _SendExclamation!!
    }

private var _SendExclamation: ImageVector? = null

