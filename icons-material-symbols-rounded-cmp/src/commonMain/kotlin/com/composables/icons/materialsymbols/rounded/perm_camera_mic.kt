package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Perm_camera_mic: ImageVector
    get() {
        if (_Perm_camera_mic != null) return _Perm_camera_mic!!
        
        _Perm_camera_mic = ImageVector.Builder(
            name = "perm_camera_mic",
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
                lineToRelative(50f, -54f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(170f)
                quadToRelative(17f, 0f, 32.5f, 7f)
                reflectiveQuadToRelative(26.5f, 19f)
                lineToRelative(50f, 54f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                horizontalLineTo(638f)
                lineToRelative(-73f, -80f)
                horizontalLineTo(395f)
                lineToRelative(-73f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -280f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
                moveToRelative(320f, -120f)
                quadToRelative(-55f, 0f, -97.5f, -33f)
                reflectiveQuadTo(326f, 523f)
                quadToRelative(-5f, -17f, -17f, -30f)
                reflectiveQuadToRelative(-29f, -13f)
                quadToRelative(-17f, 0f, -28f, 14f)
                reflectiveQuadToRelative(-8f, 31f)
                quadToRelative(14f, 74f, 67.5f, 126.5f)
                reflectiveQuadTo(440f, 716f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-84f)
                quadToRelative(75f, -12f, 128.5f, -64.5f)
                reflectiveQuadTo(716f, 525f)
                quadToRelative(3f, -17f, -8f, -31f)
                reflectiveQuadToRelative(-28f, -14f)
                quadToRelative(-17f, 0f, -29f, 13f)
                reflectiveQuadToRelative(-17f, 30f)
                quadToRelative(-14f, 51f, -56.5f, 84f)
                reflectiveQuadTo(480f, 640f)
                close()
            }
        }.build()
        
        return _Perm_camera_mic!!
    }

private var _Perm_camera_mic: ImageVector? = null

