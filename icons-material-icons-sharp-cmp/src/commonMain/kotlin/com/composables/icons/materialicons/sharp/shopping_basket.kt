package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shopping_basket: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.21f, 9f)
                lineToRelative(-4.39f, -6.57f)
                curveToRelative(-0.4f, -0.59f, -1.27f, -0.59f, -1.66f, 0f)
                lineTo(6.77f, 9f)
                horizontalLineTo(0.69f)
                lineTo(4f, 21f)
                horizontalLineToRelative(16.02f)
                lineToRelative(3.29f, -12f)
                horizontalLineToRelative(-6.1f)
                close()
                moveToRelative(-5.22f, -4.21f)
                lineTo(14.8f, 9f)
                horizontalLineTo(9.18f)
                lineToRelative(2.81f, -4.21f)
                close()
                moveTo(12f, 17f)
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

