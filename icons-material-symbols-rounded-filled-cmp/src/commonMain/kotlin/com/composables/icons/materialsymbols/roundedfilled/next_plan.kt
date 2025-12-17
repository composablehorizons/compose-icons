package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Next_plan: ImageVector
    get() {
        if (_Next_plan != null) return _Next_plan!!
        
        _Next_plan = ImageVector.Builder(
            name = "next_plan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(584f, 480f)
                horizontalLineToRelative(-24f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 400f)
                verticalLineToRelative(22f)
                quadToRelative(-32f, -38f, -76.5f, -60f)
                reflectiveQuadTo(466f, 340f)
                quadToRelative(-83f, 0f, -143.5f, 49.5f)
                reflectiveQuadTo(245f, 514f)
                quadToRelative(-4f, 18f, 7f, 32f)
                reflectiveQuadToRelative(28f, 14f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(327f, 518f)
                quadToRelative(14f, -43f, 52f, -70.5f)
                reflectiveQuadToRelative(87f, -27.5f)
                quadToRelative(36f, 0f, 67f, 16.5f)
                reflectiveQuadToRelative(51f, 43.5f)
                close()
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
            }
        }.build()
        
        return _Next_plan!!
    }

private var _Next_plan: ImageVector? = null

