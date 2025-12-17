package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Apple: ImageVector
    get() {
        if (_Apple != null) return _Apple!!
        
        _Apple = ImageVector.Builder(
            name = "apple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318.7f, 268.7f)
                curveToRelative(-0.2f, -36.7f, 16.4f, -64.4f, 50f, -84.8f)
                curveToRelative(-18.8f, -26.9f, -47.2f, -41.7f, -84.7f, -44.6f)
                curveToRelative(-35.5f, -2.8f, -74.3f, 20.7f, -88.5f, 20.7f)
                curveToRelative(-15f, 0f, -49.4f, -19.7f, -76.4f, -19.7f)
                curveTo(63.3f, 141.2f, 4f, 184.8f, 4f, 273.5f)
                quadToRelative(0f, 39.3f, 14.4f, 81.2f)
                curveToRelative(12.8f, 36.7f, 59f, 126.7f, 107.2f, 125.2f)
                curveToRelative(25.2f, -0.6f, 43f, -17.9f, 75.8f, -17.9f)
                curveToRelative(31.8f, 0f, 48.3f, 17.9f, 76.4f, 17.9f)
                curveToRelative(48.6f, -0.7f, 90.4f, -82.5f, 102.6f, -119.3f)
                curveToRelative(-65.2f, -30.7f, -61.7f, -90f, -61.7f, -91.9f)
                close()
                moveToRelative(-56.6f, -164.2f)
                curveToRelative(27.3f, -32.4f, 24.8f, -61.9f, 24f, -72.5f)
                curveToRelative(-24.1f, 1.4f, -52f, 16.4f, -67.9f, 34.9f)
                curveToRelative(-17.5f, 19.8f, -27.8f, 44.3f, -25.6f, 71.9f)
                curveToRelative(26.1f, 2f, 49.9f, -11.4f, 69.5f, -34.3f)
                close()
            }
        }.build()
        
        return _Apple!!
    }

private var _Apple: ImageVector? = null

