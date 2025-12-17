package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutSidebarLeftDock: ImageVector
    get() {
        if (_LayoutSidebarLeftDock != null) return _LayoutSidebarLeftDock!!
        
        _LayoutSidebarLeftDock = ImageVector.Builder(
            name = "layout-sidebar-left-dock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.35254f, 6.14844f)
                curveTo(9.15754f, 5.95344f, 8.84148f, 5.95344f, 8.64648f, 6.14844f)
                lineTo(7.14648f, 7.64844f)
                lineTo(7.14453f, 7.64648f)
                curveTo(6.94968f, 7.84133f, 6.94999f, 8.15848f, 7.14453f, 8.35352f)
                lineTo(8.64453f, 9.85352f)
                curveTo(8.74253f, 9.95052f, 8.87102f, 10f, 8.99902f, 10f)
                curveTo(9.12701f, 9.99999f, 9.25454f, 9.9515f, 9.35254f, 9.85352f)
                curveTo(9.54754f, 9.65852f, 9.54754f, 9.34148f, 9.35254f, 9.14648f)
                lineTo(8.70703f, 8.50098f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 8.50098f, 13f, 8.27697f, 13f, 8.00098f)
                curveTo(13f, 7.72498f, 12.776f, 7.50098f, 12.5f, 7.50098f)
                horizontalLineTo(8.70703f)
                lineTo(9.35254f, 6.85449f)
                curveTo(9.54753f, 6.65949f, 9.54753f, 6.34344f, 9.35254f, 6.14844f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                curveTo(2.119f, 1f, 0.999997f, 2.119f, 0.999997f, 3.5f)
                lineTo(1f, 12.5f)
                curveTo(1f, 13.881f, 2.119f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 15f, 15f, 13.881f, 15f, 12.5f)
                lineTo(15f, 3.5f)
                curveTo(15f, 2.119f, 13.881f, 1f, 12.5f, 1f)
                lineTo(3.5f, 1f)
                close()
                moveTo(12.5f, 2f)
                curveTo(13.328f, 2f, 14f, 2.672f, 14f, 3.5f)
                lineTo(14f, 12.5f)
                curveTo(14f, 13.328f, 13.328f, 14f, 12.5f, 14f)
                horizontalLineTo(6f)
                lineTo(6f, 2f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _LayoutSidebarLeftDock!!
    }

private var _LayoutSidebarLeftDock: ImageVector? = null

