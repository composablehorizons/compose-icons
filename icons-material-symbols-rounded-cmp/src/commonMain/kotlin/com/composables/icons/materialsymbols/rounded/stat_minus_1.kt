package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stat_minus_1: ImageVector
    get() {
        if (_Stat_minus_1 != null) return _Stat_minus_1!!
        
        _Stat_minus_1 = ImageVector.Builder(
            name = "stat_minus_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 598f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(268f, 403f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(268f, 347f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(156f, 155f)
                lineToRelative(156f, -155f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(692f, 347f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 587f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                close()
            }
        }.build()
        
        return _Stat_minus_1!!
    }

private var _Stat_minus_1: ImageVector? = null

