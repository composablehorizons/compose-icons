package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`1x_mobiledata`: ImageVector
    get() {
        if (_1x_mobiledata != null) return _1x_mobiledata!!
        
        _1x_mobiledata = ImageVector.Builder(
            name = "1x_mobiledata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(174f, 0f)
                lineToRelative(126f, -212f)
                lineToRelative(-114f, -188f)
                horizontalLineToRelative(94f)
                lineToRelative(66f, 110f)
                lineToRelative(68f, -110f)
                horizontalLineToRelative(92f)
                lineTo(634f, 468f)
                lineToRelative(126f, 212f)
                horizontalLineToRelative(-94f)
                lineToRelative(-80f, -134f)
                lineToRelative(-80f, 134f)
                horizontalLineToRelative(-92f)
                close()
            }
        }.build()
        
        return _1x_mobiledata!!
    }

private var _1x_mobiledata: ImageVector? = null

