package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flaky: ImageVector
    get() {
        if (_Flaky != null) return _Flaky!!
        
        _Flaky = ImageVector.Builder(
            name = "flaky",
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
                    moveTo(14.05f, 17.58f)
                    lineToRelative(-0.01f, 0.01f)
                    lineToRelative(-2.4f, -2.4f)
                    lineToRelative(1.06f, -1.06f)
                    lineToRelative(1.35f, 1.35f)
                    lineTo(16.54f, 13f)
                    lineToRelative(1.06f, 1.06f)
                    lineToRelative(-3.54f, 3.54f)
                    lineTo(14.05f, 17.58f)
                    close()
                    moveTo(12f, 2f)
                    curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                    reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                    reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                    close()
                    moveTo(7.34f, 6.28f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(1.06f, 1.06f)
                    lineTo(9.81f, 8.75f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(-1.06f, 1.06f)
                    lineTo(8.75f, 9.81f)
                    lineToRelative(-1.41f, 1.41f)
                    lineToRelative(-1.06f, -1.06f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(6.28f, 7.34f)
                    lineTo(7.34f, 6.28f)
                    close()
                    moveTo(12f, 20f)
                    curveToRelative(-2.2f, 0f, -4.2f, -0.9f, -5.7f, -2.3f)
                    lineTo(17.7f, 6.3f)
                    curveTo(19.1f, 7.8f, 20f, 9.8f, 20f, 12f)
                    curveTo(20f, 16.4f, 16.4f, 20f, 12f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Flaky!!
    }

private var _Flaky: ImageVector? = null

