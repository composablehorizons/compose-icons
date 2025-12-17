package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Book_2: ImageVector
    get() {
        if (_Book_2 != null) return _Book_2!!
        
        _Book_2 = ImageVector.Builder(
            name = "book_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 880f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                horizontalLineToRelative(420f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(501f)
                quadToRelative(0f, 8f, -6.5f, 14.5f)
                reflectiveQuadTo(770f, 690f)
                quadToRelative(-14f, 7f, -22f, 20f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(0f, 17f, 8f, 30.5f)
                reflectiveQuadToRelative(22f, 19.5f)
                quadToRelative(14f, 6f, 22f, 16.5f)
                reflectiveQuadToRelative(8f, 22.5f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(300f)
                close()
                moveToRelative(60f, -280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 600f)
                close()
                moveToRelative(-60f, 200f)
                horizontalLineToRelative(373f)
                quadToRelative(-6f, -14f, -9.5f, -28.5f)
                reflectiveQuadTo(660f, 740f)
                quadToRelative(0f, -16f, 3f, -31f)
                reflectiveQuadToRelative(10f, -29f)
                horizontalLineTo(300f)
                quadToRelative(-26f, 0f, -43f, 17.5f)
                reflectiveQuadTo(240f, 740f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
            }
        }.build()
        
        return _Book_2!!
    }

private var _Book_2: ImageVector? = null

