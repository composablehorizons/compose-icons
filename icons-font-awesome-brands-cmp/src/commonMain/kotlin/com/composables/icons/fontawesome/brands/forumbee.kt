package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Forumbee: ImageVector
    get() {
        if (_Forumbee != null) return _Forumbee!!
        
        _Forumbee = ImageVector.Builder(
            name = "forumbee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.8f, 309.7f)
                curveTo(2f, 292.7f, 0f, 275.5f, 0f, 258.3f)
                curveTo(0f, 135f, 99.8f, 35f, 223.1f, 35f)
                curveToRelative(16.6f, 0f, 33.3f, 2f, 49.3f, 5.5f)
                curveTo(149f, 87.5f, 51.9f, 186f, 5.8f, 309.7f)
                close()
                moveToRelative(392.9f, -189.2f)
                curveTo(385f, 103f, 369f, 87.8f, 350.9f, 75.2f)
                curveToRelative(-149.6f, 44.3f, -266.3f, 162.1f, -309.7f, 312f)
                curveToRelative(12.5f, 18.1f, 28f, 35.6f, 45.2f, 49f)
                curveToRelative(43.1f, -151.3f, 161.2f, -271.7f, 312.3f, -315.7f)
                close()
                moveToRelative(15.8f, 252.7f)
                curveToRelative(15.2f, -25.1f, 25.4f, -53.7f, 29.5f, -82.8f)
                curveToRelative(-79.4f, 42.9f, -145f, 110.6f, -187.6f, 190.3f)
                curveToRelative(30f, -4.4f, 58.9f, -15.3f, 84.6f, -31.3f)
                curveToRelative(35f, 13.1f, 70.9f, 24.3f, 107f, 33.6f)
                curveToRelative(-9.3f, -36.5f, -20.4f, -74.5f, -33.5f, -109.8f)
                close()
                moveToRelative(29.7f, -145.5f)
                curveToRelative(-2.6f, -19.5f, -7.9f, -38.7f, -15.8f, -56.8f)
                curveTo(290.5f, 216.7f, 182f, 327.5f, 137.1f, 466f)
                curveToRelative(18.1f, 7.6f, 37f, 12.5f, 56.6f, 15.2f)
                curveTo(240f, 367.1f, 330.5f, 274.4f, 444.2f, 227.7f)
                close()
            }
        }.build()
        
        return _Forumbee!!
    }

private var _Forumbee: ImageVector? = null

