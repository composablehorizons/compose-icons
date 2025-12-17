package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 560f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(287f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(14f, 23f)
                lineToRelative(10f, 48f)
                horizontalLineToRelative(184f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 280f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(553f)
                quadToRelative(-14f, 0f, -25f, -9f)
                reflectiveQuadToRelative(-14f, -23f)
                lineToRelative(-10f, -48f)
                horizontalLineTo(280f)
                close()
                moveToRelative(306f, 0f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-240f)
                horizontalLineTo(543f)
                quadToRelative(-14f, 0f, -25f, -9f)
                reflectiveQuadToRelative(-14f, -23f)
                lineToRelative(-10f, -48f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(257f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(14f, 23f)
                lineToRelative(10f, 48f)
                close()
                moveToRelative(-86f, -160f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

