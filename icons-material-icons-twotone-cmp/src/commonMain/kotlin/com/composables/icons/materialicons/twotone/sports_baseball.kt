package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sports_baseball: ImageVector
    get() {
        if (_Sports_baseball != null) return _Sports_baseball!!
        
        _Sports_baseball = ImageVector.Builder(
            name = "sports_baseball",
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
                        moveTo(5.61f, 7.22f)
                        curveTo(4.6f, 8.55f, 4f, 10.2f, 4f, 12f)
                        reflectiveCurveToRelative(0.6f, 3.45f, 1.61f, 4.78f)
                        curveTo(7.06f, 15.69f, 8f, 13.95f, 8f, 12f)
                        reflectiveCurveTo(7.06f, 8.31f, 5.61f, 7.22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 12f)
                        curveToRelative(0f, -2.52f, 1.17f, -4.77f, 3f, -6.24f)
                        curveTo(15.63f, 4.66f, 13.89f, 4f, 12f, 4f)
                        reflectiveCurveTo(8.37f, 4.66f, 7f, 5.76f)
                        curveToRelative(1.83f, 1.47f, 3f, 3.71f, 3f, 6.24f)
                        reflectiveCurveToRelative(-1.17f, 4.77f, -3f, 6.24f)
                        curveToRelative(1.37f, 1.1f, 3.11f, 1.76f, 5f, 1.76f)
                        reflectiveCurveToRelative(3.63f, -0.66f, 5f, -1.76f)
                        curveTo(15.17f, 16.77f, 14f, 14.52f, 14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.39f, 7.22f)
                        curveTo(16.94f, 8.31f, 16f, 10.05f, 16f, 12f)
                        reflectiveCurveToRelative(0.94f, 3.69f, 2.39f, 4.78f)
                        curveTo(19.4f, 15.45f, 20f, 13.8f, 20f, 12f)
                        reflectiveCurveTo(19.4f, 8.55f, 18.39f, 7.22f)
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
                        moveTo(5.61f, 16.78f)
                        curveTo(4.6f, 15.45f, 4f, 13.8f, 4f, 12f)
                        reflectiveCurveToRelative(0.6f, -3.45f, 1.61f, -4.78f)
                        curveTo(7.06f, 8.31f, 8f, 10.05f, 8f, 12f)
                        reflectiveCurveTo(7.06f, 15.69f, 5.61f, 16.78f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-1.89f, 0f, -3.63f, -0.66f, -5f, -1.76f)
                        curveToRelative(1.83f, -1.47f, 3f, -3.71f, 3f, -6.24f)
                        reflectiveCurveTo(8.83f, 7.23f, 7f, 5.76f)
                        curveTo(8.37f, 4.66f, 10.11f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(3.63f, 0.66f, 5f, 1.76f)
                        curveToRelative(-1.83f, 1.47f, -3f, 3.71f, -3f, 6.24f)
                        reflectiveCurveToRelative(1.17f, 4.77f, 3f, 6.24f)
                        curveTo(15.63f, 19.34f, 13.89f, 20f, 12f, 20f)
                        close()
                        moveTo(18.39f, 16.78f)
                        curveTo(16.94f, 15.69f, 16f, 13.95f, 16f, 12f)
                        reflectiveCurveToRelative(0.94f, -3.69f, 2.39f, -4.78f)
                        curveTo(19.4f, 8.55f, 20f, 10.2f, 20f, 12f)
                        reflectiveCurveTo(19.4f, 15.45f, 18.39f, 16.78f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_baseball!!
    }

private var _Sports_baseball: ImageVector? = null

