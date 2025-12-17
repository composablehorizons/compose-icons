package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.File_copy_off: ImageVector
    get() {
        if (_File_copy_off != null) return _File_copy_off!!
        
        _File_copy_off = ImageVector.Builder(
            name = "file_copy_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(772f, 658f)
                lineTo(252f, 138f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                quadToRelative(0f, -29f, 20f, -49f)
                reflectiveQuadToRelative(49f, -20f)
                horizontalLineToRelative(258f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(316f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(772f, 658f)
                close()
                moveToRelative(76f, 246f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(648f, 760f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-328f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveTo(620f, 320f)
                horizontalLineToRelative(160f)
                lineTo(560f, 100f)
                lineToRelative(220f, 220f)
                lineToRelative(-220f, -220f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 320f)
                close()
                moveTo(160f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 360f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _File_copy_off!!
    }

private var _File_copy_off: ImageVector? = null

