package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Toys_and_games: ImageVector
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
                moveTo(840f, 648f)
                verticalLineToRelative(232f)
                horizontalLineTo(120f)
                verticalLineToRelative(-230f)
                horizontalLineToRelative(58f)
                quadToRelative(11f, 14f, 27.5f, 22f)
                reflectiveQuadToRelative(34.5f, 8f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(-18f, 0f, -34.5f, 8f)
                reflectiveQuadTo(178f, 550f)
                horizontalLineToRelative(-58f)
                verticalLineToRelative(-230f)
                horizontalLineToRelative(190f)
                quadToRelative(-5f, -15f, -7.5f, -30f)
                reflectiveQuadToRelative(-2.5f, -30f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 260f)
                quadToRelative(0f, 15f, -2.5f, 30f)
                reflectiveQuadToRelative(-7.5f, 30f)
                horizontalLineToRelative(190f)
                verticalLineToRelative(232f)
                horizontalLineToRelative(-56f)
                quadToRelative(-11f, -15f, -28f, -23.5f)
                reflectiveQuadToRelative(-36f, -8.5f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(19f, 0f, 36f, -8.5f)
                reflectiveQuadToRelative(28f, -23.5f)
                horizontalLineToRelative(56f)
                close()
            }
        }.build()
        
        return _Toys_and_games!!
    }

private var _Toys_and_games: ImageVector? = null

