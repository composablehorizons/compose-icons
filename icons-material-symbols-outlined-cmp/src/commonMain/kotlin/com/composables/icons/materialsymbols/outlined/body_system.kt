package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Body_system: ImageVector
    get() {
        if (_Body_system != null) return _Body_system!!
        
        _Body_system = ImageVector.Builder(
            name = "body_system",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(316f, 720f)
                lineToRelative(76f, -364f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-148f)
                lineToRelative(202f, -85f)
                quadToRelative(14f, -6f, 29.5f, -7.5f)
                reflectiveQuadTo(501f, 243f)
                quadToRelative(14f, 5f, 26.5f, 14f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(40f, 64f)
                quadToRelative(28f, 45f, 73.5f, 70.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-70f, 0f, -125.5f, -28f)
                reflectiveQuadTo(540f, 420f)
                lineToRelative(-24f, 60f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-122f)
                lineToRelative(-78f, -72f)
                lineToRelative(-42f, 194f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(224f, -500f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -119f, 61.5f, -214f)
                reflectiveQuadTo(302f, 122f)
                lineToRelative(36f, 71f)
                quadToRelative(-79f, 39f, -128.5f, 115.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Body_system!!
    }

private var _Body_system: ImageVector? = null

