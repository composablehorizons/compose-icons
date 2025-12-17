package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Check_small: ImageVector
    get() {
        if (_Check_small != null) return _Check_small!!
        
        _Check_small = ImageVector.Builder(
            name = "check_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 656f)
                lineTo(240f, 496f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                lineToRelative(264f, -264f)
                lineToRelative(56f, 56f)
                lineToRelative(-320f, 320f)
                close()
            }
        }.build()
        
        return _Check_small!!
    }

private var _Check_small: ImageVector? = null

