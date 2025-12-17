package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Siren_open: ImageVector
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
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 600f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(43f)
                quadToRelative(-10f, -2f, -19.5f, -2.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-116f, 0f, -198f, 81.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 31f, 6.5f, 61.5f)
                reflectiveQuadTo(467f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(120f)
                close()
                moveTo(720f, 920f)
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

