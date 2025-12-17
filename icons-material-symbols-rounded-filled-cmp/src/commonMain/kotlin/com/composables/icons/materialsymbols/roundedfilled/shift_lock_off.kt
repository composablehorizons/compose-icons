package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shift_lock_off: ImageVector
    get() {
        if (_Shift_lock_off != null) return _Shift_lock_off!!
        
        _Shift_lock_off = ImageVector.Builder(
            name = "shift_lock_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(44f, -320f)
                quadToRelative(-26f, 0f, -36.5f, -22.5f)
                reflectiveQuadTo(173f, 455f)
                lineToRelative(127f, -156f)
                lineToRelative(340f, 340f)
                verticalLineToRelative(41f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                verticalLineToRelative(-160f)
                horizontalLineTo(204f)
                close()
                moveToRelative(307f, -402f)
                lineToRelative(276f, 337f)
                quadToRelative(16f, 20f, 5.5f, 42.5f)
                reflectiveQuadTo(756f, 520f)
                horizontalLineToRelative(-89f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(611f, 497f)
                lineTo(377f, 263f)
                quadToRelative(-11f, -11f, -12f, -26.5f)
                reflectiveQuadToRelative(9f, -27.5f)
                lineToRelative(75f, -91f)
                quadToRelative(12f, -15f, 31f, -15f)
                reflectiveQuadToRelative(31f, 15f)
                close()
                moveTo(791f, 903f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
            }
        }.build()
        
        return _Shift_lock_off!!
    }

private var _Shift_lock_off: ImageVector? = null

