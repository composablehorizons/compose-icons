package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.TableCells: ImageVector
    get() {
        if (_TableCells != null) return _TableCells!!
        
        _TableCells = ImageVector.Builder(
            name = "table-cells",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.99f, 5.24f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 3f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 5.25f)
                lineToRelative(0.01f, 9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.76f, 17f)
                horizontalLineTo(3.26f)
                arcTo(2.267f, 2.267f, 0f, false, true, 1f, 14.74f)
                lineToRelative(-0.01f, -9.5f)
                close()
                moveToRelative(8.26f, 9.52f)
                verticalLineToRelative(-0.625f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.615f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.373f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.627f, -0.74f)
                close()
                moveToRelative(1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.627f, 0.74f)
                horizontalLineToRelative(5.373f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.615f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.625f)
                close()
                moveToRelative(6.75f, -3.63f)
                verticalLineToRelative(-0.625f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.625f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
                moveToRelative(-8.25f, 0f)
                verticalLineToRelative(-0.625f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.625f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
                moveTo(17.5f, 7.5f)
                verticalLineToRelative(-0.625f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(7.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
                moveToRelative(-8.25f, 0f)
                verticalLineToRelative(-0.625f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(7.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _TableCells!!
    }

private var _TableCells: ImageVector? = null

