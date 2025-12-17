package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flip_camera_ios: ImageVector
    get() {
        if (_Flip_camera_ios != null) return _Flip_camera_ios!!
        
        _Flip_camera_ios = ImageVector.Builder(
            name = "flip_camera_ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -120f)
                quadToRelative(79f, 0f, 136f, -53.5f)
                reflectiveQuadTo(678f, 534f)
                lineToRelative(30f, 28f)
                lineToRelative(42f, -42f)
                lineToRelative(-100f, -100f)
                lineToRelative(-100f, 100f)
                lineToRelative(42f, 42f)
                lineToRelative(26f, -26f)
                quadToRelative(-6f, 53f, -45f, 88.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(-13f, 0f, -25.5f, -2.5f)
                reflectiveQuadTo(430f, 650f)
                lineToRelative(-44f, 44f)
                quadToRelative(22f, 12f, 45.5f, 19f)
                reflectiveQuadToRelative(48.5f, 7f)
                close()
                moveTo(310f, 620f)
                lineToRelative(100f, -100f)
                lineToRelative(-42f, -42f)
                lineToRelative(-26f, 26f)
                quadToRelative(6f, -53f, 45f, -88.5f)
                reflectiveQuadToRelative(93f, -35.5f)
                quadToRelative(13f, 0f, 25.5f, 2.5f)
                reflectiveQuadTo(530f, 390f)
                lineToRelative(44f, -44f)
                quadToRelative(-22f, -12f, -45.5f, -19f)
                reflectiveQuadToRelative(-48.5f, -7f)
                quadToRelative(-79f, 0f, -136f, 53.5f)
                reflectiveQuadTo(282f, 506f)
                lineToRelative(-30f, -28f)
                lineToRelative(-42f, 42f)
                lineToRelative(100f, 100f)
                close()
            }
        }.build()
        
        return _Flip_camera_ios!!
    }

private var _Flip_camera_ios: ImageVector? = null

