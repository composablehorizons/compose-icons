package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rss_feed: ImageVector
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
                moveTo(4f, 4.44f)
                verticalLineToRelative(2.83f)
                curveToRelative(7.03f, 0f, 12.73f, 5.7f, 12.73f, 12.73f)
                horizontalLineToRelative(2.83f)
                curveToRelative(0f, -8.59f, -6.97f, -15.56f, -15.56f, -15.56f)
                close()
                moveToRelative(0f, 5.66f)
                verticalLineToRelative(2.83f)
                curveToRelative(3.9f, 0f, 7.07f, 3.17f, 7.07f, 7.07f)
                horizontalLineToRelative(2.83f)
                curveToRelative(0f, -5.47f, -4.43f, -9.9f, -9.9f, -9.9f)
                close()
            }
        }.build()
        
        return _Rss_feed!!
    }

private var _Rss_feed: ImageVector? = null

