package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Slide_library: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(376f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(320f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-216f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(376f)
                horizontalLineTo(240f)
                close()
                moveToRelative(300f, -160f)
                quadToRelative(-23f, 0f, -44.5f, -10.5f)
                reflectiveQuadTo(460f, 440f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(500f, 400f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(560f, 340f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 480f)
                close()
                moveToRelative(131f, -120f)
                lineToRelative(-71f, -71f)
                lineToRelative(178f, -177f)
                lineToRelative(70f, 70f)
                lineToRelative(-177f, 178f)
                close()
            }
        }.build()
        
        return _Slide_library!!
    }

private var _Slide_library: ImageVector? = null

