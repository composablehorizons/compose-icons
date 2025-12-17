package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_outward: ImageVector
    get() {
        if (_Arrow_outward != null) return _Arrow_outward!!
        
        _Arrow_outward = ImageVector.Builder(
            name = "arrow_outward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 720f)
                lineToRelative(-56f, -56f)
                lineToRelative(384f, -384f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-344f)
                lineTo(256f, 720f)
                close()
            }
        }.build()
        
        return _Arrow_outward!!
    }

private var _Arrow_outward: ImageVector? = null

