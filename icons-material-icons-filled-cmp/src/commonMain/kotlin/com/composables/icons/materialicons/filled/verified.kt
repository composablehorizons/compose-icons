package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Verified: ImageVector
    get() {
        if (_Verified != null) return _Verified!!
        
        _Verified = ImageVector.Builder(
            name = "verified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(23f, 12f)
                    lineToRelative(-2.44f, -2.79f)
                    lineToRelative(0.34f, -3.69f)
                    lineToRelative(-3.61f, -0.82f)
                    lineTo(15.4f, 1.5f)
                    lineTo(12f, 2.96f)
                    lineTo(8.6f, 1.5f)
                    lineTo(6.71f, 4.69f)
                    lineTo(3.1f, 5.5f)
                    lineTo(3.44f, 9.2f)
                    lineTo(1f, 12f)
                    lineToRelative(2.44f, 2.79f)
                    lineToRelative(-0.34f, 3.7f)
                    lineToRelative(3.61f, 0.82f)
                    lineTo(8.6f, 22.5f)
                    lineToRelative(3.4f, -1.47f)
                    lineToRelative(3.4f, 1.46f)
                    lineToRelative(1.89f, -3.19f)
                    lineToRelative(3.61f, -0.82f)
                    lineToRelative(-0.34f, -3.69f)
                    lineTo(23f, 12f)
                    close()
                    moveTo(10.09f, 16.72f)
                    lineToRelative(-3.8f, -3.81f)
                    lineToRelative(1.48f, -1.48f)
                    lineToRelative(2.32f, 2.33f)
                    lineToRelative(5.85f, -5.87f)
                    lineToRelative(1.48f, 1.48f)
                    lineTo(10.09f, 16.72f)
                    close()
                }
            }
        }.build()
        
        return _Verified!!
    }

private var _Verified: ImageVector? = null

