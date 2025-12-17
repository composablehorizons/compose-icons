package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Table_bar: ImageVector
    get() {
        if (_Table_bar != null) return _Table_bar!!
        
        _Table_bar = ImageVector.Builder(
            name = "table_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 749f)
                lineToRelative(40f, -99f)
                quadToRelative(9f, -23f, 29f, -36.5f)
                reflectiveQuadToRelative(45f, -13.5f)
                horizontalLineToRelative(66f)
                verticalLineToRelative(-161f)
                quadToRelative(-153f, -5f, -256.5f, -45f)
                reflectiveQuadTo(80f, 300f)
                quadToRelative(0f, -58f, 117f, -99f)
                reflectiveQuadToRelative(283f, -41f)
                quadToRelative(167f, 0f, 283.5f, 41f)
                reflectiveQuadTo(880f, 300f)
                quadToRelative(0f, 54f, -103.5f, 94f)
                reflectiveQuadTo(520f, 439f)
                verticalLineToRelative(161f)
                horizontalLineToRelative(66f)
                quadToRelative(24f, 0f, 44.5f, 13.5f)
                reflectiveQuadTo(660f, 650f)
                lineToRelative(40f, 99f)
                quadToRelative(8f, 18f, -3.5f, 34.5f)
                reflectiveQuadTo(665f, 800f)
                quadToRelative(-11f, 0f, -20f, -6f)
                reflectiveQuadToRelative(-14f, -17f)
                lineToRelative(-39f, -97f)
                horizontalLineTo(368f)
                lineToRelative(-39f, 97f)
                quadToRelative(-5f, 11f, -14f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-20f, 0f, -31.5f, -16.5f)
                reflectiveQuadTo(260f, 749f)
                close()
            }
        }.build()
        
        return _Table_bar!!
    }

private var _Table_bar: ImageVector? = null

