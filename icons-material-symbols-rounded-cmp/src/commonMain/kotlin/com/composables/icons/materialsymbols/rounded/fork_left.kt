package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fork_left: ImageVector
    get() {
        if (_Fork_left != null) return _Fork_left!!
        
        _Fork_left = ImageVector.Builder(
            name = "fork_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 273f)
                lineToRelative(-36f, 36f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(428f, 308f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 308f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -35f)
                verticalLineToRelative(527f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(-18f, -64f, -63.5f, -94.5f)
                reflectiveQuadTo(357f, 555f)
                quadToRelative(-11f, 0f, -22f, 1.5f)
                reflectiveQuadToRelative(-22f, 3.5f)
                lineToRelative(36f, 36f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(348f, 652f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(188f, 548f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(348f, 388f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-35f, 36f)
                quadToRelative(9f, -2f, 19f, -3f)
                reflectiveQuadToRelative(21f, -1f)
                quadToRelative(44f, 0f, 88f, 13.5f)
                reflectiveQuadToRelative(79f, 44.5f)
                verticalLineToRelative(-261f)
                close()
            }
        }.build()
        
        return _Fork_left!!
    }

private var _Fork_left: ImageVector? = null

