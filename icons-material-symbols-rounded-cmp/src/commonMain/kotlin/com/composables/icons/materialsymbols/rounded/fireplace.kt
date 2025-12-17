package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fireplace: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                close()
                moveToRelative(400f, -80f)
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
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 720f)
                horizontalLineToRelative(50f)
                quadToRelative(-23f, -29f, -36.5f, -61f)
                reflectiveQuadTo(280f, 598f)
                quadToRelative(0f, -105f, 48f, -168.5f)
                reflectiveQuadTo(463f, 314f)
                quadToRelative(10f, -6f, 20f, -6f)
                reflectiveQuadToRelative(19f, 5f)
                quadToRelative(9f, 5f, 15f, 14f)
                reflectiveQuadToRelative(7f, 20f)
                quadToRelative(2f, 34f, 29f, 66f)
                reflectiveQuadToRelative(53f, 51f)
                quadToRelative(33f, 24f, 53.5f, 56.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, 35f, -11f, 64.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(40f)
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

