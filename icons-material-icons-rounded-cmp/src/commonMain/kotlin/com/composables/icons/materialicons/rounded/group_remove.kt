package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Group_remove: ImageVector
    get() {
        if (_Group_remove != null) return _Group_remove!!
        
        _Group_remove = ImageVector.Builder(
            name = "group_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveTo(18.45f, 11f, 18f, 10.55f, 18f, 10f)
                close()
                moveTo(8f, 4f)
                curveTo(5.79f, 4f, 4f, 5.79f, 4f, 8f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(10.21f, 4f, 8f, 4f)
                close()
                moveTo(8f, 13f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                curveTo(16f, 14.34f, 10.67f, 13f, 8f, 13f)
                close()
                moveTo(12.51f, 4.05f)
                curveTo(13.43f, 5.11f, 14f, 6.49f, 14f, 8f)
                reflectiveCurveToRelative(-0.57f, 2.89f, -1.49f, 3.95f)
                curveTo(14.47f, 11.7f, 16f, 10.04f, 16f, 8f)
                reflectiveCurveTo(14.47f, 4.3f, 12.51f, 4.05f)
                close()
                moveTo(16.53f, 13.83f)
                curveTo(17.42f, 14.66f, 18f, 15.7f, 18f, 17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveTo(20f, 15.55f, 18.41f, 14.49f, 16.53f, 13.83f)
                close()
            }
        }.build()
        
        return _Group_remove!!
    }

private var _Group_remove: ImageVector? = null

