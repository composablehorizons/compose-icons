package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cancel_schedule_send: ImageVector
    get() {
        if (_Cancel_schedule_send != null) return _Cancel_schedule_send!!
        
        _Cancel_schedule_send = ImageVector.Builder(
            name = "cancel_schedule_send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(609f, 779f)
                lineToRelative(70f, -70f)
                lineToRelative(70f, 70f)
                lineToRelative(30f, -30f)
                lineToRelative(-69f, -69f)
                lineToRelative(70f, -70f)
                lineToRelative(-30f, -30f)
                lineToRelative(-70f, 70f)
                lineToRelative(-70f, -70f)
                lineToRelative(-30f, 30f)
                lineToRelative(70f, 70f)
                lineToRelative(-70f, 70f)
                lineToRelative(29f, 29f)
                close()
                moveToRelative(-489f, 21f)
                verticalLineToRelative(-640f)
                lineToRelative(572f, 240f)
                horizontalLineToRelative(-12f)
                quadToRelative(-35f, 0f, -66f, 8f)
                reflectiveQuadToRelative(-60f, 22f)
                lineTo(200f, 280f)
                verticalLineToRelative(140f)
                lineToRelative(240f, 60f)
                lineToRelative(-240f, 60f)
                verticalLineToRelative(140f)
                lineToRelative(216f, -92f)
                quadToRelative(-8f, 23f, -12f, 45.5f)
                reflectiveQuadToRelative(-4f, 46.5f)
                verticalLineToRelative(2f)
                lineTo(120f, 800f)
                close()
                moveToRelative(560f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(200f, 588f)
                verticalLineToRelative(-308f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-92f)
                close()
            }
        }.build()
        
        return _Cancel_schedule_send!!
    }

private var _Cancel_schedule_send: ImageVector? = null

