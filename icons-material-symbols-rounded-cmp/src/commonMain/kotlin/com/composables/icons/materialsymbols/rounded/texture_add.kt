package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Texture_add: ImageVector
    get() {
        if (_Texture_add != null) return _Texture_add!!
        
        _Texture_add = ImageVector.Builder(
            name = "texture_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 760f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(-549f, 69f)
                quadToRelative(-11f, -11f, -12f, -27f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(641f, -641f)
                quadToRelative(15f, -15f, 31f, -13f)
                reflectiveQuadToRelative(27f, 13f)
                quadToRelative(11f, 11f, 12f, 27f)
                reflectiveQuadToRelative(-14f, 30f)
                lineTo(187f, 829f)
                quadToRelative(-14f, 14f, -29.5f, 12.5f)
                reflectiveQuadTo(131f, 829f)
                close()
                moveToRelative(0f, -308f)
                quadToRelative(-11f, -11f, -12f, -27f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(332f, -332f)
                quadToRelative(14f, -14f, 29.5f, -12.5f)
                reflectiveQuadTo(520f, 132f)
                quadToRelative(11f, 11f, 12.5f, 26.5f)
                reflectiveQuadTo(520f, 188f)
                lineTo(187f, 521f)
                quadToRelative(-14f, 14f, -29.5f, 12.5f)
                reflectiveQuadTo(131f, 521f)
                close()
                moveToRelative(23f, -275f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-72f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(72f)
                quadToRelative(14f, 0f, 19f, 12f)
                reflectiveQuadToRelative(-5f, 22f)
                lineToRelative(-92f, 92f)
                close()
                moveToRelative(646f, 261f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(761f, 467f)
                quadToRelative(0f, -17f, 11f, -28f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 507f)
                close()
                moveTo(468f, 840f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(429f, 800f)
                quadToRelative(0f, -17f, 11f, -28f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(17f, 0f, 28.5f, 11f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(468f, 840f)
                close()
            }
        }.build()
        
        return _Texture_add!!
    }

private var _Texture_add: ImageVector? = null

