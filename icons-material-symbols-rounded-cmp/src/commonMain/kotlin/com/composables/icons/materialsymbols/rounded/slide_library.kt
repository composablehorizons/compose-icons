package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Slide_library: ImageVector
    get() {
        if (_Slide_library != null) return _Slide_library!!
        
        _Slide_library = ImageVector.Builder(
            name = "slide_library",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(216f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(576f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(536f, 240f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 304f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 344f)
                verticalLineToRelative(216f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineTo(320f)
                close()
                moveToRelative(220f, -160f)
                quadToRelative(-19f, 0f, -36.5f, -6.5f)
                reflectiveQuadTo(472f, 454f)
                quadToRelative(-5f, -5f, -3f, -10.5f)
                reflectiveQuadToRelative(7f, -7.5f)
                quadToRelative(11f, -3f, 17.5f, -14f)
                reflectiveQuadToRelative(6.5f, -22f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(560f, 340f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 480f)
                close()
                moveToRelative(103f, -148f)
                lineToRelative(-15f, -15f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(122f, -121f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(14f, 14f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(699f, 332f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
            }
        }.build()
        
        return _Slide_library!!
    }

private var _Slide_library: ImageVector? = null

