package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Siren_open: ImageVector
    get() {
        if (_Siren_open != null) return _Siren_open!!
        
        _Siren_open = ImageVector.Builder(
            name = "siren_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(467f, 600f)
                close()
                moveToRelative(-24f, 80f)
                close()
                moveTo(320f, 520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(120f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(43f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-11f, 0f, -20.5f, 0.5f)
                reflectiveQuadTo(680f, 443f)
                verticalLineToRelative(-43f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(187f)
                quadToRelative(-9f, 19f, -15f, 39f)
                reflectiveQuadToRelative(-9f, 41f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(283f)
                quadToRelative(3f, 21f, 9f, 41f)
                reflectiveQuadToRelative(15f, 39f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-72f, -100f)
                lineToRelative(112f, -112f)
                verticalLineToRelative(92f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(92f)
                lineTo(620f, 792f)
                lineToRelative(28f, 28f)
                close()
            }
        }.build()
        
        return _Siren_open!!
    }

private var _Siren_open: ImageVector? = null

