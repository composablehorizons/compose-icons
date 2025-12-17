package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Change_history: ImageVector
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
                moveTo(152f, 800f)
                quadToRelative(-23f, 0f, -35f, -20.5f)
                reflectiveQuadToRelative(1f, -40.5f)
                lineToRelative(328f, -525f)
                quadToRelative(12f, -19f, 34f, -19f)
                reflectiveQuadToRelative(34f, 19f)
                lineToRelative(328f, 525f)
                quadToRelative(13f, 20f, 1f, 40.5f)
                reflectiveQuadTo(808f, 800f)
                horizontalLineTo(152f)
                close()
                moveToRelative(72f, -80f)
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

