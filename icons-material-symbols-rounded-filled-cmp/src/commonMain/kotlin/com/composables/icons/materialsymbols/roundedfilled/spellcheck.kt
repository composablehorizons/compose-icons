package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Spellcheck: ImageVector
    get() {
        if (_Spellcheck != null) return _Spellcheck!!
        
        _Spellcheck = ImageVector.Builder(
            name = "spellcheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(564f, 768f)
                lineToRelative(198f, -198f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(621f, 823f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineToRelative(-85f, -85f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                close()
                moveTo(254f, 508f)
                lineToRelative(-37f, 105f)
                quadToRelative(-5f, 12f, -15f, 19.5f)
                reflectiveQuadToRelative(-23f, 7.5f)
                quadToRelative(-22f, 0f, -34f, -18f)
                reflectiveQuadToRelative(-4f, -38f)
                lineToRelative(162f, -435f)
                quadToRelative(5f, -13f, 16.5f, -21f)
                reflectiveQuadToRelative(25.5f, -8f)
                horizontalLineToRelative(32f)
                quadToRelative(14f, 0f, 25.5f, 8f)
                reflectiveQuadToRelative(16.5f, 21f)
                lineToRelative(162f, 434f)
                quadToRelative(8f, 21f, -4.5f, 39f)
                reflectiveQuadTo(541f, 640f)
                quadToRelative(-14f, 0f, -25f, -8f)
                reflectiveQuadToRelative(-16f, -21f)
                lineToRelative(-36f, -103f)
                horizontalLineTo(254f)
                close()
                moveToRelative(28f, -76f)
                horizontalLineToRelative(156f)
                lineToRelative(-76f, -216f)
                horizontalLineToRelative(-4f)
                lineToRelative(-76f, 216f)
                close()
            }
        }.build()
        
        return _Spellcheck!!
    }

private var _Spellcheck: ImageVector? = null

