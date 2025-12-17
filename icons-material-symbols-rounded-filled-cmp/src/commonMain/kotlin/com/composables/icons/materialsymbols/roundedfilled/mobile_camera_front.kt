package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_camera_front: ImageVector
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
                moveTo(280f, 526f)
                quadToRelative(48f, -23f, 98.5f, -34.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(51f, 0f, 101.5f, 11.5f)
                reflectiveQuadTo(680f, 526f)
                verticalLineToRelative(-366f)
                horizontalLineTo(280f)
                verticalLineToRelative(366f)
                close()
                moveToRelative(200f, -86f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-98f, 360f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 720f)
                horizontalLineToRelative(142f)
                lineToRelative(-16f, -16f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(84f, 84f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(16f, -16f)
                close()
                moveToRelative(218f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(600f)
                close()
                moveToRelative(160f, -640f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(124f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(536f)
                quadToRelative(-12f, 0f, -23.5f, -5f)
                reflectiveQuadTo(493f, 662f)
                lineToRelative(-42f, -42f)
                quadToRelative(-11f, -11f, -26f, -17.5f)
                reflectiveQuadToRelative(-31f, -6.5f)
                quadToRelative(-16f, 0f, -31f, 6.5f)
                reflectiveQuadTo(337f, 620f)
                lineToRelative(-32f, 32f)
                quadToRelative(-8f, 8f, -19f, 12.5f)
                reflectiveQuadToRelative(-22f, 4.5f)
                quadToRelative(-24f, 0f, -44f, -18f)
                reflectiveQuadToRelative(-20f, -48f)
                verticalLineToRelative(-443f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                close()
            }
        }.build()
        
        return _Mobile_camera_front!!
    }

private var _Mobile_camera_front: ImageVector? = null

