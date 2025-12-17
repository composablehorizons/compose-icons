package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Child_friendly: ImageVector
    get() {
        if (_Child_friendly != null) return _Child_friendly!!
        
        _Child_friendly = ImageVector.Builder(
            name = "child_friendly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 880f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveTo(540f, 304f)
                lineTo(384f, 116f)
                quadToRelative(36f, -18f, 78f, -27f)
                reflectiveQuadToRelative(90f, -9f)
                quadToRelative(41f, 0f, 79f, 9f)
                reflectiveQuadToRelative(70f, 27f)
                quadToRelative(11f, 8f, 13f, 21.5f)
                reflectiveQuadToRelative(-9f, 22.5f)
                lineTo(540f, 304f)
                close()
                moveToRelative(-420f, -44f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 220f)
                quadToRelative(0f, -57f, 39.5f, -98.5f)
                reflectiveQuadTo(216f, 80f)
                quadToRelative(30f, 0f, 55f, 14f)
                reflectiveQuadToRelative(51f, 44f)
                lineToRelative(428f, 516f)
                quadToRelative(17f, 20f, 6.5f, 43f)
                reflectiveQuadTo(720f, 720f)
                horizontalLineTo(480f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(280f, 520f)
                verticalLineToRelative(-308f)
                lineToRelative(-20f, -24f)
                quadToRelative(-14f, -17f, -23.5f, -22.5f)
                reflectiveQuadTo(216f, 160f)
                quadToRelative(-24f, 0f, -40f, 18f)
                reflectiveQuadToRelative(-16f, 42f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 260f)
                close()
            }
        }.build()
        
        return _Child_friendly!!
    }

private var _Child_friendly: ImageVector? = null

