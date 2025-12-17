package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Electric_bike: ImageVector
    get() {
        if (_Electric_bike != null) return _Electric_bike!!
        
        _Electric_bike = ImageVector.Builder(
            name = "electric_bike",
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
                        moveTo(19f, 7f)
                        horizontalLineToRelative(-0.82f)
                        lineToRelative(-1.7f, -4.68f)
                        curveTo(16.19f, 1.53f, 15.44f, 1f, 14.6f, 1f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2.6f)
                        lineToRelative(1.46f, 4f)
                        horizontalLineToRelative(-4.81f)
                        lineToRelative(-0.36f, -1f)
                        horizontalLineTo(12f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(1.75f)
                        lineToRelative(1.82f, 5f)
                        horizontalLineTo(9.9f)
                        curveTo(9.46f, 8.77f, 7.59f, 7.12f, 5.25f, 7.01f)
                        curveTo(2.45f, 6.87f, 0f, 9.2f, 0f, 12f)
                        curveToRelative(0f, 2.8f, 2.2f, 5f, 5f, 5f)
                        curveToRelative(2.46f, 0f, 4.45f, -1.69f, 4.9f, -4f)
                        horizontalLineToRelative(4.2f)
                        curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f)
                        curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5f)
                        curveTo(24f, 9.2f, 21.8f, 7f, 19f, 7f)
                        close()
                        moveTo(7.82f, 13f)
                        curveToRelative(-0.4f, 1.17f, -1.49f, 2f, -2.82f, 2f)
                        curveToRelative(-1.68f, 0f, -3f, -1.32f, -3f, -3f)
                        reflectiveCurveToRelative(1.32f, -3f, 3f, -3f)
                        curveToRelative(1.33f, 0f, 2.42f, 0.83f, 2.82f, 2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(7.82f)
                        close()
                        moveTo(14.1f, 11f)
                        horizontalLineToRelative(-1.4f)
                        lineToRelative(-0.73f, -2f)
                        horizontalLineTo(15f)
                        curveTo(14.56f, 9.58f, 14.24f, 10.25f, 14.1f, 11f)
                        close()
                        moveTo(19f, 15f)
                        curveToRelative(-1.68f, 0f, -3f, -1.32f, -3f, -3f)
                        curveToRelative(0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f)
                        lineToRelative(0.96f, 2.64f)
                        lineToRelative(1.88f, -0.68f)
                        lineToRelative(-0.97f, -2.67f)
                        curveTo(18.94f, 9.01f, 18.97f, 9f, 19f, 9f)
                        curveToRelative(1.68f, 0f, 3f, 1.32f, 3f, 3f)
                        reflectiveCurveTo(20.68f, 15f, 19f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 20f)
                        lineTo(7f, 20f)
                        lineTo(13f, 23f)
                        lineTo(13f, 21f)
                        lineTo(17f, 21f)
                        lineTo(11f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Electric_bike!!
    }

private var _Electric_bike: ImageVector? = null

