package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Workspaces: ImageVector
    get() {
        if (_Workspaces != null) return _Workspaces!!
        
        _Workspaces = ImageVector.Builder(
            name = "workspaces",
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
                        moveTo(8f, 17f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 19f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 17f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 7f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 9f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 7f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 17f)
                        arcTo(2f, 2f, 0f, false, true, 18f, 19f)
                        arcTo(2f, 2f, 0f, false, true, 16f, 17f)
                        arcTo(2f, 2f, 0f, false, true, 20f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                        reflectiveCurveTo(20.2f, 13f, 18f, 13f)
                        close()
                        moveTo(18f, 19f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(20f, 18.1f, 19.1f, 19f, 18f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 13f)
                        curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                        reflectiveCurveTo(8.2f, 13f, 6f, 13f)
                        close()
                        moveTo(6f, 19f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(8f, 18.1f, 7.1f, 19f, 6f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 7f)
                        curveToRelative(0f, -2.2f, -1.8f, -4f, -4f, -4f)
                        reflectiveCurveTo(8f, 4.8f, 8f, 7f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveTo(16f, 9.2f, 16f, 7f)
                        close()
                        moveTo(12f, 9f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(14f, 8.1f, 13.1f, 9f, 12f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Workspaces!!
    }

private var _Workspaces: ImageVector? = null

