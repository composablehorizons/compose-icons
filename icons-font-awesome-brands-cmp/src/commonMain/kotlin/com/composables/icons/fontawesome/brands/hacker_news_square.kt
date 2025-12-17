package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.HackerNewsSquare: ImageVector
    get() {
        if (_HackerNewsSquare != null) return _HackerNewsSquare!!
        
        _HackerNewsSquare = ImageVector.Builder(
            name = "hacker-news-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(21.2f, 229.2f)
                horizontalLineTo(21f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                curveToRelative(0f, 0.1f, 0f, 0.3f, -0.1f, 0.4f)
                close()
                moveToRelative(218f, 53.9f)
                verticalLineTo(384f)
                horizontalLineToRelative(-31.4f)
                verticalLineTo(281.3f)
                lineTo(128f, 128f)
                horizontalLineToRelative(37.3f)
                curveToRelative(52.5f, 98.3f, 49.2f, 101.2f, 59.3f, 125.6f)
                curveToRelative(12.3f, -27f, 5.8f, -24.4f, 60.6f, -125.6f)
                horizontalLineTo(320f)
                lineToRelative(-80.8f, 155.1f)
                close()
            }
        }.build()
        
        return _HackerNewsSquare!!
    }

private var _HackerNewsSquare: ImageVector? = null

