package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Book_5: ImageVector
    get() {
        if (_Book_5 != null) return _Book_5!!
        
        _Book_5 = ImageVector.Builder(
            name = "book_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(270f, 880f)
                quadToRelative(-45f, 0f, -77.5f, -30.5f)
                reflectiveQuadTo(160f, 774f)
                verticalLineToRelative(-558f)
                quadToRelative(0f, -38f, 23.5f, -68f)
                reflectiveQuadToRelative(61.5f, -38f)
                lineToRelative(395f, -78f)
                verticalLineToRelative(640f)
                lineToRelative(-379f, 76f)
                quadToRelative(-9f, 2f, -15f, 9.5f)
                reflectiveQuadToRelative(-6f, 16.5f)
                quadToRelative(0f, 11f, 9f, 18.5f)
                reflectiveQuadToRelative(21f, 7.5f)
                horizontalLineToRelative(450f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
                horizontalLineTo(270f)
                close()
                moveToRelative(90f, -233f)
                lineToRelative(200f, -39f)
                verticalLineToRelative(-478f)
                lineToRelative(-200f, 39f)
                verticalLineToRelative(478f)
                close()
                moveToRelative(-80f, 16f)
                verticalLineToRelative(-478f)
                lineToRelative(-15f, 3f)
                quadToRelative(-11f, 2f, -18f, 9.5f)
                reflectiveQuadToRelative(-7f, 18.5f)
                verticalLineToRelative(457f)
                quadToRelative(5f, -2f, 10.5f, -3.5f)
                reflectiveQuadTo(261f, 667f)
                lineToRelative(19f, -4f)
                close()
                moveToRelative(-40f, -472f)
                verticalLineToRelative(482f)
                verticalLineToRelative(-482f)
                close()
            }
        }.build()
        
        return _Book_5!!
    }

private var _Book_5: ImageVector? = null

