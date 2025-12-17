package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Assistant: ImageVector
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

