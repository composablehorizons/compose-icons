package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.App_registration: ImageVector
    get() {
        if (_App_registration != null) return _App_registration!!
        
        _App_registration = ImageVector.Builder(
            name = "app_registration",
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
                        moveTo(14f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 12f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 10f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 14f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 18f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 20f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 18f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 14f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 12f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 6f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 4f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 8f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 18f, 8f)
                        arcTo(2f, 2f, 0f, false, true, 16f, 6f)
                        arcTo(2f, 2f, 0f, false, true, 20f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 18.07f)
                        verticalLineToRelative(1.43f)
                        curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                        horizontalLineToRelative(1.4f)
                        curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                        lineToRelative(5.83f, -5.83f)
                        lineToRelative(-2.12f, -2.12f)
                        lineToRelative(-5.81f, 5.81f)
                        curveTo(11.05f, 17.81f, 11f, 17.94f, 11f, 18.07f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.03f, 14f)
                        lineTo(14f, 12.03f)
                        verticalLineTo(12f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        horizontalLineTo(12.03f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.85f, 11.56f)
                        lineToRelative(-1.41f, -1.41f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-1.06f, 1.06f)
                        lineToRelative(2.12f, 2.12f)
                        lineToRelative(1.06f, -1.06f)
                        curveTo(21.05f, 12.07f, 21.05f, 11.76f, 20.85f, 11.56f)
                        close()
                    }
                }
            }
        }.build()
        
        return _App_registration!!
    }

private var _App_registration: ImageVector? = null

