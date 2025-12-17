package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Person_search: ImageVector
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
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8.54f)
                        curveTo(9.07f, 17.24f, 10.31f, 14.11f, 10.35f, 14.01f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.43f, 18.02f)
                        curveToRelative(0.47f, -0.8f, 0.7f, -1.77f, 0.48f, -2.82f)
                        curveToRelative(-0.34f, -1.64f, -1.72f, -2.95f, -3.38f, -3.16f)
                        curveToRelative(-2.63f, -0.34f, -4.85f, 1.87f, -4.5f, 4.5f)
                        curveToRelative(0.22f, 1.66f, 1.52f, 3.04f, 3.16f, 3.38f)
                        curveToRelative(1.05f, 0.22f, 2.02f, -0.01f, 2.82f, -0.48f)
                        lineToRelative(1.86f, 1.86f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
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

