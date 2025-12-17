package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Water_damage: ImageVector
    get() {
        if (_Water_damage != null) return _Water_damage!!
        
        _Water_damage = ImageVector.Builder(
            name = "water_damage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-347f)
                lineTo(480f, 220f)
                lineTo(280f, 373f)
                verticalLineToRelative(347f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-366f)
                lineTo(88f, 520f)
                lineToRelative(-47f, -63f)
                lineToRelative(439f, -337f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-112f, -86f)
                verticalLineToRelative(366f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(0f, -27f, -15f, -57.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-50f, 72f, -65f, 102.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Water_damage!!
    }

private var _Water_damage: ImageVector? = null

