package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.InboxStack: ImageVector
    get() {
        if (_InboxStack != null) return _InboxStack!!
        
        _InboxStack = ImageVector.Builder(
            name = "inbox-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.045f, 6.954f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 0.217f, -0.678f)
                lineTo(2.53f, 3.58f)
                arcTo(2.75f, 2.75f, 0f, false, true, 5.019f, 2f)
                horizontalLineToRelative(9.962f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, 2.488f, 1.58f)
                lineToRelative(1.27f, 2.696f)
                curveToRelative(0.101f, 0.216f, 0.174f, 0.444f, 0.216f, 0.678f)
                arcTo(1f, 1f, 0f, false, true, 19f, 7.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, -2.75f, 2.75f)
                horizontalLineTo(3.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 1f, 8.75f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.045f, -0.296f)
                close()
                moveToRelative(2.843f, -2.736f)
                arcTo(1.25f, 1.25f, 0f, false, true, 5.02f, 3.5f)
                horizontalLineToRelative(9.962f)
                curveToRelative(0.484f, 0f, 0.925f, 0.28f, 1.13f, 0.718f)
                lineToRelative(0.957f, 2.032f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, -0.86f, 0.49f)
                lineToRelative(-0.606f, 1.02f)
                arcToRelative(1f, 1f, 0f, false, true, -0.86f, 0.49f)
                horizontalLineTo(8.236f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                arcTo(1f, 1f, 0f, false, false, 6f, 6.25f)
                horizontalLineTo(2.932f)
                lineToRelative(0.956f, -2.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.894f, 0.553f)
                lineToRelative(0.448f, 0.894f)
                arcToRelative(1f, 1f, 0f, false, false, 0.894f, 0.553f)
                horizontalLineToRelative(3.438f)
                arcToRelative(1f, 1f, 0f, false, false, 0.86f, -0.49f)
                lineToRelative(0.606f, -1.02f)
                arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _InboxStack!!
    }

private var _InboxStack: ImageVector? = null

