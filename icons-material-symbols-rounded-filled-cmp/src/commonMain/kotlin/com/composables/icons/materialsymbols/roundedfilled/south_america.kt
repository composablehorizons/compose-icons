package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.South_america: ImageVector
    get() {
        if (_South_america != null) return _South_america!!
        
        _South_america = ImageVector.Builder(
            name = "south_america",
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
                moveToRelative(0f, -80f)
                lineToRelative(-28f, -28f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                verticalLineToRelative(-224f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 440f)
                verticalLineToRelative(-40f)
                lineTo(235f, 275f)
                quadToRelative(-35f, 42f, -55f, 94f)
                reflectiveQuadToRelative(-20f, 111f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(40f, -2f)
                quadToRelative(119f, -15f, 199.5f, -105f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-44f, 0f, -84.5f, 11.5f)
                reflectiveQuadTo(320f, 203f)
                verticalLineToRelative(77f)
                horizontalLineToRelative(142f)
                quadToRelative(18f, 0f, 34.5f, 8f)
                reflectiveQuadToRelative(27.5f, 22f)
                lineToRelative(56f, 70f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 420f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 9f, -2.5f, 17f)
                reflectiveQuadToRelative(-7.5f, 16f)
                lineTo(520f, 720f)
                verticalLineToRelative(78f)
                close()
            }
        }.build()
        
        return _South_america!!
    }

private var _South_america: ImageVector? = null

