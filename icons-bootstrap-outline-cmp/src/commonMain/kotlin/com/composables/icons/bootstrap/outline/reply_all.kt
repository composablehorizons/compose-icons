package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ReplyAll: ImageVector
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
                moveTo(8.098f, 5.013f)
                arcToRelative(0.144f, 0.144f, 0f, false, true, 0.202f, 0.134f)
                verticalLineTo(6.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                curveToRelative(0.667f, 0f, 2.013f, 0.005f, 3.3f, 0.822f)
                curveToRelative(0.984f, 0.624f, 1.99f, 1.76f, 2.595f, 3.876f)
                curveToRelative(-1.02f, -0.983f, -2.185f, -1.516f, -3.205f, -1.799f)
                arcToRelative(8.7f, 8.7f, 0f, false, false, -1.921f, -0.306f)
                arcToRelative(7f, 7f, 0f, false, false, -0.798f, 0.008f)
                horizontalLineToRelative(-0.013f)
                lineToRelative(-0.005f, 0.001f)
                horizontalLineToRelative(-0.001f)
                lineTo(8.8f, 9.9f)
                lineToRelative(-0.05f, -0.498f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.45f, 0.498f)
                verticalLineToRelative(1.153f)
                curveToRelative(0f, 0.108f, -0.11f, 0.176f, -0.202f, 0.134f)
                lineTo(4.114f, 8.254f)
                lineToRelative(-0.042f, -0.028f)
                arcToRelative(0.147f, 0.147f, 0f, false, true, 0f, -0.252f)
                lineToRelative(0.042f, -0.028f)
                close()
                moveTo(9.3f, 10.386f)
                quadToRelative(0.102f, 0f, 0.223f, 0.006f)
                curveToRelative(0.434f, 0.02f, 1.034f, 0.086f, 1.7f, 0.271f)
                curveToRelative(1.326f, 0.368f, 2.896f, 1.202f, 3.94f, 3.08f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.933f, -0.305f)
                curveToRelative(-0.464f, -3.71f, -1.886f, -5.662f, -3.46f, -6.66f)
                curveToRelative(-1.245f, -0.79f, -2.527f, -0.942f, -3.336f, -0.971f)
                verticalLineToRelative(-0.66f)
                arcToRelative(1.144f, 1.144f, 0f, false, false, -1.767f, -0.96f)
                lineToRelative(-3.994f, 2.94f)
                arcToRelative(1.147f, 1.147f, 0f, false, false, 0f, 1.946f)
                lineToRelative(3.994f, 2.94f)
                arcToRelative(1.144f, 1.144f, 0f, false, false, 1.767f, -0.96f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.232f, 4.293f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.7f, -0.106f)
                lineTo(0.54f, 7.127f)
                arcToRelative(1.147f, 1.147f, 0f, false, false, 0f, 1.946f)
                lineToRelative(3.994f, 2.94f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.593f, -0.805f)
                lineTo(1.114f, 8.254f)
                lineToRelative(-0.042f, -0.028f)
                arcToRelative(0.147f, 0.147f, 0f, false, true, 0f, -0.252f)
                lineToRelative(0.042f, -0.028f)
                lineToRelative(4.012f, -2.954f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.106f, -0.699f)
            }
        }.build()
        
        return _ReplyAll!!
    }

private var _ReplyAll: ImageVector? = null

