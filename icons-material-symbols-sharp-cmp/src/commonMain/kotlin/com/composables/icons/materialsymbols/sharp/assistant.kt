package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Assistant: ImageVector
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
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-7f, -5f)
                horizontalLineToRelative(4.8f)
                lineToRelative(2.2f, 2.2f)
                lineToRelative(2.2f, -2.2f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 4f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(8.55f, 8.55f)
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

