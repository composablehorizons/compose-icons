package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Energy_program_saving: ImageVector
    get() {
        if (_Energy_program_saving != null) return _Energy_program_saving!!
        
        _Energy_program_saving = ImageVector.Builder(
            name = "energy_program_saving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 680f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(640f, 500f)
                verticalLineToRelative(-180f)
                horizontalLineTo(460f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(280f, 500f)
                quadToRelative(0f, 26f, 7f, 50f)
                reflectiveQuadToRelative(21f, 46f)
                lineToRelative(-16f, 16f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(16f, -16f)
                quadToRelative(22f, 14f, 46f, 21f)
                reflectiveQuadToRelative(50f, 7f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-9f, 0f, -18f, -2f)
                reflectiveQuadToRelative(-18f, -5f)
                lineToRelative(84f, -85f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineToRelative(-85f, 84f)
                quadToRelative(-3f, -9f, -5f, -18f)
                reflectiveQuadToRelative(-2f, -18f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(20f, 320f)
                lineTo(342f, 812f)
                lineToRelative(-173f, -21f)
                lineToRelative(-21f, -173f)
                lineTo(40f, 480f)
                lineToRelative(108f, -138f)
                lineToRelative(21f, -173f)
                lineToRelative(173f, -21f)
                lineToRelative(138f, -108f)
                lineToRelative(138f, 108f)
                lineToRelative(173f, 21f)
                lineToRelative(21f, 173f)
                lineToRelative(108f, 138f)
                lineToRelative(-108f, 138f)
                lineToRelative(-21f, 173f)
                lineToRelative(-173f, 21f)
                lineTo(480f, 920f)
                close()
                moveToRelative(0f, -102f)
                lineToRelative(106f, -82f)
                lineToRelative(134f, -17f)
                lineToRelative(16f, -133f)
                lineToRelative(82f, -106f)
                lineToRelative(-82f, -106f)
                lineToRelative(-17f, -133f)
                lineToRelative(-133f, -17f)
                lineToRelative(-106f, -82f)
                lineToRelative(-106f, 82f)
                lineToRelative(-134f, 17f)
                lineToRelative(-16f, 133f)
                lineToRelative(-82f, 106f)
                lineToRelative(82f, 106f)
                lineToRelative(17f, 134f)
                lineToRelative(133f, 16f)
                lineToRelative(106f, 82f)
                close()
                moveToRelative(0f, -338f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Energy_program_saving!!
    }

private var _Energy_program_saving: ImageVector? = null

