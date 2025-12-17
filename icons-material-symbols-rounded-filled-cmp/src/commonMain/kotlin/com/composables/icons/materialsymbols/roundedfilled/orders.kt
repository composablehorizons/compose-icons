package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Orders: ImageVector
    get() {
        if (_Orders != null) return _Orders!!
        
        _Orders = ImageVector.Builder(
            name = "orders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-436f)
                lineTo(98f, 150f)
                quadToRelative(-7f, -15f, -1f, -30.5f)
                reflectiveQuadToRelative(21f, -22.5f)
                quadToRelative(15f, -7f, 30.5f, -1.5f)
                reflectiveQuadTo(171f, 116f)
                lineToRelative(77f, 166f)
                horizontalLineToRelative(464f)
                lineToRelative(77f, -166f)
                quadToRelative(7f, -15f, 22.5f, -21f)
                reflectiveQuadToRelative(30.5f, 2f)
                quadToRelative(15f, 7f, 21f, 22.5f)
                reflectiveQuadToRelative(-1f, 30.5f)
                lineToRelative(-62f, 134f)
                verticalLineToRelative(436f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                close()
                moveToRelative(240f, -200f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
            }
        }.build()
        
        return _Orders!!
    }

private var _Orders: ImageVector? = null

