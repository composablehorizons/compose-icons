package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Book_3: ImageVector
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
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                horizontalLineToRelative(420f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(481f)
                quadToRelative(0f, 16f, -8f, 29f)
                reflectiveQuadToRelative(-22f, 20f)
                quadToRelative(-14f, 7f, -22f, 20.5f)
                reflectiveQuadToRelative(-8f, 29.5f)
                quadToRelative(0f, 16f, 8f, 30f)
                reflectiveQuadToRelative(22f, 20f)
                quadToRelative(13f, 5f, 21.5f, 15f)
                reflectiveQuadToRelative(8.5f, 24f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(300f)
                close()
                moveToRelative(-60f, -267f)
                quadToRelative(14f, -7f, 29f, -10f)
                reflectiveQuadToRelative(31f, -3f)
                horizontalLineToRelative(420f)
                verticalLineToRelative(-440f)
                horizontalLineTo(300f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 220f)
                verticalLineToRelative(393f)
                close()
                moveToRelative(183f, -164f)
                horizontalLineToRelative(113f)
                lineToRelative(20f, 56f)
                quadToRelative(2f, 7f, 7.5f, 11f)
                reflectiveQuadToRelative(13.5f, 4f)
                quadToRelative(12f, 0f, 19f, -10f)
                reflectiveQuadToRelative(2f, -21f)
                lineToRelative(-88f, -234f)
                quadToRelative(-2f, -7f, -8f, -11f)
                reflectiveQuadToRelative(-14f, -4f)
                horizontalLineToRelative(-18f)
                quadToRelative(-8f, 0f, -14f, 4f)
                reflectiveQuadToRelative(-8f, 11f)
                lineToRelative(-88f, 235f)
                quadToRelative(-5f, 11f, 2.5f, 20.5f)
                reflectiveQuadTo(382f, 520f)
                quadToRelative(8f, 0f, 13.5f, -4f)
                reflectiveQuadToRelative(7.5f, -11f)
                lineToRelative(20f, -56f)
                close()
                moveToRelative(14f, -41f)
                lineToRelative(41f, -116f)
                horizontalLineToRelative(3f)
                lineToRelative(41f, 116f)
                horizontalLineToRelative(-85f)
                close()
                moveTo(240f, 613f)
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
        
        return _Book_3!!
    }

private var _Book_3: ImageVector? = null

