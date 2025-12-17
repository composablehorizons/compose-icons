package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Video_settings: ImageVector
    get() {
        if (_Video_settings != null) return _Video_settings!!
        
        _Video_settings = ImageVector.Builder(
            name = "video_settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                close()
                moveToRelative(-60f, -195f)
                verticalLineToRelative(-250f)
                quadToRelative(0f, -18f, 15.5f, -26.5f)
                reflectiveQuadTo(426f, 330f)
                lineToRelative(195f, 125f)
                quadToRelative(14f, 9f, 14f, 25f)
                reflectiveQuadToRelative(-14f, 25f)
                lineTo(426f, 630f)
                quadToRelative(-15f, 10f, -30.5f, 1.5f)
                reflectiveQuadTo(380f, 605f)
                close()
                moveTo(711f, 904f)
                lineToRelative(-9f, -44f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(658f, 836f)
                lineToRelative(-43f, 13f)
                quadToRelative(-7f, 2f, -13f, -0.5f)
                reflectiveQuadToRelative(-10f, -8.5f)
                lineToRelative(-24f, -40f)
                quadToRelative(-4f, -6f, -2f, -13f)
                reflectiveQuadToRelative(7f, -12f)
                lineToRelative(33f, -29f)
                quadToRelative(-2f, -14f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-33f, -29f)
                quadToRelative(-5f, -5f, -7f, -12f)
                reflectiveQuadToRelative(2f, -13f)
                lineToRelative(24f, -40f)
                quadToRelative(4f, -6f, 10f, -8.5f)
                reflectiveQuadToRelative(13f, -0.5f)
                lineToRelative(43f, 13f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(702f, 580f)
                lineToRelative(9f, -44f)
                quadToRelative(2f, -7f, 6.5f, -11.5f)
                reflectiveQuadTo(730f, 520f)
                horizontalLineToRelative(48f)
                quadToRelative(8f, 0f, 12.5f, 4.5f)
                reflectiveQuadTo(797f, 536f)
                lineToRelative(9f, 44f)
                quadToRelative(12f, 5f, 22.5f, 11f)
                reflectiveQuadToRelative(21.5f, 15f)
                lineToRelative(42f, -15f)
                quadToRelative(7f, -2f, 13.5f, 0.5f)
                reflectiveQuadTo(916f, 600f)
                lineToRelative(24f, 42f)
                quadToRelative(4f, 6f, 2.5f, 13f)
                reflectiveQuadToRelative(-6.5f, 12f)
                lineToRelative(-34f, 29f)
                quadToRelative(2f, 12f, 2f, 25f)
                reflectiveQuadToRelative(-2f, 25f)
                lineToRelative(33f, 29f)
                quadToRelative(5f, 5f, 7f, 12f)
                reflectiveQuadToRelative(-2f, 13f)
                lineToRelative(-24f, 40f)
                quadToRelative(-4f, 6f, -10f, 8.5f)
                reflectiveQuadToRelative(-13f, 0.5f)
                lineToRelative(-43f, -13f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(806f, 860f)
                lineToRelative(-9f, 44f)
                quadToRelative(-2f, 7f, -6.5f, 11.5f)
                reflectiveQuadTo(778f, 920f)
                horizontalLineToRelative(-48f)
                quadToRelative(-8f, 0f, -12.5f, -4.5f)
                reflectiveQuadTo(711f, 904f)
                close()
                moveToRelative(43f, -104f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(834f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(754f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(674f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(754f, 800f)
                close()
            }
        }.build()
        
        return _Video_settings!!
    }

private var _Video_settings: ImageVector? = null

