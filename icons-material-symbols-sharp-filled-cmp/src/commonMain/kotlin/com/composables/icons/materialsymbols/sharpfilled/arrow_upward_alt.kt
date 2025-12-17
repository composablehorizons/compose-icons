package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrow_upward_alt: ImageVector
    get() {
        if (_Arrow_upward_alt != null) return _Arrow_upward_alt!!
        
        _Arrow_upward_alt = ImageVector.Builder(
            name = "arrow_upward_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                verticalLineToRelative(-368f)
                lineTo(296f, 496f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-144f, -144f)
                verticalLineToRelative(368f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_upward_alt!!
    }

private var _Arrow_upward_alt: ImageVector? = null

