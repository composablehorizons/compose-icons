package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_stroller: ImageVector
    get() {
        if (_No_stroller != null) return _No_stroller!!
        
        _No_stroller = ImageVector.Builder(
            name = "no_stroller",
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
                    moveTo(8f, 20f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(8f, 18.9f, 8f, 20f)
                    close()
                    moveTo(15f, 8.66f)
                    verticalLineToRelative(3.51f)
                    lineToRelative(2f, 2f)
                    verticalLineToRelative(-7.9f)
                    curveTo(17.58f, 5.59f, 17.97f, 5f, 18.65f, 5f)
                    curveTo(19.42f, 5f, 20f, 5.66f, 20f, 6.48f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(6.48f)
                    curveTo(22f, 4.56f, 20.52f, 3f, 18.65f, 3f)
                    curveToRelative(-1.66f, 0f, -2.54f, 1.27f, -3.18f, 2.03f)
                    lineToRelative(-3.5f, 4.11f)
                    lineToRelative(1.42f, 1.42f)
                    lineTo(15f, 8.66f)
                    close()
                    moveTo(19.78f, 22.61f)
                    lineToRelative(-1.91f, -1.91f)
                    curveTo(17.58f, 21.46f, 16.86f, 22f, 16f, 22f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f)
                    lineTo(14.17f, 17f)
                    horizontalLineTo(7.43f)
                    curveToRelative(-0.85f, 0f, -1.31f, -1f, -0.76f, -1.65f)
                    lineToRelative(2.69f, -3.16f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(7.86f, 7.86f)
                    lineToRelative(1.42f, 1.42f)
                    lineToRelative(0f, 0f)
                    lineToRelative(9.11f, 9.11f)
                    lineTo(19.78f, 22.61f)
                    close()
                    moveTo(12.17f, 15f)
                    lineToRelative(-1.39f, -1.39f)
                    lineTo(9.6f, 15f)
                    horizontalLineTo(12.17f)
                    close()
                    moveTo(10f, 5f)
                    curveToRelative(0.29f, 0f, 0.58f, 0.02f, 0.86f, 0.05f)
                    lineTo(9.49f, 6.67f)
                    lineToRelative(1.42f, 1.42f)
                    lineTo(14.3f, 4.1f)
                    curveTo(13.03f, 3.4f, 11.56f, 3f, 10f, 3f)
                    curveTo(8.77f, 3f, 7.6f, 3.25f, 6.53f, 3.7f)
                    lineTo(8.1f, 5.27f)
                    curveTo(8.71f, 5.1f, 9.35f, 5f, 10f, 5f)
                    close()
                }
            }
        }.build()
        
        return _No_stroller!!
    }

private var _No_stroller: ImageVector? = null

