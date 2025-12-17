package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
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
                lineToRelative(195f, -73f)
                lineToRelative(-203f, -203f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-203f, -203f)
                lineToRelative(-73f, 195f)
                horizontalLineToRelative(-56f)
                close()
                moveToRelative(191f, -361f)
                lineTo(481f, 253f)
                lineToRelative(359f, -133f)
                lineToRelative(-133f, 359f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

