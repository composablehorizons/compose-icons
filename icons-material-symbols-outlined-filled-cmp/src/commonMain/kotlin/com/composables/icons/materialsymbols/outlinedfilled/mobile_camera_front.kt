package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_camera_front: ImageVector
    get() {
        if (_Mobile_camera_front != null) return _Mobile_camera_front!!
        
        _Mobile_camera_front = ImageVector.Builder(
            name = "mobile_camera_front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(394f, 900f)
                lineToRelative(-56f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(182f)
                lineToRelative(-44f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineTo(394f, 900f)
                close()
                moveToRelative(166f, -100f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-80f, -360f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(200f, 680f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(204f)
                horizontalLineTo(511f)
                lineTo(394f, 563f)
                lineTo(277f, 680f)
                horizontalLineToRelative(-77f)
                close()
                moveToRelative(80f, -154f)
                quadToRelative(48f, -23f, 98.5f, -34.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(51f, 0f, 101.5f, 11.5f)
                reflectiveQuadTo(680f, 526f)
                verticalLineToRelative(-366f)
                horizontalLineTo(280f)
                verticalLineToRelative(366f)
                close()
            }
        }.build()
        
        return _Mobile_camera_front!!
    }

private var _Mobile_camera_front: ImageVector? = null

