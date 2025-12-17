package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Airlines: ImageVector
    get() {
        if (_Airlines != null) return _Airlines!!
        
        _Airlines = ImageVector.Builder(
            name = "airlines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(232f, 720f)
                horizontalLineToRelative(462f)
                lineToRelative(90f, -480f)
                horizontalLineTo(562f)
                lineTo(232f, 720f)
                close()
                moveTo(80f, 800f)
                lineToRelative(440f, -640f)
                horizontalLineToRelative(360f)
                lineTo(760f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(500f, -240f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(232f, 720f)
                horizontalLineToRelative(462f)
                horizontalLineToRelative(-462f)
                close()
            }
        }.build()
        
        return _Airlines!!
    }

private var _Airlines: ImageVector? = null

