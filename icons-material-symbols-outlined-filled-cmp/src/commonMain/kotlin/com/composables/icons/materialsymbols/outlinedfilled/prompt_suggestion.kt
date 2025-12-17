package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Prompt_suggestion: ImageVector
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
                moveTo(600f, 760f)
                lineToRelative(-56f, -57f)
                lineToRelative(143f, -143f)
                horizontalLineTo(300f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(120f, 380f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(300f, 200f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-20f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                horizontalLineToRelative(387f)
                lineTo(544f, 336f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Prompt_suggestion!!
    }

private var _Prompt_suggestion: ImageVector? = null

