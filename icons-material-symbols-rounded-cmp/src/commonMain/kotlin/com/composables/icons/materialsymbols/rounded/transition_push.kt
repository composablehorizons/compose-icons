package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Transition_push: ImageVector
    get() {
        if (_Transition_push != null) return _Transition_push!!
        
        _Transition_push = ImageVector.Builder(
            name = "transition_push",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 800f)
                horizontalLineToRelative(-41f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28f)
                reflectiveQuadToRelative(28.5f, -11f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-481f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 160f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 800f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -79f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-481f)
                horizontalLineTo(640f)
                verticalLineToRelative(481f)
                close()
                moveTo(206f, 520f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(126f)
                lineToRelative(-35f, -35f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(172f, 348f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(103f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(228f, 612f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(172f, 612f)
                quadToRelative(-12f, -11f, -12f, -28f)
                reflectiveQuadToRelative(11f, -29f)
                lineToRelative(35f, -35f)
                close()
                moveToRelative(434f, 201f)
                verticalLineToRelative(-481f)
                verticalLineToRelative(481f)
                close()
            }
        }.build()
        
        return _Transition_push!!
    }

private var _Transition_push: ImageVector? = null

