package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Book_3: ImageVector
    get() {
        if (_Book_3 != null) return _Book_3!!
        
        _Book_3 = ImageVector.Builder(
            name = "book_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 880f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(160f, 740f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -58f, 40.5f, -99f)
                reflectiveQuadToRelative(99.5f, -41f)
                horizontalLineToRelative(500f)
                verticalLineToRelative(600f)
                quadToRelative(-26f, 0f, -43f, 17.5f)
                reflectiveQuadTo(740f, 740f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                verticalLineToRelative(80f)
                horizontalLineTo(300f)
                close()
                moveToRelative(49f, -360f)
                horizontalLineToRelative(49f)
                lineToRelative(25f, -71f)
                horizontalLineToRelative(113f)
                lineToRelative(25f, 71f)
                horizontalLineToRelative(49f)
                lineTo(504f, 240f)
                horizontalLineToRelative(-50f)
                lineTo(349f, 520f)
                close()
                moveToRelative(88f, -112f)
                lineToRelative(41f, -116f)
                horizontalLineToRelative(3f)
                lineToRelative(41f, 116f)
                horizontalLineToRelative(-85f)
                close()
                moveTo(300f, 800f)
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
        
        return _Book_3!!
    }

private var _Book_3: ImageVector? = null

