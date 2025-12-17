package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Punch_clock: ImageVector
    get() {
        if (_Punch_clock != null) return _Punch_clock!!
        
        _Punch_clock = ImageVector.Builder(
            name = "punch_clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 120f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 320f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(120f, -640f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(160f, 500f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 560f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 560f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 740f)
                close()
                moveToRelative(20f, -188f)
                verticalLineToRelative(-72f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(71f)
                quadToRelative(0f, 8f, 3f, 15.5f)
                reflectiveQuadToRelative(9f, 13.5f)
                lineToRelative(40f, 40f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-40f, -40f)
                close()
            }
        }.build()
        
        return _Punch_clock!!
    }

private var _Punch_clock: ImageVector? = null

