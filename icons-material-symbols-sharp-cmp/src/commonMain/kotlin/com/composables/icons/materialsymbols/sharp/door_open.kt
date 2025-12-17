package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Door_open: ImageVector
    get() {
        if (_Door_open != null) return _Door_open!!
        
        _Door_open = ImageVector.Builder(
            name = "door_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 520f)
                close()
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(240f, -40f)
                verticalLineToRelative(-481f)
                lineToRelative(-240f, -39f)
                verticalLineToRelative(-80f)
                lineToRelative(320f, 52f)
                verticalLineToRelative(614f)
                lineToRelative(-320f, 54f)
                close()
                moveToRelative(-160f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-560f)
                horizontalLineTo(280f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Door_open!!
    }

private var _Door_open: ImageVector? = null

