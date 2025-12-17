package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Done_outline: ImageVector
    get() {
        if (_Done_outline != null) return _Done_outline!!
        
        _Done_outline = ImageVector.Builder(
            name = "done_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(381f, 720f)
                lineToRelative(424f, -424f)
                lineToRelative(-57f, -56f)
                lineToRelative(-368f, 367f)
                lineToRelative(-169f, -170f)
                lineToRelative(-57f, 57f)
                lineToRelative(227f, 226f)
                close()
                moveToRelative(0f, 113f)
                lineTo(42f, 494f)
                lineToRelative(169f, -170f)
                lineToRelative(170f, 170f)
                lineToRelative(366f, -367f)
                lineToRelative(172f, 168f)
                lineToRelative(-538f, 538f)
                close()
            }
        }.build()
        
        return _Done_outline!!
    }

private var _Done_outline: ImageVector? = null

