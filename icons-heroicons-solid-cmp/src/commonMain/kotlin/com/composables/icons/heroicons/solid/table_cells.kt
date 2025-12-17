package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.TableCells: ImageVector
    get() {
        if (_TableCells != null) return _TableCells!!
        
        _TableCells = ImageVector.Builder(
            name = "table-cells",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 5.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(12.75f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(3.375f)
                arcTo(1.875f, 1.875f, 0f, false, true, 1.5f, 18.375f)
                verticalLineTo(5.625f)
                close()
                moveTo(21f, 9.375f)
                arcTo(0.375f, 0.375f, 0f, false, false, 20.625f, 9f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveToRelative(0f, 3.75f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveToRelative(0f, 3.75f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(10.875f, 18.75f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(3.375f, 15f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, -0.375f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.375f, 0.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                close()
                moveToRelative(0f, -3.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, 0.375f, -0.375f)
                verticalLineToRelative(-1.5f)
                arcTo(0.375f, 0.375f, 0f, false, false, 10.875f, 9f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.375f, 0.375f, 0f, false, false, 3f, 9.375f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                close()
            }
        }.build()
        
        return _TableCells!!
    }

private var _TableCells: ImageVector? = null

