package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_encryption_gmailerrorred: ImageVector
    get() {
        if (_No_encryption_gmailerrorred != null) return _No_encryption_gmailerrorred!!
        
        _No_encryption_gmailerrorred = ImageVector.Builder(
            name = "no_encryption_gmailerrorred",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8.9f, 6f)
                    curveToRelative(0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                    reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-4.27f)
                    lineTo(20f, 17.17f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    curveTo(9.79f, 1f, 7.93f, 2.45f, 7.27f, 4.44f)
                    lineTo(8.9f, 6.07f)
                    verticalLineTo(6f)
                    close()
                    moveTo(2.1f, 2.1f)
                    lineTo(0.69f, 3.51f)
                    lineTo(5.3f, 8.13f)
                    curveTo(4.55f, 8.42f, 4f, 9.15f, 4f, 10f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(0.34f, 0f, 0.65f, -0.09f, 0.93f, -0.24f)
                    lineToRelative(1.56f, 1.56f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(2.1f, 2.1f)
                    close()
                    moveTo(12f, 17f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f)
                    lineToRelative(2.81f, 2.81f)
                    curveTo(13.12f, 16.73f, 12.59f, 17f, 12f, 17f)
                    close()
                }
            }
        }.build()
        
        return _No_encryption_gmailerrorred!!
    }

private var _No_encryption_gmailerrorred: ImageVector? = null

