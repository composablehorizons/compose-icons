package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Book_4_spark: ImageVector
    get() {
        if (_Book_4_spark != null) return _Book_4_spark!!
        
        _Book_4_spark = ImageVector.Builder(
            name = "book_4_spark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 640f)
                close()
                moveTo(760f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(272f)
                quadToRelative(-34f, 35f, -53f, 81f)
                reflectiveQuadToRelative(-19f, 99f)
                quadToRelative(0f, 103f, 69.5f, 177f)
                reflectiveQuadTo(680f, 519f)
                verticalLineToRelative(121f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-287f)
                quadToRelative(22f, -5f, 42f, -13.5f)
                reflectiveQuadToRelative(38f, -20.5f)
                verticalLineToRelative(321f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveToRelative(-60f, -400f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadToRelative(-64f, -156f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                close()
            }
        }.build()
        
        return _Book_4_spark!!
    }

private var _Book_4_spark: ImageVector? = null

