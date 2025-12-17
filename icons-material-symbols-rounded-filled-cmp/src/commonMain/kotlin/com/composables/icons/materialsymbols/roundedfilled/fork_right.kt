package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fork_right: ImageVector
    get() {
        if (_Fork_right != null) return _Fork_right!!
        
        _Fork_right = ImageVector.Builder(
            name = "fork_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(-527f)
                lineToRelative(-36f, 35f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(268f, 252f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(532f, 308f)
                quadToRelative(-12f, 12f, -28f, 12.5f)
                reflectiveQuadTo(476f, 309f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(261f)
                quadToRelative(35f, -31f, 79f, -44.5f)
                reflectiveQuadToRelative(88f, -13.5f)
                quadToRelative(11f, 0f, 21f, 1f)
                reflectiveQuadToRelative(19f, 3f)
                lineToRelative(-35f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(668f, 388f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(668f, 652f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(36f, -36f)
                quadToRelative(-11f, -2f, -22f, -3.5f)
                reflectiveQuadToRelative(-22f, -1.5f)
                quadToRelative(-54f, 0f, -99.5f, 30.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 840f)
                close()
            }
        }.build()
        
        return _Fork_right!!
    }

private var _Fork_right: ImageVector? = null

