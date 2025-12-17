package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nutrition: ImageVector
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
                quadToRelative(-20f, -5f, -39f, -14.5f)
                reflectiveQuadTo(328f, 252f)
                quadToRelative(-33f, -33f, -42.5f, -78.5f)
                reflectiveQuadTo(281f, 81f)
                quadToRelative(47f, -5f, 92.5f, 4.5f)
                reflectiveQuadTo(452f, 128f)
                quadToRelative(23f, 23f, 33.5f, 52f)
                reflectiveQuadToRelative(13.5f, 61f)
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
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -200f)
                close()
            }
        }.build()
        
        return _Nutrition!!
    }

private var _Nutrition: ImageVector? = null

