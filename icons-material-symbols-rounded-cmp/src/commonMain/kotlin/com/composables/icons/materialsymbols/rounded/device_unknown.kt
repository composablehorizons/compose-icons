package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Device_unknown: ImageVector
    get() {
        if (_Device_unknown != null) return _Device_unknown!!
        
        _Device_unknown = ImageVector.Builder(
            name = "device_unknown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(-17f, 0f, -29.5f, -12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, -17f, 12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(17f, 0f, 29.5f, 12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, 17f, -12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-91f, -307f)
                quadToRelative(-10f, -5f, -13f, -16.5f)
                reflectiveQuadToRelative(4f, -21.5f)
                quadToRelative(17f, -26f, 43.5f, -40.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(48f, 0f, 81f, 27.5f)
                reflectiveQuadToRelative(33f, 74.5f)
                quadToRelative(0f, 25f, -12.5f, 46f)
                reflectiveQuadTo(552f, 466f)
                quadToRelative(-13f, 13f, -25.5f, 26f)
                reflectiveQuadTo(511f, 523f)
                quadToRelative(-2f, 12f, -10.5f, 20.5f)
                reflectiveQuadTo(480f, 552f)
                quadToRelative(-12f, 0f, -20.5f, -8f)
                reflectiveQuadToRelative(-8.5f, -20f)
                quadToRelative(0f, -25f, 15f, -45f)
                reflectiveQuadToRelative(34f, -37f)
                quadToRelative(13f, -13f, 23.5f, -27f)
                reflectiveQuadToRelative(10.5f, -31f)
                quadToRelative(0f, -20f, -16.5f, -33f)
                reflectiveQuadTo(480f, 338f)
                quadToRelative(-14f, 0f, -27.5f, 6.5f)
                reflectiveQuadTo(431f, 363f)
                quadToRelative(-8f, 11f, -19.5f, 13.5f)
                reflectiveQuadTo(389f, 373f)
                close()
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Device_unknown!!
    }

private var _Device_unknown: ImageVector? = null

