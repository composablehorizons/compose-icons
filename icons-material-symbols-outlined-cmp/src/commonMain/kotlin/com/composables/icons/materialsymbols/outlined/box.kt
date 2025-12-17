package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Box: ImageVector
    get() {
        if (_Box != null) return _Box!!
        
        _Box = ImageVector.Builder(
            name = "box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 320f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-440f)
                horizontalLineTo(640f)
                verticalLineToRelative(320f)
                lineToRelative(-160f, -80f)
                lineToRelative(-160f, 80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 520f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(499f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(16f, -600f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(184f, 80f)
                verticalLineToRelative(190f)
                lineToRelative(80f, -40f)
                lineToRelative(80f, 40f)
                verticalLineToRelative(-190f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Box!!
    }

private var _Box: ImageVector? = null

