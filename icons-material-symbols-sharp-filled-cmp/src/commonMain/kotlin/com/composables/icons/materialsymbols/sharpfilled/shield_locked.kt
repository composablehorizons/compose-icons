package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shield_locked: ImageVector
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
                moveTo(640f, 880f)
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
                moveTo(480f, 880f)
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
                quadToRelative(-83f, 0f, -141.5f, 58f)
                reflectiveQuadTo(560f, 680f)
                verticalLineToRelative(170f)
                quadToRelative(-19f, 10f, -39f, 17.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Shield_locked!!
    }

private var _Shield_locked: ImageVector? = null

