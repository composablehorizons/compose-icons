package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Remove_shopping_cart: ImageVector
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
                moveTo(0.71f, 1.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.68f, 3.68f)
                lineToRelative(2.21f, 4.66f)
                lineToRelative(-1.35f, 2.45f)
                curveToRelative(-0.19f, 0.33f, -0.28f, 0.73f, -0.24f, 1.15f)
                curveToRelative(0.1f, 1.06f, 1.06f, 1.82f, 2.12f, 1.82f)
                horizontalLineToRelative(7.33f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                curveToRelative(0.67f, 0f, 1.26f, -0.33f, 1.62f, -0.84f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(2.12f, 1.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(7f, 15f)
                lineToRelative(1.1f, -2f)
                horizontalLineToRelative(2.36f)
                lineToRelative(2f, 2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(9.05f, -2.06f)
                curveToRelative(0.54f, -0.14f, 0.99f, -0.49f, 1.25f, -0.97f)
                lineToRelative(3.58f, -6.49f)
                curveTo(21.25f, 4.82f, 20.76f, 4f, 20f, 4f)
                horizontalLineTo(7.12f)
                lineToRelative(8.93f, 8.94f)
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

