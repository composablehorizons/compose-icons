package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shopping_cart_checkout: ImageVector
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
                    moveTo(19f, 16f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(7f)
                    lineToRelative(1.1f, -2f)
                    horizontalLineToRelative(7.45f)
                    curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                    lineToRelative(3.24f, -6.14f)
                    curveToRelative(0.25f, -0.48f, 0.08f, -1.08f, -0.4f, -1.34f)
                    curveToRelative(-0.49f, -0.27f, -1.1f, -0.08f, -1.36f, 0.41f)
                    lineTo(15.55f, 11f)
                    horizontalLineTo(8.53f)
                    lineTo(4.54f, 2.57f)
                    curveTo(4.38f, 2.22f, 4.02f, 2f, 3.64f, 2f)
                    horizontalLineTo(2f)
                    curveTo(1.45f, 2f, 1f, 2.45f, 1f, 3f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    lineToRelative(3.6f, 7.59f)
                    lineToRelative(-1.35f, 2.44f)
                    curveTo(4.52f, 15.37f, 5.48f, 17f, 7f, 17f)
                    horizontalLineToRelative(11f)
                    curveTo(18.55f, 17f, 19f, 16.55f, 19f, 16f)
                    close()
                    moveTo(11.29f, 2.71f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(2.59f, 2.59f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-2.59f, 2.59f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(12.17f, 7f)
                    lineTo(9f, 7f)
                    curveTo(8.45f, 7f, 8f, 6.55f, 8f, 6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    lineToRelative(3.17f, 0f)
                    lineToRelative(-0.88f, -0.88f)
                    curveTo(10.9f, 3.73f, 10.9f, 3.1f, 11.29f, 2.71f)
                    close()
                }
            }
        }.build()
        
        return _Shopping_cart_checkout!!
    }

private var _Shopping_cart_checkout: ImageVector? = null

