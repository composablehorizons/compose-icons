package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_quilt: ImageVector
    get() {
        if (_View_quilt != null) return _View_quilt!!
        
        _View_quilt = ImageVector.Builder(
            name = "view_quilt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(453f, 460f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(373f, 380f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(453f, 200f)
                horizontalLineToRelative(307f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 460f)
                horizontalLineTo(453f)
                close()
                moveToRelative(254f, 300f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(627f, 680f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(707f, 500f)
                horizontalLineToRelative(53f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 580f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineToRelative(-53f)
                close()
                moveToRelative(-254f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(373f, 680f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(453f, 500f)
                horizontalLineToRelative(54f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(587f, 580f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(507f, 760f)
                horizontalLineToRelative(-54f)
                close()
                moveToRelative(-253f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(53f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(333f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(253f, 760f)
                horizontalLineToRelative(-53f)
                close()
            }
        }.build()
        
        return _View_quilt!!
    }

private var _View_quilt: ImageVector? = null

