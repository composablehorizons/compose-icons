package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Skip_previous: ImageVector
    get() {
        if (_Skip_previous != null) return _Skip_previous!!
        
        _Skip_previous = ImageVector.Builder(
            name = "skip_previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(520f, 0f)
                lineTo(380f, 480f)
                lineToRelative(360f, -240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(-80f, -240f)
                close()
                moveToRelative(0f, 90f)
                verticalLineToRelative(-180f)
                lineToRelative(-136f, 90f)
                lineToRelative(136f, 90f)
                close()
            }
        }.build()
        
        return _Skip_previous!!
    }

private var _Skip_previous: ImageVector? = null

