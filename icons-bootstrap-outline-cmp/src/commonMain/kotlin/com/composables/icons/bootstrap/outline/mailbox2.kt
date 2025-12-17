package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mailbox2: ImageVector
    get() {
        if (_Mailbox2 != null) return _Mailbox2!!
        
        _Mailbox2 = ImageVector.Builder(
            name = "mailbox2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 8.5f)
                horizontalLineToRelative(2.793f)
                lineToRelative(0.853f, 0.854f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 9.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                horizontalLineTo(4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                moveTo(8f, 7f)
                arcToRelative(4f, 4f, 0f, false, false, -1.354f, -3f)
                horizontalLineTo(12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineTo(8f)
                close()
                moveToRelative(-3.415f, 0.157f)
                curveTo(4.42f, 7.087f, 4.218f, 7f, 4f, 7f)
                reflectiveCurveToRelative(-0.42f, 0.086f, -0.585f, 0.157f)
                curveTo(3.164f, 7.264f, 3f, 7.334f, 3f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                curveToRelative(0f, 0.334f, -0.164f, 0.264f, -0.415f, 0.157f)
            }
        }.build()
        
        return _Mailbox2!!
    }

private var _Mailbox2: ImageVector? = null

