package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shift_lock: ImageVector
    get() {
        if (_Shift_lock != null) return _Shift_lock!!
        
        _Shift_lock = ImageVector.Builder(
            name = "shift_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                verticalLineToRelative(-160f)
                horizontalLineTo(204f)
                quadToRelative(-26f, 0f, -36.5f, -22.5f)
                reflectiveQuadTo(173f, 455f)
                lineToRelative(276f, -337f)
                quadToRelative(12f, -15f, 31f, -15f)
                reflectiveQuadToRelative(31f, 15f)
                lineToRelative(276f, 337f)
                quadToRelative(16f, 20f, 5.5f, 42.5f)
                reflectiveQuadTo(756f, 520f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Shift_lock!!
    }

private var _Shift_lock: ImageVector? = null

