package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_text_wrap: ImageVector
    get() {
        if (_Format_text_wrap != null) return _Format_text_wrap!!
        
        _Format_text_wrap = ImageVector.Builder(
            name = "format_text_wrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 800f)
                close()
                moveToRelative(560f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveTo(395f, 673f)
                lineToRelative(-85f, -85f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(86f, -85f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(452f, 447f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-17f, 17f)
                horizontalLineToRelative(85f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(600f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 360f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(200f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                horizontalLineToRelative(-85f)
                lineToRelative(17f, 17f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(452f, 673f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(395f, 673f)
                close()
            }
        }.build()
        
        return _Format_text_wrap!!
    }

private var _Format_text_wrap: ImageVector? = null

