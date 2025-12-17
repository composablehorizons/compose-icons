package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Night_sight_auto_off: ImageVector
    get() {
        if (_Night_sight_auto_off != null) return _Night_sight_auto_off!!
        
        _Night_sight_auto_off = ImageVector.Builder(
            name = "night_sight_auto_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 375f)
                lineTo(272f, 247f)
                quadToRelative(29f, -18f, 61.5f, -28f)
                reflectiveQuadToRelative(67.5f, -13f)
                quadToRelative(18f, -2f, 28f, 14f)
                reflectiveQuadToRelative(0f, 32f)
                quadToRelative(-15f, 25f, -22f, 52f)
                reflectiveQuadToRelative(-7f, 56f)
                verticalLineToRelative(15f)
                close()
                moveToRelative(313f, 313f)
                lineToRelative(-88f, -88f)
                quadToRelative(18f, 2f, 36.5f, 1f)
                reflectiveQuadToRelative(35.5f, -8f)
                quadToRelative(19f, -8f, 33.5f, 5f)
                reflectiveQuadToRelative(9.5f, 33f)
                quadToRelative(-5f, 15f, -12f, 29f)
                reflectiveQuadToRelative(-15f, 28f)
                close()
                moveTo(440f, 840f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -42f, 10.5f, -81f)
                reflectiveQuadToRelative(30.5f, -75f)
                lineTo(42f, 245f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(42f, 188f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadTo(99f, 188f)
                lineToRelative(664f, 664f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(706f, 908f)
                lineTo(596f, 799f)
                quadToRelative(-36f, 20f, -75f, 30.5f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(216f, -480f)
                lineToRelative(-20f, 56f)
                quadToRelative(-4f, 11f, -13f, 17.5f)
                reflectiveQuadToRelative(-20f, 6.5f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(569f, 392f)
                lineToRelative(102f, -287f)
                quadToRelative(4f, -11f, 14f, -18f)
                reflectiveQuadToRelative(22f, -7f)
                horizontalLineToRelative(26f)
                quadToRelative(12f, 0f, 22f, 7f)
                reflectiveQuadToRelative(14f, 18f)
                lineToRelative(102f, 287f)
                quadToRelative(6f, 17f, -4.5f, 32.5f)
                reflectiveQuadTo(837f, 440f)
                quadToRelative(-11f, 0f, -20f, -6.5f)
                reflectiveQuadTo(804f, 416f)
                lineToRelative(-20f, -56f)
                horizontalLineTo(656f)
                close()
                moveToRelative(18f, -54f)
                horizontalLineToRelative(92f)
                lineToRelative(-46f, -146f)
                lineToRelative(-46f, 146f)
                close()
            }
        }.build()
        
        return _Night_sight_auto_off!!
    }

private var _Night_sight_auto_off: ImageVector? = null

