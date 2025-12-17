package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.More_time: ImageVector
    get() {
        if (_More_time != null) return _More_time!!
        
        _More_time = ImageVector.Builder(
            name = "more_time",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 464f)
                lineToRelative(100f, 100f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(412f, 508f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-159f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(144f)
                close()
                moveToRelative(240f, -224f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                verticalLineToRelative(-80f)
                close()
                moveTo(440f, 840f)
                quadToRelative(-75f, 0f, -140.5f, -28f)
                reflectiveQuadTo(185f, 735f)
                quadToRelative(-49f, -49f, -77f, -114.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -75f, 28f, -140.5f)
                reflectiveQuadTo(185f, 225f)
                quadToRelative(49f, -49f, 114.5f, -77f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(11f, 0f, 20.5f, 0.5f)
                reflectiveQuadTo(481f, 123f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(521f, 163f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(481f, 203f)
                quadToRelative(-11f, 0f, -20.5f, -1.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(-118f, 0f, -199f, 81f)
                reflectiveQuadToRelative(-81f, 199f)
                quadToRelative(0f, 118f, 81f, 199f)
                reflectiveQuadToRelative(199f, 81f)
                quadToRelative(118f, 0f, 199f, -81f)
                reflectiveQuadToRelative(81f, -199f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 75f, -28f, 140.5f)
                reflectiveQuadTo(695f, 735f)
                quadToRelative(-49f, 49f, -114.5f, 77f)
                reflectiveQuadTo(440f, 840f)
                close()
            }
        }.build()
        
        return _More_time!!
    }

private var _More_time: ImageVector? = null

