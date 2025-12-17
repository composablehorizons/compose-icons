package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flag_circle: ImageVector
    get() {
        if (_Flag_circle != null) return _Flag_circle!!
        
        _Flag_circle = ImageVector.Builder(
            name = "flag_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 520f)
                horizontalLineToRelative(100f)
                lineToRelative(29f, 58f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                horizontalLineToRelative(135f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineToRelative(-80f)
                lineToRelative(-29f, -58f)
                quadToRelative(-5f, -11f, -15f, -16.5f)
                reflectiveQuadToRelative(-21f, -5.5f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                verticalLineToRelative(370f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(350f, 720f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(380f, 690f)
                verticalLineToRelative(-170f)
                close()
                moveToRelative(140f, -80f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Flag_circle!!
    }

private var _Flag_circle: ImageVector? = null

