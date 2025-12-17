package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_off: ImageVector
    get() {
        if (_Mobile_off != null) return _Mobile_off!!
        
        _Mobile_off = ImageVector.Builder(
            name = "mobile_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(200f, 257f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(383f)
                horizontalLineToRelative(384f)
                lineToRelative(96f, 96f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-583f)
                close()
                moveToRelative(153f, -17f)
                lineTo(206f, 92f)
                quadToRelative(10f, -23f, 29.5f, -37.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(526f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineTo(353f)
                close()
            }
        }.build()
        
        return _Mobile_off!!
    }

private var _Mobile_off: ImageVector? = null

