package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_gale_wifi: ImageVector
    get() {
        if (_Nest_gale_wifi != null) return _Nest_gale_wifi!!
        
        _Nest_gale_wifi = ImageVector.Builder(
            name = "nest_gale_wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(104f, 400f)
                lineToRelative(11f, -165f)
                quadToRelative(2f, -32f, 25f, -53.5f)
                reflectiveQuadToRelative(55f, -21.5f)
                horizontalLineToRelative(570f)
                quadToRelative(32f, 0f, 55f, 21.5f)
                reflectiveQuadToRelative(25f, 53.5f)
                lineToRelative(11f, 165f)
                horizontalLineTo(104f)
                close()
                moveToRelative(96f, 400f)
                lineToRelative(-13f, -40f)
                horizontalLineToRelative(-21f)
                quadToRelative(-35f, 0f, -58.5f, -25f)
                reflectiveQuadTo(86f, 675f)
                lineToRelative(13f, -195f)
                horizontalLineToRelative(762f)
                lineToRelative(13f, 195f)
                quadToRelative(2f, 35f, -21.5f, 60f)
                reflectiveQuadTo(794f, 760f)
                horizontalLineToRelative(-21f)
                lineToRelative(-13f, 40f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Nest_gale_wifi!!
    }

private var _Nest_gale_wifi: ImageVector? = null

