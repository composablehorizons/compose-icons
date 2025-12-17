package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Autorenew: ImageVector
    get() {
        if (_Autorenew != null) return _Autorenew!!
        
        _Autorenew = ImageVector.Builder(
            name = "autorenew",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 482f)
                quadToRelative(0f, 16f, 2f, 31.5f)
                reflectiveQuadToRelative(7f, 30.5f)
                quadToRelative(5f, 17f, -1f, 32.5f)
                reflectiveQuadTo(227f, 599f)
                quadToRelative(-16f, 8f, -31.5f, 1.5f)
                reflectiveQuadTo(175f, 577f)
                quadToRelative(-8f, -23f, -11.5f, -47f)
                reflectiveQuadToRelative(-3.5f, -48f)
                quadToRelative(0f, -134f, 93f, -228f)
                reflectiveQuadToRelative(227f, -94f)
                horizontalLineToRelative(7f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(507f, 332f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -36f)
                horizontalLineToRelative(-7f)
                quadToRelative(-100f, 0f, -170f, 70.5f)
                reflectiveQuadTo(240f, 482f)
                close()
                moveToRelative(480f, -4f)
                quadToRelative(0f, -16f, -2f, -31.5f)
                reflectiveQuadToRelative(-7f, -30.5f)
                quadToRelative(-5f, -17f, 1f, -32.5f)
                reflectiveQuadToRelative(21f, -22.5f)
                quadToRelative(16f, -8f, 31.5f, -1.5f)
                reflectiveQuadTo(785f, 383f)
                quadToRelative(8f, 23f, 11.5f, 47f)
                reflectiveQuadToRelative(3.5f, 48f)
                quadToRelative(0f, 134f, -93f, 228f)
                reflectiveQuadToRelative(-227f, 94f)
                horizontalLineToRelative(-7f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(349f, 788f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-36f, 36f)
                horizontalLineToRelative(7f)
                quadToRelative(100f, 0f, 170f, -70.5f)
                reflectiveQuadTo(720f, 478f)
                close()
            }
        }.build()
        
        return _Autorenew!!
    }

private var _Autorenew: ImageVector? = null

