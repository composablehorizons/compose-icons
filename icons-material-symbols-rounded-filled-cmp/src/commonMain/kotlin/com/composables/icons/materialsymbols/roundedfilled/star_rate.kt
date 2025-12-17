package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Star_rate: ImageVector
    get() {
        if (_Star_rate != null) return _Star_rate!!
        
        _Star_rate = ImageVector.Builder(
            name = "star_rate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 652f)
                lineTo(332f, 765f)
                quadToRelative(-11f, 9f, -24f, 8.5f)
                reflectiveQuadToRelative(-23f, -7.5f)
                quadToRelative(-10f, -7f, -15.5f, -19f)
                reflectiveQuadToRelative(-0.5f, -26f)
                lineToRelative(57f, -185f)
                lineToRelative(-145f, -103f)
                quadToRelative(-12f, -8f, -15f, -21f)
                reflectiveQuadToRelative(1f, -24f)
                quadToRelative(4f, -11f, 14f, -19.5f)
                reflectiveQuadToRelative(24f, -8.5f)
                horizontalLineToRelative(179f)
                lineToRelative(58f, -192f)
                quadToRelative(5f, -14f, 15.5f, -21.5f)
                reflectiveQuadTo(480f, 139f)
                quadToRelative(12f, 0f, 22.5f, 7.5f)
                reflectiveQuadTo(518f, 168f)
                lineToRelative(58f, 192f)
                horizontalLineToRelative(179f)
                quadToRelative(14f, 0f, 24f, 8.5f)
                reflectiveQuadToRelative(14f, 19.5f)
                quadToRelative(4f, 11f, 1f, 24f)
                reflectiveQuadToRelative(-15f, 21f)
                lineTo(634f, 536f)
                lineToRelative(57f, 185f)
                quadToRelative(5f, 14f, -0.5f, 26f)
                reflectiveQuadTo(675f, 766f)
                quadToRelative(-10f, 7f, -23f, 7.5f)
                reflectiveQuadToRelative(-24f, -8.5f)
                lineTo(480f, 652f)
                close()
            }
        }.build()
        
        return _Star_rate!!
    }

private var _Star_rate: ImageVector? = null

