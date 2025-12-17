package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Avg_pace: ImageVector
    get() {
        if (_Avg_pace != null) return _Avg_pace!!
        
        _Avg_pace = ImageVector.Builder(
            name = "avg_pace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(610f, 200f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(560f, 150f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(610f, 100f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(660f, 150f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(610f, 200f)
                close()
                moveToRelative(0f, 660f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(560f, 810f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(610f, 760f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(660f, 810f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(610f, 860f)
                close()
                moveToRelative(160f, -520f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 290f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 240f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 290f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 340f)
                close()
                moveToRelative(0f, 380f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 670f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 620f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 670f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 720f)
                close()
                moveToRelative(60f, -190f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(830f, 430f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(830f, 530f)
                close()
                moveTo(80f, 480f)
                quadToRelative(0f, -157f, 104.5f, -270f)
                reflectiveQuadTo(441f, 82f)
                quadToRelative(16f, -2f, 27.5f, 9.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(0f, 16f, -10.5f, 28f)
                reflectiveQuadTo(443f, 162f)
                quadToRelative(-121f, 14f, -202f, 104f)
                reflectiveQuadToRelative(-81f, 214f)
                quadToRelative(0f, 125f, 81f, 214.5f)
                reflectiveQuadTo(443f, 798f)
                quadToRelative(16f, 2f, 26.5f, 14f)
                reflectiveQuadToRelative(10.5f, 28f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(441f, 878f)
                quadTo(288f, 863f, 184f, 750f)
                reflectiveQuadTo(80f, 480f)
                close()
                moveToRelative(400f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -5f, 0.5f, -10.5f)
                reflectiveQuadTo(403f, 459f)
                lineToRelative(-55f, -55f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(55f, 55f)
                quadToRelative(4f, -1f, 21f, -3f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Avg_pace!!
    }

private var _Avg_pace: ImageVector? = null

