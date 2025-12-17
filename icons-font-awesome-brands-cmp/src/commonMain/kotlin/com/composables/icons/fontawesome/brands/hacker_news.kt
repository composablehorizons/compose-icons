package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.HackerNews: ImageVector
    get() {
        if (_HackerNews != null) return _HackerNews!!
        
        _HackerNews = ImageVector.Builder(
            name = "hacker-news",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(21.2f, 197.2f)
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
        
        return _HackerNews!!
    }

private var _HackerNews: ImageVector? = null

