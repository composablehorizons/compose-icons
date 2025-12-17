package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Change_history: ImageVector
    get() {
        if (_Change_history != null) return _Change_history!!
        
        _Change_history = ImageVector.Builder(
            name = "change_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                lineToRelative(400f, -640f)
                lineToRelative(400f, 640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(144f, -80f)
                horizontalLineToRelative(512f)
                lineTo(480f, 310f)
                lineTo(224f, 720f)
                close()
                moveToRelative(256f, -205f)
                close()
            }
        }.build()
        
        return _Change_history!!
    }

private var _Change_history: ImageVector? = null

