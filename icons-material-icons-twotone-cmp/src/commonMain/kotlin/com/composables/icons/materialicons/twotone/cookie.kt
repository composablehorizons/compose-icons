package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cookie: ImageVector
    get() {
        if (_Cookie != null) return _Cookie!!
        
        _Cookie = ImageVector.Builder(
            name = "cookie",
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
                        moveTo(17.07f, 8.93f)
                        curveToRelative(-2.55f, -0.39f, -4.57f, -2.41f, -4.99f, -4.94f)
                        curveTo(6.73f, 3.82f, 4f, 8.69f, 4f, 12f)
                        curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                        curveToRelative(4.06f, 0f, 7.7f, -3.14f, 7.98f, -7.45f)
                        curveTo(17.59f, 11.48f, 17.14f, 9.29f, 17.07f, 8.93f)
                        close()
                        moveTo(8.5f, 15f)
                        curveTo(7.67f, 15f, 7f, 14.33f, 7f, 13.5f)
                        reflectiveCurveTo(7.67f, 12f, 8.5f, 12f)
                        reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                        reflectiveCurveTo(9.33f, 15f, 8.5f, 15f)
                        close()
                        moveTo(10.5f, 10f)
                        curveTo(9.67f, 10f, 9f, 9.33f, 9f, 8.5f)
                        reflectiveCurveTo(9.67f, 7f, 10.5f, 7f)
                        reflectiveCurveTo(12f, 7.67f, 12f, 8.5f)
                        reflectiveCurveTo(11.33f, 10f, 10.5f, 10f)
                        close()
                        moveTo(15f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(16f, 15.55f, 15.55f, 16f, 15f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 10f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 9f, 8.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 15f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 13.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 15f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 16f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 15f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.95f, 10.99f)
                        curveToRelative(-1.79f, -0.03f, -3.7f, -1.95f, -2.68f, -4.22f)
                        curveToRelative(-2.97f, 1f, -5.78f, -1.59f, -5.19f, -4.56f)
                        curveTo(7.1f, 0.74f, 2f, 6.41f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveTo(17.89f, 22f, 22.54f, 16.92f, 21.95f, 10.99f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -3.31f, 2.73f, -8.18f, 8.08f, -8.02f)
                        curveToRelative(0.42f, 2.54f, 2.44f, 4.56f, 4.99f, 4.94f)
                        curveToRelative(0.07f, 0.36f, 0.52f, 2.55f, 2.92f, 3.63f)
                        curveTo(19.7f, 16.86f, 16.06f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cookie!!
    }

private var _Cookie: ImageVector? = null

