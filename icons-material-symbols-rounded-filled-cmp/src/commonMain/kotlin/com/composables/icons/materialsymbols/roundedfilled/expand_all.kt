package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Expand_all: ImageVector
    get() {
        if (_Expand_all != null) return _Expand_all!!
        
        _Expand_all = ImageVector.Builder(
            name = "expand_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 766f)
                lineToRelative(155f, -155f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(691f, 668f)
                lineTo(537f, 823f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(268f, 668f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(269f, 611f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(154f, 155f)
                close()
                moveToRelative(0f, -572f)
                lineTo(326f, 348f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(270f, 348f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(269f, 291f)
                lineToRelative(154f, -154f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(154f, 154f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(690f, 348f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(634f, 348f)
                lineTo(480f, 194f)
                close()
            }
        }.build()
        
        return _Expand_all!!
    }

private var _Expand_all: ImageVector? = null

