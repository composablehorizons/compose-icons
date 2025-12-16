package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BookmarkFilled: ImageVector
    get() {
        if (_BookmarkFilled != null) return _BookmarkFilled!!
        
        _BookmarkFilled = ImageVector.Builder(
            name = "bookmark-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.6006f, 2.00977f)
                curveTo(11.8286f, 2.05629f, 12f, 2.25829f, 12f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(12f, 13.6818f, 11.9012f, 13.8494f, 11.7422f, 13.9375f)
                curveTo(11.5833f, 14.0254f, 11.3894f, 14.02f, 11.2354f, 13.9238f)
                lineTo(7.5f, 11.5898f)
                lineTo(3.76465f, 13.9238f)
                curveTo(3.61062f, 14.02f, 3.41669f, 14.0254f, 3.25781f, 13.9375f)
                curveTo(3.09884f, 13.8494f, 3f, 13.6818f, 3f, 13.5f)
                verticalLineTo(2.5f)
                lineTo(3.00977f, 2.39941f)
                curveTo(3.05629f, 2.17145f, 3.25829f, 2f, 3.5f, 2f)
                horizontalLineTo(11.5f)
                lineTo(11.6006f, 2.00977f)
                close()
            }
        }.build()
        
        return _BookmarkFilled!!
    }

private var _BookmarkFilled: ImageVector? = null

