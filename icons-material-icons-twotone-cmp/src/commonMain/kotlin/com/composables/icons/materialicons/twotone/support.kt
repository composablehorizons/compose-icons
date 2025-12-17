package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Support: ImageVector
    get() {
        if (_Support != null) return _Support!!
        
        _Support = ImageVector.Builder(
            name = "support",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.3f, 7.32f)
                        lineTo(9.13f, 4.54f)
                        curveTo(7.02f, 5.35f, 5.35f, 7.02f, 4.54f, 9.13f)
                        lineToRelative(2.78f, 1.15f)
                        curveTo(7.83f, 8.9f, 8.92f, 7.82f, 10.3f, 7.32f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.32f, 13.72f)
                        lineToRelative(-2.78f, 1.15f)
                        curveToRelative(0.81f, 2.1f, 2.48f, 3.78f, 4.59f, 4.59f)
                        lineToRelative(1.17f, -2.78f)
                        curveTo(8.91f, 16.18f, 7.83f, 15.09f, 7.32f, 13.72f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.67f, 10.27f)
                        lineToRelative(2.78f, -1.15f)
                        curveToRelative(-0.81f, -2.1f, -2.48f, -3.77f, -4.58f, -4.58f)
                        lineToRelative(-1.15f, 2.78f)
                        curveTo(15.09f, 7.83f, 16.17f, 8.9f, 16.67f, 10.27f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.68f, 13.71f)
                        curveToRelative(-0.5f, 1.37f, -1.58f, 2.46f, -2.95f, 2.97f)
                        lineToRelative(1.15f, 2.78f)
                        curveToRelative(2.1f, -0.81f, 3.77f, -2.48f, 4.58f, -4.58f)
                        lineTo(16.68f, 13.71f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(14.87f, 4.54f)
                        curveToRelative(2.1f, 0.81f, 3.77f, 2.48f, 4.58f, 4.58f)
                        lineToRelative(-2.78f, 1.15f)
                        curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f)
                        lineTo(14.87f, 4.54f)
                        close()
                        moveTo(9.13f, 4.54f)
                        lineToRelative(1.17f, 2.78f)
                        curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f)
                        lineTo(4.54f, 9.13f)
                        curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f)
                        close()
                        moveTo(9.13f, 19.46f)
                        curveToRelative(-2.1f, -0.81f, -3.78f, -2.48f, -4.59f, -4.59f)
                        lineToRelative(2.78f, -1.15f)
                        curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f)
                        lineTo(9.13f, 19.46f)
                        close()
                        moveTo(9f, 12f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                        reflectiveCurveTo(9f, 13.66f, 9f, 12f)
                        close()
                        moveTo(14.88f, 19.46f)
                        lineToRelative(-1.15f, -2.78f)
                        curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f)
                        lineToRelative(2.78f, 1.17f)
                        curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Support!!
    }

private var _Support: ImageVector? = null

