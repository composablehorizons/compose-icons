package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Model_training: ImageVector
    get() {
        if (_Model_training != null) return _Model_training!!
        
        _Model_training = ImageVector.Builder(
            name = "model_training",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15.5f, 13.5f)
                    curveToRelative(0f, 2f, -2.5f, 3.5f, -2.5f, 5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -1.5f, -2.5f, -3f, -2.5f, -5f)
                    curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                    horizontalLineToRelative(0f)
                    curveTo(13.93f, 10f, 15.5f, 11.57f, 15.5f, 13.5f)
                    close()
                    moveTo(13f, 19.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(21f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19.5f)
                    close()
                    moveTo(19f, 13f)
                    curveToRelative(0f, 1.68f, -0.59f, 3.21f, -1.58f, 4.42f)
                    lineToRelative(1.42f, 1.42f)
                    curveTo(20.18f, 17.27f, 21f, 15.23f, 21f, 13f)
                    curveToRelative(0f, -2.74f, -1.23f, -5.19f, -3.16f, -6.84f)
                    lineToRelative(-1.42f, 1.42f)
                    curveTo(17.99f, 8.86f, 19f, 10.82f, 19f, 13f)
                    close()
                    moveTo(16f, 5f)
                    lineToRelative(-4f, -4f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                    curveToRelative(0f, 2.23f, 0.82f, 4.27f, 2.16f, 5.84f)
                    lineToRelative(1.42f, -1.42f)
                    curveTo(5.59f, 16.21f, 5f, 14.68f, 5f, 13f)
                    curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                    curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                    verticalLineToRelative(3f)
                    lineTo(16f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Model_training!!
    }

private var _Model_training: ImageVector? = null

