package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_cam_magnet_mount: ImageVector
    get() {
        if (_Nest_cam_magnet_mount != null) return _Nest_cam_magnet_mount!!
        
        _Nest_cam_magnet_mount = ImageVector.Builder(
            name = "nest_cam_magnet_mount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(920f, 652f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(840f, 572f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-629f, 79f)
                quadToRelative(-15f, 0f, -30f, -5.5f)
                reflectiveQuadTo(234f, 708f)
                lineTo(64f, 539f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(40f, 483f)
                quadToRelative(0f, -15f, 5.5f, -30f)
                reflectiveQuadTo(63f, 426f)
                lineToRelative(115f, -116f)
                quadToRelative(29f, -29f, 65.5f, -44f)
                reflectiveQuadToRelative(76.5f, -15f)
                quadToRelative(84f, 0f, 142f, 58f)
                reflectiveQuadToRelative(58f, 142f)
                quadToRelative(0f, 40f, -15f, 76.5f)
                reflectiveQuadTo(461f, 593f)
                lineTo(347f, 707f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadToRelative(-29.5f, 6f)
                close()
                moveToRelative(29f, -400f)
                quadToRelative(-23f, 0f, -45f, 9f)
                reflectiveQuadToRelative(-40f, 27f)
                lineTo(120f, 482f)
                lineToRelative(170f, 170f)
                lineToRelative(115f, -115f)
                quadToRelative(18f, -18f, 27f, -40f)
                reflectiveQuadToRelative(9f, -45f)
                quadToRelative(0f, -51f, -35f, -86f)
                reflectiveQuadToRelative(-86f, -35f)
                close()
                moveToRelative(-39f, 160f)
                close()
                moveToRelative(397f, 123f)
                lineToRelative(-42f, -42f)
                lineToRelative(48f, -48f)
                horizontalLineTo(560f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(128f)
                lineToRelative(-50f, -50f)
                lineToRelative(42f, -42f)
                lineToRelative(120f, 120f)
                lineToRelative(-122f, 122f)
                close()
            }
        }.build()
        
        return _Nest_cam_magnet_mount!!
    }

private var _Nest_cam_magnet_mount: ImageVector? = null

