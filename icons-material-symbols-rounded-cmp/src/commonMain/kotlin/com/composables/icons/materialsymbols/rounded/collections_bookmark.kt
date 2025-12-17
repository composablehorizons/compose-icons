package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Collections_bookmark: ImageVector
    get() {
        if (_Collections_bookmark != null) return _Collections_bookmark!!
        
        _Collections_bookmark = ImageVector.Builder(
            name = "collections_bookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(245f)
                quadToRelative(0f, 12f, -10f, 18f)
                reflectiveQuadToRelative(-20f, -1f)
                lineToRelative(-49f, -29f)
                quadToRelative(-10f, -6f, -21.5f, -6f)
                reflectiveQuadToRelative(-20.5f, 6f)
                lineToRelative(-49f, 29f)
                quadToRelative(-11f, 7f, -20.5f, 1f)
                reflectiveQuadToRelative(-9.5f, -18f)
                verticalLineToRelative(-245f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -720f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(200f, 245f)
                quadToRelative(0f, 12f, 9.5f, 18f)
                reflectiveQuadToRelative(20.5f, -1f)
                lineToRelative(49f, -29f)
                quadToRelative(9f, -6f, 20.5f, -6f)
                reflectiveQuadToRelative(21.5f, 6f)
                lineToRelative(49f, 29f)
                quadToRelative(10f, 7f, 20f, 1f)
                reflectiveQuadToRelative(10f, -18f)
                quadToRelative(0f, 12f, -10f, 18f)
                reflectiveQuadToRelative(-20f, -1f)
                lineToRelative(-49f, -29f)
                quadToRelative(-10f, -6f, -21.5f, -6f)
                reflectiveQuadToRelative(-20.5f, 6f)
                lineToRelative(-49f, 29f)
                quadToRelative(-11f, 7f, -20.5f, 1f)
                reflectiveQuadToRelative(-9.5f, -18f)
                close()
            }
        }.build()
        
        return _Collections_bookmark!!
    }

private var _Collections_bookmark: ImageVector? = null

