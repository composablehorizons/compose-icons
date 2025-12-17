package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Search_hands_free: ImageVector
    get() {
        if (_Search_hands_free != null) return _Search_hands_free!!
        
        _Search_hands_free = ImageVector.Builder(
            name = "search_hands_free",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
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
                moveToRelative(-40f, -84f)
                verticalLineToRelative(-120f)
                quadToRelative(-60f, -12f, -102f, -54f)
                reflectiveQuadToRelative(-54f, -102f)
                horizontalLineTo(164f)
                quadToRelative(12f, 109f, 89.5f, 185f)
                reflectiveQuadTo(440f, 796f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(109f, -12f, 186.5f, -89.5f)
                reflectiveQuadTo(796f, 520f)
                horizontalLineTo(676f)
                quadToRelative(-12f, 60f, -54f, 102f)
                reflectiveQuadToRelative(-102f, 54f)
                verticalLineToRelative(120f)
                close()
                moveTo(164f, 440f)
                horizontalLineToRelative(116f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(160f)
                lineToRelative(120f, 120f)
                horizontalLineToRelative(116f)
                quadToRelative(-15f, -121f, -105f, -200.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-121f, 0f, -211f, 79.5f)
                reflectiveQuadTo(164f, 440f)
                close()
            }
        }.build()
        
        return _Search_hands_free!!
    }

private var _Search_hands_free: ImageVector? = null

