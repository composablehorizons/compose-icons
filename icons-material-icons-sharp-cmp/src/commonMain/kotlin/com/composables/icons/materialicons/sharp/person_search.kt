package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Person_search: ImageVector
    get() {
        if (_Person_search != null) return _Person_search!!
        
        _Person_search = ImageVector.Builder(
            name = "person_search",
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
                        moveTo(14f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 10f, 12f)
                        arcTo(4f, 4f, 0f, false, true, 6f, 8f)
                        arcTo(4f, 4f, 0f, false, true, 14f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.35f, 14.01f)
                        curveTo(7.62f, 13.91f, 2f, 15.27f, 2f, 18f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(9.54f)
                        curveTo(9.07f, 17.24f, 10.31f, 14.11f, 10.35f, 14.01f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.43f, 18.02f)
                        curveTo(19.79f, 17.43f, 20f, 16.74f, 20f, 16f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(0.74f, 0f, 1.43f, -0.22f, 2.02f, -0.57f)
                        lineTo(20.59f, 22f)
                        lineTo(22f, 20.59f)
                        lineTo(19.43f, 18.02f)
                        close()
                        moveTo(16f, 18f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(18f, 17.1f, 17.1f, 18f, 16f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Person_search!!
    }

private var _Person_search: ImageVector? = null

