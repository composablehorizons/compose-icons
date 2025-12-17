package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Note: ImageVector
    get() {
        if (_Note != null) return _Note!!
        
        _Note = ImageVector.Builder(
            name = "note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 22f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(4f, 20.825f, 4f, 20f)
                verticalLineTo(4f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(5.175f, 2f, 6f, 2f)
                horizontalLineToRelative(8f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(18.825f, 22f, 18f, 22f)
                close()
                moveToRelative(7f, -13f)
                horizontalLineToRelative(5f)
                lineToRelative(-5f, -5f)
                close()
            }
        }.build()
        
        return _Note!!
    }

private var _Note: ImageVector? = null

