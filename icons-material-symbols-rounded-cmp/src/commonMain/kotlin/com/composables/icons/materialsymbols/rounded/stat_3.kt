package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stat_3: ImageVector
    get() {
        if (_Stat_3 != null) return _Stat_3!!
        
        _Stat_3 = ImageVector.Builder(
            name = "stat_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 672f)
                lineTo(324f, 827f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 827f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -155f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(155f, 155f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 827f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 672f)
                close()
                moveToRelative(0f, -240f)
                lineTo(324f, 587f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 587f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -155f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(155f, 155f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 587f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 432f)
                close()
                moveToRelative(0f, -240f)
                lineTo(324f, 347f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 347f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -155f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(183f, 183f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -183f)
                close()
            }
        }.build()
        
        return _Stat_3!!
    }

private var _Stat_3: ImageVector? = null

