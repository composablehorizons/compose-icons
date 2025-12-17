package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airlines: ImageVector
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
                moveToRelative(-130f, 49f)
                lineToRelative(394f, -574f)
                quadToRelative(11f, -17f, 28.5f, -26f)
                reflectiveQuadToRelative(37.5f, -9f)
                horizontalLineToRelative(222f)
                quadToRelative(38f, 0f, 61.5f, 29f)
                reflectiveQuadToRelative(16.5f, 66f)
                lineToRelative(-96f, 512f)
                quadToRelative(-3f, 14f, -14f, 23.5f)
                reflectiveQuadToRelative(-25f, 9.5f)
                horizontalLineTo(118f)
                quadToRelative(-12f, 0f, -17.5f, -10.5f)
                reflectiveQuadTo(102f, 769f)
                close()
                moveToRelative(478f, -209f)
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

