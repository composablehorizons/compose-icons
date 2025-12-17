package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffRenamed: ImageVector
    get() {
        if (_DiffRenamed != null) return _DiffRenamed!!
        
        _DiffRenamed = ImageVector.Builder(
            name = "diff-renamed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 14f, 14f, 12.881f, 14f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
                close()
                moveTo(13f, 11.5f)
                curveTo(13f, 12.328f, 12.328f, 13f, 11.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(10.854f, 7.646f)
                curveTo(11.049f, 7.841f, 11.049f, 8.158f, 10.854f, 8.353f)
                lineTo(8.854f, 10.353f)
                curveTo(8.756f, 10.451f, 8.628f, 10.499f, 8.5f, 10.499f)
                curveTo(8.372f, 10.499f, 8.244f, 10.45f, 8.146f, 10.353f)
                curveTo(7.951f, 10.158f, 7.951f, 9.841f, 8.146f, 9.646f)
                lineTo(9.292f, 8.5f)
                horizontalLineTo(5.499f)
                curveTo(5.223f, 8.5f, 4.999f, 8.276f, 4.999f, 8f)
                curveTo(4.999f, 7.724f, 5.223f, 7.5f, 5.499f, 7.5f)
                horizontalLineTo(9.292f)
                lineTo(8.146f, 6.354f)
                curveTo(7.951f, 6.159f, 7.951f, 5.842f, 8.146f, 5.647f)
                curveTo(8.341f, 5.452f, 8.658f, 5.452f, 8.853f, 5.647f)
                lineTo(10.853f, 7.647f)
                lineTo(10.854f, 7.646f)
                close()
            }
        }.build()
        
        return _DiffRenamed!!
    }

private var _DiffRenamed: ImageVector? = null

