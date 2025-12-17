package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Upcoming: ImageVector
    get() {
        if (_Upcoming != null) return _Upcoming!!
        
        _Upcoming = ImageVector.Builder(
            name = "upcoming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(280f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(624f, -408f)
                lineToRelative(-56f, -56f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 56f)
                lineToRelative(-142f, 142f)
                close()
                moveToRelative(-448f, 0f)
                lineTo(114f, 290f)
                lineToRelative(56f, -56f)
                lineToRelative(142f, 142f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(184f, -112f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Upcoming!!
    }

private var _Upcoming: ImageVector? = null

