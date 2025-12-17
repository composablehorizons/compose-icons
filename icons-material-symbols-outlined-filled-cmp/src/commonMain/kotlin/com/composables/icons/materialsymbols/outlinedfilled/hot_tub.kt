package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hot_tub: ImageVector
    get() {
        if (_Hot_tub != null) return _Hot_tub!!
        
        _Hot_tub = ImageVector.Builder(
            name = "hot_tub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 320f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -38f, 26f, -64f)
                reflectiveQuadToRelative(64f, -26f)
                quadToRelative(20f, 0f, 37f, 8f)
                reflectiveQuadToRelative(31f, 22f)
                lineToRelative(56f, 62f)
                quadToRelative(7f, 8f, 15f, 15f)
                reflectiveQuadToRelative(17f, 13f)
                horizontalLineToRelative(434f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(560f, -480f)
                lineToRelative(4f, -24f)
                quadToRelative(5f, -25f, -3.5f, -48.5f)
                reflectiveQuadTo(694f, 286f)
                quadToRelative(-29f, -29f, -43f, -67.5f)
                reflectiveQuadToRelative(-9f, -80.5f)
                lineToRelative(2f, -18f)
                horizontalLineToRelative(76f)
                lineToRelative(-4f, 24f)
                quadToRelative(-4f, 24f, 3.5f, 47.5f)
                reflectiveQuadTo(744f, 232f)
                quadToRelative(30f, 30f, 44.5f, 69f)
                reflectiveQuadToRelative(9.5f, 81f)
                lineToRelative(-2f, 18f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(-160f, 0f)
                lineToRelative(4f, -24f)
                quadToRelative(5f, -25f, -3.5f, -48.5f)
                reflectiveQuadTo(534f, 286f)
                quadToRelative(-29f, -29f, -43f, -67.5f)
                reflectiveQuadToRelative(-9f, -80.5f)
                lineToRelative(2f, -18f)
                horizontalLineToRelative(76f)
                lineToRelative(-4f, 24f)
                quadToRelative(-5f, 24f, 3f, 47.5f)
                reflectiveQuadToRelative(25f, 40.5f)
                quadToRelative(30f, 30f, 44.5f, 69f)
                reflectiveQuadToRelative(9.5f, 81f)
                lineToRelative(-2f, 18f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(120f, 400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-160f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Hot_tub!!
    }

private var _Hot_tub: ImageVector? = null

