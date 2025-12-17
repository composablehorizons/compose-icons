package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Emoticon: ImageVector
    get() {
        if (_Emoticon != null) return _Emoticon!!
        
        _Emoticon = ImageVector.Builder(
            name = "emoticon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 680f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(320f, 620f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(260f, 680f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -25f, 17f, -42.5f)
                reflectiveQuadToRelative(43f, -17.5f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(320f, 340f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(260f, 400f)
                close()
                moveToRelative(180f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -40f)
                quadToRelative(0f, -54f, -14.5f, -104f)
                reflectiveQuadTo(623f, 284f)
                quadToRelative(-9f, -14f, -8f, -31f)
                reflectiveQuadToRelative(14f, -28f)
                quadToRelative(13f, -11f, 29f, -8.5f)
                reflectiveQuadToRelative(26f, 16.5f)
                quadToRelative(36f, 53f, 56f, 115.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 56f, -13.5f, 107f)
                reflectiveQuadTo(709f, 684f)
                quadToRelative(-8f, 15f, -24f, 19f)
                reflectiveQuadToRelative(-30f, -5f)
                quadToRelative(-14f, -9f, -17.5f, -25.5f)
                reflectiveQuadTo(642f, 641f)
                quadToRelative(18f, -37f, 28f, -77f)
                reflectiveQuadToRelative(10f, -84f)
                close()
            }
        }.build()
        
        return _Emoticon!!
    }

private var _Emoticon: ImageVector? = null

