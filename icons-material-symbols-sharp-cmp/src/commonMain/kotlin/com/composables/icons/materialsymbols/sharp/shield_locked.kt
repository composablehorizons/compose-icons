package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shield_locked: ImageVector
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
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 10f, -0.5f, 20f)
                reflectiveQuadToRelative(-1.5f, 20f)
                quadToRelative(-9f, -2f, -18.5f, -3f)
                reflectiveQuadToRelative(-19.5f, -1f)
                quadToRelative(-11f, 0f, -21f, 1f)
                reflectiveQuadToRelative(-21f, 3f)
                quadToRelative(1f, -10f, 1.5f, -19.5f)
                reflectiveQuadToRelative(0.5f, -20.5f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                quadToRelative(21f, -7f, 41f, -17f)
                reflectiveQuadToRelative(39f, -23f)
                verticalLineToRelative(94f)
                quadToRelative(-19f, 10f, -39f, 17.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Shield_locked!!
    }

private var _Shield_locked: ImageVector? = null

