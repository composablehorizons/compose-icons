package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Open_run: ImageVector
    get() {
        if (_Open_run != null) return _Open_run!!
        
        _Open_run = ImageVector.Builder(
            name = "open_run",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 767f)
                lineToRelative(57f, -57f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(593f, 767f)
                lineToRelative(-85f, 85f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadTo(480f, 863f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineToRelative(-85f, -85f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(57f, 57f)
                close()
                moveTo(193f, 480f)
                lineToRelative(57f, 57f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(193f, 593f)
                lineToRelative(-85f, -85f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 480f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(85f, -85f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(574f, 0f)
                lineToRelative(-57f, -57f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(85f, 85f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineToRelative(-85f, 85f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(710f, 593f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(57f, -57f)
                close()
                moveTo(480f, 193f)
                lineToRelative(-57f, 57f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(85f, -85f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(85f, 85f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(593f, 250f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-57f, -57f)
                close()
            }
        }.build()
        
        return _Open_run!!
    }

private var _Open_run: ImageVector? = null

