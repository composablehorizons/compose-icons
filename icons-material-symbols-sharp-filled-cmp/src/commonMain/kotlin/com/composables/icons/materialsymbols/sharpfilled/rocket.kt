package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-237f)
                quadToRelative(0f, -20f, 9.5f, -38f)
                reflectiveQuadToRelative(26.5f, -29f)
                lineToRelative(44f, -29f)
                quadToRelative(7f, 84f, 22f, 143f)
                reflectiveQuadToRelative(47f, 131f)
                lineTo(160f, 880f)
                close()
                moveToRelative(209f, -80f)
                quadToRelative(-35f, -66f, -52f, -140f)
                reflectiveQuadToRelative(-17f, -153f)
                quadToRelative(0f, -125f, 49.5f, -235.5f)
                reflectiveQuadTo(480f, 104f)
                quadToRelative(81f, 57f, 130.5f, 167.5f)
                reflectiveQuadTo(660f, 507f)
                quadToRelative(0f, 78f, -17f, 151.5f)
                reflectiveQuadTo(591f, 800f)
                horizontalLineTo(369f)
                close()
                moveToRelative(111f, -280f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveTo(800f, 880f)
                lineToRelative(-149f, -59f)
                quadToRelative(32f, -72f, 47f, -131f)
                reflectiveQuadToRelative(22f, -143f)
                lineToRelative(44f, 29f)
                quadToRelative(17f, 11f, 26.5f, 29f)
                reflectiveQuadToRelative(9.5f, 38f)
                verticalLineToRelative(237f)
                close()
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

