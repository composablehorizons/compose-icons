package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Workspaces: ImageVector
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
                        moveTo(6f, 13f)
                        curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                        reflectiveCurveTo(8.2f, 13f, 6f, 13f)
                        close()
                        moveTo(12f, 3f)
                        curveTo(9.8f, 3f, 8f, 4.8f, 8f, 7f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                        reflectiveCurveTo(14.2f, 3f, 12f, 3f)
                        close()
                        moveTo(18f, 13f)
                        curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                        reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                        reflectiveCurveTo(20.2f, 13f, 18f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Workspaces!!
    }

private var _Workspaces: ImageVector? = null

