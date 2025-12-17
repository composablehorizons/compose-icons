package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Menstrual_health: ImageVector
    get() {
        if (_Menstrual_health != null) return _Menstrual_health!!
        
        _Menstrual_health = ImageVector.Builder(
            name = "menstrual_health",
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
                verticalLineToRelative(-300f)
                quadToRelative(0f, -25f, 22f, -36f)
                reflectiveQuadToRelative(42f, 4f)
                lineToRelative(178f, 133f)
                quadToRelative(26f, -37f, 56.5f, -78f)
                reflectiveQuadToRelative(68.5f, -87f)
                quadToRelative(13f, -16f, 33f, -16f)
                reflectiveQuadToRelative(33f, 16f)
                quadToRelative(38f, 46f, 68.5f, 86.5f)
                reflectiveQuadTo(638f, 281f)
                lineToRelative(178f, -133f)
                quadToRelative(20f, -15f, 42f, -4f)
                reflectiveQuadToRelative(22f, 36f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(200f, 600f)
                quadToRelative(0f, -57f, 18.5f, -117.5f)
                reflectiveQuadTo(279f, 350f)
                lineToRelative(-119f, -90f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 44f, 11.5f, 84.5f)
                reflectiveQuadTo(203f, 640f)
                quadToRelative(-2f, -10f, -2.5f, -19.5f)
                reflectiveQuadTo(200f, 600f)
                close()
                moveToRelative(280f, 200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -66f, -45f, -167f)
                reflectiveQuadTo(480f, 200f)
                quadTo(370f, 334f, 325f, 434f)
                reflectiveQuadToRelative(-45f, 166f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(280f, -200f)
                quadToRelative(0f, 11f, -0.5f, 20.5f)
                reflectiveQuadTo(757f, 640f)
                quadToRelative(20f, -35f, 31.5f, -75.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-220f)
                lineToRelative(-119f, 89f)
                quadToRelative(42f, 72f, 60.5f, 132.5f)
                reflectiveQuadTo(760f, 600f)
                close()
            }
        }.build()
        
        return _Menstrual_health!!
    }

private var _Menstrual_health: ImageVector? = null

