package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stat_2: ImageVector
    get() {
        if (_Stat_2 != null) return _Stat_2!!
        
        _Stat_2 = ImageVector.Builder(
            name = "stat_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 553f)
                lineTo(324f, 708f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 708f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -155f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(155f, 155f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 708f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 553f)
                close()
                moveToRelative(0f, -240f)
                lineTo(324f, 468f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 468f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -155f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(155f, 155f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 468f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 313f)
                close()
            }
        }.build()
        
        return _Stat_2!!
    }

private var _Stat_2: ImageVector? = null

