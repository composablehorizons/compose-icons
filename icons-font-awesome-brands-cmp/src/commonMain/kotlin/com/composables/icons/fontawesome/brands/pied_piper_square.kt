package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.PiedPiperSquare: ImageVector
    get() {
        if (_PiedPiperSquare != null) return _PiedPiperSquare!!
        
        _PiedPiperSquare = ImageVector.Builder(
            name = "pied-piper-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 419f)
                lineTo(0f, 479.2f)
                lineToRelative(0.8f, -328f)
                curveTo(0.8f, 85.3f, 54f, 32f, 120f, 32f)
                horizontalLineToRelative(327.2f)
                curveToRelative(-93f, 28.9f, -189.9f, 94.2f, -253.9f, 168.6f)
                curveTo(122.7f, 282f, 82.6f, 338f, 32f, 419f)
                moveTo(448f, 32f)
                reflectiveCurveTo(305.2f, 98.8f, 261.6f, 199.1f)
                curveToRelative(-23.2f, 53.6f, -28.9f, 118.1f, -71f, 158.6f)
                curveToRelative(-28.9f, 27.8f, -69.8f, 38.2f, -105.3f, 56.3f)
                curveToRelative(-23.2f, 12f, -66.4f, 40.5f, -84.9f, 66f)
                horizontalLineToRelative(328.4f)
                curveToRelative(66f, 0f, 119.3f, -53.3f, 119.3f, -119.2f)
                curveToRelative(-0.1f, 0f, -0.1f, -328.8f, -0.1f, -328.8f)
                close()
            }
        }.build()
        
        return _PiedPiperSquare!!
    }

private var _PiedPiperSquare: ImageVector? = null

