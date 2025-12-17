package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shield_locked: ImageVector
    get() {
        if (_Shield_locked != null) return _Shield_locked!!
        
        _Shield_locked = ImageVector.Builder(
            name = "shield_locked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(760f, 484f)
                quadToRelative(-17f, 0f, -28.5f, -11f)
                reflectiveQuadTo(720f, 444f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                quadToRelative(11f, -4f, 23f, -9.5f)
                reflectiveQuadToRelative(23f, -10.5f)
                quadToRelative(15f, -7f, 31f, -1f)
                reflectiveQuadToRelative(23f, 21f)
                quadToRelative(7f, 15f, 1f, 31f)
                reflectiveQuadToRelative(-21f, 23f)
                quadToRelative(-11f, 5f, -24.5f, 10.5f)
                reflectiveQuadTo(511f, 871f)
                quadToRelative(-6f, 2f, -12.5f, 3.5f)
                reflectiveQuadTo(485f, 876f)
                quadToRelative(-7f, 0f, -13f, -1.5f)
                reflectiveQuadTo(460f, 871f)
                quadToRelative(-135f, -45f, -215.5f, -166f)
                reflectiveQuadTo(160f, 444f)
                close()
                moveTo(674f, 880f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(6f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(674f)
                close()
                moveToRelative(46f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(40f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Shield_locked!!
    }

private var _Shield_locked: ImageVector? = null

