package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Total_dissolved_solids: ImageVector
    get() {
        if (_Total_dissolved_solids != null) return _Total_dissolved_solids!!
        
        _Total_dissolved_solids = ImageVector.Builder(
            name = "total_dissolved_solids",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 186f)
                quadToRelative(-76f, 69f, -128f, 132f)
                reflectiveQuadToRelative(-80f, 119f)
                quadToRelative(-8f, 14f, -23f, 20.5f)
                reflectiveQuadToRelative(-30f, 0.5f)
                quadToRelative(-15f, -6f, -22f, -21f)
                reflectiveQuadToRelative(0f, -29f)
                quadToRelative(42f, -88f, 115f, -166f)
                reflectiveQuadToRelative(142f, -139f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(480f, 93f)
                quadToRelative(7f, 0f, 14f, 2.5f)
                reflectiveQuadToRelative(12f, 7.5f)
                quadToRelative(68f, 60f, 141f, 139f)
                reflectiveQuadToRelative(116f, 167f)
                quadToRelative(7f, 14f, 0f, 28.5f)
                reflectiveQuadTo(741f, 458f)
                quadToRelative(-15f, 6f, -29.5f, -0.5f)
                reflectiveQuadTo(689f, 437f)
                quadToRelative(-28f, -56f, -80f, -119f)
                reflectiveQuadTo(480f, 186f)
                close()
                moveToRelative(314f, 432f)
                quadToRelative(-9f, 49f, -31.5f, 92.5f)
                reflectiveQuadTo(705f, 789f)
                quadToRelative(-35f, 35f, -78.5f, 57f)
                reflectiveQuadTo(535f, 876f)
                lineToRelative(259f, -258f)
                close()
                moveToRelative(-163f, -66f)
                horizontalLineToRelative(114f)
                lineTo(421f, 876f)
                quadToRelative(-23f, -5f, -44.5f, -11.5f)
                reflectiveQuadTo(335f, 847f)
                lineToRelative(296f, -295f)
                close()
                moveToRelative(-229f, 0f)
                horizontalLineToRelative(114f)
                lineTo(267f, 801f)
                quadToRelative(-15f, -14f, -28.5f, -29f)
                reflectiveQuadTo(214f, 740f)
                lineToRelative(188f, -188f)
                close()
                moveToRelative(-116f, 0f)
                lineTo(176f, 662f)
                quadToRelative(-5f, -16f, -8f, -31.5f)
                reflectiveQuadToRelative(-5f, -31.5f)
                quadToRelative(-2f, -19f, 10.5f, -33f)
                reflectiveQuadToRelative(32.5f, -14f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(194f, -80f)
                close()
            }
        }.build()
        
        return _Total_dissolved_solids!!
    }

private var _Total_dissolved_solids: ImageVector? = null

