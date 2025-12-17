package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_frame_question: ImageVector
    get() {
        if (_Battery_android_frame_question != null) return _Battery_android_frame_question!!
        
        _Battery_android_frame_question = ImageVector.Builder(
            name = "battery_android_frame_question",
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
                horizontalLineToRelative(451f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(651f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(611f, 320f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(482f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(682f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(642f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(381f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(621f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(581f, 600f)
                horizontalLineTo(200f)
                close()
                moveToRelative(601f, -62f)
                quadToRelative(-12f, 0f, -20.5f, -7.5f)
                reflectiveQuadTo(772f, 511f)
                quadToRelative(0f, -27f, 15f, -43.5f)
                reflectiveQuadToRelative(33f, -33.5f)
                quadToRelative(12f, -11f, 22f, -24.5f)
                reflectiveQuadToRelative(10f, -30.5f)
                quadToRelative(0f, -20f, -15.5f, -32f)
                reflectiveQuadTo(800f, 335f)
                quadToRelative(-13f, 0f, -24.5f, 5.5f)
                reflectiveQuadTo(756f, 356f)
                quadToRelative(-8f, 9f, -18f, 14.5f)
                reflectiveQuadToRelative(-21f, 0.5f)
                quadToRelative(-11f, -5f, -15.5f, -16f)
                reflectiveQuadToRelative(1.5f, -21f)
                quadToRelative(15f, -25f, 41f, -39.5f)
                reflectiveQuadToRelative(56f, -14.5f)
                quadToRelative(44f, 0f, 76.5f, 27.5f)
                reflectiveQuadTo(909f, 377f)
                quadToRelative(0f, 23f, -11.5f, 43f)
                reflectiveQuadTo(869f, 457f)
                lineToRelative(-23.5f, 23.5f)
                quadTo(833f, 493f, 830f, 510f)
                quadToRelative(-2f, 11f, -10f, 19.5f)
                reflectiveQuadToRelative(-19f, 8.5f)
                close()
                moveToRelative(-1f, 122f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 620f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 580f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 660f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_question!!
    }

private var _Battery_android_frame_question: ImageVector? = null

