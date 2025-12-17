package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Viadeo: ImageVector
    get() {
        if (_Viadeo != null) return _Viadeo!!
        
        _Viadeo = ImageVector.Builder(
            name = "viadeo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(276.2f, 150.5f)
                verticalLineToRelative(0.7f)
                curveTo(258.3f, 98.6f, 233.6f, 47.8f, 205.4f, 0f)
                curveToRelative(43.3f, 29.2f, 67f, 100f, 70.8f, 150.5f)
                close()
                moveToRelative(32.7f, 121.7f)
                curveToRelative(7.6f, 18.2f, 11f, 37.5f, 11f, 57f)
                curveToRelative(0f, 77.7f, -57.8f, 141f, -137.8f, 139.4f)
                lineToRelative(3.8f, -0.3f)
                curveToRelative(74.2f, -46.7f, 109.3f, -118.6f, 109.3f, -205.1f)
                curveToRelative(0f, -38.1f, -6.5f, -75.9f, -18.9f, -112f)
                curveToRelative(1f, 11.7f, 1f, 23.7f, 1f, 35.4f)
                curveToRelative(0f, 91.8f, -18.1f, 241.6f, -116.6f, 280f)
                curveTo(95f, 455.2f, 49.4f, 398f, 49.4f, 329.2f)
                curveToRelative(0f, -75.6f, 57.4f, -142.3f, 135.4f, -142.3f)
                curveToRelative(16.8f, 0f, 33.7f, 3.1f, 49.1f, 9.6f)
                curveToRelative(1.7f, -15.1f, 6.5f, -29.9f, 13.4f, -43.3f)
                curveToRelative(-19.9f, -7.2f, -41.2f, -10.7f, -62.5f, -10.7f)
                curveToRelative(-161.5f, 0f, -238.7f, 195.9f, -129.9f, 313.7f)
                curveToRelative(67.9f, 74.6f, 192f, 73.9f, 259.8f, 0f)
                curveToRelative(56.6f, -61.3f, 60.9f, -142.4f, 36.4f, -201f)
                curveToRelative(-12.7f, 8f, -27.1f, 13.9f, -42.2f, 17f)
                close()
                moveTo(418.1f, 11.7f)
                curveToRelative(-31f, 66.5f, -81.3f, 47.2f, -115.8f, 80.1f)
                curveToRelative(-12.4f, 12f, -20.6f, 34f, -20.6f, 50.5f)
                curveToRelative(0f, 14.1f, 4.5f, 27.1f, 12f, 38.8f)
                curveToRelative(47.4f, -11f, 98.3f, -46f, 118.2f, -90.7f)
                curveToRelative(-0.7f, 5.5f, -4.8f, 14.4f, -7.2f, 19.2f)
                curveToRelative(-20.3f, 35.7f, -64.6f, 65.6f, -99.7f, 84.9f)
                curveToRelative(14.8f, 14.4f, 33.7f, 25.8f, 55f, 25.8f)
                curveToRelative(79f, 0f, 110.1f, -134.6f, 58.1f, -208.6f)
                close()
            }
        }.build()
        
        return _Viadeo!!
    }

private var _Viadeo: ImageVector? = null

