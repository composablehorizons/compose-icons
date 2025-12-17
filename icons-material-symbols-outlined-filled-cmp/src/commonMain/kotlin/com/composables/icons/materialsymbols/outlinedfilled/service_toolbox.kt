package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Service_toolbox: ImageVector
    get() {
        if (_Service_toolbox != null) return _Service_toolbox!!
        
        _Service_toolbox = ImageVector.Builder(
            name = "service_toolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveTo(97f, 480f)
                lineToRelative(83f, -192f)
                quadToRelative(9f, -22f, 29f, -35f)
                reflectiveQuadToRelative(43f, -13f)
                horizontalLineToRelative(28f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(28f)
                quadToRelative(23f, 0f, 43f, 13f)
                reflectiveQuadToRelative(29f, 35f)
                lineToRelative(83f, 192f)
                horizontalLineTo(680f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineTo(360f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineTo(97f)
                close()
                moveToRelative(263f, -240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Service_toolbox!!
    }

private var _Service_toolbox: ImageVector? = null

