package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_bolt: ImageVector
    get() {
        if (_Battery_android_bolt != null) return _Battery_android_bolt!!
        
        _Battery_android_bolt = ImageVector.Builder(
            name = "battery_android_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(417f, 510f)
                lineToRelative(-25f, 112f)
                quadToRelative(-2f, 8f, 5f, 11f)
                reflectiveQuadToRelative(12f, -2f)
                lineToRelative(147f, -147f)
                quadToRelative(10f, -10f, 5f, -22f)
                reflectiveQuadToRelative(-19f, -12f)
                horizontalLineToRelative(-79f)
                lineToRelative(25f, -112f)
                quadToRelative(2f, -8f, -5f, -11f)
                reflectiveQuadToRelative(-12f, 2f)
                lineTo(324f, 476f)
                quadToRelative(-10f, 10f, -5f, 22f)
                reflectiveQuadToRelative(19f, 12f)
                horizontalLineToRelative(79f)
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
        
        return _Battery_android_bolt!!
    }

private var _Battery_android_bolt: ImageVector? = null

