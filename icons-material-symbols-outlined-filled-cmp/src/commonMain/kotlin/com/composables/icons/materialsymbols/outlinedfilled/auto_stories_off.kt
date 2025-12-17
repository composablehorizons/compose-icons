package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_stories_off: ImageVector
    get() {
        if (_Auto_stories_off != null) return _Auto_stories_off!!
        
        _Auto_stories_off = ImageVector.Builder(
            name = "auto_stories_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-42f, 0f, -82.5f, 11f)
                reflectiveQuadTo(100f, 762f)
                quadToRelative(-21f, 11f, -40.5f, -1f)
                reflectiveQuadTo(40f, 726f)
                verticalLineToRelative(-482f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadTo(62f, 208f)
                quadToRelative(6f, -3f, 11.5f, -6f)
                reflectiveQuadToRelative(11.5f, -5f)
                lineToRelative(-59f, -59f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                lineToRelative(-204f, -204f)
                quadToRelative(-38f, 10f, -72.5f, 27.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -434f)
                lineTo(274f, 160f)
                quadToRelative(54f, 2f, 106f, 16.5f)
                reflectiveQuadTo(480f, 220f)
                verticalLineToRelative(146f)
                close()
                moveToRelative(0f, 338f)
                quadToRelative(18f, -11f, 36.5f, -20f)
                reflectiveQuadToRelative(38.5f, -17f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(161f, -177f)
                lineToRelative(-81f, -81f)
                verticalLineToRelative(-226f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(400f)
                lineTo(641f, 527f)
                close()
                moveToRelative(240f, 240f)
                lineTo(758f, 644f)
                quadToRelative(21f, 3f, 41.5f, 8f)
                reflectiveQuadToRelative(40.5f, 12f)
                verticalLineToRelative(-480f)
                quadToRelative(15f, 5f, 29.5f, 11f)
                reflectiveQuadToRelative(28.5f, 13f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(482f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(881f, 767f)
                close()
            }
        }.build()
        
        return _Auto_stories_off!!
    }

private var _Auto_stories_off: ImageVector? = null

