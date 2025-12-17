package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.17f, 19f)
                        lineToRelative(-3.42f, -3.42f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-3.92f)
                        lineTo(9.5f, 12.33f)
                        verticalLineTo(18f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-7.17f)
                        lineToRelative(-1f, -1f)
                        verticalLineTo(19f)
                        horizontalLineTo(16.17f)
                        close()
                        moveTo(17f, 8f)
                        verticalLineToRelative(6.17f)
                        lineToRelative(-1f, -1f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(2.67f)
                        lineToRelative(-1.75f, -1.75f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-0.92f)
                        lineToRelative(-1f, -1f)
                        horizontalLineTo(17f)
                        close()
                    }
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13.17f)
                        lineToRelative(-1.5f, -1.5f)
                        verticalLineTo(9f)
                        horizontalLineTo(16f)
                        verticalLineTo(13.17f)
                        close()
                        moveTo(19.78f, 22.61f)
                        lineToRelative(-1.85f, -1.85f)
                        curveTo(17.65f, 20.91f, 17.34f, 21f, 17f, 21f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        horizontalLineTo(9f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(18.38f, 18.38f)
                        lineTo(19.78f, 22.61f)
                        close()
                        moveTo(16.17f, 19f)
                        lineToRelative(-3.42f, -3.42f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-3.92f)
                        lineTo(9.5f, 12.33f)
                        verticalLineTo(18f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-7.17f)
                        lineToRelative(-1f, -1f)
                        verticalLineTo(19f)
                        horizontalLineTo(16.17f)
                        close()
                        moveTo(12.75f, 9f)
                        horizontalLineToRelative(-0.92f)
                        lineToRelative(0.92f, 0.92f)
                        verticalLineTo(9f)
                        close()
                        moveTo(19f, 8f)
                        verticalLineToRelative(8.17f)
                        lineToRelative(-2f, -2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-6.17f)
                        lineTo(9.84f, 7.01f)
                        lineTo(9f, 6.17f)
                        verticalLineTo(6f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        curveTo(18.1f, 6f, 19f, 6.9f, 19f, 8f)
                        close()
                        moveTo(10.5f, 6f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(3.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

