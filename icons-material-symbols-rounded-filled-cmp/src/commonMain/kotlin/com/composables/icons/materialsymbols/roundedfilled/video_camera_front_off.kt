package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Video_camera_front_off: ImageVector
    get() {
        if (_Video_camera_front_off != null) return _Video_camera_front_off!!
        
        _Video_camera_front_off = ImageVector.Builder(
            name = "video_camera_front_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(794f, 906f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(740f, 740f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(160f, 160f)
                lineToRelative(560f, 560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                close()
                moveToRelative(80f, 480f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -44f, -44f, -71f)
                reflectiveQuadToRelative(-116f, -27f)
                quadToRelative(-72f, 0f, -116f, 27f)
                reflectiveQuadToRelative(-44f, 71f)
                verticalLineToRelative(22f)
                close()
                moveToRelative(606f, 26f)
                lineTo(713f, 533f)
                quadToRelative(-10f, 14f, -28.5f, 17f)
                reflectiveQuadTo(652f, 539f)
                lineTo(341f, 228f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(270f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                close()
            }
        }.build()
        
        return _Video_camera_front_off!!
    }

private var _Video_camera_front_off: ImageVector? = null

