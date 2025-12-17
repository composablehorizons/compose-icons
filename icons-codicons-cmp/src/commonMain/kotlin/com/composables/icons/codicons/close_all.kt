package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CloseAll: ImageVector
    get() {
        if (_CloseAll != null) return _CloseAll!!
        
        _CloseAll = ImageVector.Builder(
            name = "close-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.853f, 4.853f)
                lineTo(7.707f, 6.999f)
                lineTo(9.853f, 9.145f)
                curveTo(10.048f, 9.34f, 10.048f, 9.657f, 9.853f, 9.852f)
                curveTo(9.658f, 10.047f, 9.341f, 10.047f, 9.146f, 9.852f)
                lineTo(7f, 7.706f)
                lineTo(4.854f, 9.852f)
                curveTo(4.659f, 10.047f, 4.342f, 10.047f, 4.147f, 9.852f)
                curveTo(3.952f, 9.657f, 3.952f, 9.34f, 4.147f, 9.145f)
                lineTo(6.293f, 6.999f)
                lineTo(4.147f, 4.853f)
                curveTo(3.952f, 4.658f, 3.952f, 4.341f, 4.147f, 4.146f)
                curveTo(4.342f, 3.951f, 4.659f, 3.951f, 4.854f, 4.146f)
                lineTo(7f, 6.292f)
                lineTo(9.146f, 4.146f)
                curveTo(9.341f, 3.951f, 9.658f, 3.951f, 9.853f, 4.146f)
                curveTo(10.048f, 4.341f, 10.048f, 4.658f, 9.853f, 4.853f)
                close()
                moveTo(14f, 3.268f)
                verticalLineTo(11f)
                curveTo(14f, 12.657f, 12.657f, 14f, 11f, 14f)
                horizontalLineTo(3.268f)
                curveTo(3.614f, 14.598f, 4.26f, 15f, 5f, 15f)
                horizontalLineTo(11f)
                curveTo(13.209f, 15f, 15f, 13.209f, 15f, 11f)
                verticalLineTo(5f)
                curveTo(15f, 4.26f, 14.598f, 3.613f, 14f, 3.268f)
                close()
                moveTo(11f, 13f)
                horizontalLineTo(3f)
                curveTo(1.895f, 13f, 1f, 12.105f, 1f, 11f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(11f)
                curveTo(12.105f, 1f, 13f, 1.895f, 13f, 3f)
                verticalLineTo(11f)
                curveTo(13f, 12.105f, 12.105f, 13f, 11f, 13f)
                close()
                moveTo(3f, 12f)
                horizontalLineTo(11f)
                curveTo(11.552f, 12f, 12f, 11.552f, 12f, 11f)
                verticalLineTo(3f)
                curveTo(12f, 2.448f, 11.552f, 2f, 11f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(11f)
                curveTo(2f, 11.552f, 2.448f, 12f, 3f, 12f)
                close()
            }
        }.build()
        
        return _CloseAll!!
    }

private var _CloseAll: ImageVector? = null

