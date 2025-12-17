package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_downward_alt: ImageVector
    get() {
        if (_Arrow_downward_alt != null) return _Arrow_downward_alt!!
        
        _Arrow_downward_alt = ImageVector.Builder(
            name = "arrow_downward_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                lineTo(240f, 480f)
                lineToRelative(56f, -56f)
                lineToRelative(144f, 144f)
                verticalLineToRelative(-368f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(368f)
                lineToRelative(144f, -144f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Arrow_downward_alt!!
    }

private var _Arrow_downward_alt: ImageVector? = null

