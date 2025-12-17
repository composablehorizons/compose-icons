package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MailboxFlag: ImageVector
    get() {
        if (_MailboxFlag != null) return _MailboxFlag!!
        
        _MailboxFlag = ImageVector.Builder(
            name = "mailbox-flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 8.5f)
                verticalLineTo(3.707f)
                lineToRelative(0.854f, -0.853f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11.5f, 2.5f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 0f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, 0.334f, -0.164f, 0.264f, -0.415f, 0.157f)
                curveTo(4.42f, 7.087f, 4.218f, 7f, 4f, 7f)
                reflectiveCurveToRelative(-0.42f, 0.086f, -0.585f, 0.157f)
                curveTo(3.164f, 7.264f, 3f, 7.334f, 3f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(6.646f)
                arcTo(4f, 4f, 0f, false, true, 8f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                verticalLineTo(3f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                moveToRelative(0f, 1f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
            }
        }.build()
        
        return _MailboxFlag!!
    }

private var _MailboxFlag: ImageVector? = null

