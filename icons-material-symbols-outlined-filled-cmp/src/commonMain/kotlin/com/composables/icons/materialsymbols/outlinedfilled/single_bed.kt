package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Single_bed: ImageVector
    get() {
        if (_Single_bed != null) return _Single_bed!!
        
        _Single_bed = ImageVector.Builder(
            name = "single_bed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, -80f)
                horizontalLineToRelative(-54f)
                verticalLineToRelative(-201f)
                quadToRelative(0f, -33f, 23.5f, -56f)
                reflectiveQuadToRelative(56.5f, -23f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 200f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-54f)
                lineToRelative(-26f, 80f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, -80f)
                horizontalLineTo(306f)
                lineToRelative(-26f, 80f)
                close()
                moveToRelative(240f, -360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-200f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Single_bed!!
    }

private var _Single_bed: ImageVector? = null

