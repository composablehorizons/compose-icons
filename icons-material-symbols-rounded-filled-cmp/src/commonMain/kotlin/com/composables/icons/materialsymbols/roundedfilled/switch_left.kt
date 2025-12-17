package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Switch_left: ImageVector
    get() {
        if (_Switch_left != null) return _Switch_left!!
        
        _Switch_left = ImageVector.Builder(
            name = "switch_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 704f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(148f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(16f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(12f, 29.5f)
                verticalLineToRelative(366f)
                quadToRelative(0f, 18f, -12f, 29.5f)
                reflectiveQuadTo(360f, 704f)
                close()
                moveToRelative(-20f, -89f)
                verticalLineToRelative(-270f)
                lineTo(205f, 480f)
                lineToRelative(135f, 135f)
                close()
                moveToRelative(260f, 89f)
                quadToRelative(-16f, 0f, -28f, -11.5f)
                reflectiveQuadTo(560f, 663f)
                verticalLineToRelative(-366f)
                quadToRelative(0f, -18f, 12f, -29.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(628f, 692f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                close()
            }
        }.build()
        
        return _Switch_left!!
    }

private var _Switch_left: ImageVector? = null

