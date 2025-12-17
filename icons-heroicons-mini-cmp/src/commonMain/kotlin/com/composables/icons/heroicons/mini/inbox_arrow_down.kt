package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.InboxArrowDown: ImageVector
    get() {
        if (_InboxArrowDown != null) return _InboxArrowDown!!
        
        _InboxArrowDown = ImageVector.Builder(
            name = "inbox-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.59f)
                lineToRelative(1.95f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.1f, 1.02f)
                lineToRelative(-3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.1f, 0f)
                lineTo(6.2f, 7.26f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.1f, -1.02f)
                lineToRelative(1.95f, 2.1f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.273f, 4.5f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -1.205f, 0.918f)
                lineToRelative(-1.523f, 5.52f)
                curveToRelative(-0.006f, 0.02f, -0.01f, 0.041f, -0.015f, 0.062f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 0.894f, 0.553f)
                lineToRelative(0.448f, 0.894f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 0.553f)
                horizontalLineToRelative(3.438f)
                arcToRelative(1f, 1f, 0f, false, false, 0.86f, -0.49f)
                lineToRelative(0.606f, -1.02f)
                arcTo(1f, 1f, 0f, false, true, 14f, 11f)
                horizontalLineToRelative(3.47f)
                arcToRelative(1.318f, 1.318f, 0f, false, false, -0.015f, -0.062f)
                lineToRelative(-1.523f, -5.52f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -1.205f, -0.918f)
                horizontalLineToRelative(-0.977f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(0.977f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 2.651f, 2.019f)
                lineToRelative(1.523f, 5.52f)
                curveToRelative(0.066f, 0.239f, 0.099f, 0.485f, 0.099f, 0.732f)
                verticalLineTo(15f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3.73f)
                curveToRelative(0f, -0.246f, 0.033f, -0.492f, 0.099f, -0.73f)
                lineToRelative(1.523f, -5.521f)
                arcTo(2.75f, 2.75f, 0f, false, true, 5.273f, 3f)
                horizontalLineToRelative(0.977f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-0.977f)
                close()
            }
        }.build()
        
        return _InboxArrowDown!!
    }

private var _InboxArrowDown: ImageVector? = null

