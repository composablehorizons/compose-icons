package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Headset_off: ImageVector
    get() {
        if (_Headset_off != null) return _Headset_off!!
        
        _Headset_off = ImageVector.Builder(
            name = "headset_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(844f, 726f)
                lineTo(604f, 486f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -118f, -82f, -199f)
                reflectiveQuadToRelative(-198f, -81f)
                quadToRelative(-44f, 0f, -83.5f, 12.5f)
                reflectiveQuadTo(328f, 208f)
                lineToRelative(-58f, -56f)
                quadToRelative(45f, -35f, 99.5f, -53.5f)
                reflectiveQuadTo(484f, 80f)
                quadToRelative(74f, 0f, 139.5f, 28f)
                reflectiveQuadTo(738f, 185f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(844f, 440f)
                verticalLineToRelative(286f)
                close()
                moveTo(820f, 936f)
                lineToRelative(-16f, -16f)
                horizontalLineTo(484f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                lineTo(223f, 339f)
                quadToRelative(-9f, 24f, -14f, 49f)
                reflectiveQuadToRelative(-5f, 52f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(124f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -45f, 9.5f, -84.5f)
                reflectiveQuadTo(163f, 278f)
                lineTo(28f, 143f)
                lineToRelative(57f, -56f)
                lineTo(876f, 879f)
                lineToRelative(-56f, 57f)
                close()
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

