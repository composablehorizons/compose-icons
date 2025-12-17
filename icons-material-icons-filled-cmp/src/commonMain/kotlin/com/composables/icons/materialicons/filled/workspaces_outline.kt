package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Workspaces_outline: ImageVector
    get() {
        if (_Workspaces_outline != null) return _Workspaces_outline!!
        
        _Workspaces_outline = ImageVector.Builder(
            name = "workspaces_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                moveToRelative(0f, -2f)
                curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
                moveToRelative(6f, -8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                moveToRelative(0f, -2f)
                curveTo(9.8f, 3f, 8f, 4.8f, 8f, 7f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
                moveToRelative(6f, 12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                moveToRelative(0f, -2f)
                curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
            }
        }.build()
        
        return _Workspaces_outline!!
    }

private var _Workspaces_outline: ImageVector? = null

