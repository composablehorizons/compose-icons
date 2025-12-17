package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) return _ShoppingBag!!
        
        _ShoppingBag = ImageVector.Builder(
            name = "shopping-bag",
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
                moveTo(15.75f, 10.5f)
                verticalLineTo(6f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, -7.5f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(11.356f, -1.993f)
                lineToRelative(1.263f, 12f)
                curveToRelative(0.07f, 0.665f, -0.45f, 1.243f, -1.119f, 1.243f)
                horizontalLineTo(4.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.12f, -1.243f)
                lineToRelative(1.264f, -12f)
                arcTo(1.125f, 1.125f, 0f, false, true, 5.513f, 7.5f)
                horizontalLineToRelative(12.974f)
                curveToRelative(0.576f, 0f, 1.059f, 0.435f, 1.119f, 1.007f)
                close()
                moveTo(8.625f, 10.5f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
                moveToRelative(7.5f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.75f, 0f)
                close()
            }
        }.build()
        
        return _ShoppingBag!!
    }

private var _ShoppingBag: ImageVector? = null

