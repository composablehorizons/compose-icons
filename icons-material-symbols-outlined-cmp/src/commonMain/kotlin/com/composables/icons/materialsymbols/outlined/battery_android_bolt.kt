package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Battery_android_bolt: ImageVector
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
                moveTo(390f, 630f)
                horizontalLineToRelative(20f)
                lineToRelative(180f, -180f)
                horizontalLineTo(463f)
                lineToRelative(27f, -120f)
                horizontalLineToRelative(-20f)
                lineTo(290f, 510f)
                horizontalLineToRelative(127f)
                lineToRelative(-27f, 120f)
                close()
                moveToRelative(-230f, 40f)
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

