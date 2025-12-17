package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rss_feed: ImageVector
    get() {
        if (_Rss_feed != null) return _Rss_feed!!
        
        _Rss_feed = ImageVector.Builder(
            name = "rss_feed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.36f, 17.82f)
                arcTo(2.18f, 2.18f, 0f, false, true, 6.18f, 20f)
                arcTo(2.18f, 2.18f, 0f, false, true, 4f, 17.82f)
                arcTo(2.18f, 2.18f, 0f, false, true, 8.36f, 17.82f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.59f, 10.23f)
                curveToRelative(-0.84f, -0.14f, -1.59f, 0.55f, -1.59f, 1.4f)
                curveToRelative(0f, 0.71f, 0.53f, 1.28f, 1.23f, 1.4f)
                curveToRelative(2.92f, 0.51f, 5.22f, 2.82f, 5.74f, 5.74f)
                curveToRelative(0.12f, 0.7f, 0.69f, 1.23f, 1.4f, 1.23f)
                curveToRelative(0.85f, 0f, 1.54f, -0.75f, 1.41f, -1.59f)
                curveToRelative(-0.68f, -4.2f, -3.99f, -7.51f, -8.19f, -8.18f)
                close()
                moveToRelative(-0.03f, -5.71f)
                curveTo(4.73f, 4.43f, 4f, 5.1f, 4f, 5.93f)
                curveToRelative(0f, 0.73f, 0.55f, 1.33f, 1.27f, 1.4f)
                curveToRelative(6.01f, 0.6f, 10.79f, 5.38f, 11.39f, 11.39f)
                curveToRelative(0.07f, 0.73f, 0.67f, 1.28f, 1.4f, 1.28f)
                curveToRelative(0.84f, 0f, 1.5f, -0.73f, 1.42f, -1.56f)
                curveToRelative(-0.73f, -7.34f, -6.57f, -13.19f, -13.92f, -13.92f)
                close()
            }
        }.build()
        
        return _Rss_feed!!
    }

private var _Rss_feed: ImageVector? = null

