package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Book_6: ImageVector
    get() {
        if (_Book_6 != null) return _Book_6!!
        
        _Book_6 = ImageVector.Builder(
            name = "book_6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(600f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(447f)
                quadToRelative(10f, -3f, 19.5f, -5f)
                reflectiveQuadToRelative(20.5f, -2f)
                close()
                moveToRelative(62f, -100f)
                quadToRelative(8f, 0f, 13.5f, -4f)
                reflectiveQuadToRelative(7.5f, -11f)
                lineToRelative(21f, -57f)
                horizontalLineToRelative(113f)
                lineToRelative(20f, 57f)
                quadToRelative(2f, 7f, 8f, 11f)
                reflectiveQuadToRelative(13f, 4f)
                quadToRelative(12f, 0f, 19f, -10f)
                reflectiveQuadToRelative(2f, -21f)
                lineToRelative(-88f, -234f)
                quadToRelative(-2f, -7f, -8f, -11f)
                reflectiveQuadToRelative(-14f, -4f)
                horizontalLineToRelative(-18f)
                quadToRelative(-8f, 0f, -14f, 4f)
                reflectiveQuadToRelative(-8f, 11f)
                lineToRelative(-88f, 235f)
                quadToRelative(-4f, 11f, 2.5f, 20.5f)
                reflectiveQuadTo(302f, 540f)
                close()
                moveToRelative(56f, -112f)
                lineToRelative(41f, -116f)
                horizontalLineToRelative(2f)
                lineToRelative(41f, 116f)
                horizontalLineToRelative(-84f)
                close()
                moveTo(200f, 647f)
                verticalLineToRelative(-487f)
                verticalLineToRelative(487f)
                close()
            }
        }.build()
        
        return _Book_6!!
    }

private var _Book_6: ImageVector? = null

