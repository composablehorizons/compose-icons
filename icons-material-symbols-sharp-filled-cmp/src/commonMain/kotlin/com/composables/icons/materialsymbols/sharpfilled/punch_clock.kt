package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Punch_clock: ImageVector
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
                moveTo(120f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, -640f)
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
                moveToRelative(46f, -106f)
                lineToRelative(28f, -28f)
                lineToRelative(-54f, -54f)
                verticalLineToRelative(-92f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(108f)
                lineToRelative(66f, 66f)
                close()
            }
        }.build()
        
        return _Punch_clock!!
    }

private var _Punch_clock: ImageVector? = null

