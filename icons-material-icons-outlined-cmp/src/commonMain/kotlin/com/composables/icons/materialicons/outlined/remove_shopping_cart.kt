package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Remove_shopping_cart: ImageVector
    get() {
        if (_Remove_shopping_cart != null) return _Remove_shopping_cart!!
        
        _Remove_shopping_cart = ImageVector.Builder(
            name = "remove_shopping_cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.41f, 1.13f)
                lineTo(0f, 2.54f)
                lineToRelative(4.39f, 4.39f)
                lineToRelative(2.21f, 4.66f)
                lineToRelative(-1.35f, 2.45f)
                curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                curveToRelative(0.67f, 0f, 1.26f, -0.33f, 1.62f, -0.84f)
                lineTo(21.46f, 24f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.13f)
                close()
                moveTo(7f, 15f)
                lineToRelative(1.1f, -2f)
                horizontalLineToRelative(2.36f)
                lineToRelative(2f, 2f)
                horizontalLineTo(7f)
                close()
                moveTo(20f, 4f)
                horizontalLineTo(7.12f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(9.19f)
                lineToRelative(-2.76f, 5f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.54f, -0.14f, 0.99f, -0.49f, 1.25f, -0.97f)
                lineToRelative(3.58f, -6.49f)
                curveTo(21.25f, 4.82f, 20.76f, 4f, 20f, 4f)
                close()
                moveTo(7f, 18f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Remove_shopping_cart!!
    }

private var _Remove_shopping_cart: ImageVector? = null

