package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Taunt: ImageVector
    get() {
        if (_Taunt != null) return _Taunt!!
        
        _Taunt = ImageVector.Builder(
            name = "taunt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(218f, 579f)
                quadToRelative(-24f, 13f, -51f, 5.5f)
                reflectiveQuadTo(126f, 554f)
                quadToRelative(-17f, -29f, -6f, -60f)
                reflectiveQuadToRelative(43f, -42f)
                lineToRelative(337f, -112f)
                lineToRelative(36f, 71f)
                lineToRelative(-318f, 168f)
                close()
                moveToRelative(22f, 261f)
                verticalLineToRelative(-227f)
                lineToRelative(349f, -184f)
                lineToRelative(-17f, -35f)
                lineToRelative(228f, -114f)
                lineToRelative(36f, 72f)
                lineToRelative(-276f, 208f)
                verticalLineToRelative(280f)
                horizontalLineTo(240f)
                close()
                moveToRelative(60f, -440f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Taunt!!
    }

private var _Taunt: ImageVector? = null

