package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Price_check: ImageVector
    get() {
        if (_Price_check != null) return _Price_check!!
        
        _Price_check = ImageVector.Builder(
            name = "price_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(558f, 727f)
                lineToRelative(198f, -198f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(586f, 811f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(416f, 697f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                close()
                moveTo(260f, 559f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 519f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 479f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 359f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 159f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 119f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(340f, 159f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 199f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 239f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 359f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 559f)
                horizontalLineToRelative(-60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(300f, 599f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(260f, 559f)
                close()
            }
        }.build()
        
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null

