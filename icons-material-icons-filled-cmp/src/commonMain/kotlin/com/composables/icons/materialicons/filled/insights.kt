package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Insights: ImageVector
    get() {
        if (_Insights != null) return _Insights!!
        
        _Insights = ImageVector.Builder(
            name = "insights",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 8f)
                        curveToRelative(-1.45f, 0f, -2.26f, 1.44f, -1.93f, 2.51f)
                        lineToRelative(-3.55f, 3.56f)
                        curveToRelative(-0.3f, -0.09f, -0.74f, -0.09f, -1.04f, 0f)
                        lineToRelative(-2.55f, -2.55f)
                        curveTo(12.27f, 10.45f, 11.46f, 9f, 10f, 9f)
                        curveToRelative(-1.45f, 0f, -2.27f, 1.44f, -1.93f, 2.52f)
                        lineToRelative(-4.56f, 4.55f)
                        curveTo(2.44f, 15.74f, 1f, 16.55f, 1f, 18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        curveToRelative(1.45f, 0f, 2.26f, -1.44f, 1.93f, -2.51f)
                        lineToRelative(4.55f, -4.56f)
                        curveToRelative(0.3f, 0.09f, 0.74f, 0.09f, 1.04f, 0f)
                        lineToRelative(2.55f, 2.55f)
                        curveTo(12.73f, 16.55f, 13.54f, 18f, 15f, 18f)
                        curveToRelative(1.45f, 0f, 2.27f, -1.44f, 1.93f, -2.52f)
                        lineToRelative(3.56f, -3.55f)
                        curveTo(21.56f, 12.26f, 23f, 11.45f, 23f, 10f)
                        curveTo(23f, 8.9f, 22.1f, 8f, 21f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 9f)
                        lineTo(15.94f, 6.93f)
                        lineTo(18f, 6f)
                        lineTo(15.94f, 5.07f)
                        lineTo(15f, 3f)
                        lineTo(14.08f, 5.07f)
                        lineTo(12f, 6f)
                        lineTo(14.08f, 6.93f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.5f, 11f)
                        lineTo(4f, 9f)
                        lineTo(6f, 8.5f)
                        lineTo(4f, 8f)
                        lineTo(3.5f, 6f)
                        lineTo(3f, 8f)
                        lineTo(1f, 8.5f)
                        lineTo(3f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Insights!!
    }

private var _Insights: ImageVector? = null

