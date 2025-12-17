package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Mobile_camera_front: ImageVector
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
                moveTo(280f, 526f)
                quadToRelative(48f, -23f, 98.5f, -34.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(51f, 0f, 101.5f, 11.5f)
                reflectiveQuadTo(680f, 526f)
                verticalLineToRelative(-366f)
                horizontalLineTo(280f)
                verticalLineToRelative(366f)
                close()
                moveToRelative(280f, 274f)
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
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 360f)
                close()
                moveToRelative(0f, 200f)
                close()
                moveToRelative(0f, -240f)
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
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-62f)
                quadToRelative(-40f, -29f, -90.5f, -43.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-59f, 0f, -109.5f, 14.5f)
                reflectiveQuadTo(280f, 618f)
                verticalLineToRelative(62f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mobile_camera_front!!
    }

private var _Mobile_camera_front: ImageVector? = null

