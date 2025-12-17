package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Korvue: ImageVector
    get() {
        if (_Korvue != null) return _Korvue!!
        
        _Korvue = ImageVector.Builder(
            name = "korvue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 446f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(386.5f, 34f)
                horizontalLineToRelative(-327f)
                curveTo(26.8f, 34f, 0f, 60.8f, 0f, 93.5f)
                verticalLineToRelative(327.1f)
                curveTo(0f, 453.2f, 26.8f, 480f, 59.5f, 480f)
                horizontalLineToRelative(327.1f)
                curveToRelative(33f, 0f, 59.5f, -26.8f, 59.5f, -59.5f)
                verticalLineToRelative(-327f)
                curveTo(446f, 60.8f, 419.2f, 34f, 386.5f, 34f)
                close()
                moveTo(87.1f, 120.8f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(116f)
                lineToRelative(61.8f, -116f)
                horizontalLineToRelative(110.9f)
                lineToRelative(-81.2f, 132f)
                horizontalLineTo(87.1f)
                verticalLineToRelative(-132f)
                close()
                moveToRelative(161.8f, 272.1f)
                lineToRelative(-65.7f, -113.6f)
                verticalLineToRelative(113.6f)
                horizontalLineToRelative(-96f)
                verticalLineTo(262.1f)
                horizontalLineToRelative(191.5f)
                lineToRelative(88.6f, 130.8f)
                horizontalLineTo(248.9f)
                close()
            }
        }.build()
        
        return _Korvue!!
    }

private var _Korvue: ImageVector? = null

