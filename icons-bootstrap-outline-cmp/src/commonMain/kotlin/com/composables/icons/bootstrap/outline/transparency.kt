package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Transparency: ImageVector
    get() {
        if (_Transparency != null) return _Transparency!!
        
        _Transparency = ImageVector.Builder(
            name = "transparency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 6.5f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 12.346f, -2.846f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -8.691f, 8.691f)
                arcTo(6.5f, 6.5f, 0f, false, true, 0f, 6.5f)
                moveToRelative(5.144f, 6.358f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 7.714f, -7.714f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -7.714f, 7.714f)
                moveToRelative(-0.733f, -1.269f)
                quadToRelative(0.546f, 0.226f, 1.144f, 0.33f)
                lineToRelative(-1.474f, -1.474f)
                quadToRelative(0.104f, 0.597f, 0.33f, 1.144f)
                moveToRelative(2.614f, 0.386f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 1.173f, -0.242f)
                lineTo(4.374f, 7.91f)
                arcToRelative(6f, 6f, 0f, false, false, -0.296f, 1.118f)
                close()
                moveToRelative(2.157f, -0.672f)
                quadToRelative(0.446f, -0.25f, 0.838f, -0.576f)
                lineTo(5.418f, 6.126f)
                arcToRelative(6f, 6f, 0f, false, false, -0.587f, 0.826f)
                close()
                moveToRelative(1.545f, -1.284f)
                quadToRelative(0.325f, -0.39f, 0.576f, -0.837f)
                lineTo(6.953f, 4.83f)
                arcToRelative(6f, 6f, 0f, false, false, -0.827f, 0.587f)
                lineToRelative(4.6f, 4.602f)
                close()
                moveToRelative(1.006f, -1.822f)
                quadToRelative(0.183f, -0.562f, 0.242f, -1.172f)
                lineTo(9.028f, 4.078f)
                quadToRelative(-0.58f, 0.096f, -1.118f, 0.296f)
                lineToRelative(3.823f, 3.824f)
                close()
                moveToRelative(0.186f, -2.642f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -0.33f, -1.144f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -1.144f, -0.33f)
                close()
            }
        }.build()
        
        return _Transparency!!
    }

private var _Transparency: ImageVector? = null

