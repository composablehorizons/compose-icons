package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Query_stats: ImageVector
    get() {
        if (_Query_stats != null) return _Query_stats!!
        
        _Query_stats = ImageVector.Builder(
            name = "query_stats",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(105f, 727f)
                lineToRelative(-65f, -47f)
                lineToRelative(200f, -320f)
                lineToRelative(120f, 140f)
                lineToRelative(160f, -260f)
                lineToRelative(109f, 163f)
                quadToRelative(-23f, 1f, -43.5f, 5.5f)
                reflectiveQuadTo(545f, 421f)
                lineToRelative(-22f, -33f)
                lineToRelative(-152f, 247f)
                lineToRelative(-121f, -141f)
                lineToRelative(-145f, 233f)
                close()
                moveTo(863f, 920f)
                lineTo(738f, 795f)
                quadToRelative(-20f, 14f, -44.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(463f, 643f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(643f, 463f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(823f, 643f)
                quadToRelative(0f, 26f, -7f, 50.5f)
                reflectiveQuadTo(795f, 739f)
                lineTo(920f, 863f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(643f, 743f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(89f, -320f)
                quadToRelative(-19f, -8f, -39.5f, -13f)
                reflectiveQuadToRelative(-42.5f, -6f)
                lineToRelative(205f, -324f)
                lineToRelative(65f, 47f)
                lineToRelative(-188f, 296f)
                close()
            }
        }.build()
        
        return _Query_stats!!
    }

private var _Query_stats: ImageVector? = null

