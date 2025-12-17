package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Save: ImageVector
    get() {
        if (_Save != null) return _Save!!
        
        _Save = ImageVector.Builder(
            name = "save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(480f)
                lineToRelative(160f, 160f)
                close()
                moveToRelative(-80f, 34f)
                lineTo(646f, 200f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-446f)
                close()
                moveTo(480f, 720f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-40f, -86f)
                verticalLineToRelative(446f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(114f)
                close()
            }
        }.build()
        
        return _Save!!
    }

private var _Save: ImageVector? = null

