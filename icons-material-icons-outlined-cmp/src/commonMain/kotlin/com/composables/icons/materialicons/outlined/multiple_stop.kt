package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Multiple_stop: ImageVector
    get() {
        if (_Multiple_stop != null) return _Multiple_stop!!
        
        _Multiple_stop = ImageVector.Builder(
            name = "multiple_stop",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(-4f, 4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(4f)
                    close()
                    moveTo(10f, 7f)
                    curveTo(9.45f, 7f, 9f, 7.45f, 9f, 8f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(10.55f, 7f, 10f, 7f)
                    close()
                    moveTo(6f, 7f)
                    curveTo(5.45f, 7f, 5f, 7.45f, 5f, 8f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(6.55f, 7f, 6f, 7f)
                    close()
                    moveTo(7f, 17f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-3f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(4f, 4f)
                    verticalLineTo(17f)
                    close()
                    moveTo(14f, 17f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    curveTo(13f, 16.55f, 13.45f, 17f, 14f, 17f)
                    close()
                    moveTo(18f, 17f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                    curveTo(17f, 16.55f, 17.45f, 17f, 18f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Multiple_stop!!
    }

private var _Multiple_stop: ImageVector? = null

