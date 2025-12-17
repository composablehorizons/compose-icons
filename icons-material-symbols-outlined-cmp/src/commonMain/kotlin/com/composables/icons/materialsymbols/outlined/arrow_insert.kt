package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_insert: ImageVector
    get() {
        if (_Arrow_insert != null) return _Arrow_insert!!
        
        _Arrow_insert = ImageVector.Builder(
            name = "arrow_insert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(704f, 720f)
                lineTo(320f, 336f)
                verticalLineToRelative(344f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(376f)
                lineToRelative(384f, 384f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Arrow_insert!!
    }

private var _Arrow_insert: ImageVector? = null

