package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutSidebarRightDock: ImageVector
    get() {
        if (_LayoutSidebarRightDock != null) return _LayoutSidebarRightDock!!
        
        _LayoutSidebarRightDock = ImageVector.Builder(
            name = "layout-sidebar-right-dock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.64746f, 6.14844f)
                curveTo(6.84246f, 5.95344f, 7.15852f, 5.95344f, 7.35352f, 6.14844f)
                lineTo(8.85352f, 7.64844f)
                lineTo(8.85547f, 7.64648f)
                curveTo(9.05032f, 7.84133f, 9.05001f, 8.15848f, 8.85547f, 8.35352f)
                lineTo(7.35547f, 9.85352f)
                curveTo(7.25747f, 9.95052f, 7.12898f, 10f, 7.00098f, 10f)
                curveTo(6.87299f, 9.99999f, 6.74546f, 9.9515f, 6.64746f, 9.85352f)
                curveTo(6.45246f, 9.65852f, 6.45246f, 9.34148f, 6.64746f, 9.14648f)
                lineTo(7.29297f, 8.50098f)
                horizontalLineTo(3.5f)
                curveTo(3.22401f, 8.50098f, 3.00001f, 8.27697f, 3f, 8.00098f)
                curveTo(3f, 7.72498f, 3.224f, 7.50098f, 3.5f, 7.50098f)
                horizontalLineTo(7.29297f)
                lineTo(6.64746f, 6.85449f)
                curveTo(6.45247f, 6.65949f, 6.45247f, 6.34344f, 6.64746f, 6.14844f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                curveTo(13.881f, 1f, 15f, 2.119f, 15f, 3.5f)
                lineTo(15f, 12.5f)
                curveTo(15f, 13.881f, 13.881f, 15f, 12.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 15f, 1f, 13.881f, 1f, 12.5f)
                lineTo(1f, 3.5f)
                curveTo(1f, 2.119f, 2.119f, 1f, 3.5f, 1f)
                lineTo(12.5f, 1f)
                close()
                moveTo(3.5f, 2f)
                curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
                lineTo(2f, 12.5f)
                curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(10f)
                lineTo(10f, 2f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _LayoutSidebarRightDock!!
    }

private var _LayoutSidebarRightDock: ImageVector? = null

