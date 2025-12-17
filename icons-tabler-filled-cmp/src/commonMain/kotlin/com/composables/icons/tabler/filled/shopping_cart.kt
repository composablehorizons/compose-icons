package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ShoppingCart: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1.068f)
                lineToRelative(13.071f, 0.935f)
                arcToRelative(1f, 1f, 0f, false, true, 0.929f, 1.024f)
                lineToRelative(-0.01f, 0.114f)
                lineToRelative(-1f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, -0.877f, 0.853f)
                lineToRelative(-0.113f, 0.006f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, true, true, -2.995f, 3.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                curveToRelative(0.017f, -0.288f, 0.074f, -0.564f, 0.166f, -0.824f)
                horizontalLineToRelative(-5.342f)
                arcToRelative(3f, 3f, 0f, true, true, -5.824f, 1.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-12.17f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(0f, 16f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
                moveToRelative(11f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

