package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chevron_forward: ImageVector
    get() {
        if (_Chevron_forward != null) return _Chevron_forward!!
        
        _Chevron_forward = ImageVector.Builder(
            name = "chevron_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 480f)
                lineTo(320f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                lineToRelative(-56f, -56f)
                lineToRelative(184f, -184f)
                close()
            }
        }.build()
        
        return _Chevron_forward!!
    }

private var _Chevron_forward: ImageVector? = null

