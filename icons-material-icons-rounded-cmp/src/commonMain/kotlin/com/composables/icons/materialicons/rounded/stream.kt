package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Stream: ImageVector
    get() {
        if (_Stream != null) return _Stream!!
        
        _Stream = ImageVector.Builder(
            name = "stream",
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
                        moveTo(22f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 20f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 18f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 22f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 2f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 20f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 22f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 20f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.89f, 14.65f)
                        lineToRelative(-2.94f, 2.93f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(2.94f, -2.93f)
                        curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0f, -1.41f)
                        curveTo(8.91f, 14.26f, 8.28f, 14.26f, 7.89f, 14.65f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.41f, 4.94f)
                        curveTo(6.02f, 4.55f, 5.39f, 4.55f, 5f, 4.94f)
                        curveTo(4.61f, 5.33f, 4.61f, 5.96f, 5f, 6.35f)
                        lineToRelative(2.93f, 2.94f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                        curveTo(9.73f, 8.9f, 9.73f, 8.27f, 9.34f, 7.88f)
                        lineTo(6.41f, 4.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.12f, 14.65f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineTo(17.64f, 19f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                        lineTo(16.12f, 14.65f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.06f, 9.33f)
                        lineToRelative(2.99f, -2.98f)
                        curveToRelative(0.39f, -0.4f, 0.39f, -1.03f, 0f, -1.42f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-2.99f, 2.98f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.42f)
                        curveTo(15.04f, 9.72f, 15.67f, 9.72f, 16.06f, 9.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Stream!!
    }

private var _Stream: ImageVector? = null

