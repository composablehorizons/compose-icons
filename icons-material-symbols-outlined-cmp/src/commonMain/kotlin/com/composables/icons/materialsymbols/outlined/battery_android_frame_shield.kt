package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Battery_android_frame_shield: ImageVector
    get() {
        if (_Battery_android_frame_shield != null) return _Battery_android_frame_shield!!
        
        _Battery_android_frame_shield = ImageVector.Builder(
            name = "battery_android_frame_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(482f)
                lineToRelative(-154f, 80f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(405f)
                quadToRelative(18f, 25f, 38.5f, 45f)
                reflectiveQuadToRelative(42.5f, 35f)
                horizontalLineTo(160f)
                close()
                moveToRelative(580f, -40f)
                quadToRelative(-80f, -29f, -130f, -118f)
                reflectiveQuadToRelative(-50f, -202f)
                quadToRelative(41f, -5f, 85f, -25f)
                reflectiveQuadToRelative(95f, -55f)
                quadToRelative(51f, 35f, 95f, 55f)
                reflectiveQuadToRelative(85f, 25f)
                quadToRelative(0f, 113f, -50f, 202f)
                reflectiveQuadTo(740f, 680f)
                close()
                moveToRelative(0f, -89f)
                quadToRelative(35f, -23f, 60f, -68f)
                reflectiveQuadToRelative(35f, -102f)
                quadToRelative(-23f, -8f, -46.5f, -19.5f)
                reflectiveQuadTo(740f, 375f)
                verticalLineToRelative(216f)
                close()
                moveToRelative(-200f, 9f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                quadToRelative(0f, 72f, 16.5f, 132f)
                reflectiveQuadTo(540f, 600f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_shield!!
    }

private var _Battery_android_frame_shield: ImageVector? = null

