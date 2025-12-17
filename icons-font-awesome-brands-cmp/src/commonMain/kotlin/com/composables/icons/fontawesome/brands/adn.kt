package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Adn: ImageVector
    get() {
        if (_Adn != null) return _Adn!!
        
        _Adn = ImageVector.Builder(
            name = "adn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 167.5f)
                lineToRelative(64.9f, 98.8f)
                horizontalLineTo(183.1f)
                lineToRelative(64.9f, -98.8f)
                close()
                moveTo(496f, 256f)
                curveToRelative(0f, 136.9f, -111.1f, 248f, -248f, 248f)
                reflectiveCurveTo(0f, 392.9f, 0f, 256f)
                reflectiveCurveTo(111.1f, 8f, 248f, 8f)
                reflectiveCurveToRelative(248f, 111.1f, 248f, 248f)
                close()
                moveToRelative(-99.8f, 82.7f)
                lineTo(248f, 115.5f)
                lineTo(99.8f, 338.7f)
                horizontalLineToRelative(30.4f)
                lineToRelative(33.6f, -51.7f)
                horizontalLineToRelative(168.6f)
                lineToRelative(33.6f, 51.7f)
                horizontalLineToRelative(30.2f)
                close()
            }
        }.build()
        
        return _Adn!!
    }

private var _Adn: ImageVector? = null

