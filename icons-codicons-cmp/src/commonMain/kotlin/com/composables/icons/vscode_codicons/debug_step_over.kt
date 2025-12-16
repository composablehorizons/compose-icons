package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStepOver: ImageVector
    get() {
        if (_DebugStepOver != null) return _DebugStepOver!!
        
        _DebugStepOver = ImageVector.Builder(
            name = "debug-step-over",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.99993f, 13f)
                curveTo(9.99993f, 14.103f, 9.10293f, 15f, 7.99993f, 15f)
                curveTo(6.89693f, 15f, 5.99993f, 14.103f, 5.99993f, 13f)
                curveTo(5.99993f, 11.897f, 6.89693f, 11f, 7.99993f, 11f)
                curveTo(9.10293f, 11f, 9.99993f, 11.897f, 9.99993f, 13f)
                close()
                moveTo(13.2499f, 2f)
                curveTo(12.8359f, 2f, 12.4999f, 2.336f, 12.4999f, 2.75f)
                verticalLineTo(4.027f)
                curveTo(11.3829f, 2.759f, 9.75993f, 2f, 7.99993f, 2f)
                curveTo(5.03293f, 2f, 2.47993f, 4.211f, 2.06093f, 7.144f)
                curveTo(2.00193f, 7.554f, 2.28793f, 7.934f, 2.69793f, 7.993f)
                curveTo(2.73393f, 7.999f, 2.76993f, 8.001f, 2.80493f, 8.001f)
                curveTo(3.17193f, 8.001f, 3.49293f, 7.731f, 3.54693f, 7.357f)
                curveTo(3.86093f, 5.159f, 5.77593f, 3.501f, 8.00093f, 3.501f)
                curveTo(9.52993f, 3.501f, 10.9199f, 4.264f, 11.7439f, 5.501f)
                horizontalLineTo(9.75093f)
                curveTo(9.33693f, 5.501f, 9.00093f, 5.837f, 9.00093f, 6.251f)
                curveTo(9.00093f, 6.665f, 9.33693f, 7.001f, 9.75093f, 7.001f)
                horizontalLineTo(13.2509f)
                curveTo(13.6649f, 7.001f, 14.0009f, 6.665f, 14.0009f, 6.251f)
                verticalLineTo(2.751f)
                curveTo(14.0009f, 2.337f, 13.6649f, 2.001f, 13.2509f, 2.001f)
                lineTo(13.2499f, 2f)
                close()
            }
        }.build()
        
        return _DebugStepOver!!
    }

private var _DebugStepOver: ImageVector? = null

