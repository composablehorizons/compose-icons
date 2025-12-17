package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Android: ImageVector
    get() {
        if (_Android != null) return _Android!!
        
        _Android = ImageVector.Builder(
            name = "android",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.6f, 9.48f)
                        lineToRelative(1.84f, -3.18f)
                        curveToRelative(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f)
                        curveToRelative(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f)
                        lineToRelative(-1.88f, 3.24f)
                        curveToRelative(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0f)
                        lineTo(5.65f, 5.67f)
                        curveToRelative(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f)
                        curveTo(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f)
                        lineTo(6.4f, 9.48f)
                        curveTo(3.3f, 11.25f, 1.28f, 14.44f, 1f, 18f)
                        horizontalLineToRelative(22f)
                        curveTo(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f)
                        close()
                        moveTo(7f, 15.25f)
                        curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                        curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                        reflectiveCurveTo(8.25f, 13.31f, 8.25f, 14f)
                        curveTo(8.25f, 14.69f, 7.69f, 15.25f, 7f, 15.25f)
                        close()
                        moveTo(17f, 15.25f)
                        curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                        curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                        reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                        curveTo(18.25f, 14.69f, 17.69f, 15.25f, 17f, 15.25f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Android!!
    }

private var _Android: ImageVector? = null

