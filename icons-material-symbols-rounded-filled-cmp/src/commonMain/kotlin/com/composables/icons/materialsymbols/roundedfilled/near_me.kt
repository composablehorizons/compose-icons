package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Near_me: ImageVector
    get() {
        if (_Near_me != null) return _Near_me!!
        
        _Near_me = ImageVector.Builder(
            name = "near_me",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 558f)
                lineTo(143f, 453f)
                quadToRelative(-13f, -5f, -19f, -15.5f)
                reflectiveQuadToRelative(-6f, -21.5f)
                quadToRelative(0f, -11f, 6.5f, -21.5f)
                reflectiveQuadTo(144f, 379f)
                lineToRelative(614f, -228f)
                quadToRelative(12f, -5f, 23f, -2f)
                reflectiveQuadToRelative(19f, 11f)
                quadToRelative(8f, 8f, 11f, 19f)
                reflectiveQuadToRelative(-2f, 23f)
                lineTo(581f, 816f)
                quadToRelative(-5f, 13f, -15.5f, 19.5f)
                reflectiveQuadTo(544f, 842f)
                quadToRelative(-11f, 0f, -21.5f, -6f)
                reflectiveQuadTo(507f, 817f)
                lineTo(402f, 558f)
                close()
            }
        }.build()
        
        return _Near_me!!
    }

private var _Near_me: ImageVector? = null

