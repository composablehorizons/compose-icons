package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mitre: ImageVector
    get() {
        if (_Mitre != null) return _Mitre!!
        
        _Mitre = ImageVector.Builder(
            name = "mitre",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 360f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 200f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 40f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 280f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(20f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 600f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 520f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 680f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 360f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-20f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 200f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 40f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 120f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(20f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(20f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 760f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 920f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(420f, 280f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveTo(300f, 800f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Mitre!!
    }

private var _Mitre: ImageVector? = null

