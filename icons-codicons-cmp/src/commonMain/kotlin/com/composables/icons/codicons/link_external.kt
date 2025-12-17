package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LinkExternal: ImageVector
    get() {
        if (_LinkExternal != null) return _LinkExternal!!
        
        _LinkExternal = ImageVector.Builder(
            name = "link-external",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.49999f, 2f)
                curveTo(2.67157f, 2f, 2f, 2.67157f, 2f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.3284f, 2.67157f, 14f, 3.49999f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 14f, 13.9999f, 13.3284f, 13.9999f, 12.5f)
                verticalLineTo(9.26923f)
                curveTo(13.9999f, 8.99309f, 14.2238f, 8.76923f, 14.4999f, 8.76923f)
                curveTo(14.7761f, 8.76923f, 14.9999f, 8.99309f, 14.9999f, 9.26923f)
                verticalLineTo(12.5f)
                curveTo(14.9999f, 13.8807f, 13.8807f, 15f, 12.5f, 15f)
                horizontalLineTo(3.49999f)
                curveTo(2.11928f, 15f, 1f, 13.8807f, 1f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 2.11929f, 2.11928f, 1f, 3.49999f, 1f)
                horizontalLineTo(6.73075f)
                curveTo(7.00689f, 1f, 7.23074f, 1.22386f, 7.23074f, 1.5f)
                curveTo(7.23074f, 1.77614f, 7.00689f, 2f, 6.73075f, 2f)
                horizontalLineTo(3.49999f)
                close()
                moveTo(8.76925f, 1.5f)
                curveTo(8.76925f, 1.22386f, 8.99311f, 1f, 9.26925f, 1f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 1f, 15f, 1.22386f, 15f, 1.5f)
                verticalLineTo(6.73077f)
                curveTo(15f, 7.00691f, 14.7761f, 7.23077f, 14.5f, 7.23077f)
                curveTo(14.2239f, 7.23077f, 14f, 7.00691f, 14f, 6.73077f)
                verticalLineTo(2.70711f)
                lineTo(9.6228f, 7.08433f)
                curveTo(9.42754f, 7.27959f, 9.11096f, 7.27959f, 8.9157f, 7.08433f)
                curveTo(8.72044f, 6.88906f, 8.72044f, 6.57248f, 8.9157f, 6.37722f)
                lineTo(13.2929f, 2f)
                horizontalLineTo(9.26925f)
                curveTo(8.99311f, 2f, 8.76925f, 1.77614f, 8.76925f, 1.5f)
                close()
            }
        }.build()
        
        return _LinkExternal!!
    }

private var _LinkExternal: ImageVector? = null

