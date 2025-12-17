package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_android_question: ImageVector
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
                moveTo(417f, 535f)
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
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-540f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(170f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(380f)
                close()
                moveToRelative(249f, -40f)
                horizontalLineToRelative(62f)
                verticalLineToRelative(-62f)
                horizontalLineToRelative(-62f)
                verticalLineToRelative(62f)
                close()
            }
        }.build()
        
        return _Battery_android_question!!
    }

private var _Battery_android_question: ImageVector? = null

