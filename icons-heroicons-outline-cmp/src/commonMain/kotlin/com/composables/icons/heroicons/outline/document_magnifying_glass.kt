package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_DocumentMagnifyingGlass != null) return _DocumentMagnifyingGlass!!
        
        _DocumentMagnifyingGlass = ImageVector.Builder(
            name = "document-magnifying-glass",
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
                moveTo(19.5f, 14.25f)
                verticalLineToRelative(-2.625f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 13.5f, 7.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineTo(8.25f)
                moveToRelative(5.231f, 13.481f)
                lineTo(15f, 17.25f)
                moveToRelative(-4.5f, -15f)
                horizontalLineTo(5.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                close()
                moveToRelative(3.75f, 11.625f)
                arcToRelative(2.625f, 2.625f, 0f, true, true, -5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, false, true, 5.25f, 0f)
                close()
            }
        }.build()
        
        return _DocumentMagnifyingGlass!!
    }

private var _DocumentMagnifyingGlass: ImageVector? = null

