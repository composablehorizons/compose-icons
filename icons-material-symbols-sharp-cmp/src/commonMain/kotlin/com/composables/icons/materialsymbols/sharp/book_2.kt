package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Book_2: ImageVector
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
                horizontalLineToRelative(500f)
                verticalLineToRelative(600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(740f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(800f, 800f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                close()
                moveToRelative(-60f, -267f)
                quadToRelative(14f, -7f, 29f, -10f)
                reflectiveQuadToRelative(31f, -3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(-20f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 220f)
                verticalLineToRelative(393f)
                close()
                moveToRelative(160f, -13f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-440f)
                horizontalLineTo(400f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(-160f, 13f)
                verticalLineToRelative(-453f)
                verticalLineToRelative(453f)
                close()
                moveToRelative(60f, 187f)
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

