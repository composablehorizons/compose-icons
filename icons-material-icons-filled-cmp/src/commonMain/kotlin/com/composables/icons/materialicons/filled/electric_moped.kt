package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Electric_moped: ImageVector
    get() {
        if (_Electric_moped != null) return _Electric_moped!!
        
        _Electric_moped = ImageVector.Builder(
            name = "electric_moped",
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
                        moveTo(19f, 5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2.65f)
                        lineTo(13.52f, 12f)
                        horizontalLineTo(10f)
                        verticalLineTo(7f)
                        horizontalLineTo(6f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        horizontalLineToRelative(4.48f)
                        lineTo(19f, 8.35f)
                        verticalLineTo(5f)
                        close()
                        moveTo(7f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        horizontalLineToRelative(2f)
                        curveTo(8f, 14.55f, 7.55f, 15f, 7f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 4f)
                        horizontalLineTo(10f)
                        verticalLineTo(6f)
                        horizontalLineTo(5f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 11f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        reflectiveCurveTo(20.66f, 11f, 19f, 11f)
                        close()
                        moveTo(19f, 15f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(19.55f, 15f, 19f, 15f)
                        close()
                    }
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 20f)
                    lineTo(11f, 20f)
                    lineTo(11f, 18f)
                    lineTo(17f, 21f)
                    lineTo(13f, 21f)
                    lineTo(13f, 23f)
                    close()
                }
            }
        }.build()
        
        return _Electric_moped!!
    }

private var _Electric_moped: ImageVector? = null

