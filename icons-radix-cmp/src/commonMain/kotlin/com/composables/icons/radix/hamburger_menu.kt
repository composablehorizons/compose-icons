package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.HamburgerMenu: ImageVector
    get() {
        if (_HamburgerMenu != null) return _HamburgerMenu!!
        
        _HamburgerMenu = ImageVector.Builder(
            name = "hamburger-menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.6006f, 11.0098f)
                curveTo(13.8286f, 11.0563f, 14f, 11.2583f, 14f, 11.5f)
                curveTo(14f, 11.7417f, 13.8286f, 11.9437f, 13.6006f, 11.9902f)
                lineTo(13.5f, 12f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 12f, 1f, 11.7761f, 1f, 11.5f)
                curveTo(1f, 11.2239f, 1.22386f, 11f, 1.5f, 11f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 11.0098f)
                close()
                moveTo(13.6006f, 7.00977f)
                curveTo(13.8286f, 7.05629f, 14f, 7.25829f, 14f, 7.5f)
                curveTo(14f, 7.74171f, 13.8286f, 7.94371f, 13.6006f, 7.99023f)
                lineTo(13.5f, 8f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 8f, 1f, 7.77614f, 1f, 7.5f)
                curveTo(1f, 7.22386f, 1.22386f, 7f, 1.5f, 7f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 7.00977f)
                close()
                moveTo(13.6006f, 3.00977f)
                curveTo(13.8286f, 3.05629f, 14f, 3.25829f, 14f, 3.5f)
                curveTo(14f, 3.74171f, 13.8286f, 3.94371f, 13.6006f, 3.99023f)
                lineTo(13.5f, 4f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 4f, 1f, 3.77614f, 1f, 3.5f)
                curveTo(1f, 3.22386f, 1.22386f, 3f, 1.5f, 3f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 3.00977f)
                close()
            }
        }.build()
        
        return _HamburgerMenu!!
    }

private var _HamburgerMenu: ImageVector? = null

