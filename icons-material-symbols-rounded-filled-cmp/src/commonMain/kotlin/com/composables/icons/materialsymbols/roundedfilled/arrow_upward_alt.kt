package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_upward_alt: ImageVector
    get() {
        if (_Arrow_upward_alt != null) return _Arrow_upward_alt!!
        
        _Arrow_upward_alt = ImageVector.Builder(
            name = "arrow_upward_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 352f)
                lineTo(324f, 468f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(184f, -184f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(184f, 184f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(520f, 352f)
                verticalLineToRelative(328f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(-328f)
                close()
            }
        }.build()
        
        return _Arrow_upward_alt!!
    }

private var _Arrow_upward_alt: ImageVector? = null

