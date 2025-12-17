package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Book_ribbon: ImageVector
    get() {
        if (_Book_ribbon != null) return _Book_ribbon!!
        
        _Book_ribbon = ImageVector.Builder(
            name = "book_ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 682f)
                verticalLineToRelative(-394f)
                quadToRelative(-41f, -24f, -87f, -36f)
                reflectiveQuadToRelative(-93f, -12f)
                quadToRelative(-36f, 0f, -71.5f, 7f)
                reflectiveQuadTo(120f, 268f)
                verticalLineToRelative(396f)
                quadToRelative(35f, -12f, 69.5f, -18f)
                reflectiveQuadToRelative(70.5f, -6f)
                quadToRelative(47f, 0f, 91.5f, 10.5f)
                reflectiveQuadTo(440f, 682f)
                close()
                moveToRelative(40f, 118f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-42f, 0f, -82.5f, 11f)
                reflectiveQuadTo(100f, 762f)
                quadToRelative(-21f, 11f, -40.5f, -1f)
                reflectiveQuadTo(40f, 726f)
                verticalLineToRelative(-482f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadTo(62f, 208f)
                quadToRelative(46f, -24f, 96f, -36f)
                reflectiveQuadToRelative(102f, -12f)
                quadToRelative(74f, 0f, 126f, 17f)
                reflectiveQuadToRelative(112f, 52f)
                quadToRelative(11f, 6f, 16.5f, 14f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(418f)
                quadToRelative(44f, -21f, 88.5f, -31.5f)
                reflectiveQuadTo(700f, 640f)
                quadToRelative(36f, 0f, 70.5f, 6f)
                reflectiveQuadToRelative(69.5f, 18f)
                verticalLineToRelative(-481f)
                quadToRelative(15f, 5f, 29.5f, 11f)
                reflectiveQuadToRelative(28.5f, 14f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(482f)
                quadToRelative(0f, 23f, -19.5f, 35f)
                reflectiveQuadToRelative(-40.5f, 1f)
                quadToRelative(-37f, -20f, -77.5f, -31f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-60f, 0f, -116f, 21f)
                reflectiveQuadToRelative(-104f, 59f)
                close()
                moveToRelative(140f, -240f)
                verticalLineToRelative(-440f)
                lineToRelative(120f, -40f)
                verticalLineToRelative(440f)
                lineToRelative(-120f, 40f)
                close()
                moveToRelative(-340f, -99f)
                close()
            }
        }.build()
        
        return _Book_ribbon!!
    }

private var _Book_ribbon: ImageVector? = null

