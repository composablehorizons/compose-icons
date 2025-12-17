package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.InboxArrowDown: ImageVector
    get() {
        if (_InboxArrowDown != null) return _InboxArrowDown!!
        
        _InboxArrowDown = ImageVector.Builder(
            name = "inbox-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.69f)
                lineToRelative(-0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-0.72f, 0.72f)
                verticalLineTo(2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.784f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.701f, 0.483f)
                lineTo(2.553f, 9f)
                horizontalLineToRelative(2.412f)
                arcToRelative(1f, 1f, 0f, false, true, 0.832f, 0.445f)
                lineToRelative(0.406f, 0.61f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, 0.445f)
                horizontalLineToRelative(1.93f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, -0.445f)
                lineToRelative(0.406f, -0.61f)
                arcTo(1f, 1f, 0f, false, true, 11.035f, 9f)
                horizontalLineToRelative(2.412f)
                lineToRelative(-1.53f, -4.017f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.7f, -0.483f)
                horizontalLineToRelative(-0.467f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.466f)
                curveToRelative(0.934f, 0f, 1.77f, 0.577f, 2.103f, 1.449f)
                lineToRelative(1.534f, 4.026f)
                curveToRelative(0.097f, 0.256f, 0.147f, 0.527f, 0.147f, 0.801f)
                verticalLineToRelative(1.474f)
                arcTo(2.25f, 2.25f, 0f, false, true, 12.75f, 13f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 10.75f)
                verticalLineTo(9.276f)
                curveToRelative(0f, -0.274f, 0.05f, -0.545f, 0.147f, -0.801f)
                lineToRelative(1.534f, -4.026f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.784f, 3f)
                horizontalLineToRelative(0.466f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-0.466f)
                close()
            }
        }.build()
        
        return _InboxArrowDown!!
    }

private var _InboxArrowDown: ImageVector? = null

