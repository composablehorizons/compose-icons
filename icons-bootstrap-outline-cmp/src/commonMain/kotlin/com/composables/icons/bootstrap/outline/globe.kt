package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Globe: ImageVector
    get() {
        if (_Globe != null) return _Globe!!
        
        _Globe = ImageVector.Builder(
            name = "globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
                moveToRelative(7.5f, -6.923f)
                curveToRelative(-0.67f, 0.204f, -1.335f, 0.82f, -1.887f, 1.855f)
                arcTo(8f, 8f, 0f, false, false, 5.145f, 4f)
                horizontalLineTo(7.5f)
                close()
                moveTo(4.09f, 4f)
                arcToRelative(9.3f, 9.3f, 0f, false, true, 0.64f, -1.539f)
                arcToRelative(7f, 7f, 0f, false, true, 0.597f, -0.933f)
                arcTo(7.03f, 7.03f, 0f, false, false, 2.255f, 4f)
                close()
                moveToRelative(-0.582f, 3.5f)
                curveToRelative(0.03f, -0.877f, 0.138f, -1.718f, 0.312f, -2.5f)
                horizontalLineTo(1.674f)
                arcToRelative(7f, 7f, 0f, false, false, -0.656f, 2.5f)
                close()
                moveTo(4.847f, 5f)
                arcToRelative(12.5f, 12.5f, 0f, false, false, -0.338f, 2.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(5f)
                close()
                moveTo(8.5f, 5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.99f)
                arcToRelative(12.5f, 12.5f, 0f, false, false, -0.337f, -2.5f)
                close()
                moveTo(4.51f, 8.5f)
                arcToRelative(12.5f, 12.5f, 0f, false, false, 0.337f, 2.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(8.5f)
                close()
                moveToRelative(3.99f, 0f)
                verticalLineTo(11f)
                horizontalLineToRelative(2.653f)
                curveToRelative(0.187f, -0.765f, 0.306f, -1.608f, 0.338f, -2.5f)
                close()
                moveTo(5.145f, 12f)
                quadToRelative(0.208f, 0.58f, 0.468f, 1.068f)
                curveToRelative(0.552f, 1.035f, 1.218f, 1.65f, 1.887f, 1.855f)
                verticalLineTo(12f)
                close()
                moveToRelative(0.182f, 2.472f)
                arcToRelative(7f, 7f, 0f, false, true, -0.597f, -0.933f)
                arcTo(9.3f, 9.3f, 0f, false, true, 4.09f, 12f)
                horizontalLineTo(2.255f)
                arcToRelative(7f, 7f, 0f, false, false, 3.072f, 2.472f)
                moveTo(3.82f, 11f)
                arcToRelative(13.7f, 13.7f, 0f, false, true, -0.312f, -2.5f)
                horizontalLineToRelative(-2.49f)
                curveToRelative(0.062f, 0.89f, 0.291f, 1.733f, 0.656f, 2.5f)
                close()
                moveToRelative(6.853f, 3.472f)
                arcTo(7f, 7f, 0f, false, false, 13.745f, 12f)
                horizontalLineTo(11.91f)
                arcToRelative(9.3f, 9.3f, 0f, false, true, -0.64f, 1.539f)
                arcToRelative(7f, 7f, 0f, false, true, -0.597f, 0.933f)
                moveTo(8.5f, 12f)
                verticalLineToRelative(2.923f)
                curveToRelative(0.67f, -0.204f, 1.335f, -0.82f, 1.887f, -1.855f)
                quadToRelative(0.26f, -0.487f, 0.468f, -1.068f)
                close()
                moveToRelative(3.68f, -1f)
                horizontalLineToRelative(2.146f)
                curveToRelative(0.365f, -0.767f, 0.594f, -1.61f, 0.656f, -2.5f)
                horizontalLineToRelative(-2.49f)
                arcToRelative(13.7f, 13.7f, 0f, false, true, -0.312f, 2.5f)
                moveToRelative(2.802f, -3.5f)
                arcToRelative(7f, 7f, 0f, false, false, -0.656f, -2.5f)
                horizontalLineTo(12.18f)
                curveToRelative(0.174f, 0.782f, 0.282f, 1.623f, 0.312f, 2.5f)
                close()
                moveTo(11.27f, 2.461f)
                curveToRelative(0.247f, 0.464f, 0.462f, 0.98f, 0.64f, 1.539f)
                horizontalLineToRelative(1.835f)
                arcToRelative(7f, 7f, 0f, false, false, -3.072f, -2.472f)
                curveToRelative(0.218f, 0.284f, 0.418f, 0.598f, 0.597f, 0.933f)
                moveTo(10.855f, 4f)
                arcToRelative(8f, 8f, 0f, false, false, -0.468f, -1.068f)
                curveTo(9.835f, 1.897f, 9.17f, 1.282f, 8.5f, 1.077f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Globe!!
    }

private var _Globe: ImageVector? = null

