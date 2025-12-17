package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SendSlash: ImageVector
    get() {
        if (_SendSlash != null) return _SendSlash!!
        
        _SendSlash = ImageVector.Builder(
            name = "send-slash",
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
                moveTo(14.975f, 10.025f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -4.95f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4.95f, -4.95f)
                moveToRelative(-4.243f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.147f, -0.318f)
                lineToRelative(-3.465f, 3.465f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.318f, -3.147f)
                moveToRelative(0.39f, 3.854f)
                lineToRelative(3.464f, -3.465f)
                arcToRelative(2.501f, 2.501f, 0f, false, true, -3.465f, 3.465f)
                close()
            }
        }.build()
        
        return _SendSlash!!
    }

private var _SendSlash: ImageVector? = null

