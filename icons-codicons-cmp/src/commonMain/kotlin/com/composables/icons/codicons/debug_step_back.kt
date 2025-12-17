package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStepBack: ImageVector
    get() {
        if (_DebugStepBack != null) return _DebugStepBack!!
        
        _DebugStepBack = ImageVector.Builder(
            name = "debug-step-back",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                curveTo(6.897f, 11f, 6f, 11.897f, 6f, 13f)
                curveTo(6f, 14.103f, 6.897f, 15f, 8f, 15f)
                curveTo(9.103f, 15f, 10f, 14.103f, 10f, 13f)
                curveTo(10f, 11.897f, 9.103f, 11f, 8f, 11f)
                close()
                moveTo(13.939f, 7.144f)
                curveTo(13.52f, 4.211f, 10.966f, 2f, 8f, 2f)
                curveTo(6.24f, 2f, 4.617f, 2.758f, 3.5f, 4.027f)
                verticalLineTo(2.75f)
                curveTo(3.5f, 2.336f, 3.164f, 2f, 2.75f, 2f)
                curveTo(2.336f, 2f, 2f, 2.336f, 2f, 2.75f)
                verticalLineTo(6.25f)
                curveTo(2f, 6.664f, 2.336f, 7f, 2.75f, 7f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 7f, 7f, 6.664f, 7f, 6.25f)
                curveTo(7f, 5.836f, 6.664f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(4.257f)
                curveTo(5.081f, 4.263f, 6.471f, 3.5f, 8f, 3.5f)
                curveTo(10.225f, 3.5f, 12.14f, 5.158f, 12.454f, 7.356f)
                curveTo(12.508f, 7.73f, 12.829f, 8f, 13.196f, 8f)
                curveTo(13.231f, 8f, 13.267f, 7.998f, 13.303f, 7.992f)
                curveTo(13.713f, 7.933f, 13.998f, 7.554f, 13.94f, 7.143f)
                lineTo(13.939f, 7.144f)
                close()
            }
        }.build()
        
        return _DebugStepBack!!
    }

private var _DebugStepBack: ImageVector? = null

