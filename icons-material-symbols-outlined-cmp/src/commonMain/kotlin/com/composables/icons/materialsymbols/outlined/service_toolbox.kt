package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Service_toolbox: ImageVector
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
                moveTo(280f, 240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(28f)
                quadToRelative(24f, 0f, 43.5f, 13.5f)
                reflectiveQuadTo(780f, 288f)
                lineToRelative(94f, 216f)
                quadToRelative(3f, 8f, 4.5f, 16f)
                reflectiveQuadToRelative(1.5f, 16f)
                verticalLineToRelative(184f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-184f)
                quadToRelative(0f, -8f, 1.5f, -16f)
                reflectiveQuadToRelative(4.5f, -16f)
                lineToRelative(94f, -216f)
                quadToRelative(9f, -21f, 28.5f, -34.5f)
                reflectiveQuadTo(252f, 240f)
                horizontalLineToRelative(28f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 240f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(96f)
                lineToRelative(-68f, -160f)
                horizontalLineTo(252f)
                lineToRelative(-68f, 160f)
                horizontalLineToRelative(96f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(200f, -40f)
                close()
                moveToRelative(0f, -40f)
                close()
                moveToRelative(0f, 80f)
                close()
            }
        }.build()
        
        return _Service_toolbox!!
    }

private var _Service_toolbox: ImageVector? = null

