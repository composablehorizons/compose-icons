package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Gate: ImageVector
    get() {
        if (_Gate != null) return _Gate!!
        
        _Gate = ImageVector.Builder(
            name = "gate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, 80f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(240f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(400f)
                horizontalLineTo(200f)
                close()
                moveToRelative(600f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 480f)
                close()
                moveTo(280f, 680f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 360f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Gate!!
    }

private var _Gate: ImageVector? = null

