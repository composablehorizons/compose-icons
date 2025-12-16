package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Warning: ImageVector
    get() {
        if (_Warning != null) return _Warning!!
        
        _Warning = ImageVector.Builder(
            name = "warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.831f, 11.965f)
                lineTo(9.206f, 1.714f)
                curveTo(8.965f, 1.274f, 8.503f, 1f, 8f, 1f)
                curveTo(7.497f, 1f, 7.035f, 1.274f, 6.794f, 1.714f)
                lineTo(1.169f, 11.965f)
                curveTo(1.059f, 12.167f, 1f, 12.395f, 1f, 12.625f)
                curveTo(1f, 13.383f, 1.617f, 14f, 2.375f, 14f)
                horizontalLineTo(13.625f)
                curveTo(14.383f, 14f, 15f, 13.383f, 15f, 12.625f)
                curveTo(15f, 12.395f, 14.941f, 12.167f, 14.831f, 11.965f)
                close()
                moveTo(13.625f, 13f)
                horizontalLineTo(2.375f)
                curveTo(2.168f, 13f, 2f, 12.832f, 2f, 12.625f)
                curveTo(2f, 12.561f, 2.016f, 12.5f, 2.046f, 12.445f)
                lineTo(7.671f, 2.195f)
                curveTo(7.736f, 2.075f, 7.863f, 2f, 8f, 2f)
                curveTo(8.137f, 2f, 8.264f, 2.075f, 8.329f, 2.195f)
                lineTo(13.954f, 12.445f)
                curveTo(13.984f, 12.501f, 14f, 12.561f, 14f, 12.625f)
                curveTo(14f, 12.832f, 13.832f, 13f, 13.625f, 13f)
                close()
                moveTo(8.75f, 11.25f)
                curveTo(8.75f, 11.664f, 8.414f, 12f, 8f, 12f)
                curveTo(7.586f, 12f, 7.25f, 11.664f, 7.25f, 11.25f)
                curveTo(7.25f, 10.836f, 7.586f, 10.5f, 8f, 10.5f)
                curveTo(8.414f, 10.5f, 8.75f, 10.836f, 8.75f, 11.25f)
                close()
                moveTo(7.5f, 9f)
                verticalLineTo(5.5f)
                curveTo(7.5f, 5.224f, 7.724f, 5f, 8f, 5f)
                curveTo(8.276f, 5f, 8.5f, 5.224f, 8.5f, 5.5f)
                verticalLineTo(9f)
                curveTo(8.5f, 9.276f, 8.276f, 9.5f, 8f, 9.5f)
                curveTo(7.724f, 9.5f, 7.5f, 9.276f, 7.5f, 9f)
                close()
            }
        }.build()
        
        return _Warning!!
    }

private var _Warning: ImageVector? = null

