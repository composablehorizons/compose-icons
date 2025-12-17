package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mediation: ImageVector
    get() {
        if (_Mediation != null) return _Mediation!!
        
        _Mediation = ImageVector.Builder(
            name = "mediation",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        horizontalLineToRelative(-5.06f)
                        curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f)
                        curveToRelative(-0.03f, 1.81f, -1.66f, 3.23f, -3.55f, 2.9f)
                        curveToRelative(-1.2f, -0.21f, -2.19f, -1.2f, -2.4f, -2.4f)
                        curveTo(1.71f, 18.65f, 3.16f, 17f, 5f, 17f)
                        curveToRelative(0.95f, 0f, 1.78f, 0.45f, 2.33f, 1.14f)
                        curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f)
                        horizontalLineToRelative(-3.1f)
                        curveToRelative(-0.48f, 1.34f, -1.86f, 2.24f, -3.42f, 1.94f)
                        curveToRelative(-1.18f, -0.23f, -2.13f, -1.2f, -2.35f, -2.38f)
                        curveTo(1.7f, 10.66f, 3.16f, 9f, 5f, 9f)
                        curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                        horizontalLineToRelative(3.1f)
                        curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f)
                        curveToRelative(-0.64f, 0.8f, -1.67f, 1.28f, -2.81f, 1.1f)
                        curveTo(3.29f, 6.77f, 2.26f, 5.77f, 2.05f, 4.54f)
                        curveTo(1.72f, 2.65f, 3.17f, 1f, 5f, 1f)
                        curveToRelative(1.64f, 0f, 2.96f, 1.31f, 2.99f, 2.95f)
                        curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f)
                        horizontalLineTo(18f)
                        verticalLineTo(9.21f)
                        curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                        lineToRelative(2.79f, 2.79f)
                        curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(-2.79f, 2.79f)
                        curveTo(18.54f, 15.46f, 18f, 15.24f, 18f, 14.79f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mediation!!
    }

private var _Mediation: ImageVector? = null

