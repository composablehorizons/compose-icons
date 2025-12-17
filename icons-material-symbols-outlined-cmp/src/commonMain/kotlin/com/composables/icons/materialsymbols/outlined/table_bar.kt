package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Table_bar: ImageVector
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
                moveTo(240f, 800f)
                lineToRelative(60f, -150f)
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
                lineToRelative(60f, 150f)
                horizontalLineToRelative(-80f)
                lineToRelative(-48f, -120f)
                horizontalLineTo(368f)
                lineToRelative(-48f, 120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -440f)
                quadToRelative(97f, 0f, 183f, -17f)
                reflectiveQuadToRelative(126f, -43f)
                quadToRelative(-40f, -26f, -126f, -43f)
                reflectiveQuadToRelative(-183f, -17f)
                quadToRelative(-97f, 0f, -183f, 17f)
                reflectiveQuadToRelative(-126f, 43f)
                quadToRelative(40f, 26f, 126f, 43f)
                reflectiveQuadToRelative(183f, 17f)
                close()
                moveToRelative(0f, -60f)
                close()
            }
        }.build()
        
        return _Table_bar!!
    }

private var _Table_bar: ImageVector? = null

