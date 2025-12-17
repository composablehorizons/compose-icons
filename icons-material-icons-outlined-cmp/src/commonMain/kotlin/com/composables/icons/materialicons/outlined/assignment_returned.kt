package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Assignment_returned: ImageVector
    get() {
        if (_Assignment_returned != null) return _Assignment_returned!!
        
        _Assignment_returned = ImageVector.Builder(
            name = "assignment_returned",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                lineToRelative(5f, 5f)
                close()
                moveToRelative(2f, -9f)
                horizontalLineToRelative(-4.18f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.01f, -0.4f, 0.04f)
                curveToRelative(-0.39f, 0.08f, -0.74f, 0.28f, -1.01f, 0.55f)
                curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f)
                curveToRelative(-0.1f, 0.23f, -0.16f, 0.49f, -0.16f, 0.77f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f)
                reflectiveCurveToRelative(0.25f, 0.45f, 0.43f, 0.64f)
                curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f)
                curveToRelative(0.13f, 0.02f, 0.26f, 0.03f, 0.4f, 0.03f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, -0.25f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Assignment_returned!!
    }

private var _Assignment_returned: ImageVector? = null

