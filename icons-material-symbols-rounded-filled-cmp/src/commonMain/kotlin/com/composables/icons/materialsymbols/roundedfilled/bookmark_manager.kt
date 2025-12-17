package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bookmark_manager: ImageVector
    get() {
        if (_Bookmark_manager != null) return _Bookmark_manager!!
        
        _Bookmark_manager = ImageVector.Builder(
            name = "bookmark_manager",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 840f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(209f, -208f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 660f)
                lineTo(695f, 868f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadTo(666f, 880f)
                horizontalLineToRelative(-66f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 840f)
                close()
                moveToRelative(263f, -184f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(207f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(57f, 57f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 18f, -14.5f, 29f)
                reflectiveQuadToRelative(-33.5f, 8f)
                horizontalLineToRelative(-11f)
                quadToRelative(-28f, 0f, -52.5f, 10f)
                reflectiveQuadTo(724f, 480f)
                lineTo(503f, 701f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 30.5f)
                verticalLineToRelative(3f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bookmark_manager!!
    }

private var _Bookmark_manager: ImageVector? = null

