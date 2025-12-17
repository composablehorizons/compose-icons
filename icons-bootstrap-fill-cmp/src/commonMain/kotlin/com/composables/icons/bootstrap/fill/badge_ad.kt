package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeAd: ImageVector
    get() {
        if (_BadgeAd != null) return _BadgeAd!!
        
        _BadgeAd = ImageVector.Builder(
            name = "badge-ad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.35f, 8.337f)
                curveToRelative(0f, -0.699f, -0.42f, -1.138f, -1.001f, -1.138f)
                curveToRelative(-0.584f, 0f, -0.954f, 0.444f, -0.954f, 1.239f)
                verticalLineToRelative(0.453f)
                curveToRelative(0f, 0.8f, 0.374f, 1.248f, 0.972f, 1.248f)
                curveToRelative(0.588f, 0f, 0.984f, -0.44f, 0.984f, -1.2f)
                close()
                moveToRelative(-5.413f, 0.237f)
                lineToRelative(-0.734f, -2.426f)
                horizontalLineTo(5.15f)
                lineToRelative(-0.734f, 2.426f)
                horizontalLineToRelative(1.52f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(6.209f, 6.32f)
                curveToRelative(0f, -1.28f, 0.694f, -2.044f, 1.753f, -2.044f)
                curveToRelative(0.655f, 0f, 1.156f, 0.294f, 1.336f, 0.769f)
                horizontalLineToRelative(0.053f)
                verticalLineToRelative(-2.36f)
                horizontalLineToRelative(1.16f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1.138f)
                verticalLineToRelative(-0.747f)
                horizontalLineToRelative(-0.057f)
                curveToRelative(-0.145f, 0.474f, -0.69f, 0.804f, -1.367f, 0.804f)
                curveToRelative(-1.055f, 0f, -1.74f, -0.764f, -1.74f, -2.043f)
                verticalLineToRelative(-0.695f)
                close()
                moveToRelative(-4.04f, 1.138f)
                lineTo(3.7f, 11f)
                horizontalLineTo(2.5f)
                lineToRelative(2.013f, -5.999f)
                horizontalLineTo(5.9f)
                lineTo(7.905f, 11f)
                horizontalLineTo(6.644f)
                lineToRelative(-0.47f, -1.542f)
                horizontalLineTo(4.17f)
                close()
            }
        }.build()
        
        return _BadgeAd!!
    }

private var _BadgeAd: ImageVector? = null

