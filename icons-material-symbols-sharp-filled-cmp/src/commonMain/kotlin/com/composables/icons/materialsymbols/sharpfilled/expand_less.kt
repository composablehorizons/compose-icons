package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Expand_less: ImageVector
    get() {
        if (_Expand_less != null) return _Expand_less!!
        
        _Expand_less = ImageVector.Builder(
            name = "expand_less",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 615f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -184f)
                lineToRelative(-184f, 184f)
                close()
            }
        }.build()
        
        return _Expand_less!!
    }

private var _Expand_less: ImageVector? = null

