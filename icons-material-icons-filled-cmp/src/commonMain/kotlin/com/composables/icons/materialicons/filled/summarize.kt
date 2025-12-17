package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Summarize: ImageVector
    get() {
        if (_Summarize != null) return _Summarize!!
        
        _Summarize = ImageVector.Builder(
            name = "summarize",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3.01f, 3.9f, 3.01f, 5f)
                        lineTo(3f, 19f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                        horizontalLineTo(19f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(9f)
                        lineTo(15f, 3f)
                        close()
                        moveTo(8f, 17f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(8.55f, 17f, 8f, 17f)
                        close()
                        moveTo(8f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(8.55f, 13f, 8f, 13f)
                        close()
                        moveTo(8f, 9f)
                        curveTo(7.45f, 9f, 7f, 8.55f, 7f, 8f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(8.55f, 9f, 8f, 9f)
                        close()
                        moveTo(14f, 10f)
                        verticalLineTo(4.5f)
                        lineToRelative(5.5f, 5.5f)
                        horizontalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Summarize!!
    }

private var _Summarize: ImageVector? = null

