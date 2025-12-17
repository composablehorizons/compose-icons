package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Difference: ImageVector
    get() {
        if (_Difference != null) return _Difference!!
        
        _Difference = ImageVector.Builder(
            name = "difference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(420f)
                verticalLineToRelative(80f)
                close()
                moveTo(320f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(280f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-360f)
                lineTo(560f, 120f)
                horizontalLineTo(320f)
                verticalLineToRelative(560f)
                close()
                moveTo(160f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -240f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

