package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.TableCells: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.375f, 19.5f)
                horizontalLineToRelative(17.25f)
                moveToRelative(-17.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                moveTo(3.375f, 19.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                moveToRelative(-9.75f, 0f)
                verticalLineTo(5.625f)
                moveToRelative(0f, 12.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                moveToRelative(18.375f, 2.625f)
                verticalLineTo(5.625f)
                moveToRelative(0f, 12.75f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveToRelative(1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                moveToRelative(0f, 3.75f)
                horizontalLineToRelative(-7.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 12f, 18.375f)
                moveToRelative(9.75f, -12.75f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3.375f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                moveToRelative(19.5f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(2.25f, 5.625f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(17.25f)
                moveToRelative(-17.25f, 0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveTo(3.375f, 8.25f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(17.25f, -3.75f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                moveToRelative(8.625f, -1.125f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveToRelative(-17.25f, 0f)
                horizontalLineToRelative(7.5f)
                moveToRelative(-7.5f, 0f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveTo(12f, 10.875f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(12f, 10.875f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(-2.25f, 0f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveTo(13.125f, 12f)
                horizontalLineToRelative(7.5f)
                moveToRelative(-7.5f, 0f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                moveTo(20.625f, 12f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveToRelative(-17.25f, 0f)
                horizontalLineToRelative(7.5f)
                moveTo(12f, 14.625f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(12f, 14.625f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(-2.25f, 0f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveToRelative(0f, 1.5f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 0f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(7.5f)
            }
        }.build()
        
        return _TableCells!!
    }

private var _TableCells: ImageVector? = null

