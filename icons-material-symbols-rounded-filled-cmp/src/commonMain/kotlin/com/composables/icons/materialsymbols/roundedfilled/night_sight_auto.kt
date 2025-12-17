package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Night_sight_auto: ImageVector
    get() {
        if (_Night_sight_auto != null) return _Night_sight_auto!!
        
        _Night_sight_auto = ImageVector.Builder(
            name = "night_sight_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -58f, 19f, -110.5f)
                reflectiveQuadToRelative(53f, -94f)
                quadToRelative(34f, -41.5f, 81.5f, -69f)
                reflectiveQuadTo(377f, 212f)
                quadToRelative(25f, -3f, 39f, 17.5f)
                reflectiveQuadToRelative(1f, 42.5f)
                quadToRelative(-12f, 20f, -14.5f, 42.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(12f, 0f, 24f, -0.5f)
                reflectiveQuadToRelative(24f, -4.5f)
                quadToRelative(21f, -8f, 37.5f, 7.5f)
                reflectiveQuadTo(735f, 639f)
                quadToRelative(-29f, 94f, -112f, 147.5f)
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
        
        return _Night_sight_auto!!
    }

private var _Night_sight_auto: ImageVector? = null

