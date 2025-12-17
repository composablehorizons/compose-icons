package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Book_6: ImageVector
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
                horizontalLineToRelative(440f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
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
                moveToRelative(30f, -100f)
                horizontalLineToRelative(48f)
                lineToRelative(26f, -72f)
                horizontalLineToRelative(113f)
                lineToRelative(25f, 72f)
                horizontalLineToRelative(48f)
                lineTo(425f, 260f)
                horizontalLineToRelative(-50f)
                lineTo(270f, 540f)
                close()
                moveToRelative(88f, -112f)
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

