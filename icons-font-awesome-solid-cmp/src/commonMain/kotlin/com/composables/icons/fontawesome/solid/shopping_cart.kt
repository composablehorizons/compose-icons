package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) return _ShoppingCart!!
        
        _ShoppingCart = ImageVector.Builder(
            name = "shopping-cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528.12f, 301.319f)
                lineToRelative(47.273f, -208f)
                curveTo(578.806f, 78.301f, 567.391f, 64f, 551.99f, 64f)
                horizontalLineTo(159.208f)
                lineToRelative(-9.166f, -44.81f)
                curveTo(147.758f, 8.021f, 137.93f, 0f, 126.529f, 0f)
                horizontalLineTo(24f)
                curveTo(10.745f, 0f, 0f, 10.745f, 0f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(69.883f)
                lineToRelative(70.248f, 343.435f)
                curveTo(147.325f, 417.1f, 136f, 435.222f, 136f, 456f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                reflectiveCurveToRelative(56f, -25.072f, 56f, -56f)
                curveToRelative(0f, -15.674f, -6.447f, -29.835f, -16.824f, -40f)
                horizontalLineToRelative(209.647f)
                curveTo(430.447f, 426.165f, 424f, 440.326f, 424f, 456f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                reflectiveCurveToRelative(56f, -25.072f, 56f, -56f)
                curveToRelative(0f, -22.172f, -12.888f, -41.332f, -31.579f, -50.405f)
                lineToRelative(5.517f, -24.276f)
                curveToRelative(3.413f, -15.018f, -8.002f, -29.319f, -23.403f, -29.319f)
                horizontalLineTo(218.117f)
                lineToRelative(-6.545f, -32f)
                horizontalLineToRelative(293.145f)
                curveToRelative(11.206f, 0f, 20.92f, -7.754f, 23.403f, -18.681f)
                close()
            }
        }.build()
        
        return _ShoppingCart!!
    }

private var _ShoppingCart: ImageVector? = null

