package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_forward_ios: ImageVector
    get() {
        if (_Arrow_forward_ios != null) return _Arrow_forward_ios!!
        
        _Arrow_forward_ios = ImageVector.Builder(
            name = "arrow_forward_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(321f, 880f)
                lineToRelative(-71f, -71f)
                lineToRelative(329f, -329f)
                lineToRelative(-329f, -329f)
                lineToRelative(71f, -71f)
                lineToRelative(400f, 400f)
                lineTo(321f, 880f)
                close()
            }
        }.build()
        
        return _Arrow_forward_ios!!
    }

private var _Arrow_forward_ios: ImageVector? = null

