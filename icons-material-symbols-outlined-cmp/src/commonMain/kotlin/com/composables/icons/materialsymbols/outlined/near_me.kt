package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Near_me: ImageVector
    get() {
        if (_Near_me != null) return _Near_me!!
        
        _Near_me = ImageVector.Builder(
            name = "near_me",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(516f, 840f)
                lineTo(402f, 558f)
                lineTo(120f, 444f)
                verticalLineToRelative(-56f)
                lineToRelative(720f, -268f)
                lineToRelative(-268f, 720f)
                horizontalLineToRelative(-56f)
                close()
                moveToRelative(26f, -148f)
                lineToRelative(162f, -436f)
                lineToRelative(-436f, 162f)
                lineToRelative(196f, 78f)
                lineToRelative(78f, 196f)
                close()
                moveToRelative(-78f, -196f)
                close()
            }
        }.build()
        
        return _Near_me!!
    }

private var _Near_me: ImageVector? = null

