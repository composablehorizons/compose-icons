package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Coin: ImageVector
    get() {
        if (_Coin != null) return _Coin!!
        
        _Coin = ImageVector.Builder(
            name = "coin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 9.511f)
                curveToRelative(0.076f, 0.954f, 0.83f, 1.697f, 2.182f, 1.785f)
                verticalLineTo(12f)
                horizontalLineToRelative(0.6f)
                verticalLineToRelative(-0.709f)
                curveToRelative(1.4f, -0.098f, 2.218f, -0.846f, 2.218f, -1.932f)
                curveToRelative(0f, -0.987f, -0.626f, -1.496f, -1.745f, -1.76f)
                lineToRelative(-0.473f, -0.112f)
                verticalLineTo(5.57f)
                curveToRelative(0.6f, 0.068f, 0.982f, 0.396f, 1.074f, 0.85f)
                horizontalLineToRelative(1.052f)
                curveToRelative(-0.076f, -0.919f, -0.864f, -1.638f, -2.126f, -1.716f)
                verticalLineTo(4f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(0.719f)
                curveToRelative(-1.195f, 0.117f, -2.01f, 0.836f, -2.01f, 1.853f)
                curveToRelative(0f, 0.9f, 0.606f, 1.472f, 1.613f, 1.707f)
                lineToRelative(0.397f, 0.098f)
                verticalLineToRelative(2.034f)
                curveToRelative(-0.615f, -0.093f, -1.022f, -0.43f, -1.114f, -0.9f)
                close()
                moveToRelative(2.177f, -2.166f)
                curveToRelative(-0.59f, -0.137f, -0.91f, -0.416f, -0.91f, -0.836f)
                curveToRelative(0f, -0.47f, 0.345f, -0.822f, 0.915f, -0.925f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(-0.005f)
                close()
                moveToRelative(0.692f, 1.193f)
                curveToRelative(0.717f, 0.166f, 1.048f, 0.435f, 1.048f, 0.91f)
                curveToRelative(0f, 0.542f, -0.412f, 0.914f, -1.135f, 0.982f)
                verticalLineTo(8.518f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13.5f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, 0f, -11f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 0f, 11f)
                moveToRelative(0f, 0.5f)
                arcTo(6f, 6f, 0f, true, false, 8f, 2f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, 12f)
            }
        }.build()
        
        return _Coin!!
    }

private var _Coin: ImageVector? = null

