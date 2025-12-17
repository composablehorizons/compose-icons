package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.598f, 5.013f)
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
                lineTo(7.3f, 9.9f)
                lineToRelative(-0.05f, -0.498f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.45f, 0.498f)
                verticalLineToRelative(1.153f)
                curveToRelative(0f, 0.108f, -0.11f, 0.176f, -0.202f, 0.134f)
                lineTo(2.614f, 8.254f)
                lineToRelative(-0.042f, -0.028f)
                arcToRelative(0.147f, 0.147f, 0f, false, true, 0f, -0.252f)
                lineToRelative(0.042f, -0.028f)
                close()
                moveTo(7.8f, 10.386f)
                quadToRelative(0.103f, 0f, 0.223f, 0.006f)
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
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

