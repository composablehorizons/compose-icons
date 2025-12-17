package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fort: ImageVector
    get() {
        if (_Fort != null) return _Fort!!
        
        _Fort = ImageVector.Builder(
            name = "fort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-160f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-240f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(240f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 720f)
                verticalLineToRelative(120f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-47f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-306f)
                lineToRelative(47f, -47f)
                horizontalLineTo(633f)
                lineToRelative(47f, 47f)
                verticalLineToRelative(153f)
                horizontalLineTo(280f)
                verticalLineToRelative(-153f)
                lineToRelative(47f, -47f)
                horizontalLineTo(153f)
                lineToRelative(47f, 47f)
                verticalLineToRelative(306f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(360f, -240f)
                close()
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

