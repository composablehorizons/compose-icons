package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hail: ImageVector
    get() {
        if (_Hail != null) return _Hail!!
        
        _Hail = ImageVector.Builder(
            name = "hail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 680f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 880f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-436f)
                quadToRelative(-42f, 14f, -58.5f, 49f)
                reflectiveQuadTo(281f, 529f)
                quadToRelative(-2f, 14f, -14f, 22.5f)
                reflectiveQuadToRelative(-27f, 8.5f)
                quadToRelative(-16f, 0f, -28f, -10f)
                reflectiveQuadToRelative(-10f, -25f)
                quadToRelative(11f, -113f, 84f, -179f)
                reflectiveQuadToRelative(194f, -66f)
                quadToRelative(90f, 0f, 139.5f, -40.5f)
                reflectiveQuadTo(678f, 118f)
                quadToRelative(2f, -17f, 13.5f, -27.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(9.5f, 27f)
                quadToRelative(-8f, 75f, -45.5f, 133.5f)
                reflectiveQuadTo(600f, 336f)
                verticalLineToRelative(504f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 840f)
                close()
                moveToRelative(120f, -600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Hail!!
    }

private var _Hail: ImageVector? = null

