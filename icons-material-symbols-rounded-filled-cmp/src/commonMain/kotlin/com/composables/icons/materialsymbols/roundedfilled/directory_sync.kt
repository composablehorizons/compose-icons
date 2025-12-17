package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directory_sync: ImageVector
    get() {
        if (_Directory_sync != null) return _Directory_sync!!
        
        _Directory_sync = ImageVector.Builder(
            name = "directory_sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 480f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -12f, 11f, -18f)
                reflectiveQuadToRelative(21f, 2f)
                lineToRelative(125f, 94f)
                quadToRelative(16f, 12f, 16f, 32f)
                reflectiveQuadToRelative(-16f, 32f)
                lineToRelative(-125f, 94f)
                quadToRelative(-10f, 8f, -21f, 2f)
                reflectiveQuadToRelative(-11f, -18f)
                verticalLineToRelative(-40f)
                quadToRelative(-91f, 0f, -155.5f, 64.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(0f, 33f, 9.5f, 63.5f)
                reflectiveQuadTo(296f, 600f)
                quadToRelative(11f, 16f, 9f, 34.5f)
                reflectiveQuadTo(288f, 664f)
                lineToRelative(-34f, 25f)
                quadToRelative(-18f, 14f, -40f, 11f)
                reflectiveQuadToRelative(-35f, -22f)
                quadToRelative(-29f, -43f, -44f, -93f)
                reflectiveQuadToRelative(-15f, -105f)
                close()
                moveToRelative(360f, 360f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 12f, -11f, 18f)
                reflectiveQuadToRelative(-21f, -2f)
                lineToRelative(-125f, -94f)
                quadToRelative(-16f, -12f, -16f, -32f)
                reflectiveQuadToRelative(16f, -32f)
                lineToRelative(125f, -94f)
                quadToRelative(10f, -8f, 21f, -2f)
                reflectiveQuadToRelative(11f, 18f)
                verticalLineToRelative(40f)
                quadToRelative(91f, 0f, 155.5f, -64.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -33f, -9.5f, -63.5f)
                reflectiveQuadTo(664f, 360f)
                quadToRelative(-11f, -16f, -9f, -34.5f)
                reflectiveQuadToRelative(17f, -29.5f)
                lineToRelative(34f, -25f)
                quadToRelative(18f, -14f, 40f, -10.5f)
                reflectiveQuadToRelative(35f, 21.5f)
                quadToRelative(28f, 43f, 43.5f, 93f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 150f, -105f, 255f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Directory_sync!!
    }

private var _Directory_sync: ImageVector? = null

