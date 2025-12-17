package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Menstrual_health: ImageVector
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
                moveTo(480f, 75f)
                quadToRelative(49f, 59f, 88f, 109.5f)
                reflectiveQuadToRelative(70f, 96.5f)
                lineToRelative(242f, -181f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-380f)
                lineToRelative(242f, 181f)
                quadToRelative(31f, -45f, 70f, -96f)
                reflectiveQuadToRelative(88f, -110f)
                close()
                moveTo(160f, 260f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 44f, 11.5f, 84.5f)
                reflectiveQuadTo(203f, 640f)
                quadToRelative(-2f, -10f, -2.5f, -19.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(0f, -57f, 18.5f, -117.5f)
                reflectiveQuadTo(279f, 350f)
                lineToRelative(-119f, -90f)
                close()
                moveToRelative(320f, -60f)
                quadTo(370f, 334f, 325f, 434f)
                reflectiveQuadToRelative(-45f, 166f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -66f, -45f, -167f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(320f, 60f)
                lineToRelative(-119f, 89f)
                quadToRelative(42f, 72f, 60.5f, 132.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(0f, 11f, -0.5f, 20.5f)
                reflectiveQuadTo(757f, 640f)
                quadToRelative(20f, -35f, 31.5f, -75.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-220f)
                close()
            }
        }.build()
        
        return _Menstrual_health!!
    }

private var _Menstrual_health: ImageVector? = null

