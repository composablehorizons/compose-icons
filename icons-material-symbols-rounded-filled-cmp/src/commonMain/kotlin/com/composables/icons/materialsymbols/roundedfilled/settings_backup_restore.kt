package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_backup_restore: ImageVector
    get() {
        if (_Settings_backup_restore != null) return _Settings_backup_restore!!
        
        _Settings_backup_restore = ImageVector.Builder(
            name = "settings_backup_restore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-126f, 0f, -223f, -76.5f)
                reflectiveQuadTo(131f, 568f)
                quadToRelative(-4f, -15f, 6f, -27.5f)
                reflectiveQuadToRelative(27f, -14.5f)
                quadToRelative(16f, -2f, 29f, 6f)
                reflectiveQuadToRelative(18f, 24f)
                quadToRelative(24f, 90f, 99f, 147f)
                reflectiveQuadToRelative(170f, 57f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-69f, 0f, -129f, 32f)
                reflectiveQuadToRelative(-101f, 88f)
                horizontalLineToRelative(70f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 400f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(54f)
                quadToRelative(51f, -64f, 124.5f, -99f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Settings_backup_restore!!
    }

private var _Settings_backup_restore: ImageVector? = null

