package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Scissors: ImageVector
    get() {
        if (_Scissors != null) return _Scissors!!
        
        _Scissors = ImageVector.Builder(
            name = "scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 3.5f)
                curveToRelative(-0.614f, -0.884f, -0.074f, -1.962f, 0.858f, -2.5f)
                lineTo(8f, 7.226f)
                lineTo(11.642f, 1f)
                curveToRelative(0.932f, 0.538f, 1.472f, 1.616f, 0.858f, 2.5f)
                lineTo(8.81f, 8.61f)
                lineToRelative(1.556f, 2.661f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.794f, 0.637f)
                lineTo(8f, 9.73f)
                lineToRelative(-1.572f, 2.177f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.794f, -0.637f)
                lineTo(7.19f, 8.61f)
                close()
                moveToRelative(2.5f, 10f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
            }
        }.build()
        
        return _Scissors!!
    }

private var _Scissors: ImageVector? = null

