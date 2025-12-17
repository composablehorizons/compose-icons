package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Vital_signs: ImageVector
    get() {
        if (_Vital_signs != null) return _Vital_signs!!
        
        _Vital_signs = ImageVector.Builder(
            name = "vital_signs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                quadToRelative(-19f, 0f, -34f, -11f)
                reflectiveQuadToRelative(-22f, -28f)
                lineToRelative(-92f, -241f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 440f)
                horizontalLineToRelative(160f)
                quadToRelative(13f, 0f, 22.5f, 7f)
                reflectiveQuadToRelative(14.5f, 19f)
                lineToRelative(83f, 218f)
                lineToRelative(184f, -485f)
                quadToRelative(7f, -17f, 22f, -28f)
                reflectiveQuadToRelative(34f, -11f)
                quadToRelative(19f, 0f, 34f, 11f)
                reflectiveQuadToRelative(22f, 28f)
                lineToRelative(92f, 241f)
                horizontalLineToRelative(132f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(720f)
                quadToRelative(-13f, 0f, -22.5f, -7f)
                reflectiveQuadTo(683f, 494f)
                lineToRelative(-83f, -218f)
                lineToRelative(-184f, 485f)
                quadToRelative(-7f, 17f, -22f, 28f)
                reflectiveQuadToRelative(-34f, 11f)
                close()
            }
        }.build()
        
        return _Vital_signs!!
    }

private var _Vital_signs: ImageVector? = null

