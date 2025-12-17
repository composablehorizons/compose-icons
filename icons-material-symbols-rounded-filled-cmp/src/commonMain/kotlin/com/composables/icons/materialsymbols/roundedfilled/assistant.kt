package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Assistant: ImageVector
    get() {
        if (_Assistant != null) return _Assistant!!
        
        _Assistant = ImageVector.Builder(
            name = "assistant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.3f, 22.3f)
                lineTo(9f, 20f)
                horizontalLineTo(5f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 18.825f, 3f, 18f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.587f, -1.413f)
                quadTo(4.175f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(21f, 3.175f, 21f, 4f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(19.825f, 20f, 19f, 20f)
                horizontalLineToRelative(-4f)
                lineToRelative(-2.3f, 2.3f)
                quadToRelative(-0.275f, 0.275f, -0.7f, 0.275f)
                quadToRelative(-0.425f, 0f, -0.7f, -0.275f)
                close()
                moveToRelative(2.25f, -9.75f)
                lineToRelative(2.425f, -1.1f)
                quadToRelative(0.3f, -0.125f, 0.3f, -0.45f)
                reflectiveQuadToRelative(-0.3f, -0.45f)
                lineToRelative(-2.425f, -1.1f)
                lineToRelative(-1.1f, -2.425f)
                quadToRelative(-0.125f, -0.3f, -0.45f, -0.3f)
                reflectiveQuadToRelative(-0.45f, 0.3f)
                lineToRelative(-1.1f, 2.425f)
                lineToRelative(-2.425f, 1.1f)
                quadToRelative(-0.3f, 0.125f, -0.3f, 0.45f)
                reflectiveQuadToRelative(0.3f, 0.45f)
                lineToRelative(2.425f, 1.1f)
                lineToRelative(1.1f, 2.425f)
                quadToRelative(0.125f, 0.3f, 0.45f, 0.3f)
                reflectiveQuadToRelative(0.45f, -0.3f)
                close()
            }
        }.build()
        
        return _Assistant!!
    }

private var _Assistant: ImageVector? = null

