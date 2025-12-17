package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
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
                        moveTo(17f, 7f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                        reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        reflectiveCurveTo(19.76f, 7f, 17f, 7f)
                        close()
                        moveTo(8f, 12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(9f)
                        curveTo(8.45f, 11f, 8f, 11.45f, 8f, 12f)
                        close()
                        moveTo(10f, 15f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                        reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(7f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(11f, 15.45f, 10.55f, 15f, 10f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

