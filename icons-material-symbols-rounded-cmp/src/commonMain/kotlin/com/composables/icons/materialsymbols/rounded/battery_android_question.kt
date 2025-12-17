package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_question: ImageVector
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
                moveToRelative(1f, -258f)
                quadToRelative(17f, 0f, 28.5f, 9f)
                reflectiveQuadToRelative(11.5f, 27f)
                quadToRelative(0f, 10f, -5f, 20f)
                reflectiveQuadToRelative(-21f, 24f)
                quadToRelative(-20f, 19f, -27.5f, 31.5f)
                reflectiveQuadTo(418f, 514f)
                quadToRelative(-1f, 9f, 5f, 15f)
                reflectiveQuadToRelative(15f, 7f)
                quadToRelative(10f, 1f, 17f, -5.5f)
                reflectiveQuadToRelative(9f, -16.5f)
                quadToRelative(2f, -11f, 7f, -19.5f)
                reflectiveQuadToRelative(16f, -19.5f)
                quadToRelative(23f, -22f, 31f, -36.5f)
                reflectiveQuadToRelative(8f, -30.5f)
                quadToRelative(0f, -36f, -25f, -57f)
                reflectiveQuadToRelative(-61f, -21f)
                quadToRelative(-26f, 0f, -46f, 11.5f)
                reflectiveQuadTo(362f, 374f)
                quadToRelative(-4f, 7f, -1.5f, 15f)
                reflectiveQuadToRelative(10.5f, 12f)
                quadToRelative(8f, 5f, 17.5f, 1.5f)
                reflectiveQuadTo(404f, 391f)
                quadToRelative(7f, -9f, 16f, -14f)
                reflectiveQuadToRelative(21f, -5f)
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

