package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bug_report: ImageVector
    get() {
        if (_Bug_report != null) return _Bug_report!!
        
        _Bug_report = ImageVector.Builder(
            name = "bug_report",
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
                moveTo(15.83f, 9.65f)
                lineTo(15.46f, 9f)
                curveToRelative(-0.3f, -0.53f, -0.71f, -0.96f, -1.21f, -1.31f)
                lineToRelative(-0.61f, -0.42f)
                lineToRelative(-0.68f, -0.16f)
                curveTo(12.63f, 7.04f, 12.32f, 7f, 12f, 7f)
                curveToRelative(-0.31f, 0f, -0.63f, 0.04f, -0.94f, 0.11f)
                lineToRelative(-0.74f, 0.18f)
                lineToRelative(-0.57f, 0.4f)
                curveToRelative(-0.49f, 0.34f, -0.91f, 0.79f, -1.21f, 1.31f)
                lineToRelative(-0.37f, 0.65f)
                lineToRelative(-0.1f, 0.65f)
                curveToRelative(-0.04f, 0.23f, -0.07f, 0.48f, -0.07f, 0.7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.22f, 0.03f, 0.47f, 0.07f, 0.7f)
                lineToRelative(0.1f, 0.65f)
                lineToRelative(0.37f, 0.65f)
                curveToRelative(0.72f, 1.24f, 2.04f, 2f, 3.46f, 2f)
                reflectiveCurveToRelative(2.74f, -0.77f, 3.46f, -2f)
                lineToRelative(0.37f, -0.64f)
                lineToRelative(0.1f, -0.65f)
                curveToRelative(0.04f, -0.24f, 0.07f, -0.49f, 0.07f, -0.71f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.22f, -0.03f, -0.47f, -0.07f, -0.7f)
                lineToRelative(-0.1f, -0.65f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8f)
                horizontalLineToRelative(-2.81f)
                curveToRelative(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f)
                lineTo(17f, 4.41f)
                lineTo(15.59f, 3f)
                lineToRelative(-2.17f, 2.17f)
                curveTo(12.96f, 5.06f, 12.49f, 5f, 12f, 5f)
                reflectiveCurveToRelative(-0.96f, 0.06f, -1.41f, 0.17f)
                lineTo(8.41f, 3f)
                lineTo(7f, 4.41f)
                lineToRelative(1.62f, 1.63f)
                curveTo(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.09f)
                curveToRelative(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.34f, 0.04f, 0.67f, 0.09f, 1f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.81f)
                curveToRelative(1.04f, 1.79f, 2.97f, 3f, 5.19f, 3f)
                reflectiveCurveToRelative(4.15f, -1.21f, 5.19f, -3f)
                horizontalLineTo(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.09f)
                curveToRelative(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.34f, -0.04f, -0.67f, -0.09f, -1f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
                moveToRelative(-4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.22f, -0.03f, 0.47f, -0.07f, 0.7f)
                lineToRelative(-0.1f, 0.65f)
                lineToRelative(-0.37f, 0.65f)
                curveToRelative(-0.72f, 1.24f, -2.04f, 2f, -3.46f, 2f)
                reflectiveCurveToRelative(-2.74f, -0.77f, -3.46f, -2f)
                lineToRelative(-0.37f, -0.64f)
                lineToRelative(-0.1f, -0.65f)
                curveTo(8.03f, 15.47f, 8f, 15.22f, 8f, 15f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.22f, 0.03f, -0.47f, 0.07f, -0.7f)
                lineToRelative(0.1f, -0.65f)
                lineToRelative(0.37f, -0.65f)
                curveToRelative(0.3f, -0.52f, 0.72f, -0.97f, 1.21f, -1.31f)
                lineToRelative(0.57f, -0.39f)
                lineToRelative(0.74f, -0.18f)
                curveToRelative(0.31f, -0.08f, 0.63f, -0.12f, 0.94f, -0.12f)
                curveToRelative(0.32f, 0f, 0.63f, 0.04f, 0.95f, 0.12f)
                lineToRelative(0.68f, 0.16f)
                lineToRelative(0.61f, 0.42f)
                curveToRelative(0.5f, 0.34f, 0.91f, 0.78f, 1.21f, 1.31f)
                lineToRelative(0.38f, 0.65f)
                lineToRelative(0.1f, 0.65f)
                curveToRelative(0.04f, 0.22f, 0.07f, 0.47f, 0.07f, 0.69f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-6f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Bug_report!!
    }

private var _Bug_report: ImageVector? = null

