package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) return _ShoppingCart!!
        
        _ShoppingCart = ImageVector.Builder(
            name = "shopping-cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1.75f, 1f)
                horizontalLineToRelative(1.628f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, 1.734f, 1.51f)
                lineTo(5.18f, 3f)
                arcToRelative(65.25f, 65.25f, 0f, false, true, 13.36f, 1.412f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.58f, 0.875f)
                arcToRelative(48.645f, 48.645f, 0f, false, true, -1.618f, 6.2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.712f, 0.513f)
                horizontalLineTo(6f)
                arcToRelative(2.503f, 2.503f, 0f, false, false, -2.292f, 1.5f)
                horizontalLineTo(17.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.76f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.748f, -0.807f)
                arcToRelative(4.002f, 4.002f, 0f, false, true, 2.716f, -3.486f)
                lineTo(3.626f, 2.716f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.248f, -0.216f)
                horizontalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1f, 1.75f)
                close()
                moveTo(6f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                close()
                moveTo(15.5f, 19f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

