package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_dining: ImageVector
    get() {
        if (_Local_dining != null) return _Local_dining!!
        
        _Local_dining = ImageVector.Builder(
            name = "local_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(479f, 538f)
                lineTo(203f, 812f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(147f, 812f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(382f, -382f)
                quadToRelative(-18f, -42f, -5f, -95f)
                reflectiveQuadToRelative(57f, -95f)
                quadToRelative(53f, -53f, 118f, -62f)
                reflectiveQuadToRelative(106f, 32f)
                quadToRelative(41f, 41f, 32f, 106f)
                reflectiveQuadToRelative(-62f, 118f)
                quadToRelative(-42f, 44f, -95f, 57f)
                reflectiveQuadToRelative(-95f, -5f)
                lineToRelative(-50f, 50f)
                lineToRelative(276f, 276f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(811f, 812f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(479f, 538f)
                close()
                moveToRelative(-186f, -40f)
                lineTo(173f, 378f)
                quadToRelative(-42f, -42f, -53f, -106f)
                reflectiveQuadToRelative(25f, -114f)
                quadToRelative(11f, -15f, 29.5f, -17f)
                reflectiveQuadToRelative(31.5f, 12f)
                lineToRelative(215f, 217f)
                lineToRelative(-128f, 128f)
                close()
            }
        }.build()
        
        return _Local_dining!!
    }

private var _Local_dining: ImageVector? = null

