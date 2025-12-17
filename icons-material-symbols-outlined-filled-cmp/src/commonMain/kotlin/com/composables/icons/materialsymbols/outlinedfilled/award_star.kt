package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Award_star: ImageVector
    get() {
        if (_Award_star != null) return _Award_star!!
        
        _Award_star = ImageVector.Builder(
            name = "award_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(363f, 650f)
                lineToRelative(117f, -71f)
                lineToRelative(117f, 71f)
                lineToRelative(-31f, -133f)
                lineToRelative(104f, -90f)
                lineToRelative(-137f, -11f)
                lineToRelative(-53f, -126f)
                lineToRelative(-53f, 126f)
                lineToRelative(-137f, 11f)
                lineToRelative(104f, 90f)
                lineToRelative(-31f, 133f)
                close()
                moveTo(480f, 932f)
                lineTo(346f, 800f)
                horizontalLineTo(160f)
                verticalLineToRelative(-186f)
                lineTo(28f, 480f)
                lineToRelative(132f, -134f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(186f)
                lineToRelative(134f, -132f)
                lineToRelative(134f, 132f)
                horizontalLineToRelative(186f)
                verticalLineToRelative(186f)
                lineToRelative(132f, 134f)
                lineToRelative(-132f, 134f)
                verticalLineToRelative(186f)
                horizontalLineTo(614f)
                lineTo(480f, 932f)
                close()
            }
        }.build()
        
        return _Award_star!!
    }

private var _Award_star: ImageVector? = null

