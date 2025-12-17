package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Phone_iphone: ImageVector
    get() {
        if (_Phone_iphone != null) return _Phone_iphone!!
        
        _Phone_iphone = ImageVector.Builder(
            name = "phone_iphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, 100f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 780f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 780f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 820f)
                close()
                moveTo(280f, 640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(280f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(120f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Phone_iphone!!
    }

private var _Phone_iphone: ImageVector? = null

