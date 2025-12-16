package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Insert: ImageVector
    get() {
        if (_Insert != null) return _Insert!!
        
        _Insert = ImageVector.Builder(
            name = "insert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 6f)
                horizontalLineTo(14f)
                curveTo(14.551f, 6f, 15f, 5.551f, 15f, 5f)
                verticalLineTo(2f)
                curveTo(15f, 1.449f, 14.551f, 1f, 14f, 1f)
                horizontalLineTo(11f)
                curveTo(10.449f, 1f, 10f, 1.449f, 10f, 2f)
                verticalLineTo(5f)
                curveTo(10f, 5.551f, 10.449f, 6f, 11f, 6f)
                close()
                moveTo(11f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 14f)
                horizontalLineTo(14f)
                curveTo(14.551f, 14f, 15f, 13.551f, 15f, 13f)
                verticalLineTo(10f)
                curveTo(15f, 9.449f, 14.551f, 9f, 14f, 9f)
                horizontalLineTo(11f)
                curveTo(10.449f, 9f, 10f, 9.449f, 10f, 10f)
                verticalLineTo(13f)
                curveTo(10f, 13.551f, 10.449f, 14f, 11f, 14f)
                close()
                moveTo(11f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.854f, 5.14602f)
                lineTo(9.854f, 7.14602f)
                lineTo(9.855f, 7.14502f)
                curveTo(10.05f, 7.34002f, 10.05f, 7.65702f, 9.855f, 7.85202f)
                lineTo(7.855f, 9.85202f)
                curveTo(7.757f, 9.94902f, 7.629f, 9.99802f, 7.501f, 9.99802f)
                curveTo(7.373f, 9.99802f, 7.245f, 9.95002f, 7.147f, 9.85202f)
                curveTo(6.952f, 9.65702f, 6.952f, 9.34002f, 7.147f, 9.14502f)
                lineTo(8.293f, 7.99902f)
                horizontalLineTo(4f)
                verticalLineTo(8.99902f)
                curveTo(4f, 9.55002f, 3.551f, 9.99902f, 3f, 9.99902f)
                horizontalLineTo(1f)
                curveTo(0.724f, 9.99902f, 0.5f, 9.77502f, 0.5f, 9.49902f)
                curveTo(0.5f, 9.22302f, 0.724f, 8.99902f, 1f, 8.99902f)
                horizontalLineTo(3f)
                verticalLineTo(5.99902f)
                horizontalLineTo(1f)
                curveTo(0.724f, 5.99902f, 0.5f, 5.77502f, 0.5f, 5.49902f)
                curveTo(0.5f, 5.22302f, 0.724f, 4.99902f, 1f, 4.99902f)
                horizontalLineTo(3f)
                curveTo(3.551f, 4.99902f, 4f, 5.44802f, 4f, 5.99902f)
                verticalLineTo(6.99902f)
                horizontalLineTo(8.293f)
                lineTo(7.147f, 5.85302f)
                curveTo(6.952f, 5.65802f, 6.952f, 5.34102f, 7.147f, 5.14602f)
                curveTo(7.342f, 4.95102f, 7.659f, 4.95102f, 7.854f, 5.14602f)
                close()
            }
        }.build()
        
        return _Insert!!
    }

private var _Insert: ImageVector? = null

