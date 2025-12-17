package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Thumbsdown: ImageVector
    get() {
        if (_Thumbsdown != null) return _Thumbsdown!!
        
        _Thumbsdown = ImageVector.Builder(
            name = "thumbsdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                horizontalLineTo(4.838f)
                curveTo(3.274f, 1f, 2.717f, 2.202f, 2.435f, 3.105f)
                lineTo(1.092f, 7.404f)
                curveTo(1.031f, 7.6f, 1f, 7.801f, 1f, 8.002f)
                curveTo(1f, 9.104f, 1.897f, 10f, 3.001f, 10f)
                horizontalLineTo(5.328f)
                lineTo(4.794f, 11.781f)
                curveTo(4.723f, 12.016f, 4.687f, 12.26f, 4.687f, 12.504f)
                curveTo(4.687f, 13.88f, 5.809f, 15.001f, 7.189f, 15.001f)
                curveTo(7.571f, 15.001f, 7.915f, 14.789f, 8.087f, 14.446f)
                lineTo(10.171f, 10.277f)
                curveTo(10.256f, 10.107f, 10.427f, 10.001f, 10.618f, 10.001f)
                horizontalLineTo(13f)
                curveTo(14.103f, 10.001f, 15f, 9.104f, 15f, 8.001f)
                verticalLineTo(3f)
                curveTo(15f, 1.897f, 14.103f, 1f, 13f, 1f)
                close()
                moveTo(9.276f, 9.829f)
                lineTo(7.193f, 13.996f)
                lineTo(7.188f, 13.999f)
                curveTo(6.36f, 13.999f, 5.686f, 13.328f, 5.686f, 12.502f)
                curveTo(5.686f, 12.356f, 5.707f, 12.21f, 5.75f, 12.067f)
                lineTo(6.478f, 9.642f)
                curveTo(6.524f, 9.491f, 6.495f, 9.327f, 6.401f, 9.2f)
                curveTo(6.306f, 9.073f, 6.158f, 8.998f, 6f, 8.998f)
                horizontalLineTo(3.001f)
                curveTo(2.449f, 8.998f, 2f, 8.551f, 2f, 8f)
                curveTo(2f, 7.9f, 2.016f, 7.799f, 2.047f, 7.699f)
                lineTo(3.39f, 3.401f)
                curveTo(3.753f, 2.236f, 4.232f, 1.998f, 4.838f, 1.998f)
                horizontalLineTo(11f)
                verticalLineTo(8.998f)
                horizontalLineTo(10.618f)
                curveTo(10.046f, 8.998f, 9.531f, 9.316f, 9.276f, 9.827f)
                verticalLineTo(9.829f)
                close()
                moveTo(14f, 8f)
                curveTo(14f, 8.551f, 13.552f, 9f, 13f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.449f, 14f, 3f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Thumbsdown!!
    }

private var _Thumbsdown: ImageVector? = null

