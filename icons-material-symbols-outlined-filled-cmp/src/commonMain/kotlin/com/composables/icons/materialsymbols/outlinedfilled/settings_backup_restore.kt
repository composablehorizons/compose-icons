package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_backup_restore: ImageVector
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
                moveTo(480f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, 280f)
                quadToRelative(-139f, 0f, -241f, -91.5f)
                reflectiveQuadTo(122f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(14f, 104f, 92.5f, 172f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-69f, 0f, -129f, 32f)
                reflectiveQuadToRelative(-101f, 88f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(94f)
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
            }
        }.build()
        
        return _Settings_backup_restore!!
    }

private var _Settings_backup_restore: ImageVector? = null

