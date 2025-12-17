package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Select_check_box: ImageVector
    get() {
        if (_Select_check_box != null) return _Select_check_box!!
        
        _Select_check_box = ImageVector.Builder(
            name = "select_check_box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(8f, 0f, 15f, 1.5f)
                reflectiveQuadToRelative(14f, 4.5f)
                lineToRelative(-74f, 74f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-266f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(346f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(261f, -160f)
                lineTo(235f, 454f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(367f, -367f)
                lineToRelative(57f, 55f)
                lineToRelative(-424f, 424f)
                close()
            }
        }.build()
        
        return _Select_check_box!!
    }

private var _Select_check_box: ImageVector? = null

