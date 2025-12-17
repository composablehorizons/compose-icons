package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Edit_location_alt: ImageVector
    get() {
        if (_Edit_location_alt != null) return _Edit_location_alt!!
        
        _Edit_location_alt = ImageVector.Builder(
            name = "edit_location_alt",
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
                        moveTo(17.9f, 9.05f)
                        curveTo(17.96f, 9.41f, 18f, 9.79f, 18f, 10.2f)
                        curveToRelative(0f, 1.71f, -1.08f, 4.64f, -6f, 9.14f)
                        curveToRelative(-4.92f, -4.49f, -6f, -7.43f, -6f, -9.14f)
                        curveTo(6f, 6.17f, 9.09f, 4f, 12f, 4f)
                        curveToRelative(0.32f, 0f, 0.65f, 0.03f, 0.97f, 0.08f)
                        lineToRelative(1.65f, -1.65f)
                        curveTo(13.78f, 2.16f, 12.9f, 2f, 12f, 2f)
                        curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                        curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                        curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                        curveToRelative(0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                        lineTo(17.9f, 9.05f)
                        close()
                        moveTo(20.71f, 2f)
                        lineTo(20f, 1.29f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-0.72f, 0.72f)
                        lineToRelative(2.12f, 2.12f)
                        lineToRelative(0.72f, -0.72f)
                        curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2f)
                        close()
                        moveTo(11f, 11f)
                        horizontalLineToRelative(2.12f)
                        lineToRelative(6.16f, -6.16f)
                        lineToRelative(-2.12f, -2.12f)
                        lineTo(11f, 8.88f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.95f, 13f)
                        horizontalLineTo(9f)
                        verticalLineTo(8.05f)
                        lineToRelative(3.97f, -3.97f)
                        curveTo(12.65f, 4.03f, 12.32f, 4f, 12f, 4f)
                        curveToRelative(-2.91f, 0f, -6f, 2.17f, -6f, 6.2f)
                        curveToRelative(0f, 1.71f, 1.08f, 4.64f, 6f, 9.14f)
                        curveToRelative(4.92f, -4.49f, 6f, -7.43f, 6f, -9.14f)
                        curveToRelative(0f, -0.4f, -0.04f, -0.78f, -0.1f, -1.15f)
                        lineTo(13.95f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

