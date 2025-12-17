package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bookmark_added: ImageVector
    get() {
        if (_Bookmark_added != null) return _Bookmark_added!!
        
        _Bookmark_added = ImageVector.Builder(
            name = "bookmark_added",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(713f, 247f)
                lineToRelative(113f, -113f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(883f, 191f)
                lineTo(741f, 332f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-57f, -57f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(28f, 28f)
                close()
                moveTo(480f, 720f)
                lineToRelative(-168f, 72f)
                quadToRelative(-40f, 17f, -76f, -6.5f)
                reflectiveQuadTo(200f, 719f)
                verticalLineToRelative(-519f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(225f)
                quadToRelative(18f, 0f, 27f, 16f)
                reflectiveQuadToRelative(1f, 33f)
                quadToRelative(-7f, 17f, -10f, 34f)
                reflectiveQuadToRelative(-3f, 37f)
                quadToRelative(0f, 72f, 45.5f, 127f)
                reflectiveQuadTo(680f, 436f)
                quadToRelative(12f, 2f, 21.5f, 2.5f)
                reflectiveQuadToRelative(18.5f, 0.5f)
                quadToRelative(17f, 0f, 28.5f, 10.5f)
                reflectiveQuadTo(760f, 476f)
                verticalLineToRelative(243f)
                quadToRelative(0f, 43f, -36f, 66.5f)
                reflectiveQuadToRelative(-76f, 6.5f)
                lineToRelative(-168f, -72f)
                close()
            }
        }.build()
        
        return _Bookmark_added!!
    }

private var _Bookmark_added: ImageVector? = null

