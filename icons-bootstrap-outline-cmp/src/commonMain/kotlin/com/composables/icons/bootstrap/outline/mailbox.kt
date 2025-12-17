package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mailbox: ImageVector
    get() {
        if (_Mailbox != null) return _Mailbox!!
        
        _Mailbox = ImageVector.Builder(
            name = "mailbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                moveToRelative(0f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveToRelative(2.646f, 1f)
                arcTo(4f, 4f, 0f, false, true, 8f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.793f, 8.5f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.354f, -0.146f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, 0.552f, -0.448f, 0f, -1f, 0f)
                reflectiveCurveToRelative(-1f, 0.552f, -1f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
        }.build()
        
        return _Mailbox!!
    }

private var _Mailbox: ImageVector? = null

