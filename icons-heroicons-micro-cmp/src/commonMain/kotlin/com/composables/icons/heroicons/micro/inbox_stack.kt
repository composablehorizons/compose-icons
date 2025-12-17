package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.InboxStack: ImageVector
    get() {
        if (_InboxStack != null) return _InboxStack!!
        
        _InboxStack = ImageVector.Builder(
            name = "inbox-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.742f, 2.755f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.424f, 2f)
                horizontalLineToRelative(7.152f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.682f, 0.755f)
                lineToRelative(1.174f, 1.32f)
                curveToRelative(0.366f, 0.412f, 0.568f, 0.944f, 0.568f, 1.495f)
                verticalLineToRelative(0.68f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 6.25f)
                verticalLineToRelative(-0.68f)
                curveToRelative(0f, -0.55f, 0.202f, -1.083f, 0.568f, -1.495f)
                lineToRelative(1.174f, -1.32f)
                close()
                moveToRelative(1.682f, 0.745f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.561f, 0.252f)
                lineTo(2.753f, 5f)
                horizontalLineToRelative(2.212f)
                arcToRelative(1f, 1f, 0f, false, true, 0.832f, 0.445f)
                lineToRelative(0.406f, 0.61f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, 0.445f)
                horizontalLineToRelative(1.93f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, -0.445f)
                lineToRelative(0.406f, -0.61f)
                arcTo(1f, 1f, 0f, false, true, 11.035f, 5f)
                horizontalLineToRelative(2.211f)
                lineToRelative(-1.109f, -1.248f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.56f, -0.252f)
                horizontalLineTo(4.423f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.215f)
                arcToRelative(1f, 1f, 0f, false, true, 0.832f, 0.445f)
                lineToRelative(0.406f, 0.61f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, 0.445f)
                horizontalLineToRelative(1.93f)
                arcToRelative(1f, 1f, 0f, false, false, 0.832f, -0.445f)
                lineToRelative(0.406f, -0.61f)
                arcToRelative(1f, 1f, 0f, false, true, 0.832f, -0.445f)
                horizontalLineToRelative(3.215f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1f)
                arcTo(2.25f, 2.25f, 0f, false, true, 12.75f, 14f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 11.75f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _InboxStack!!
    }

private var _InboxStack: ImageVector? = null

