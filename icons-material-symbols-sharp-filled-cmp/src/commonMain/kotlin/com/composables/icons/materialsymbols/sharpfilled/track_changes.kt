package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Track_changes: ImageVector
    get() {
        if (_Track_changes != null) return _Track_changes!!
        
        _Track_changes = ImageVector.Builder(
            name = "track_changes",
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
                horizontalLineToRelative(40f)
                verticalLineToRelative(331f)
                quadToRelative(18f, 11f, 29f, 28.5f)
                reflectiveQuadToRelative(11f, 40.5f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -23f, 11f, -41f)
                reflectiveQuadToRelative(29f, -28f)
                verticalLineToRelative(-86f)
                quadToRelative(-52f, 14f, -86f, 56.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -36f, -14.5f, -66.5f)
                reflectiveQuadTo(586f, 360f)
                lineToRelative(57f, -57f)
                quadToRelative(35f, 33f, 56f, 78.5f)
                reflectiveQuadToRelative(21f, 98.5f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -90f, 57f, -156.5f)
                reflectiveQuadTo(440f, 243f)
                verticalLineToRelative(-81f)
                quadToRelative(-119f, 15f, -199.5f, 105f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -69f, -27f, -129f)
                reflectiveQuadToRelative(-74f, -104f)
                lineToRelative(57f, -57f)
                quadToRelative(57f, 55f, 90.5f, 129.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Track_changes!!
    }

private var _Track_changes: ImageVector? = null

