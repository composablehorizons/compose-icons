package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStackframe: ImageVector
    get() {
        if (_DebugStackframe != null) return _DebugStackframe!!
        
        _DebugStackframe = ImageVector.Builder(
            name = "debug-stackframe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.879f, 14f)
                horizontalLineTo(5f)
                curveTo(3.897f, 14f, 3f, 13.103f, 3f, 12f)
                verticalLineTo(4f)
                curveTo(3f, 2.897f, 3.897f, 2f, 5f, 2f)
                horizontalLineTo(8.879f)
                curveTo(9.405f, 2f, 9.921f, 2.213f, 10.293f, 2.586f)
                lineTo(14.505f, 6.798f)
                curveTo(14.826f, 7.119f, 15.003f, 7.546f, 15.003f, 8f)
                curveTo(15.003f, 8.454f, 14.826f, 8.881f, 14.505f, 9.202f)
                lineTo(10.293f, 13.414f)
                curveTo(9.921f, 13.787f, 9.405f, 14f, 8.879f, 14f)
                close()
                moveTo(5f, 3f)
                curveTo(4.449f, 3f, 4f, 3.449f, 4f, 4f)
                verticalLineTo(12f)
                curveTo(4f, 12.551f, 4.449f, 13f, 5f, 13f)
                horizontalLineTo(8.879f)
                curveTo(9.142f, 13f, 9.4f, 12.893f, 9.586f, 12.707f)
                lineTo(13.798f, 8.495f)
                curveTo(13.93f, 8.363f, 14.003f, 8.187f, 14.003f, 8f)
                curveTo(14.003f, 7.813f, 13.93f, 7.637f, 13.798f, 7.505f)
                lineTo(9.586f, 3.293f)
                curveTo(9.4f, 3.107f, 9.142f, 3f, 8.879f, 3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _DebugStackframe!!
    }

private var _DebugStackframe: ImageVector? = null

