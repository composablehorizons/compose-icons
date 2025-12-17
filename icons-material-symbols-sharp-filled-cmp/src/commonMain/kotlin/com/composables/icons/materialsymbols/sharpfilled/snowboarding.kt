package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Snowboarding: ImageVector
    get() {
        if (_Snowboarding != null) return _Snowboarding!!
        
        _Snowboarding = ImageVector.Builder(
            name = "snowboarding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(751f, 900f)
                quadToRelative(-9f, 0f, -18.5f, -1f)
                reflectiveQuadTo(714f, 896f)
                lineTo(209f, 788f)
                quadToRelative(-44f, -9f, -76.5f, -35.5f)
                reflectiveQuadTo(83f, 688f)
                quadToRelative(-2f, -4f, -2f, -18f)
                quadToRelative(3f, -12f, 13f, -19f)
                reflectiveQuadToRelative(23f, -5f)
                quadToRelative(7f, 2f, 12f, 6.5f)
                reflectiveQuadToRelative(8f, 10.5f)
                quadToRelative(12f, 25f, 33.5f, 43f)
                reflectiveQuadToRelative(50.5f, 24f)
                lineToRelative(19f, 4f)
                lineToRelative(140f, -94f)
                lineToRelative(-39f, -172f)
                lineToRelative(117f, -188f)
                horizontalLineToRelative(-94f)
                lineToRelative(-76f, 122f)
                lineToRelative(-68f, -42f)
                lineToRelative(100f, -160f)
                horizontalLineToRelative(228f)
                quadToRelative(27f, 0f, 43.5f, 15f)
                reflectiveQuadToRelative(22.5f, 28f)
                lineToRelative(21f, 48f)
                quadToRelative(20f, 48f, 64.5f, 78.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(80f)
                quadToRelative(-70f, 0f, -128f, -33.5f)
                reflectiveQuadTo(579f, 358f)
                lineToRelative(-72f, 115f)
                lineToRelative(133f, 107f)
                lineToRelative(40f, 248f)
                lineToRelative(46f, 9f)
                quadToRelative(6f, 2f, 12.5f, 2.5f)
                reflectiveQuadToRelative(12.5f, 0.5f)
                quadToRelative(24f, 0f, 43f, -8f)
                reflectiveQuadToRelative(36f, -22f)
                quadToRelative(5f, -5f, 26f, -6f)
                quadToRelative(13f, 2f, 19.5f, 13f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(-1f, 5f, -3.5f, 9f)
                reflectiveQuadToRelative(-6.5f, 8f)
                quadToRelative(-25f, 22f, -56f, 33f)
                reflectiveQuadToRelative(-63f, 11f)
                close()
                moveToRelative(-155f, -90f)
                lineToRelative(-30f, -186f)
                lineToRelative(-114f, -81f)
                lineToRelative(18f, 133f)
                lineToRelative(-121f, 81f)
                lineToRelative(247f, 53f)
                close()
                moveToRelative(44f, -610f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 200f)
                close()
            }
        }.build()
        
        return _Snowboarding!!
    }

private var _Snowboarding: ImageVector? = null

