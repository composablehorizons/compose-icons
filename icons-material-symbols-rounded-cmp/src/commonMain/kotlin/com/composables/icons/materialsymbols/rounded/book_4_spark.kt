package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Book_4_spark: ImageVector
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
                moveTo(200f, 647f)
                quadToRelative(10f, -3f, 19.5f, -5f)
                reflectiveQuadToRelative(20.5f, -2f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(447f)
                close()
                moveToRelative(40f, 233f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 160f)
                horizontalLineTo(360f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 560f)
                verticalLineToRelative(160f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-40f, -233f)
                verticalLineToRelative(-487f)
                verticalLineToRelative(487f)
                close()
                moveToRelative(500f, -167f)
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

