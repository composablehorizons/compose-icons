package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Headset_off: ImageVector
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
                moveTo(840f, 726f)
                lineTo(594f, 480f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -118f, -82f, -199f)
                reflectiveQuadToRelative(-198f, -81f)
                quadToRelative(-44f, 0f, -83.5f, 12.5f)
                reflectiveQuadTo(324f, 208f)
                lineToRelative(-58f, -56f)
                quadToRelative(45f, -35f, 99.5f, -53.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(74f, 0f, 139.5f, 28f)
                reflectiveQuadTo(734f, 185f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(840f, 440f)
                verticalLineToRelative(286f)
                close()
                moveTo(480f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(247f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-87f)
                verticalLineToRelative(-87f)
                lineTo(221f, 334f)
                quadToRelative(-9f, 24f, -15f, 51.5f)
                reflectiveQuadToRelative(-6f, 54.5f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -45f, 10.5f, -87f)
                reflectiveQuadToRelative(30.5f, -80f)
                lineTo(27f, 140f)
                lineToRelative(57f, -56f)
                lineTo(875f, 876f)
                verticalLineToRelative(44f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

