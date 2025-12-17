package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nfc: ImageVector
    get() {
        if (_Nfc != null) return _Nfc!!
        
        _Nfc = ImageVector.Builder(
            name = "nfc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(52f)
                quadToRelative(-20f, 11f, -30f, 28f)
                reflectiveQuadToRelative(-10f, 40f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -23f, -11f, -40f)
                reflectiveQuadToRelative(-29f, -28f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(400f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Nfc!!
    }

private var _Nfc: ImageVector? = null

