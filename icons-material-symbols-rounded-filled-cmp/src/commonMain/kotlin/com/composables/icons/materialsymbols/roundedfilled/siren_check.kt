package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Siren_check: ImageVector
    get() {
        if (_Siren_check != null) return _Siren_check!!
        
        _Siren_check = ImageVector.Builder(
            name = "siren_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(691f, 725f)
                lineToRelative(-18f, -18f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 9.5f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(32f, 32f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(90f, -89f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21f, -8.5f)
                reflectiveQuadToRelative(-21f, 8.5f)
                lineToRelative(-76f, 74f)
                close()
                moveToRelative(29f, 195f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(400f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                verticalLineToRelative(-80f)
                close()
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
                verticalLineToRelative(14f)
                quadToRelative(0f, 11f, -8.5f, 19f)
                reflectiveQuadToRelative(-20.5f, 7f)
                quadToRelative(-58f, -2f, -112.5f, 19f)
                reflectiveQuadTo(522f, 522f)
                quadToRelative(-38f, 38f, -60f, 88.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 19f, 2.5f, 37f)
                reflectiveQuadToRelative(7.5f, 36f)
                quadToRelative(5f, 17f, -5.5f, 32f)
                reflectiveQuadTo(417f, 840f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Siren_check!!
    }

private var _Siren_check: ImageVector? = null

