package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Shopping_basket: ImageVector
    get() {
        if (_Shopping_basket != null) return _Shopping_basket!!
        
        _Shopping_basket = ImageVector.Builder(
            name = "shopping_basket",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.21f, 9f)
                lineToRelative(-4.38f, -6.56f)
                curveToRelative(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f)
                curveToRelative(-0.32f, 0f, -0.64f, 0.14f, -0.83f, 0.43f)
                lineTo(6.79f, 9f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f)
                lineToRelative(2.54f, 9.27f)
                curveToRelative(0.23f, 0.84f, 1f, 1.46f, 1.92f, 1.46f)
                horizontalLineToRelative(13f)
                curveToRelative(0.92f, 0f, 1.69f, -0.62f, 1.93f, -1.46f)
                lineToRelative(2.54f, -9.27f)
                lineTo(23f, 10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.79f)
                close()
                moveTo(9f, 9f)
                lineToRelative(3f, -4.4f)
                lineTo(15f, 9f)
                horizontalLineTo(9f)
                close()
                moveToRelative(3f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.build()
        
        return _Shopping_basket!!
    }

private var _Shopping_basket: ImageVector? = null

