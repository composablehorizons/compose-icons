package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonBadge: ImageVector
    get() {
        if (_PersonBadge != null) return _PersonBadge!!
        
        _PersonBadge = ImageVector.Builder(
            name = "person-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(11f, 8f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2f, 2.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 11.5f, 0f)
                close()
                moveTo(3f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 1f)
                horizontalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 2.5f)
                verticalLineToRelative(10.795f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, -0.776f, -0.492f)
                curveTo(11.392f, 12.387f, 10.063f, 12f, 8f, 12f)
                reflectiveCurveToRelative(-3.392f, 0.387f, -4.224f, 0.803f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, -0.776f, 0.492f)
                close()
            }
        }.build()
        
        return _PersonBadge!!
    }

private var _PersonBadge: ImageVector? = null

