package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 11.27f)
                curveToRelative(0f, -0.246f, 0.033f, -0.492f, 0.099f, -0.73f)
                lineToRelative(1.523f, -5.521f)
                arcTo(2.75f, 2.75f, 0f, false, true, 5.273f, 3f)
                horizontalLineToRelative(9.454f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 2.651f, 2.019f)
                lineToRelative(1.523f, 5.52f)
                curveToRelative(0.066f, 0.239f, 0.099f, 0.485f, 0.099f, 0.732f)
                verticalLineTo(15f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3.73f)
                close()
                moveToRelative(3.068f, -5.852f)
                arcTo(1.25f, 1.25f, 0f, false, true, 5.273f, 4.5f)
                horizontalLineToRelative(9.454f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 1.205f, 0.918f)
                lineToRelative(1.523f, 5.52f)
                curveToRelative(0.006f, 0.02f, 0.01f, 0.041f, 0.015f, 0.062f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, -0.86f, 0.49f)
                lineToRelative(-0.606f, 1.02f)
                arcToRelative(1f, 1f, 0f, false, true, -0.86f, 0.49f)
                horizontalLineTo(8.236f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                arcTo(1f, 1f, 0f, false, false, 6f, 11f)
                horizontalLineTo(2.53f)
                lineToRelative(0.015f, -0.062f)
                lineToRelative(1.523f, -5.52f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

