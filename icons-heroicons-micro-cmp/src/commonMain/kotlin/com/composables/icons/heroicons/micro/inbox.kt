package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.784f, 3f)
                arcTo(2.25f, 2.25f, 0f, false, false, 2.68f, 4.449f)
                lineTo(1.147f, 8.475f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 9.276f)
                verticalLineToRelative(1.474f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.25f, 13f)
                horizontalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15f, 10.75f)
                verticalLineTo(9.276f)
                curveToRelative(0f, -0.274f, -0.05f, -0.545f, -0.147f, -0.801f)
                lineToRelative(-1.534f, -4.026f)
                arcTo(2.25f, 2.25f, 0f, false, false, 11.216f, 3f)
                horizontalLineTo(4.784f)
                close()
                moveToRelative(-0.701f, 1.983f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.7f, -0.483f)
                horizontalLineToRelative(6.433f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.701f, 0.483f)
                lineTo(13.447f, 9f)
                horizontalLineToRelative(-2.412f)
                arcToRelative(1f, 1f, 0f, false, false, -0.832f, 0.445f)
                lineToRelative(-0.406f, 0.61f)
                arcToRelative(1f, 1f, 0f, false, true, -0.832f, 0.445f)
                horizontalLineToRelative(-1.93f)
                arcToRelative(1f, 1f, 0f, false, true, -0.832f, -0.445f)
                lineToRelative(-0.406f, -0.61f)
                arcTo(1f, 1f, 0f, false, false, 4.965f, 9f)
                horizontalLineTo(2.553f)
                lineToRelative(1.53f, -4.017f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

