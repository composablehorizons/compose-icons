package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Assignment_late: ImageVector
    get() {
        if (_Assignment_late != null) return _Assignment_late!!
        
        _Assignment_late = ImageVector.Builder(
            name = "assignment_late",
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
                        moveTo(19f, 3f)
                        horizontalLineToRelative(-4.18f)
                        curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                        reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(12f, 2.75f)
                        curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                        curveTo(11.25f, 3.09f, 11.59f, 2.75f, 12f, 2.75f)
                        close()
                        moveTo(12f, 13f)
                        lineTo(12f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        curveTo(13f, 12.55f, 12.55f, 13f, 12f, 13f)
                        close()
                        moveTo(13f, 16f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveTo(13f, 15.45f, 13f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Assignment_late!!
    }

private var _Assignment_late: ImageVector? = null

