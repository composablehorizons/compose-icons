package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Watch_button_press: ImageVector
    get() {
        if (_Watch_button_press != null) return _Watch_button_press!!
        
        _Watch_button_press = ImageVector.Builder(
            name = "watch_button_press",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 480f)
                close()
                moveTo(340f, 880f)
                quadToRelative(-26f, 0f, -47.5f, -15.5f)
                reflectiveQuadTo(263f, 823f)
                lineToRelative(-37f, -125f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -123f)
                quadToRelative(0f, -66f, 29f, -123f)
                reflectiveQuadToRelative(77f, -95f)
                lineToRelative(37f, -125f)
                quadToRelative(8f, -26f, 29.5f, -41.5f)
                reflectiveQuadTo(340f, 80f)
                horizontalLineToRelative(120f)
                quadToRelative(26f, 0f, 47.5f, 15.5f)
                reflectiveQuadTo(537f, 137f)
                lineToRelative(37f, 125f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 123f)
                quadToRelative(0f, 66f, -29f, 123f)
                reflectiveQuadToRelative(-77f, 95f)
                lineToRelative(-37f, 125f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(460f, 880f)
                horizontalLineTo(340f)
                close()
                moveToRelative(60f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(400f, 680f)
                close()
            }
        }.build()
        
        return _Watch_button_press!!
    }

private var _Watch_button_press: ImageVector? = null

