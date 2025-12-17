package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
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
                    group {
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(16f, 13f)
                                curveToRelative(3.09f, -2.81f, 6f, -5.44f, 6f, -7.7f)
                                curveTo(22f, 3.45f, 20.55f, 2f, 18.7f, 2f)
                                curveToRelative(-1.04f, 0f, -2.05f, 0.49f, -2.7f, 1.25f)
                                curveTo(15.34f, 2.49f, 14.34f, 2f, 13.3f, 2f)
                                curveTo(11.45f, 2f, 10f, 3.45f, 10f, 5.3f)
                                curveTo(10f, 7.56f, 12.91f, 10.19f, 16f, 13f)
                                close()
                                moveTo(13.3f, 4f)
                                curveToRelative(0.44f, 0f, 0.89f, 0.21f, 1.18f, 0.55f)
                                lineTo(16f, 6.34f)
                                lineToRelative(1.52f, -1.79f)
                                curveTo(17.81f, 4.21f, 18.26f, 4f, 18.7f, 4f)
                                curveTo(19.44f, 4f, 20f, 4.56f, 20f, 5.3f)
                                curveToRelative(0f, 1.12f, -2.04f, 3.17f, -4f, 4.99f)
                                curveToRelative(-1.96f, -1.82f, -4f, -3.88f, -4f, -4.99f)
                                curveTo(12f, 4.56f, 12.56f, 4f, 13.3f, 4f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(19f, 16f)
                                horizontalLineToRelative(-2f)
                                curveToRelative(0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f)
                                lineTo(8.97f, 11f)
                                horizontalLineTo(1f)
                                verticalLineToRelative(11f)
                                horizontalLineToRelative(6f)
                                verticalLineToRelative(-1.44f)
                                lineToRelative(7f, 1.94f)
                                lineToRelative(8f, -2.5f)
                                verticalLineToRelative(-1f)
                                curveTo(22f, 17.34f, 20.66f, 16f, 19f, 16f)
                                close()
                                moveTo(3f, 20f)
                                verticalLineToRelative(-7f)
                                horizontalLineToRelative(2f)
                                verticalLineToRelative(7f)
                                horizontalLineTo(3f)
                                close()
                                moveTo(13.97f, 20.41f)
                                lineTo(7f, 18.48f)
                                verticalLineTo(13f)
                                horizontalLineToRelative(1.61f)
                                lineToRelative(5.82f, 2.17f)
                                curveTo(14.77f, 15.3f, 15f, 15.63f, 15f, 16f)
                                curveToRelative(0f, 0f, -1.99f, -0.05f, -2.3f, -0.15f)
                                lineToRelative(-2.38f, -0.79f)
                                lineToRelative(-0.63f, 1.9f)
                                lineToRelative(2.38f, 0.79f)
                                curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f)
                                horizontalLineTo(19f)
                                curveToRelative(0.39f, 0f, 0.74f, 0.23f, 0.9f, 0.56f)
                                lineTo(13.97f, 20.41f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null

