package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!
        
        _Filter = ImageVector.Builder(
            name = "filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(487.976f, 0f)
                horizontalLineTo(24.028f)
                curveTo(2.71f, 0f, -8.047f, 25.866f, 7.058f, 40.971f)
                lineTo(192f, 225.941f)
                verticalLineTo(432f)
                curveToRelative(0f, 7.831f, 3.821f, 15.17f, 10.237f, 19.662f)
                lineToRelative(80f, 55.98f)
                curveTo(298.02f, 518.69f, 320f, 507.493f, 320f, 487.98f)
                verticalLineTo(225.941f)
                lineToRelative(184.947f, -184.97f)
                curveTo(520.021f, 25.896f, 509.338f, 0f, 487.976f, 0f)
                close()
            }
        }.build()
        
        return _Filter!!
    }

private var _Filter: ImageVector? = null

