package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Expand_all: ImageVector
    get() {
        if (_Expand_all != null) return _Expand_all!!
        
        _Expand_all = ImageVector.Builder(
            name = "expand_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(240f, 640f)
                lineToRelative(57f, -57f)
                lineToRelative(183f, 183f)
                lineToRelative(183f, -183f)
                lineToRelative(57f, 57f)
                lineTo(480f, 880f)
                close()
                moveTo(298f, 376f)
                lineToRelative(-58f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-58f, 56f)
                lineToRelative(-182f, -182f)
                lineToRelative(-182f, 182f)
                close()
            }
        }.build()
        
        return _Expand_all!!
    }

private var _Expand_all: ImageVector? = null

