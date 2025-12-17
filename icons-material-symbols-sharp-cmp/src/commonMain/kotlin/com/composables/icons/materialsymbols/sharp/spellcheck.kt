package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Spellcheck: ImageVector
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
                moveTo(564f, 880f)
                lineTo(394f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 114f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 56f)
                lineTo(564f, 880f)
                close()
                moveTo(120f, 640f)
                lineToRelative(194f, -520f)
                horizontalLineToRelative(94f)
                lineToRelative(194f, 520f)
                horizontalLineToRelative(-92f)
                lineToRelative(-46f, -132f)
                horizontalLineTo(254f)
                lineToRelative(-46f, 132f)
                horizontalLineToRelative(-88f)
                close()
                moveToRelative(162f, -208f)
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

