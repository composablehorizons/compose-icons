package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Opera: ImageVector
    get() {
        if (_Opera != null) return _Opera!!
        
        _Opera = ImageVector.Builder(
            name = "opera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.9f, 32.7f)
                curveToRelative(-170.2f, 0f, -252.6f, 223.8f, -147.5f, 355.1f)
                curveToRelative(36.5f, 45.4f, 88.6f, 75.6f, 147.5f, 75.6f)
                curveToRelative(36.3f, 0f, 70.3f, -11.1f, 99.4f, -30.4f)
                curveToRelative(-43.8f, 39.2f, -101.9f, 63f, -165.3f, 63f)
                curveToRelative(-3.9f, 0f, -8f, 0f, -11.9f, -0.3f)
                curveTo(104.6f, 489.6f, 0f, 381.1f, 0f, 248f)
                curveTo(0f, 111f, 111f, 0f, 248f, 0f)
                horizontalLineToRelative(0.8f)
                curveToRelative(63.1f, 0.3f, 120.7f, 24.1f, 164.4f, 63.1f)
                curveToRelative(-29f, -19.4f, -63.1f, -30.4f, -99.3f, -30.4f)
                close()
                moveToRelative(101.8f, 397.7f)
                curveToRelative(-40.9f, 24.7f, -90.7f, 23.6f, -132f, -5.8f)
                curveToRelative(56.2f, -20.5f, 97.7f, -91.6f, 97.7f, -176.6f)
                curveToRelative(0f, -84.7f, -41.2f, -155.8f, -97.4f, -176.6f)
                curveToRelative(41.8f, -29.2f, 91.2f, -30.3f, 132.9f, -5f)
                curveToRelative(105.9f, 98.7f, 105.5f, 265.7f, -1.2f, 364f)
                close()
            }
        }.build()
        
        return _Opera!!
    }

private var _Opera: ImageVector? = null

