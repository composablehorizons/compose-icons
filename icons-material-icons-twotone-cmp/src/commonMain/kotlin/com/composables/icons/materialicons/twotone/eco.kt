package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Eco: ImageVector
    get() {
        if (_Eco != null) return _Eco!!
        
        _Eco = ImageVector.Builder(
            name = "eco",
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
                        moveTo(7.46f, 9.46f)
                        curveTo(5.68f, 11.25f, 5.55f, 14.04f, 7.03f, 16f)
                        curveToRelative(1.53f, -2.54f, 3.73f, -4.64f, 6.37f, -6f)
                        curveToRelative(-2.26f, 1.91f, -3.95f, 4.44f, -4.88f, 7.32f)
                        curveTo(9.27f, 17.75f, 10.11f, 18f, 11f, 18f)
                        curveToRelative(1.34f, 0f, 2.59f, -0.52f, 3.54f, -1.46f)
                        curveToRelative(1.74f, -1.74f, 2.81f, -6.57f, 3.26f, -10.33f)
                        curveTo(14.04f, 6.65f, 9.21f, 7.72f, 7.46f, 9.46f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.05f, 8.05f)
                        curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0f, 9.9f)
                        curveTo(7.42f, 19.32f, 9.21f, 20f, 11f, 20f)
                        reflectiveCurveToRelative(3.58f, -0.68f, 4.95f, -2.05f)
                        curveTo(19.43f, 14.47f, 20f, 4f, 20f, 4f)
                        reflectiveCurveTo(9.53f, 4.57f, 6.05f, 8.05f)
                        close()
                        moveTo(14.54f, 16.54f)
                        curveTo(13.59f, 17.48f, 12.34f, 18f, 11f, 18f)
                        curveToRelative(-0.89f, 0f, -1.73f, -0.25f, -2.48f, -0.68f)
                        curveToRelative(0.92f, -2.88f, 2.62f, -5.41f, 4.88f, -7.32f)
                        curveToRelative(-2.63f, 1.36f, -4.84f, 3.46f, -6.37f, 6f)
                        curveToRelative(-1.48f, -1.96f, -1.35f, -4.75f, 0.44f, -6.54f)
                        curveTo(9.21f, 7.72f, 14.04f, 6.65f, 17.8f, 6.2f)
                        curveTo(17.35f, 9.96f, 16.28f, 14.79f, 14.54f, 16.54f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Eco!!
    }

private var _Eco: ImageVector? = null

