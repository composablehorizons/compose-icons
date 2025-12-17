package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Kitchen: ImageVector
    get() {
        if (_Kitchen != null) return _Kitchen!!
        
        _Kitchen = ImageVector.Builder(
            name = "kitchen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 280f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 320f)
                close()
                moveToRelative(0f, 360f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 680f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-80f, -520f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Kitchen!!
    }

private var _Kitchen: ImageVector? = null

