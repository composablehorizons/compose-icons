package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fast_forward: ImageVector
    get() {
        if (_Fast_forward != null) return _Fast_forward!!
        
        _Fast_forward = ImageVector.Builder(
            name = "fast_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(100f, 720f)
                verticalLineToRelative(-480f)
                lineToRelative(360f, 240f)
                lineToRelative(-360f, 240f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-480f)
                lineToRelative(360f, 240f)
                lineToRelative(-360f, 240f)
                close()
                moveTo(180f, 480f)
                close()
                moveToRelative(400f, 0f)
                close()
                moveToRelative(-400f, 90f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(400f, 0f)
                lineToRelative(136f, -90f)
                lineToRelative(-136f, -90f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Fast_forward!!
    }

private var _Fast_forward: ImageVector? = null

