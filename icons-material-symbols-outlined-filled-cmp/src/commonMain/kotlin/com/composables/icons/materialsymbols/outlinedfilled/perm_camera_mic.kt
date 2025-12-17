package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Perm_camera_mic: ImageVector
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
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(520f)
                verticalLineToRelative(-124f)
                quadToRelative(88f, -14f, 144f, -81f)
                reflectiveQuadToRelative(56f, -155f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 88f, 56f, 155f)
                reflectiveQuadToRelative(144f, 81f)
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

