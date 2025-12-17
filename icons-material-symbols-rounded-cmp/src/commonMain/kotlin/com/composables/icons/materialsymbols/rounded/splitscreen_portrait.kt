package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Splitscreen_portrait: ImageVector
    get() {
        if (_Splitscreen_portrait != null) return _Splitscreen_portrait!!
        
        _Splitscreen_portrait = ImageVector.Builder(
            name = "splitscreen_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 520f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 560f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 400f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 240f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 280f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 440f)
                close()
                moveToRelative(440f, 360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(-80f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(0f, -640f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Splitscreen_portrait!!
    }

private var _Splitscreen_portrait: ImageVector? = null

