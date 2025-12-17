package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Prompt_suggestion: ImageVector
    get() {
        if (_Prompt_suggestion != null) return _Prompt_suggestion!!
        
        _Prompt_suggestion = ImageVector.Builder(
            name = "prompt_suggestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(687f, 560f)
                horizontalLineTo(300f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(120f, 380f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(300f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(340f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(300f, 280f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                horizontalLineToRelative(387f)
                lineTo(572f, 364f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(572f, 308f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(184f, 184f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(628f, 732f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(572f, 731f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(115f, -115f)
                close()
            }
        }.build()
        
        return _Prompt_suggestion!!
    }

private var _Prompt_suggestion: ImageVector? = null

