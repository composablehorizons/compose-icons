package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.King_bed: ImageVector
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
                moveTo(80f, 479f)
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
                verticalLineToRelative(146f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(826f, 680f)
                lineToRelative(-22f, 67f)
                quadToRelative(-2f, 6f, -7f, 9.5f)
                reflectiveQuadToRelative(-11f, 3.5f)
                horizontalLineToRelative(-12f)
                quadToRelative(-6f, 0f, -11f, -3.5f)
                reflectiveQuadToRelative(-7f, -9.5f)
                lineToRelative(-22f, -67f)
                horizontalLineTo(226f)
                lineToRelative(-22f, 67f)
                quadToRelative(-2f, 6f, -7f, 9.5f)
                reflectiveQuadToRelative(-11f, 3.5f)
                horizontalLineToRelative(-12f)
                quadToRelative(-6f, 0f, -11f, -3.5f)
                reflectiveQuadToRelative(-7f, -9.5f)
                lineToRelative(-22f, -67f)
                quadToRelative(-23f, 0f, -38.5f, -15.5f)
                reflectiveQuadTo(80f, 626f)
                verticalLineToRelative(-147f)
                close()
                moveToRelative(440f, -79f)
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
                moveToRelative(-80f, 200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineTo(160f)
                horizontalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _King_bed!!
    }

private var _King_bed: ImageVector? = null

