package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_sim: ImageVector
    get() {
        if (_No_sim != null) return _No_sim!!
        
        _No_sim = ImageVector.Builder(
            name = "no_sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(324f, 212f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(53f, -53f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(431f)
                quadToRelative(0f, 27f, -24.5f, 37f)
                reflectiveQuadToRelative(-43.5f, -9f)
                lineTo(324f, 212f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-447f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(1f, -1f)
                lineTo(56f, 168f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadTo(57f, 112f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(735f, 735f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(848f, 903f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineTo(608f, 720f)
                lineToRelative(57f, -56f)
                lineToRelative(135f, 135f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

