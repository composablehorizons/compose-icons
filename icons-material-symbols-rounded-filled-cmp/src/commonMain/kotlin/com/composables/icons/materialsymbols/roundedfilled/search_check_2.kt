package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Search_check_2: ImageVector
    get() {
        if (_Search_check_2 != null) return _Search_check_2!!
        
        _Search_check_2 = ImageVector.Builder(
            name = "search_check_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(358f, 428f)
                lineToRelative(-57f, -56f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-12f, 12f, -12.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(85f, 85f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(170f, -169f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(556f, 287f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(499f, 287f)
                lineTo(358f, 428f)
                close()
                moveToRelative(42f, 292f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 56f, -17.5f, 105.5f)
                reflectiveQuadTo(653f, 596f)
                lineToRelative(199f, 199f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(852f, 852f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(795f, 852f)
                lineTo(596f, 653f)
                quadToRelative(-41f, 32f, -90.5f, 49.5f)
                reflectiveQuadTo(400f, 720f)
                close()
            }
        }.build()
        
        return _Search_check_2!!
    }

private var _Search_check_2: ImageVector? = null

