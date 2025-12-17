package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SortAlphaUpAlt: ImageVector
    get() {
        if (_SortAlphaUpAlt != null) return _SortAlphaUpAlt!!
        
        _SortAlphaUpAlt = ImageVector.Builder(
            name = "sort-alpha-up-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.96f, 7f)
                horizontalLineTo(9.028f)
                verticalLineToRelative(-0.691f)
                lineToRelative(2.579f, -3.72f)
                verticalLineToRelative(-0.054f)
                horizontalLineTo(9.098f)
                verticalLineToRelative(-0.867f)
                horizontalLineToRelative(3.785f)
                verticalLineToRelative(0.691f)
                lineToRelative(-2.567f, 3.72f)
                verticalLineToRelative(0.054f)
                horizontalLineToRelative(2.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.082f, 12.629f)
                lineTo(9.664f, 14f)
                horizontalLineTo(8.598f)
                lineToRelative(1.789f, -5.332f)
                horizontalLineToRelative(1.234f)
                lineTo(13.402f, 14f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(-0.419f, -1.371f)
                close()
                moveToRelative(1.57f, -0.785f)
                lineTo(11f, 9.688f)
                horizontalLineToRelative(-0.047f)
                lineToRelative(-0.652f, 2.156f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(3.707f)
                lineTo(2.354f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(2f, -1.999f)
                lineToRelative(0.007f, -0.007f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.7f, 0.006f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, 0.708f)
                lineTo(4.5f, 3.707f)
                close()
            }
        }.build()
        
        return _SortAlphaUpAlt!!
    }

private var _SortAlphaUpAlt: ImageVector? = null

