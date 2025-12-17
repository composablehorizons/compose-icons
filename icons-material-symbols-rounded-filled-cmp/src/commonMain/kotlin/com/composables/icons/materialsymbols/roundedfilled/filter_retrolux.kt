package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Filter_retrolux: ImageVector
    get() {
        if (_Filter_retrolux != null) return _Filter_retrolux!!
        
        _Filter_retrolux = ImageVector.Builder(
            name = "filter_retrolux",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(573f, 848f)
                lineToRelative(-61f, -62f)
                quadToRelative(-17f, 42f, -52.5f, 68f)
                reflectiveQuadTo(380f, 880f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(240f, 740f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(14f, 0f, 28f, 2f)
                reflectiveQuadToRelative(26f, 8f)
                lineTo(258f, 347f)
                quadToRelative(-8f, -12f, -6.5f, -26f)
                reflectiveQuadToRelative(11.5f, -24f)
                lineToRelative(189f, -189f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(189f, 189f)
                quadToRelative(10f, 10f, 11.5f, 24f)
                reflectiveQuadToRelative(-6.5f, 26f)
                lineTo(520f, 620f)
                verticalLineToRelative(62f)
                lineToRelative(110f, 110f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(631f, 848f)
                quadToRelative(-12f, 12f, -29f, 12f)
                reflectiveQuadToRelative(-29f, -12f)
                close()
                moveToRelative(-193f, -48f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 740f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 680f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 800f)
                close()
            }
        }.build()
        
        return _Filter_retrolux!!
    }

private var _Filter_retrolux: ImageVector? = null

