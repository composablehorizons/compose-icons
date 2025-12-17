package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.King_bed: ImageVector
    get() {
        if (_King_bed != null) return _King_bed!!
        
        _King_bed = ImageVector.Builder(
            name = "king_bed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, -80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-201f)
                quadToRelative(0f, -33f, 23.5f, -56f)
                reflectiveQuadToRelative(56.5f, -23f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 200f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 280f)
                verticalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-54f)
                lineToRelative(-26f, 80f)
                horizontalLineToRelative(-40f)
                lineToRelative(-26f, -80f)
                horizontalLineTo(226f)
                lineToRelative(-26f, 80f)
                close()
                moveToRelative(320f, -360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _King_bed!!
    }

private var _King_bed: ImageVector? = null

