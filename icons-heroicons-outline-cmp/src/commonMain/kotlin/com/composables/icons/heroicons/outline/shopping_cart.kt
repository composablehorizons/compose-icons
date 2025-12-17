package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) return _ShoppingCart!!
        
        _ShoppingCart = ImageVector.Builder(
            name = "shopping-cart",
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
                moveTo(2.25f, 3f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.51f, 0f, 0.955f, 0.343f, 1.087f, 0.835f)
                lineToRelative(0.383f, 1.437f)
                moveTo(7.5f, 14.25f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                horizontalLineToRelative(15.75f)
                moveToRelative(-12.75f, -3f)
                horizontalLineToRelative(11.218f)
                curveToRelative(1.121f, -2.3f, 2.1f, -4.684f, 2.924f, -7.138f)
                arcToRelative(60.114f, 60.114f, 0f, false, false, -16.536f, -1.84f)
                moveTo(7.5f, 14.25f)
                lineTo(5.106f, 5.272f)
                moveTo(6f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
                moveToRelative(12.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

