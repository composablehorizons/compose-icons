package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-240f)
                lineToRelative(320f, -80f)
                lineToRelative(-320f, -80f)
                verticalLineToRelative(-240f)
                lineToRelative(760f, 320f)
                lineToRelative(-760f, 320f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

