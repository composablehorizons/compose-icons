package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Filter_arrow_right: ImageVector
    get() {
        if (_Filter_arrow_right != null) return _Filter_arrow_right!!
        
        _Filter_arrow_right = ImageVector.Builder(
            name = "filter_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-280f)
                lineTo(78f, 160f)
                horizontalLineToRelative(724f)
                lineTo(520f, 520f)
                verticalLineToRelative(280f)
                horizontalLineTo(360f)
                close()
                moveToRelative(400f, -40f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(440f, 492f)
                lineToRelative(198f, -252f)
                horizontalLineTo(242f)
                lineToRelative(198f, 252f)
                close()
            }
        }.build()
        
        return _Filter_arrow_right!!
    }

private var _Filter_arrow_right: ImageVector? = null

