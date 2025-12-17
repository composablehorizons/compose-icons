package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Single_bed: ImageVector
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
                moveTo(160f, 479f)
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
                verticalLineToRelative(146f)
                quadToRelative(0f, 23f, -15.5f, 38.5f)
                reflectiveQuadTo(746f, 680f)
                lineToRelative(-22f, 67f)
                quadToRelative(-2f, 6f, -7f, 9.5f)
                reflectiveQuadToRelative(-11f, 3.5f)
                horizontalLineToRelative(-12f)
                quadToRelative(-6f, 0f, -11f, -3.5f)
                reflectiveQuadToRelative(-7f, -9.5f)
                lineToRelative(-22f, -67f)
                horizontalLineTo(306f)
                lineToRelative(-22f, 67f)
                quadToRelative(-2f, 6f, -7f, 9.5f)
                reflectiveQuadToRelative(-11f, 3.5f)
                horizontalLineToRelative(-12f)
                quadToRelative(-6f, 0f, -11f, -3.5f)
                reflectiveQuadToRelative(-7f, -9.5f)
                lineToRelative(-22f, -67f)
                quadToRelative(-23f, 0f, -38.5f, -15.5f)
                reflectiveQuadTo(160f, 626f)
                verticalLineToRelative(-147f)
                close()
                moveToRelative(360f, -79f)
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
                moveToRelative(-80f, 200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Single_bed!!
    }

private var _Single_bed: ImageVector? = null

