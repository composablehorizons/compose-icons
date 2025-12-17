package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nutrition: ImageVector
    get() {
        if (_Nutrition != null) return _Nutrition!!
        
        _Nutrition = ImageVector.Builder(
            name = "nutrition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -94f, 55.5f, -168.5f)
                reflectiveQuadTo(401f, 291f)
                quadToRelative(-33f, -8f, -57.5f, -28.5f)
                reflectiveQuadTo(304f, 213f)
                quadToRelative(-15f, -29f, -21f, -63f)
                reflectiveQuadToRelative(-2f, -69f)
                quadToRelative(41f, -5f, 78f, 5f)
                reflectiveQuadToRelative(67f, 32f)
                quadToRelative(30f, 22f, 49.5f, 53f)
                reflectiveQuadToRelative(23.5f, 70f)
                quadToRelative(13f, -31f, 31.5f, -58.5f)
                reflectiveQuadTo(572f, 132f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-22f, 22f, -39f, 48.5f)
                reflectiveQuadTo(564f, 293f)
                quadToRelative(88f, 28f, 142f, 101.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Nutrition!!
    }

private var _Nutrition: ImageVector? = null

