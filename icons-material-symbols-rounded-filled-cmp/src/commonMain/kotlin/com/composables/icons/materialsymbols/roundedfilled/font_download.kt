package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Font_download: ImageVector
    get() {
        if (_Font_download != null) return _Font_download!!
        
        _Font_download = ImageVector.Builder(
            name = "font_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 598f)
                horizontalLineToRelative(192f)
                lineToRelative(35f, 97f)
                quadToRelative(4f, 11f, 14f, 18f)
                reflectiveQuadToRelative(22f, 7f)
                quadToRelative(20f, 0f, 32.5f, -16.5f)
                reflectiveQuadTo(684f, 667f)
                lineTo(532f, 265f)
                quadToRelative(-5f, -11f, -15f, -18f)
                reflectiveQuadToRelative(-22f, -7f)
                horizontalLineToRelative(-30f)
                quadToRelative(-12f, 0f, -22f, 7f)
                reflectiveQuadToRelative(-15f, 18f)
                lineTo(276f, 667f)
                quadToRelative(-8f, 19f, 4f, 36f)
                reflectiveQuadToRelative(32f, 17f)
                quadToRelative(13f, 0f, 22.5f, -7f)
                reflectiveQuadToRelative(14.5f, -19f)
                lineToRelative(35f, -96f)
                close()
                moveToRelative(24f, -70f)
                lineToRelative(70f, -198f)
                horizontalLineToRelative(4f)
                lineToRelative(70f, 198f)
                horizontalLineTo(408f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Font_download!!
    }

private var _Font_download: ImageVector? = null

