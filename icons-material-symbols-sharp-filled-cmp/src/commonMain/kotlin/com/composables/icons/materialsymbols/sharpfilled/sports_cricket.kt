package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sports_cricket: ImageVector
    get() {
        if (_Sports_cricket != null) return _Sports_cricket!!
        
        _Sports_cricket = ImageVector.Builder(
            name = "sports_cricket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 708f)
                lineTo(65f, 313f)
                lineToRelative(168f, -168f)
                lineToRelative(395f, 395f)
                lineToRelative(-168f, 168f)
                close()
                moveTo(744f, 880f)
                lineTo(574f, 710f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-4f, -520f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Sports_cricket!!
    }

private var _Sports_cricket: ImageVector? = null

