package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Delete_forever: ImageVector
    get() {
        if (_Delete_forever != null) return _Delete_forever!!
        
        _Delete_forever = ImageVector.Builder(
            name = "delete_forever",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7f)
                    horizontalLineTo(6f)
                    verticalLineTo(19f)
                    close()
                    moveTo(9.17f, 12.59f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(12f, 12.59f)
                    lineToRelative(1.41f, -1.41f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                    lineTo(13.41f, 14f)
                    lineToRelative(1.41f, 1.41f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                    lineTo(12f, 15.41f)
                    lineToRelative(-1.41f, 1.41f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(10.59f, 14f)
                    lineTo(9.17f, 12.59f)
                    close()
                    moveTo(18f, 4f)
                    horizontalLineToRelative(-2.5f)
                    lineToRelative(-0.71f, -0.71f)
                    curveTo(14.61f, 3.11f, 14.35f, 3f, 14.09f, 3f)
                    horizontalLineTo(9.91f)
                    curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.7f, 0.29f)
                    lineTo(8.5f, 4f)
                    horizontalLineTo(6f)
                    curveTo(5.45f, 4f, 5f, 4.45f, 5f, 5f)
                    reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(12f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveTo(18.55f, 4f, 18f, 4f)
                    close()
                }
            }
        }.build()
        
        return _Delete_forever!!
    }

private var _Delete_forever: ImageVector? = null

