package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Support: ImageVector
    get() {
        if (_Support != null) return _Support!!
        
        _Support = ImageVector.Builder(
            name = "support",
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
                moveTo(364f, 778f)
                lineToRelative(48f, -110f)
                quadToRelative(-42f, -15f, -72.5f, -46.5f)
                reflectiveQuadTo(292f, 548f)
                lineToRelative(-110f, 46f)
                quadToRelative(23f, 64f, 71f, 112f)
                reflectiveQuadToRelative(111f, 72f)
                close()
                moveToRelative(-72f, -366f)
                quadToRelative(17f, -42f, 47.5f, -73.5f)
                reflectiveQuadTo(412f, 292f)
                lineToRelative(-46f, -110f)
                quadToRelative(-64f, 24f, -112f, 72f)
                reflectiveQuadToRelative(-72f, 112f)
                lineToRelative(110f, 46f)
                close()
                moveToRelative(188f, 188f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(116f, 178f)
                quadToRelative(63f, -24f, 110.5f, -71.5f)
                reflectiveQuadTo(778f, 596f)
                lineToRelative(-110f, -48f)
                quadToRelative(-15f, 42f, -46f, 72.5f)
                reflectiveQuadTo(550f, 668f)
                lineToRelative(46f, 110f)
                close()
                moveToRelative(72f, -368f)
                lineToRelative(110f, -46f)
                quadToRelative(-24f, -63f, -71.5f, -110.5f)
                reflectiveQuadTo(596f, 182f)
                lineToRelative(-46f, 112f)
                quadToRelative(41f, 15f, 71f, 45.5f)
                reflectiveQuadToRelative(47f, 70.5f)
                close()
            }
        }.build()
        
        return _Support!!
    }

private var _Support: ImageVector? = null

