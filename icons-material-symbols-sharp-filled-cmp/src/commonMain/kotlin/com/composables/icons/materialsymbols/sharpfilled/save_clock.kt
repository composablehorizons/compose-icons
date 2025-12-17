package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Save_clock: ImageVector
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
                moveTo(720f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(67f, -105f)
                lineToRelative(28f, -28f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(87f, 87f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                lineToRelative(160f, 160f)
                verticalLineToRelative(147f)
                quadToRelative(-28f, -14f, -59f, -20.5f)
                reflectiveQuadToRelative(-62f, -6.5f)
                quadToRelative(-60f, 0f, -111.5f, 23f)
                reflectiveQuadTo(518f, 486f)
                quadToRelative(-9f, -3f, -18.5f, -4.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 40f, 23f, 71f)
                reflectiveQuadToRelative(59f, 43f)
                quadToRelative(5f, 34f, 17f, 66f)
                reflectiveQuadToRelative(32f, 60f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Save_clock!!
    }

private var _Save_clock: ImageVector? = null

