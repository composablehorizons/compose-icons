package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Filter_hdr: ImageVector
    get() {
        if (_Filter_hdr != null) return _Filter_hdr!!
        
        _Filter_hdr = ImageVector.Builder(
            name = "filter_hdr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 720f)
                lineToRelative(240f, -320f)
                lineToRelative(180f, 240f)
                horizontalLineToRelative(101f)
                lineTo(410f, 440f)
                lineToRelative(150f, -200f)
                lineToRelative(360f, 480f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Filter_hdr!!
    }

private var _Filter_hdr: ImageVector? = null

