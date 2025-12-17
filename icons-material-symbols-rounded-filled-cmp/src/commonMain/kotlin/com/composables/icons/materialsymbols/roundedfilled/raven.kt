package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Raven: ImageVector
    get() {
        if (_Raven != null) return _Raven!!
        
        _Raven = ImageVector.Builder(
            name = "raven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 200f)
                close()
                moveToRelative(160f, 520f)
                lineToRelative(-51f, 123f)
                quadToRelative(-6f, 15f, -21.5f, 21.5f)
                reflectiveQuadTo(297f, 865f)
                quadToRelative(-15f, -6f, -21.5f, -21.5f)
                reflectiveQuadTo(275f, 813f)
                lineToRelative(43f, -104f)
                quadToRelative(-106f, -28f, -172f, -114f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(22f, 0f, 42f, 7.5f)
                reflectiveQuadToRelative(40f, 15.5f)
                lineToRelative(191f, 78f)
                quadToRelative(13f, 5f, 12.5f, 18.5f)
                reflectiveQuadTo(512f, 218f)
                lineToRelative(-112f, 42f)
                verticalLineToRelative(60f)
                lineToRelative(314f, 200f)
                horizontalLineTo(400f)
                quadToRelative(-29f, 0f, -51f, -18f)
                reflectiveQuadToRelative(-27f, -46f)
                quadToRelative(-3f, -14f, -14f, -24f)
                reflectiveQuadToRelative(-26f, -10f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(242f, 462f)
                quadToRelative(0f, 20f, 12f, 44.5f)
                reflectiveQuadToRelative(25f, 38.5f)
                quadToRelative(22f, 26f, 53.5f, 40.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineToRelative(440f)
                lineToRelative(31f, 157f)
                quadToRelative(3f, 17f, -7.5f, 30f)
                reflectiveQuadTo(836f, 800f)
                horizontalLineToRelative(-14f)
                quadToRelative(-11f, 0f, -19f, -5.5f)
                reflectiveQuadTo(790f, 780f)
                lineToRelative(-30f, -60f)
                horizontalLineTo(560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Raven!!
    }

private var _Raven: ImageVector? = null

