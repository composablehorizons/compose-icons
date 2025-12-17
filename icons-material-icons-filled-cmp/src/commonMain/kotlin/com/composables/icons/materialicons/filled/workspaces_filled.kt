package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Workspaces_filled: ImageVector
    get() {
        if (_Workspaces_filled != null) return _Workspaces_filled!!
        
        _Workspaces_filled = ImageVector.Builder(
            name = "workspaces_filled",
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
                moveTo(6f, 13f)
                curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
                moveToRelative(6f, -10f)
                curveTo(9.8f, 3f, 8f, 4.8f, 8f, 7f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
                moveToRelative(6f, 10f)
                curveToRelative(-2.2f, 0f, -4f, 1.8f, -4f, 4f)
                reflectiveCurveToRelative(1.8f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.8f, 4f, -4f)
                reflectiveCurveToRelative(-1.8f, -4f, -4f, -4f)
                close()
            }
        }.build()
        
        return _Workspaces_filled!!
    }

private var _Workspaces_filled: ImageVector? = null

