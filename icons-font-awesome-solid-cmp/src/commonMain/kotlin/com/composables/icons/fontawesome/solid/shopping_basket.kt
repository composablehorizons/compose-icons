package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShoppingBasket: ImageVector
    get() {
        if (_ShoppingBasket != null) return _ShoppingBasket!!
        
        _ShoppingBasket = ImageVector.Builder(
            name = "shopping-basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 216f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineToRelative(-8f)
                lineToRelative(-26.113f, 182.788f)
                curveTo(514.509f, 462.435f, 494.257f, 480f, 470.37f, 480f)
                horizontalLineTo(105.63f)
                curveToRelative(-23.887f, 0f, -44.139f, -17.565f, -47.518f, -41.212f)
                lineTo(32f, 256f)
                horizontalLineToRelative(-8f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(67.341f)
                lineToRelative(106.78f, -146.821f)
                curveToRelative(10.395f, -14.292f, 30.407f, -17.453f, 44.701f, -7.058f)
                curveToRelative(14.293f, 10.395f, 17.453f, 30.408f, 7.058f, 44.701f)
                lineTo(170.477f, 192f)
                horizontalLineToRelative(235.046f)
                lineTo(326.12f, 82.821f)
                curveToRelative(-10.395f, -14.292f, -7.234f, -34.306f, 7.059f, -44.701f)
                curveToRelative(14.291f, -10.395f, 34.306f, -7.235f, 44.701f, 7.058f)
                lineTo(484.659f, 192f)
                horizontalLineTo(552f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                close()
                moveTo(312f, 392f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.745f, -24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                close()
                moveToRelative(112f, 0f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.745f, -24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                close()
                moveToRelative(-224f, 0f)
                verticalLineTo(280f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.745f, -24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                close()
            }
        }.build()
        
        return _ShoppingBasket!!
    }

private var _ShoppingBasket: ImageVector? = null

