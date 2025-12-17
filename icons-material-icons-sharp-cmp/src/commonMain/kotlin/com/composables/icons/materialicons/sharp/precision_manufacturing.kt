package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Precision_manufacturing: ImageVector
    get() {
        if (_Precision_manufacturing != null) return _Precision_manufacturing!!
        
        _Precision_manufacturing = ImageVector.Builder(
            name = "precision_manufacturing",
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
                    moveTo(14f, 10f)
                    verticalLineTo(9.82f)
                    lineToRelative(2.01f, 2.01f)
                    lineToRelative(5.23f, -2.44f)
                    lineToRelative(-0.63f, -1.36f)
                    lineToRelative(-4.28f, 2f)
                    lineTo(14f, 7.7f)
                    verticalLineTo(6.3f)
                    lineToRelative(2.33f, -2.33f)
                    lineToRelative(4.28f, 2f)
                    lineToRelative(0.63f, -1.36f)
                    lineToRelative(-5.23f, -2.44f)
                    lineTo(14f, 4.18f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8.82f)
                    curveTo(8.4f, 4.84f, 7.3f, 4f, 6f, 4f)
                    curveTo(4.34f, 4f, 3f, 5.34f, 3f, 7f)
                    curveToRelative(0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f)
                    lineTo(7.08f, 18f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(13f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(-3.62f)
                    lineTo(8.41f, 8.76f)
                    curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(14f)
                    close()
                    moveTo(6f, 8f)
                    curveTo(5.45f, 8f, 5f, 7.55f, 5f, 7f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    curveTo(7f, 7.55f, 6.55f, 8f, 6f, 8f)
                    close()
                }
            }
        }.build()
        
        return _Precision_manufacturing!!
    }

private var _Precision_manufacturing: ImageVector? = null

