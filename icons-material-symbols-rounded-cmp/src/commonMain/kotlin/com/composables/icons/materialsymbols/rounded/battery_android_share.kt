package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_share: ImageVector
    get() {
        if (_Battery_android_share != null) return _Battery_android_share!!
        
        _Battery_android_share = ImageVector.Builder(
            name = "battery_android_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(487f, 510f)
                lineToRelative(-15f, 15f)
                quadToRelative(-12f, 11f, -12f, 27.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(83f, -83f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-84f, -84f)
                quadToRelative(-11f, -11f, -27.5f, -11.5f)
                reflectiveQuadTo(472f, 358f)
                quadToRelative(-11f, 11f, -11.5f, 27.5f)
                reflectiveQuadTo(471f, 414f)
                lineToRelative(16f, 16f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 510f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 630f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 590f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
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
        
        return _Battery_android_share!!
    }

private var _Battery_android_share: ImageVector? = null

