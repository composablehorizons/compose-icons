package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Toys: ImageVector
    get() {
        if (_Toys != null) return _Toys!!
        
        _Toys = ImageVector.Builder(
            name = "toys",
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
                        moveTo(18.75f, 10.08f)
                        lineTo(17.4f, 6.05f)
                        curveTo(17f, 4.82f, 15.85f, 4f, 14.56f, 4f)
                        horizontalLineTo(9.44f)
                        curveTo(8.15f, 4f, 7f, 4.82f, 6.6f, 6.05f)
                        lineTo(5.81f, 8.4f)
                        lineTo(4.41f, 7f)
                        lineToRelative(0.29f, -0.29f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-2f, 2f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineTo(3f, 8.41f)
                        lineToRelative(1.79f, 1.79f)
                        curveTo(3.18f, 10.72f, 2f, 12.22f, 2f, 14f)
                        curveToRelative(0f, 1.49f, 0.83f, 2.78f, 2.05f, 3.47f)
                        curveTo(4.27f, 18.9f, 5.51f, 20f, 7f, 20f)
                        curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                        horizontalLineToRelative(4.37f)
                        curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                        curveToRelative(1.49f, 0f, 2.73f, -1.1f, 2.95f, -2.53f)
                        curveTo(21.17f, 16.78f, 22f, 15.49f, 22f, 14f)
                        curveTo(22f, 12.05f, 20.6f, 10.43f, 18.75f, 10.08f)
                        close()
                        moveTo(13f, 6f)
                        horizontalLineToRelative(1.56f)
                        curveToRelative(0.43f, 0f, 0.81f, 0.27f, 0.95f, 0.68f)
                        lineTo(16.61f, 10f)
                        horizontalLineTo(13f)
                        verticalLineTo(6f)
                        close()
                        moveTo(8.49f, 6.68f)
                        curveTo(8.63f, 6.27f, 9.01f, 6f, 9.44f, 6f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7.41f)
                        lineTo(7.39f, 9.98f)
                        lineTo(8.49f, 6.68f)
                        close()
                        moveTo(7f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(7.55f, 18f, 7f, 18f)
                        close()
                        moveTo(17f, 18f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(17.55f, 18f, 17f, 18f)
                        close()
                        moveTo(19.49f, 15.32f)
                        curveTo(18.95f, 14.53f, 18.03f, 14f, 17f, 14f)
                        curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                        horizontalLineTo(9.82f)
                        curveTo(9.4f, 14.84f, 8.3f, 14f, 7f, 14f)
                        curveToRelative(-1.03f, 0f, -1.95f, 0.53f, -2.49f, 1.32f)
                        curveTo(4.2f, 14.97f, 4f, 14.51f, 4f, 14f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveTo(20f, 14.51f, 19.8f, 14.97f, 19.49f, 15.32f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Toys!!
    }

private var _Toys: ImageVector? = null

