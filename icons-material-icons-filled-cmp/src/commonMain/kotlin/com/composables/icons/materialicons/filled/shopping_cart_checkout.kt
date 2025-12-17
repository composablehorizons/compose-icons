package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Shopping_cart_checkout: ImageVector
    get() {
        if (_Shopping_cart_checkout != null) return _Shopping_cart_checkout!!
        
        _Shopping_cart_checkout = ImageVector.Builder(
            name = "shopping_cart_checkout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 18f)
                    curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                    reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(8.1f, 18f, 7f, 18f)
                    close()
                    moveTo(17f, 18f)
                    curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                    reflectiveCurveToRelative(0.89f, 2f, 1.99f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(18.1f, 18f, 17f, 18f)
                    close()
                    moveTo(8.1f, 13f)
                    horizontalLineToRelative(7.45f)
                    curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                    lineTo(21f, 4.96f)
                    lineTo(19.25f, 4f)
                    lineToRelative(-3.7f, 7f)
                    horizontalLineTo(8.53f)
                    lineTo(4.27f, 2f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    lineToRelative(3.6f, 7.59f)
                    lineToRelative(-1.35f, 2.44f)
                    curveTo(4.52f, 15.37f, 5.48f, 17f, 7f, 17f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    lineTo(8.1f, 13f)
                    close()
                    moveTo(12f, 2f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(12.17f, 7f)
                    lineTo(8f, 7f)
                    lineToRelative(0f, -2f)
                    lineToRelative(4.17f, 0f)
                    lineToRelative(-1.59f, -1.59f)
                    lineTo(12f, 2f)
                    close()
                }
            }
        }.build()
        
        return _Shopping_cart_checkout!!
    }

private var _Shopping_cart_checkout: ImageVector? = null

