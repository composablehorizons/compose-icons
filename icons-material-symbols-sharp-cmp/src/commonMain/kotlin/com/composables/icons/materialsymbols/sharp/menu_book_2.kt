package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Menu_book_2: ImageVector
    get() {
        if (_Menu_book_2 != null) return _Menu_book_2!!
        
        _Menu_book_2 = ImageVector.Builder(
            name = "menu_book_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(140f, -120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                quadToRelative(26f, -7f, 43f, -28.5f)
                reflectiveQuadToRelative(17f, -48.5f)
                verticalLineToRelative(-163f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 27f, 17f, 48.5f)
                reflectiveQuadToRelative(43f, 28.5f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(220f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-400f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(160f)
                close()
                moveTo(240f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Menu_book_2!!
    }

private var _Menu_book_2: ImageVector? = null

