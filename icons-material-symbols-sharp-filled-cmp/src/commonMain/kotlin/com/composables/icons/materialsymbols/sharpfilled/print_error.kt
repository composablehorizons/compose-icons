package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Print_error: ImageVector
    get() {
        if (_Print_error != null) return _Print_error!!
        
        _Print_error = ImageVector.Builder(
            name = "print_error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 760f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveToRelative(-40f, -160f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(793f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(160f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Print_error!!
    }

private var _Print_error: ImageVector? = null

