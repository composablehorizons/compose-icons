package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fire_extinguisher: ImageVector
    get() {
        if (_Fire_extinguisher != null) return _Fire_extinguisher!!
        
        _Fire_extinguisher = ImageVector.Builder(
            name = "fire_extinguisher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-80f, -160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
                moveToRelative(4f, -240f)
                quadToRelative(10f, -46f, 42f, -86.5f)
                reflectiveQuadToRelative(81f, -59.5f)
                quadToRelative(-10f, -8f, -18f, -17.5f)
                reflectiveQuadTo(375f, 296f)
                lineToRelative(-129f, -27f)
                quadToRelative(-12f, -2f, -18f, -10.5f)
                reflectiveQuadToRelative(-6f, -18.5f)
                quadToRelative(0f, -10f, 6f, -18.5f)
                reflectiveQuadToRelative(18f, -10.5f)
                lineToRelative(129f, -27f)
                quadToRelative(15f, -29f, 42.5f, -46.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(21f, 0f, 40f, 7f)
                reflectiveQuadToRelative(34f, 19f)
                lineToRelative(78f, -16f)
                quadToRelative(19f, -4f, 33.5f, 8f)
                reflectiveQuadToRelative(14.5f, 31f)
                verticalLineToRelative(142f)
                quadToRelative(0f, 19f, -14.5f, 31f)
                reflectiveQuadToRelative(-33.5f, 8f)
                lineToRelative(-79f, -16f)
                quadToRelative(47f, 19f, 79.5f, 57.5f)
                reflectiveQuadTo(676f, 480f)
                horizontalLineTo(284f)
                close()
                moveToRelative(196f, -200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(-1f, -18f, -12f, -29f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 280f)
                close()
            }
        }.build()
        
        return _Fire_extinguisher!!
    }

private var _Fire_extinguisher: ImageVector? = null

