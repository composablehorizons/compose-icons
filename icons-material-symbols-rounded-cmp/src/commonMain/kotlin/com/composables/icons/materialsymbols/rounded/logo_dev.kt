package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Logo_dev: ImageVector
    get() {
        if (_Logo_dev != null) return _Logo_dev!!
        
        _Logo_dev = ImageVector.Builder(
            name = "logo_dev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 600f)
                quadToRelative(19f, 0f, 32.5f, -13.5f)
                reflectiveQuadTo(382f, 554f)
                verticalLineToRelative(-148f)
                quadToRelative(0f, -19f, -13.5f, -32.5f)
                reflectiveQuadTo(336f, 360f)
                horizontalLineToRelative(-66f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 600f)
                horizontalLineToRelative(66f)
                close()
                moveToRelative(-50f, -46f)
                verticalLineToRelative(-148f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(148f)
                horizontalLineToRelative(-50f)
                close()
                moveToRelative(149f, 46f)
                horizontalLineToRelative(76f)
                quadToRelative(9f, 0f, 15.5f, -7f)
                reflectiveQuadToRelative(6.5f, -17f)
                quadToRelative(0f, -9f, -6.5f, -15.5f)
                reflectiveQuadTo(511f, 554f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(29f)
                quadToRelative(10f, 0f, 16.5f, -6.5f)
                reflectiveQuadTo(503f, 479f)
                quadToRelative(0f, -10f, -6.5f, -16.5f)
                reflectiveQuadTo(480f, 456f)
                horizontalLineToRelative(-29f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(59f)
                quadToRelative(10f, 0f, 16.5f, -6.5f)
                reflectiveQuadTo(533f, 383f)
                quadToRelative(0f, -10f, -6.5f, -16.5f)
                reflectiveQuadTo(510f, 360f)
                horizontalLineToRelative(-75f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(405f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(435f, 600f)
                close()
                moveToRelative(206f, -1f)
                quadToRelative(13f, 0f, 22.5f, -8.5f)
                reflectiveQuadTo(676f, 569f)
                lineToRelative(48f, -180f)
                quadToRelative(3f, -11f, -4f, -20f)
                reflectiveQuadToRelative(-18f, -9f)
                quadToRelative(-8f, 0f, -14.5f, 4.5f)
                reflectiveQuadTo(679f, 377f)
                lineToRelative(-38f, 147f)
                lineToRelative(-39f, -147f)
                quadToRelative(-2f, -8f, -8f, -12.5f)
                reflectiveQuadToRelative(-14f, -4.5f)
                quadToRelative(-11f, 0f, -18f, 9f)
                reflectiveQuadToRelative(-4f, 20f)
                lineToRelative(48f, 180f)
                quadToRelative(3f, 13f, 12.5f, 21.5f)
                reflectiveQuadTo(641f, 599f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Logo_dev!!
    }

private var _Logo_dev: ImageVector? = null

