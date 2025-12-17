package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Add_triangle: ImageVector
    get() {
        if (_Add_triangle != null) return _Add_triangle!!
        
        _Add_triangle = ImageVector.Builder(
            name = "add_triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(144f, 840f)
                quadToRelative(-35f, 0f, -52f, -30f)
                reflectiveQuadToRelative(0f, -60f)
                lineToRelative(336f, -580f)
                quadToRelative(9f, -15f, 23f, -22.5f)
                reflectiveQuadToRelative(29f, -7.5f)
                quadToRelative(15f, 0f, 29f, 7.5f)
                reflectiveQuadToRelative(23f, 22.5f)
                lineToRelative(336f, 580f)
                quadToRelative(17f, 30f, 0f, 60f)
                reflectiveQuadToRelative(-52f, 30f)
                horizontalLineTo(144f)
                close()
                moveToRelative(35f, -80f)
                horizontalLineToRelative(602f)
                lineTo(480f, 240f)
                lineTo(179f, 760f)
                close()
                moveToRelative(261f, -120f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 640f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(40f, -40f)
                close()
            }
        }.build()
        
        return _Add_triangle!!
    }

private var _Add_triangle: ImageVector? = null

