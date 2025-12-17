package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Skype: ImageVector
    get() {
        if (_Skype != null) return _Skype!!
        
        _Skype = ImageVector.Builder(
            name = "skype",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(424.7f, 299.8f)
                curveToRelative(2.9f, -14f, 4.7f, -28.9f, 4.7f, -43.8f)
                curveToRelative(0f, -113.5f, -91.9f, -205.3f, -205.3f, -205.3f)
                curveToRelative(-14.9f, 0f, -29.7f, 1.7f, -43.8f, 4.7f)
                curveTo(161.3f, 40.7f, 137.7f, 32f, 112f, 32f)
                curveTo(50.2f, 32f, 0f, 82.2f, 0f, 144f)
                curveToRelative(0f, 25.7f, 8.7f, 49.3f, 23.3f, 68.2f)
                curveToRelative(-2.9f, 14f, -4.7f, 28.9f, -4.7f, 43.8f)
                curveToRelative(0f, 113.5f, 91.9f, 205.3f, 205.3f, 205.3f)
                curveToRelative(14.9f, 0f, 29.7f, -1.7f, 43.8f, -4.7f)
                curveToRelative(19f, 14.6f, 42.6f, 23.3f, 68.2f, 23.3f)
                curveToRelative(61.8f, 0f, 112f, -50.2f, 112f, -112f)
                curveToRelative(0.1f, -25.6f, -8.6f, -49.2f, -23.2f, -68.1f)
                close()
                moveToRelative(-194.6f, 91.5f)
                curveToRelative(-65.6f, 0f, -120.5f, -29.2f, -120.5f, -65f)
                curveToRelative(0f, -16f, 9f, -30.6f, 29.5f, -30.6f)
                curveToRelative(31.2f, 0f, 34.1f, 44.9f, 88.1f, 44.9f)
                curveToRelative(25.7f, 0f, 42.3f, -11.4f, 42.3f, -26.3f)
                curveToRelative(0f, -18.7f, -16f, -21.6f, -42f, -28f)
                curveToRelative(-62.5f, -15.4f, -117.8f, -22f, -117.8f, -87.2f)
                curveToRelative(0f, -59.2f, 58.6f, -81.1f, 109.1f, -81.1f)
                curveToRelative(55.1f, 0f, 110.8f, 21.9f, 110.8f, 55.4f)
                curveToRelative(0f, 16.9f, -11.4f, 31.8f, -30.3f, 31.8f)
                curveToRelative(-28.3f, 0f, -29.2f, -33.5f, -75f, -33.5f)
                curveToRelative(-25.7f, 0f, -42f, 7f, -42f, 22.5f)
                curveToRelative(0f, 19.8f, 20.8f, 21.8f, 69.1f, 33f)
                curveToRelative(41.4f, 9.3f, 90.7f, 26.8f, 90.7f, 77.6f)
                curveToRelative(0f, 59.1f, -57.1f, 86.5f, -112f, 86.5f)
                close()
            }
        }.build()
        
        return _Skype!!
    }

private var _Skype: ImageVector? = null

