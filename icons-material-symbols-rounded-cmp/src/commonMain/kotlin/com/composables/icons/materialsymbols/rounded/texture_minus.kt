package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Texture_minus: ImageVector
    get() {
        if (_Texture_minus != null) return _Texture_minus!!
        
        _Texture_minus = ImageVector.Builder(
            name = "texture_minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(131f, 829f)
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
                moveToRelative(469f, -69f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineTo(600f)
                close()
                moveTo(131f, 521f)
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
                moveToRelative(605f, 67f)
                quadToRelative(-14f, 14f, -29.5f, 12.5f)
                reflectiveQuadTo(680f, 588f)
                quadToRelative(-11f, -11f, -12.5f, -26.5f)
                reflectiveQuadTo(680f, 532f)
                lineToRelative(93f, -93f)
                quadToRelative(14f, -14f, 29f, -12f)
                reflectiveQuadToRelative(26f, 13f)
                quadToRelative(11f, 11f, 12.5f, 26.5f)
                reflectiveQuadTo(828f, 496f)
                lineToRelative(-92f, 92f)
                close()
                moveTo(154f, 246f)
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
                moveToRelative(314f, 594f)
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
        
        return _Texture_minus!!
    }

private var _Texture_minus: ImageVector? = null

