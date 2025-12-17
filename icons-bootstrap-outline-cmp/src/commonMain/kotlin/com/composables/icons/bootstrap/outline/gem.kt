package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Gem: ImageVector
    get() {
        if (_Gem != null) return _Gem!!
        
        _Gem = ImageVector.Builder(
            name = "gem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.1f, 0.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.4f, -0.2f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.4f, 0.2f)
                lineToRelative(2.976f, 3.974f)
                curveToRelative(0.149f, 0.185f, 0.156f, 0.45f, 0.01f, 0.644f)
                lineTo(8.4f, 15.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.8f, 0f)
                lineTo(0.1f, 5.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.6f)
                close()
                moveToRelative(11.386f, 3.785f)
                lineToRelative(-1.806f, -2.41f)
                lineToRelative(-0.776f, 2.413f)
                close()
                moveToRelative(-3.633f, 0.004f)
                lineToRelative(0.961f, -2.989f)
                horizontalLineTo(4.186f)
                lineToRelative(0.963f, 2.995f)
                close()
                moveTo(5.47f, 5.495f)
                lineTo(8f, 13.366f)
                lineToRelative(2.532f, -7.876f)
                close()
                moveToRelative(-1.371f, -0.999f)
                lineToRelative(-0.78f, -2.422f)
                lineToRelative(-1.818f, 2.425f)
                close()
                moveTo(1.499f, 5.5f)
                lineToRelative(5.113f, 6.817f)
                lineToRelative(-2.192f, -6.82f)
                close()
                moveToRelative(7.889f, 6.817f)
                lineToRelative(5.123f, -6.83f)
                lineToRelative(-2.928f, 0.002f)
                close()
            }
        }.build()
        
        return _Gem!!
    }

private var _Gem: ImageVector? = null

