package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Expand_more: ImageVector
    get() {
        if (_Expand_more != null) return _Expand_more!!
        
        _Expand_more = ImageVector.Builder(
            name = "expand_more",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 615f)
                lineTo(240f, 375f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 184f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Expand_more!!
    }

private var _Expand_more: ImageVector? = null

