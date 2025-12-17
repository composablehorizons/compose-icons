package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fireplace: ImageVector
    get() {
        if (_Fireplace != null) return _Fireplace!!
        
        _Fireplace = ImageVector.Builder(
            name = "fireplace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(424f, 678f)
                quadToRelative(13f, 11f, 27.5f, 15.5f)
                reflectiveQuadTo(480f, 698f)
                quadToRelative(29f, 0f, 52.5f, -18.5f)
                reflectiveQuadTo(560f, 626f)
                quadToRelative(5f, -47f, -29f, -69.5f)
                reflectiveQuadTo(480f, 498f)
                quadToRelative(-5f, 14f, -5f, 26f)
                reflectiveQuadToRelative(3f, 26f)
                quadToRelative(3f, 17f, 7f, 32f)
                reflectiveQuadToRelative(1f, 32f)
                quadToRelative(-5f, 18f, -22f, 37f)
                reflectiveQuadToRelative(-40f, 27f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -160f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -24f, -10f, -40f)
                reflectiveQuadToRelative(-28f, -30f)
                quadToRelative(-38f, -27f, -63.5f, -56.5f)
                reflectiveQuadTo(458f, 414f)
                quadToRelative(-44f, 35f, -71f, 79.5f)
                reflectiveQuadTo(360f, 598f)
                quadToRelative(0f, 35f, 36f, 78.5f)
                reflectiveQuadToRelative(84f, 43.5f)
                close()
                moveToRelative(-320f, 80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(90f)
                quadToRelative(-23f, -29f, -36.5f, -61f)
                reflectiveQuadTo(280f, 598f)
                quadToRelative(0f, -46f, 10f, -86.5f)
                reflectiveQuadToRelative(36.5f, -78.5f)
                quadToRelative(26.5f, -38f, 73.5f, -75.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(-11f, 44f, 9.5f, 93.5f)
                reflectiveQuadTo(606f, 464f)
                quadToRelative(33f, 24f, 53.5f, 56.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, 35f, -11f, 64.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(320f, -80f)
                close()
            }
        }.build()
        
        return _Fireplace!!
    }

private var _Fireplace: ImageVector? = null

