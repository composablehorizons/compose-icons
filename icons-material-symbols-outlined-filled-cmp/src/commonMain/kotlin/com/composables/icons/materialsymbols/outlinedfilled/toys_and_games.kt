package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Toys_and_games: ImageVector
    get() {
        if (_Toys_and_games != null) return _Toys_and_games!!
        
        _Toys_and_games = ImageVector.Builder(
            name = "toys_and_games",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 688f)
                quadToRelative(0f, -16f, 10.5f, -27f)
                reflectiveQuadToRelative(25.5f, -11f)
                quadToRelative(8f, 0f, 15.5f, 2.5f)
                reflectiveQuadTo(186f, 660f)
                quadToRelative(13f, 8f, 26f, 14f)
                reflectiveQuadToRelative(28f, 6f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(-15f, 0f, -29f, 5f)
                reflectiveQuadToRelative(-25f, 15f)
                quadToRelative(-6f, 5f, -14f, 7.5f)
                reflectiveQuadToRelative(-16f, 2.5f)
                quadToRelative(-15f, 0f, -25.5f, -11f)
                reflectiveQuadTo(120f, 512f)
                verticalLineToRelative(-152f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 320f)
                horizontalLineToRelative(150f)
                quadToRelative(-5f, -15f, -7.5f, -30f)
                reflectiveQuadToRelative(-2.5f, -30f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 260f)
                quadToRelative(0f, 15f, -2.5f, 30f)
                reflectiveQuadToRelative(-7.5f, 30f)
                horizontalLineToRelative(150f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 360f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 552f)
                quadToRelative(-8f, 0f, -14f, -3.5f)
                reflectiveQuadToRelative(-12f, -8.5f)
                quadToRelative(-11f, -10f, -25f, -15f)
                reflectiveQuadToRelative(-29f, -5f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(15f, 0f, 29f, -5f)
                reflectiveQuadToRelative(25f, -15f)
                quadToRelative(5f, -5f, 11.5f, -8.5f)
                reflectiveQuadTo(800f, 648f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 688f)
                verticalLineToRelative(152f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-152f)
                close()
            }
        }.build()
        
        return _Toys_and_games!!
    }

private var _Toys_and_games: ImageVector? = null

