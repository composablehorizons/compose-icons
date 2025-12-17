package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Theater_comedy: ImageVector
    get() {
        if (_Theater_comedy != null) return _Theater_comedy!!
        
        _Theater_comedy = ImageVector.Builder(
            name = "theater_comedy",
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
                        moveTo(11f, 2f)
                        verticalLineToRelative(5.5f)
                        horizontalLineToRelative(3.5f)
                        verticalLineToRelative(3.31f)
                        curveTo(14.55f, 9.8f, 15.64f, 9f, 16.99f, 9f)
                        curveToRelative(1.38f, 0f, 2.5f, 0.84f, 2.5f, 1.88f)
                        horizontalLineTo(14.5f)
                        verticalLineToRelative(3.56f)
                        curveTo(15.26f, 14.8f, 16.11f, 15f, 17f, 15f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        verticalLineTo(2f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(15f, 7.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(15.55f, 7.5f, 15f, 7.5f)
                        close()
                        moveTo(19f, 7.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(19.55f, 7.5f, 19f, 7.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 16f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        verticalLineTo(9f)
                        horizontalLineTo(1f)
                        verticalLineTo(16f)
                        close()
                        moveTo(7f, 17.88f)
                        curveToRelative(-1.38f, 0f, -2.5f, -0.84f, -2.5f, -1.88f)
                        horizontalLineToRelative(5f)
                        curveTo(9.5f, 17.04f, 8.38f, 17.88f, 7f, 17.88f)
                        close()
                        moveTo(9f, 12.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(8.45f, 12.5f, 9f, 12.5f)
                        close()
                        moveTo(5f, 12.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveTo(4.45f, 12.5f, 5f, 12.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Theater_comedy!!
    }

private var _Theater_comedy: ImageVector? = null

