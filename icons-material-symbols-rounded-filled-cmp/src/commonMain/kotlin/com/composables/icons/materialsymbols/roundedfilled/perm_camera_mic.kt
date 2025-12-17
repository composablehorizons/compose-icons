package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Perm_camera_mic: ImageVector
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
                horizontalLineTo(520f)
                verticalLineToRelative(-124f)
                quadToRelative(78f, -12f, 132.5f, -68f)
                reflectiveQuadTo(718f, 515f)
                quadToRelative(2f, -14f, -9.5f, -24.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(-15f, 0f, -27.5f, 8.5f)
                reflectiveQuadTo(637f, 511f)
                quadToRelative(-11f, 55f, -55f, 92f)
                reflectiveQuadToRelative(-102f, 37f)
                quadToRelative(-58f, 0f, -101.5f, -36.5f)
                reflectiveQuadTo(324f, 513f)
                quadToRelative(-3f, -15f, -15.5f, -24f)
                reflectiveQuadToRelative(-28.5f, -9f)
                quadToRelative(-17f, 0f, -28.5f, 10.5f)
                reflectiveQuadTo(242f, 515f)
                quadToRelative(11f, 77f, 65.5f, 133f)
                reflectiveQuadTo(440f, 716f)
                verticalLineToRelative(124f)
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
            }
        }.build()
        
        return _Perm_camera_mic!!
    }

private var _Perm_camera_mic: ImageVector? = null

