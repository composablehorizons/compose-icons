package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Add_shopping_cart: ImageVector
    get() {
        if (_Add_shopping_cart != null) return _Add_shopping_cart!!
        
        _Add_shopping_cart = ImageVector.Builder(
            name = "add_shopping_cart",
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
                close()
                moveToRelative(18.31f, 6f)
                lineToRelative(-2.76f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-4f, 9f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(10f, 0f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 1.99f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-9.83f, -3.25f)
                lineToRelative(0.03f, -0.12f)
                lineToRelative(0.9f, -1.63f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.86f, -7.01f)
                lineTo(19.42f, 4f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-1.1f, 2f)
                lineToRelative(-2.76f, 5f)
                horizontalLineTo(8.53f)
                lineToRelative(-0.13f, -0.27f)
                lineTo(6.16f, 6f)
                lineToRelative(-0.95f, -2f)
                lineToRelative(-0.94f, -2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.45f)
                curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7.42f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.11f, -0.25f, -0.25f)
                close()
            }
        }.build()
        
        return _Add_shopping_cart!!
    }

private var _Add_shopping_cart: ImageVector? = null

