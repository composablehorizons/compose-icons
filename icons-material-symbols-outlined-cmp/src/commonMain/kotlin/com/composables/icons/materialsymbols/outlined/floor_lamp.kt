package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Floor_lamp: ImageVector
    get() {
        if (_Floor_lamp != null) return _Floor_lamp!!
        
        _Floor_lamp = ImageVector.Builder(
            name = "floor_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                verticalLineToRelative(-320f)
                horizontalLineTo(240f)
                quadToRelative(-20f, 0f, -32f, -16f)
                reflectiveQuadToRelative(-6f, -36f)
                lineToRelative(78f, -252f)
                quadToRelative(8f, -25f, 29f, -40.5f)
                reflectiveQuadToRelative(47f, -15.5f)
                horizontalLineToRelative(248f)
                quadToRelative(26f, 0f, 47f, 15.5f)
                reflectiveQuadToRelative(29f, 40.5f)
                lineToRelative(78f, 252f)
                quadToRelative(6f, 20f, -6f, 36f)
                reflectiveQuadToRelative(-32f, 16f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(294f, 360f)
                horizontalLineToRelative(372f)
                lineToRelative(-62f, -200f)
                horizontalLineTo(356f)
                lineToRelative(-62f, 200f)
                close()
                moveToRelative(26f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(160f, -620f)
                close()
            }
        }.build()
        
        return _Floor_lamp!!
    }

private var _Floor_lamp: ImageVector? = null

