package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Energy_program_saving: ImageVector
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
                moveToRelative(20f, 240f)
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
                moveToRelative(28f, -412f)
                quadToRelative(11f, -12f, 11f, -28.5f)
                reflectiveQuadTo(508f, 452f)
                quadToRelative(-11f, -11f, -27.5f, -11f)
                reflectiveQuadTo(452f, 452f)
                lineToRelative(-56f, 56f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(27.5f, -12f)
                lineToRelative(56f, -57f)
                close()
            }
        }.build()
        
        return _Energy_program_saving!!
    }

private var _Energy_program_saving: ImageVector? = null

