package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Trello: ImageVector
    get() {
        if (_Trello != null) return _Trello!!
        
        _Trello = ImageVector.Builder(
            name = "trello",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392.3f, 32f)
                horizontalLineTo(56.1f)
                curveTo(25.1f, 32f, 0f, 57.1f, 0f, 88f)
                curveToRelative(-0.1f, 0f, 0f, -4f, 0f, 336f)
                curveToRelative(0f, 30.9f, 25.1f, 56f, 56f, 56f)
                horizontalLineToRelative(336.2f)
                curveToRelative(30.8f, -0.2f, 55.7f, -25.2f, 55.7f, -56f)
                verticalLineTo(88f)
                curveToRelative(0.1f, -30.8f, -24.8f, -55.8f, -55.6f, -56f)
                close()
                moveTo(197f, 371.3f)
                curveToRelative(-0.2f, 14.7f, -12.1f, 26.6f, -26.9f, 26.6f)
                horizontalLineTo(87.4f)
                curveToRelative(-14.8f, 0.1f, -26.9f, -11.8f, -27f, -26.6f)
                verticalLineTo(117.1f)
                curveToRelative(0f, -14.8f, 12f, -26.9f, 26.9f, -26.9f)
                horizontalLineToRelative(82.9f)
                curveToRelative(14.8f, 0f, 26.9f, 12f, 26.9f, 26.9f)
                verticalLineToRelative(254.2f)
                close()
                moveToRelative(193.1f, -112f)
                curveToRelative(0f, 14.8f, -12f, 26.9f, -26.9f, 26.9f)
                horizontalLineToRelative(-81f)
                curveToRelative(-14.8f, 0f, -26.9f, -12f, -26.9f, -26.9f)
                verticalLineTo(117.2f)
                curveToRelative(0f, -14.8f, 12f, -26.9f, 26.8f, -26.9f)
                horizontalLineToRelative(81.1f)
                curveToRelative(14.8f, 0f, 26.9f, 12f, 26.9f, 26.9f)
                verticalLineToRelative(142.1f)
                close()
            }
        }.build()
        
        return _Trello!!
    }

private var _Trello: ImageVector? = null

