package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Hot_tub: ImageVector
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
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                quadToRelative(0f, -38f, 26f, -64f)
                reflectiveQuadToRelative(64f, -26f)
                quadToRelative(20f, 0f, 37f, 8f)
                reflectiveQuadToRelative(31f, 22f)
                lineToRelative(56f, 62f)
                quadToRelative(7f, 8f, 15f, 15f)
                reflectiveQuadToRelative(17f, 13f)
                horizontalLineToRelative(394f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 520f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(601f, -480f)
                quadToRelative(-16f, 0f, -26.5f, -11f)
                reflectiveQuadToRelative(-9.5f, -27f)
                quadToRelative(1f, -22f, -7.5f, -41.5f)
                reflectiveQuadTo(694f, 286f)
                quadToRelative(-26f, -26f, -38.5f, -59f)
                reflectiveQuadTo(642f, 159f)
                quadToRelative(0f, -16f, 10.5f, -27.5f)
                reflectiveQuadTo(679f, 120f)
                quadToRelative(16f, 0f, 27f, 11.5f)
                reflectiveQuadToRelative(10f, 27.5f)
                quadToRelative(-1f, 20f, 6.5f, 39.5f)
                reflectiveQuadTo(744f, 232f)
                quadToRelative(26f, 26f, 39.5f, 59f)
                reflectiveQuadToRelative(14.5f, 69f)
                quadToRelative(0f, 17f, -10.5f, 28.5f)
                reflectiveQuadTo(761f, 400f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(-16f, 0f, -26.5f, -11f)
                reflectiveQuadToRelative(-9.5f, -27f)
                quadToRelative(1f, -22f, -7.5f, -41.5f)
                reflectiveQuadTo(534f, 286f)
                quadToRelative(-26f, -26f, -38.5f, -59f)
                reflectiveQuadTo(482f, 159f)
                quadToRelative(0f, -16f, 10.5f, -27.5f)
                reflectiveQuadTo(519f, 120f)
                quadToRelative(16f, 0f, 26.5f, 11f)
                reflectiveQuadToRelative(9.5f, 27f)
                quadToRelative(-1f, 21f, 6.5f, 40f)
                reflectiveQuadToRelative(22.5f, 34f)
                quadToRelative(26f, 26f, 39.5f, 59f)
                reflectiveQuadToRelative(14.5f, 69f)
                quadToRelative(0f, 17f, -10.5f, 28.5f)
                reflectiveQuadTo(601f, 400f)
                close()
                moveToRelative(79f, 400f)
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

