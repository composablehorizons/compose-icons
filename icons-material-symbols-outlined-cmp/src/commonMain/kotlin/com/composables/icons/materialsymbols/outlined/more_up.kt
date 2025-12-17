package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.More_up: ImageVector
    get() {
        if (_More_up != null) return _More_up!!
        
        _More_up = ImageVector.Builder(
            name = "more_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 640f)
                verticalLineToRelative(-360f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 840f)
                verticalLineToRelative(-360f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _More_up!!
    }

private var _More_up: ImageVector? = null

