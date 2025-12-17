package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(215f, 858f)
                quadToRelative(-20f, 8f, -37.5f, -4f)
                reflectiveQuadTo(160f, 821f)
                verticalLineToRelative(-178f)
                quadToRelative(0f, -20f, 9.5f, -38f)
                reflectiveQuadToRelative(26.5f, -29f)
                lineToRelative(44f, -29f)
                quadToRelative(7f, 81f, 21.5f, 140f)
                reflectiveQuadTo(309f, 821f)
                lineToRelative(-94f, 37f)
                close()
                moveToRelative(177f, -58f)
                quadToRelative(-14f, 0f, -24f, -9f)
                reflectiveQuadToRelative(-15f, -22f)
                quadToRelative(-27f, -69f, -40f, -127.5f)
                reflectiveQuadTo(300f, 507f)
                quadToRelative(0f, -112f, 40f, -213.5f)
                reflectiveQuadTo(449f, 129f)
                quadToRelative(6f, -6f, 14.5f, -8.5f)
                reflectiveQuadTo(480f, 118f)
                quadToRelative(8f, 0f, 16.5f, 2.5f)
                reflectiveQuadTo(511f, 129f)
                quadToRelative(69f, 63f, 109f, 164.5f)
                reflectiveQuadTo(660f, 507f)
                quadToRelative(0f, 77f, -13f, 135f)
                reflectiveQuadToRelative(-40f, 127f)
                quadToRelative(-5f, 13f, -15f, 22f)
                reflectiveQuadToRelative(-24f, 9f)
                horizontalLineTo(392f)
                close()
                moveToRelative(88f, -280f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(265f, 338f)
                lineToRelative(-94f, -37f)
                quadToRelative(33f, -75f, 47.5f, -134f)
                reflectiveQuadTo(720f, 547f)
                lineToRelative(44f, 29f)
                quadToRelative(17f, 11f, 26.5f, 29f)
                reflectiveQuadToRelative(9.5f, 38f)
                verticalLineToRelative(178f)
                quadToRelative(0f, 21f, -17.5f, 33f)
                reflectiveQuadToRelative(-37.5f, 4f)
                close()
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

