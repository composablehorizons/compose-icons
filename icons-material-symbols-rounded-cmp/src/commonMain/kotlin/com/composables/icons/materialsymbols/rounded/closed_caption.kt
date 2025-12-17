package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Closed_caption: ImageVector
    get() {
        if (_Closed_caption != null) return _Closed_caption!!
        
        _Closed_caption = ImageVector.Builder(
            name = "closed_caption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-480f)
                horizontalLineTo(200f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(80f, -120f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -9f, -6f, -15f)
                reflectiveQuadToRelative(-15f, -6f)
                horizontalLineToRelative(-18f)
                quadToRelative(-9f, 0f, -15f, 6f)
                reflectiveQuadToRelative(-6f, 15f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 9f, 6f, 15f)
                reflectiveQuadToRelative(15f, 6f)
                horizontalLineToRelative(18f)
                quadToRelative(9f, 0f, 15f, -6f)
                reflectiveQuadToRelative(6f, -15f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                close()
                moveToRelative(400f, -240f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 600f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 560f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -9f, -6f, -15f)
                reflectiveQuadToRelative(-15f, -6f)
                horizontalLineToRelative(-18f)
                quadToRelative(-9f, 0f, -15f, 6f)
                reflectiveQuadToRelative(-6f, 15f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 9f, 6f, 15f)
                reflectiveQuadToRelative(15f, 6f)
                horizontalLineToRelative(18f)
                quadToRelative(9f, 0f, 15f, -6f)
                reflectiveQuadToRelative(6f, -15f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                close()
                moveTo(200f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Closed_caption!!
    }

private var _Closed_caption: ImageVector? = null

