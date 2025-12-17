package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileWord: ImageVector
    get() {
        if (_FileWord != null) return _FileWord!!
        
        _FileWord = ImageVector.Builder(
            name = "file-word",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(57.1f, 120f)
                horizontalLineTo(305f)
                curveToRelative(7.7f, 0f, 13.4f, 7.1f, 11.7f, 14.7f)
                lineToRelative(-38f, 168f)
                curveToRelative(-1.2f, 5.5f, -6.1f, 9.3f, -11.7f, 9.3f)
                horizontalLineToRelative(-38f)
                curveToRelative(-5.5f, 0f, -10.3f, -3.8f, -11.6f, -9.1f)
                curveToRelative(-25.8f, -103.5f, -20.8f, -81.2f, -25.6f, -110.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.1f, 14.3f, -2.4f, 17.4f, -25.6f, 110.5f)
                curveToRelative(-1.3f, 5.3f, -6.1f, 9.1f, -11.6f, 9.1f)
                horizontalLineTo(117f)
                curveToRelative(-5.6f, 0f, -10.5f, -3.9f, -11.7f, -9.4f)
                lineToRelative(-37.8f, -168f)
                curveToRelative(-1.7f, -7.5f, 4f, -14.6f, 11.7f, -14.6f)
                horizontalLineToRelative(24.5f)
                curveToRelative(5.7f, 0f, 10.7f, 4f, 11.8f, 9.7f)
                curveToRelative(15.6f, 78f, 20.1f, 109.5f, 21f, 122.2f)
                curveToRelative(1.6f, -10.2f, 7.3f, -32.7f, 29.4f, -122.7f)
                curveToRelative(1.3f, -5.4f, 6.1f, -9.1f, 11.7f, -9.1f)
                horizontalLineToRelative(29.1f)
                curveToRelative(5.6f, 0f, 10.4f, 3.8f, 11.7f, 9.2f)
                curveToRelative(24f, 100.4f, 28.8f, 124f, 29.6f, 129.4f)
                curveToRelative(-0.2f, -11.2f, -2.6f, -17.8f, 21.6f, -129.2f)
                curveToRelative(1f, -5.6f, 5.9f, -9.5f, 11.5f, -9.5f)
                close()
                moveTo(384f, 121.9f)
                verticalLineToRelative(6.1f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0f, 12.5f, 2.5f, 17f, 7f)
                lineToRelative(97.9f, 98f)
                curveToRelative(4.5f, 4.5f, 7f, 10.6f, 7f, 16.9f)
                close()
            }
        }.build()
        
        return _FileWord!!
    }

private var _FileWord: ImageVector? = null

