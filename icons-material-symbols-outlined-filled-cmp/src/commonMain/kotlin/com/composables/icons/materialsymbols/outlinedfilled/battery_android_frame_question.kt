package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_android_frame_question: ImageVector
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
                horizontalLineToRelative(521f)
                quadToRelative(-20f, 16f, -35f, 36f)
                reflectiveQuadToRelative(-25f, 44f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(522f)
                quadToRelative(4f, 25f, 18f, 45.5f)
                reflectiveQuadToRelative(34f, 34.5f)
                horizontalLineTo(160f)
                close()
                moveToRelative(640f, -60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 580f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 620f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(800f, 660f)
                close()
                moveToRelative(-28f, -121f)
                horizontalLineToRelative(57f)
                verticalLineToRelative(-21.5f)
                quadToRelative(0f, -10.5f, 5f, -19.5f)
                quadToRelative(6f, -13f, 15.5f, -22f)
                reflectiveQuadToRelative(19.5f, -19f)
                quadToRelative(17f, -17f, 28.5f, -37f)
                reflectiveQuadToRelative(11.5f, -43f)
                quadToRelative(0f, -42f, -32.5f, -69.5f)
                reflectiveQuadTo(800f, 280f)
                quadToRelative(-38f, 0f, -68f, 22f)
                reflectiveQuadToRelative(-40f, 58f)
                lineToRelative(51f, 21f)
                quadToRelative(6f, -20f, 21.5f, -33f)
                reflectiveQuadToRelative(35.5f, -13f)
                quadToRelative(21f, 0f, 36.5f, 12f)
                reflectiveQuadToRelative(15.5f, 32f)
                quadToRelative(0f, 17f, -10f, 30.5f)
                reflectiveQuadTo(820f, 434f)
                quadToRelative(-11f, 11f, -22.5f, 21.5f)
                reflectiveQuadTo(779f, 480f)
                quadToRelative(-6f, 14f, -6.5f, 28.5f)
                reflectiveQuadTo(772f, 539f)
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

