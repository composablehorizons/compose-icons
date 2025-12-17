package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Battery_android_question: ImageVector
    get() {
        if (_Battery_android_question != null) return _Battery_android_question!!
        
        _Battery_android_question = ImageVector.Builder(
            name = "battery_android_question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 630f)
                quadToRelative(13f, 0f, 22f, -9f)
                reflectiveQuadToRelative(9f, -22f)
                quadToRelative(0f, -13f, -9f, -22.5f)
                reflectiveQuadToRelative(-22f, -9.5f)
                quadToRelative(-13f, 0f, -22.5f, 9.5f)
                reflectiveQuadTo(408f, 599f)
                quadToRelative(0f, 13f, 9.5f, 22f)
                reflectiveQuadToRelative(22.5f, 9f)
                close()
                moveToRelative(-23f, -95f)
                horizontalLineToRelative(46f)
                quadToRelative(0f, -24f, 4f, -34f)
                reflectiveQuadToRelative(20f, -26f)
                quadToRelative(23f, -22f, 31f, -36f)
                reflectiveQuadToRelative(8f, -31f)
                quadToRelative(0f, -35f, -25f, -56.5f)
                reflectiveQuadTo(440f, 330f)
                quadToRelative(-32f, 0f, -54f, 16.5f)
                reflectiveQuadTo(354f, 392f)
                lineToRelative(41f, 17f)
                quadToRelative(5f, -17f, 17f, -27f)
                reflectiveQuadToRelative(29f, -10f)
                quadToRelative(17f, 0f, 28.5f, 10.5f)
                reflectiveQuadTo(481f, 411f)
                quadToRelative(0f, 10f, -5f, 18.5f)
                reflectiveQuadTo(455f, 452f)
                quadToRelative(-25f, 23f, -31.5f, 38f)
                reflectiveQuadToRelative(-6.5f, 45f)
                close()
                moveTo(160f, 670f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-380f)
                horizontalLineTo(160f)
                verticalLineToRelative(380f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 670f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 210f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 290f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 26f, -17.5f, 43f)
                reflectiveQuadTo(820f, 580f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 750f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(380f)
                close()
            }
        }.build()
        
        return _Battery_android_question!!
    }

private var _Battery_android_question: ImageVector? = null

