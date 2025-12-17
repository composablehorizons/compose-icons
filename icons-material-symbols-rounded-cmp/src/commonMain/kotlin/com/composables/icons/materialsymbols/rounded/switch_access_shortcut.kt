package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Switch_access_shortcut: ImageVector
    get() {
        if (_Switch_access_shortcut != null) return _Switch_access_shortcut!!
        
        _Switch_access_shortcut = ImageVector.Builder(
            name = "switch_access_shortcut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 212f)
                quadToRelative(-57f, 51f, -88.5f, 119.5f)
                reflectiveQuadTo(400f, 476f)
                quadToRelative(0f, 91f, 43.5f, 170.5f)
                reflectiveQuadTo(565f, 774f)
                quadToRelative(14f, 9f, 19.5f, 24.5f)
                reflectiveQuadTo(582f, 829f)
                quadToRelative(-8f, 15f, -23f, 20.5f)
                reflectiveQuadToRelative(-29f, -2.5f)
                quadToRelative(-98f, -59f, -154f, -157.5f)
                reflectiveQuadTo(320f, 476f)
                quadToRelative(0f, -91f, 36f, -172.5f)
                reflectiveQuadTo(458f, 160f)
                horizontalLineToRelative(-98f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 120f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(-108f)
                close()
            }
        }.build()
        
        return _Switch_access_shortcut!!
    }

private var _Switch_access_shortcut: ImageVector? = null

