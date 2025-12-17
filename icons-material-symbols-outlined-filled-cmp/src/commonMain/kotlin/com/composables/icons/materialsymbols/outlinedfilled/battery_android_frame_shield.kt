package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_android_frame_shield: ImageVector
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
                moveTo(160.09f, 720f)
                quadTo(110f, 720f, 75f, 685f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85.09f, -35f)
                horizontalLineTo(643f)
                lineToRelative(-153f, 80f)
                horizontalLineTo(160.1f)
                quadToRelative(-17.1f, 0f, -28.6f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadToRelative(28.53f, 11.5f)
                horizontalLineToRelative(405.81f)
                quadToRelative(18.03f, 25f, 38.58f, 45f)
                quadToRelative(20.54f, 20f, 42.58f, 35f)
                horizontalLineTo(160.09f)
                close()
                moveTo(740f, 680f)
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
                moveToRelative(-199f, 9f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320.84f)
                quadToRelative(0f, 72f, 16.55f, 132f)
                quadToRelative(16.54f, 60f, 43.61f, 108f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_shield!!
    }

private var _Battery_android_frame_shield: ImageVector? = null

