package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flip_camera_android: ImageVector
    get() {
        if (_Flip_camera_android != null) return _Flip_camera_android!!
        
        _Flip_camera_android = ImageVector.Builder(
            name = "flip_camera_android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-128f, 0f, -230.5f, -73f)
                reflectiveQuadTo(104f, 616f)
                quadToRelative(-5f, -15f, 3f, -28f)
                reflectiveQuadToRelative(24f, -18f)
                quadToRelative(16f, -5f, 30.5f, 3.5f)
                reflectiveQuadTo(182f, 597f)
                quadToRelative(36f, 91f, 117f, 147f)
                reflectiveQuadToRelative(181f, 56f)
                quadToRelative(86f, 0f, 160f, -42.5f)
                reflectiveQuadTo(756f, 640f)
                horizontalLineToRelative(-76f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 560f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 760f)
                verticalLineToRelative(-40f)
                quadToRelative(-57f, 76f, -141f, 118f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -720f)
                quadToRelative(-86f, 0f, -160f, 42.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(76f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 400f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(57f, -76f, 141f, -118f)
                reflectiveQuadToRelative(179f, -42f)
                quadToRelative(128f, 0f, 230.5f, 73f)
                reflectiveQuadTo(856f, 344f)
                quadToRelative(5f, 15f, -3f, 28f)
                reflectiveQuadToRelative(-24f, 18f)
                quadToRelative(-16f, 5f, -30.5f, -3.5f)
                reflectiveQuadTo(778f, 363f)
                quadToRelative(-36f, -91f, -117f, -147f)
                reflectiveQuadToRelative(-181f, -56f)
                close()
                moveToRelative(0f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Flip_camera_android!!
    }

private var _Flip_camera_android: ImageVector? = null

