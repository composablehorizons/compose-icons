package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stars: ImageVector
    get() {
        if (_Stars != null) return _Stars!!
        
        _Stars = ImageVector.Builder(
            name = "stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 598f)
                lineToRelative(111f, 84f)
                quadToRelative(12f, 8f, 24f, 0.5f)
                reflectiveQuadToRelative(7f, -21.5f)
                lineToRelative(-42f, -139f)
                lineToRelative(109f, -78f)
                quadToRelative(12f, -9f, 7f, -22.5f)
                reflectiveQuadTo(677f, 408f)
                horizontalLineTo(544f)
                lineToRelative(-45f, -146f)
                quadToRelative(-5f, -14f, -19f, -14f)
                reflectiveQuadToRelative(-19f, 14f)
                lineToRelative(-45f, 146f)
                horizontalLineTo(283f)
                quadToRelative(-14f, 0f, -19f, 13.5f)
                reflectiveQuadToRelative(7f, 22.5f)
                lineToRelative(109f, 78f)
                lineToRelative(-42f, 139f)
                quadToRelative(-5f, 14f, 7f, 21.5f)
                reflectiveQuadToRelative(24f, -0.5f)
                lineToRelative(111f, -84f)
                close()
                moveToRelative(0f, 282f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -400f)
                close()
                moveToRelative(0f, 320f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Stars!!
    }

private var _Stars: ImageVector? = null

