package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ReplyAll: ImageVector
    get() {
        if (_ReplyAll != null) return _ReplyAll!!
        
        _ReplyAll = ImageVector.Builder(
            name = "reply-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.021f, 11.9f)
                lineTo(3.453f, 8.62f)
                arcToRelative(0.72f, 0.72f, 0f, false, true, 0f, -1.238f)
                lineTo(8.021f, 4.1f)
                arcToRelative(0.716f, 0.716f, 0f, false, true, 1.079f, 0.619f)
                verticalLineTo(6f)
                curveToRelative(1.5f, 0f, 6f, 0f, 7f, 8f)
                curveToRelative(-2.5f, -4.5f, -7f, -4f, -7f, -4f)
                verticalLineToRelative(1.281f)
                curveToRelative(0f, 0.56f, -0.606f, 0.898f, -1.079f, 0.62f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.232f, 4.293f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.106f, 0.7f)
                lineTo(1.114f, 7.945f)
                lineToRelative(-0.042f, 0.028f)
                arcToRelative(0.147f, 0.147f, 0f, false, false, 0f, 0.252f)
                lineToRelative(0.042f, 0.028f)
                lineToRelative(4.012f, 2.954f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.593f, 0.805f)
                lineTo(0.539f, 9.073f)
                arcToRelative(1.147f, 1.147f, 0f, false, true, 0f, -1.946f)
                lineToRelative(3.994f, -2.94f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.699f, 0.106f)
            }
        }.build()
        
        return _ReplyAll!!
    }

private var _ReplyAll: ImageVector? = null

