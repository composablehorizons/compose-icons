package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Film: ImageVector
    get() {
        if (_Film != null) return _Film!!
        
        _Film = ImageVector.Builder(
            name = "film",
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
                horizontalLineToRelative(1.5f)
                curveTo(5.496f, 19.5f, 6f, 18.996f, 6f, 18.375f)
                moveToRelative(-3.75f, 0f)
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
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 18f, 18.375f)
                moveTo(20.625f, 4.5f)
                horizontalLineTo(3.375f)
                moveToRelative(17.25f, 0f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveTo(20.625f, 4.5f)
                horizontalLineToRelative(-1.5f)
                curveTo(18.504f, 4.5f, 18f, 5.004f, 18f, 5.625f)
                moveToRelative(3.75f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(3.375f, 4.5f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                moveTo(3.375f, 4.5f)
                horizontalLineToRelative(1.5f)
                curveTo(5.496f, 4.5f, 6f, 5.004f, 6f, 5.625f)
                moveToRelative(-3.75f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 0f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(1.5f, -3.75f)
                curveTo(5.496f, 8.25f, 6f, 7.746f, 6f, 7.125f)
                verticalLineToRelative(-1.5f)
                moveTo(4.875f, 8.25f)
                curveTo(5.496f, 8.25f, 6f, 8.754f, 6f, 9.375f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, -5.25f)
                verticalLineToRelative(5.25f)
                moveToRelative(0f, -5.25f)
                curveTo(6f, 5.004f, 6.504f, 4.5f, 7.125f, 4.5f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveToRelative(1.125f, 2.625f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 0f)
                arcTo(1.125f, 1.125f, 0f, false, true, 18f, 7.125f)
                verticalLineToRelative(-1.5f)
                moveToRelative(1.125f, 2.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                moveToRelative(2.625f, -2.625f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(18f, 5.625f)
                verticalLineToRelative(5.25f)
                moveTo(7.125f, 12f)
                horizontalLineToRelative(9.75f)
                moveToRelative(-9.75f, 0f)
                arcTo(1.125f, 1.125f, 0f, false, true, 6f, 10.875f)
                moveTo(7.125f, 12f)
                curveTo(6.504f, 12f, 6f, 12.504f, 6f, 13.125f)
                moveToRelative(0f, -2.25f)
                curveTo(6f, 11.496f, 5.496f, 12f, 4.875f, 12f)
                moveTo(18f, 10.875f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(18f, 10.875f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveToRelative(-2.25f, 0f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                moveToRelative(-12f, 5.25f)
                verticalLineToRelative(-5.25f)
                moveToRelative(0f, 5.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                moveToRelative(-12f, 0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                moveTo(18f, 18.375f)
                verticalLineToRelative(-5.25f)
                moveToRelative(0f, 5.25f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                moveTo(18f, 13.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveTo(18f, 13.125f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                moveTo(6f, 13.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveTo(6f, 13.125f)
                curveTo(6f, 12.504f, 5.496f, 12f, 4.875f, 12f)
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 0f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                moveTo(19.125f, 12f)
                horizontalLineToRelative(1.5f)
                moveToRelative(0f, 0f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                moveToRelative(-17.25f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(14.25f, 0f)
                horizontalLineToRelative(1.5f)
            }
        }.build()
        
        return _Film!!
    }

private var _Film: ImageVector? = null

