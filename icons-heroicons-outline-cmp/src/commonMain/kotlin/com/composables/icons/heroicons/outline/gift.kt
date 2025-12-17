package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(20.625f, 11.505f)
                verticalLineToRelative(8.25f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(4.875f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-8.25f)
                moveToRelative(8.25f, -6.375f)
                arcTo(2.625f, 2.625f, 0f, true, false, 9f, 7.755f)
                horizontalLineToRelative(2.625f)
                moveToRelative(0f, -2.625f)
                verticalLineToRelative(2.625f)
                moveToRelative(0f, -2.625f)
                arcToRelative(2.625f, 2.625f, 0f, true, true, 2.625f, 2.625f)
                horizontalLineToRelative(-2.625f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(13.5f)
                moveTo(3f, 11.505f)
                horizontalLineToRelative(18f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.622f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(3f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.503f, -1.125f, 1.125f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

