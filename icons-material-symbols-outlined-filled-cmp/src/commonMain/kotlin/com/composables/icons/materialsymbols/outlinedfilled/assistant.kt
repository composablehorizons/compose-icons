package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Assistant: ImageVector
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
                moveTo(12f, 23f)
                lineToRelative(-3f, -3f)
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
                close()
                moveToRelative(1.55f, -10.45f)
                lineTo(17f, 11f)
                lineToRelative(-3.45f, -1.55f)
                lineTo(12f, 6f)
                lineToRelative(-1.55f, 3.45f)
                lineTo(7f, 11f)
                lineToRelative(3.45f, 1.55f)
                lineTo(12f, 16f)
                close()
            }
        }.build()
        
        return _Assistant!!
    }

private var _Assistant: ImageVector? = null

