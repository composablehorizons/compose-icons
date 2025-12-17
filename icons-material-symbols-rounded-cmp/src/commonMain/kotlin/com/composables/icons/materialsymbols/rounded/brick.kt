package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Brick: ImageVector
    get() {
        if (_Brick != null) return _Brick!!
        
        _Brick = ImageVector.Builder(
            name = "brick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 740f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 320f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(260f, 160f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(440f, 220f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 160f)
                horizontalLineToRelative(120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 220f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(60f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(880f, 380f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 800f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 740f)
                close()
                moveToRelative(80f, -20f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(120f, -400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 720f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
                moveToRelative(120f, -400f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Brick!!
    }

private var _Brick: ImageVector? = null

