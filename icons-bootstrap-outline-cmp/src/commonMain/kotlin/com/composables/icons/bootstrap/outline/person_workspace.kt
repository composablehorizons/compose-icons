package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonWorkspace: ImageVector
    get() {
        if (_PersonWorkspace != null) return _PersonWorkspace!!
        
        _PersonWorkspace = ImageVector.Builder(
            name = "person-workspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 16f)
                reflectiveCurveToRelative(-1f, 0f, -1f, -1f)
                reflectiveCurveToRelative(1f, -4f, 5f, -4f)
                reflectiveCurveToRelative(5f, 3f, 5f, 4f)
                reflectiveCurveToRelative(-1f, 1f, -1f, 1f)
                close()
                moveToRelative(4f, -5.95f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(0.653f)
                arcToRelative(5.4f, 5.4f, 0f, false, true, 1.066f, -2f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2.219f)
                curveToRelative(0.554f, 0.654f, 0.89f, 1.373f, 1.066f, 2f)
                horizontalLineToRelative(0.653f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _PersonWorkspace!!
    }

private var _PersonWorkspace: ImageVector? = null

