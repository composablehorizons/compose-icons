package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nfc_off: ImageVector
    get() {
        if (_Nfc_off != null) return _Nfc_off!!
        
        _Nfc_off = ImageVector.Builder(
            name = "nfc_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-527f)
                lineToRelative(-65f, -65f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-64f, -63f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -447f)
                verticalLineToRelative(247f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 680f)
                horizontalLineToRelative(247f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-127f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(560f, -193f)
                verticalLineToRelative(429f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(772f, 658f)
                lineToRelative(-92f, -92f)
                verticalLineToRelative(-246f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineTo(520f)
                quadToRelative(-26f, 0f, -46f, 14f)
                reflectiveQuadToRelative(-29f, 37f)
                lineTo(302f, 188f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(331f, 120f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                close()
                moveTo(600f, 360f)
                verticalLineToRelative(126f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Nfc_off!!
    }

private var _Nfc_off: ImageVector? = null

