package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Swipe_right_alt: ImageVector
    get() {
        if (_Swipe_right_alt != null) return _Swipe_right_alt!!
        
        _Swipe_right_alt = ImageVector.Builder(
            name = "swipe_right_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(73f, 0f, 127.5f, 45.5f)
                reflectiveQuadTo(556f, 440f)
                horizontalLineToRelative(171f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(556f)
                quadToRelative(-14f, 69f, -68.5f, 114.5f)
                reflectiveQuadTo(360f, 680f)
                close()
            }
        }.build()
        
        return _Swipe_right_alt!!
    }

private var _Swipe_right_alt: ImageVector? = null

