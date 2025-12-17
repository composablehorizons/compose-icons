package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 330f)
                horizontalLineToRelative(224f)
                lineTo(486f, 120f)
                horizontalLineToRelative(-12f)
                lineTo(368f, 330f)
                close()
                moveToRelative(82f, 474f)
                verticalLineToRelative(-414f)
                horizontalLineTo(105f)
                lineToRelative(345f, 414f)
                close()
                moveToRelative(60f, 0f)
                lineToRelative(345f, -414f)
                horizontalLineTo(510f)
                verticalLineToRelative(414f)
                close()
                moveToRelative(148f, -474f)
                horizontalLineToRelative(207f)
                lineToRelative(-83f, -166f)
                quadToRelative(-11f, -20f, -29.5f, -32f)
                reflectiveQuadTo(711f, 120f)
                horizontalLineTo(554f)
                lineToRelative(104f, 210f)
                close()
                moveToRelative(-563f, 0f)
                horizontalLineToRelative(207f)
                lineToRelative(104f, -210f)
                horizontalLineTo(249f)
                quadToRelative(-23f, 0f, -41.5f, 12f)
                reflectiveQuadTo(178f, 164f)
                lineTo(95f, 330f)
                close()
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

