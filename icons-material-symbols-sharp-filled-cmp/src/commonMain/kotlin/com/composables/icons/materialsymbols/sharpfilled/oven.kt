package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Oven: ImageVector
    get() {
        if (_Oven != null) return _Oven!!
        
        _Oven = ImageVector.Builder(
            name = "oven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 480f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, -560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 280f)
                close()
                moveToRelative(80f, 280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(80f, -280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 280f)
                close()
            }
        }.build()
        
        return _Oven!!
    }

private var _Oven: ImageVector? = null

