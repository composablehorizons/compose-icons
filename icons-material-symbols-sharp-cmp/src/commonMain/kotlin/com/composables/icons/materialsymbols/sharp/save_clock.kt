package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Save_clock: ImageVector
    get() {
        if (_Save_clock != null) return _Save_clock!!
        
        _Save_clock = ImageVector.Builder(
            name = "save_clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(203f)
                verticalLineToRelative(-3f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(147f)
                quadToRelative(-19f, -9f, -39f, -15f)
                reflectiveQuadToRelative(-41f, -9f)
                verticalLineToRelative(-89f)
                lineTo(646f, 200f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(252f)
                quadToRelative(7f, 22f, 16.5f, 42f)
                reflectiveQuadToRelative(22.5f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(600f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(20f, -208f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(87f, 87f)
                lineToRelative(28f, -28f)
                lineToRelative(-75f, -75f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(202f, 314f)
                quadToRelative(-1f, -9f, -1.5f, -17.5f)
                reflectiveQuadTo(440f, 679f)
                quadToRelative(0f, -54f, 20f, -104f)
                reflectiveQuadToRelative(58f, -89f)
                quadToRelative(-9f, -3f, -18.5f, -4.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 39f, 22.5f, 70.5f)
                reflectiveQuadTo(442f, 714f)
                close()
            }
        }.build()
        
        return _Save_clock!!
    }

private var _Save_clock: ImageVector? = null

