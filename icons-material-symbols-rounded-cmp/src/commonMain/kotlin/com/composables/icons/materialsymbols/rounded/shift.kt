package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shift: ImageVector
    get() {
        if (_Shift != null) return _Shift!!
        
        _Shift = ImageVector.Builder(
            name = "shift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineTo(204f)
                quadToRelative(-26f, 0f, -36.5f, -22.5f)
                reflectiveQuadTo(173f, 455f)
                lineToRelative(276f, -337f)
                quadToRelative(12f, -15f, 31f, -15f)
                reflectiveQuadToRelative(31f, 15f)
                lineToRelative(276f, 337f)
                quadToRelative(16f, 20f, 5.5f, 42.5f)
                reflectiveQuadTo(756f, 520f)
                horizontalLineTo(640f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                close()
                moveToRelative(80f, -40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(111f)
                lineTo(480f, 206f)
                lineTo(289f, 440f)
                horizontalLineToRelative(111f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(80f, -320f)
                close()
            }
        }.build()
        
        return _Shift!!
    }

private var _Shift: ImageVector? = null

