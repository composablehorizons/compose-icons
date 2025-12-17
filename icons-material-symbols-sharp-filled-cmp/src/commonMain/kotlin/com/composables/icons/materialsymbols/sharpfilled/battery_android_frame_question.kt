package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_frame_question: ImageVector
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
                moveTo(40f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(641f)
                quadToRelative(-20f, 16f, -35f, 36f)
                reflectiveQuadToRelative(-25f, 44f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(562f)
                quadToRelative(4f, 25f, 18f, 45.5f)
                reflectiveQuadToRelative(34f, 34.5f)
                horizontalLineTo(40f)
                close()
                moveToRelative(760f, -60f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 620f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 580f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 660f)
                close()
                moveToRelative(-28f, -121f)
                quadToRelative(0f, -16f, 0.5f, -30.5f)
                reflectiveQuadTo(779f, 480f)
                quadToRelative(7f, -14f, 18.5f, -24.5f)
                reflectiveQuadTo(820f, 434f)
                quadToRelative(12f, -11f, 22f, -24.5f)
                reflectiveQuadToRelative(10f, -30.5f)
                quadToRelative(0f, -20f, -15.5f, -32f)
                reflectiveQuadTo(800f, 335f)
                quadToRelative(-20f, 0f, -35.5f, 13f)
                reflectiveQuadTo(743f, 381f)
                lineToRelative(-51f, -21f)
                quadToRelative(10f, -36f, 40f, -58f)
                reflectiveQuadToRelative(68f, -22f)
                quadToRelative(44f, 0f, 76.5f, 27.5f)
                reflectiveQuadTo(909f, 377f)
                quadToRelative(0f, 23f, -11.5f, 43f)
                reflectiveQuadTo(869f, 457f)
                quadToRelative(-10f, 10f, -19.5f, 19f)
                reflectiveQuadTo(834f, 498f)
                quadToRelative(-7f, 14f, -5f, 41f)
                horizontalLineToRelative(-57f)
                close()
                moveToRelative(-612f, 61f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(461f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_question!!
    }

private var _Battery_android_frame_question: ImageVector? = null

