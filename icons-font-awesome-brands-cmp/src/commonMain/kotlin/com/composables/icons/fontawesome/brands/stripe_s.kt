package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.StripeS: ImageVector
    get() {
        if (_StripeS != null) return _StripeS!!
        
        _StripeS = ImageVector.Builder(
            name = "stripe-s",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(155.3f, 154.6f)
                curveToRelative(0f, -22.3f, 18.6f, -30.9f, 48.4f, -30.9f)
                curveToRelative(43.4f, 0f, 98.5f, 13.3f, 141.9f, 36.7f)
                verticalLineTo(26.1f)
                curveTo(298.3f, 7.2f, 251.1f, 0f, 203.8f, 0f)
                curveTo(88.1f, 0f, 11f, 60.4f, 11f, 161.4f)
                curveToRelative(0f, 157.9f, 216.8f, 132.3f, 216.8f, 200.4f)
                curveToRelative(0f, 26.4f, -22.9f, 34.9f, -54.7f, 34.9f)
                curveToRelative(-47.2f, 0f, -108.2f, -19.5f, -156.1f, -45.5f)
                verticalLineToRelative(128.5f)
                arcToRelative(396.09f, 396.09f, 0f, false, false, 156f, 32.4f)
                curveToRelative(118.6f, 0f, 200.3f, -51f, 200.3f, -153.6f)
                curveToRelative(0f, -170.2f, -218f, -139.7f, -218f, -203.9f)
                close()
            }
        }.build()
        
        return _StripeS!!
    }

private var _StripeS: ImageVector? = null

